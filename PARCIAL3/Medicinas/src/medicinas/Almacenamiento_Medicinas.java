package medicinas;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class Almacenamiento_Medicinas {
    private File file;
    public Almacenamiento_Medicinas(File A)
    {
        file=A;
    }
    //Cada registro tiene 7 atributos y 136 bytes
    //1.Codigo  6 chars 12 bytes 
    //2.Categoria 10 chars 20 bytes
    //3.Nombre  15 chars ,30 bytes  
    //4.Fabricante 15 chars, 30 bytes
    //5.Cantidad int 4 bytes
    //6.Precio double 8 bytes
    //7.Fecha elaboracion 8 chars ,16 bytes "DDMMAAAA"
    //8.Fecha de vencimiento 8 chars ,16 bytes "DDMMAAAA"
    //9.Descripcion 50 chars,100 bytes
    public void Ingresar(String Codigo,String Categoria,String Nombre,String Fabricante,int Cantidad,double Precio,String FE,String FV,String Des)
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(RAC.length());
            RAC.writeChars(Codigo);
            RAC.writeChars(Categoria);
            RAC.writeChars(Nombre);
            RAC.writeChars(Fabricante);
            RAC.writeInt(Cantidad);
            RAC.writeDouble(Precio);
            RAC.writeChars(FE);
            RAC.writeChars(FV);
            RAC.writeChars(Des);
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
    }
    public String get(String Nombre,String Atributo)
    {
        //System.out.println("Buscado "+Atributo);
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            if(Existe(Nombre))
            {
                RAC.seek(BuscarPunteroAtributo(Atributo,Nombre)); 
                //System.out.println(BuscarPunteroAtributo(Atributo,Nombre));
                //System.out.println(BuscarPunteroAtributo(Atributo,Nombre)+"puntero");
                switch(Atributo)
                {
                    case "CANTIDAD" -> {
                        return ""+RAC.readInt();
                    }
                    case "PRECIO" -> {
                        return ""+RAC.readDouble();
                    }
                    case "CODIGO", "CATEGORIA", "NOMBRE", "FABRICANTE", "FE", "FA","DESCRIPCION" -> {
                        String aux="";
                        for(int i=0;i<CharsDe(Atributo);i++)
                        {
                            //System.out.println("x");
                            aux=aux+RAC.readChar();
                        }
                        RAC.close();
                        return aux;
                    }
                    default -> {
                        RAC.close();
                        return "null";
                    }
                }
                   
            }
            RAC.close();
            System.out.println("Fuera");
            return "null";
        }
        catch(IOException e)
        {
            System.out.println("IOE");
            return "IOException";
        }
    }

    public boolean Existe(String NB)
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            //System.out.println("Buscando si existe");
            while(RAC.getFilePointer()<RAC.length())
            {
                RAC.skipBytes(32);
                String Nombre ="";
                for(int i =0;i<15;i++)
                {
                    Nombre=Nombre+RAC.readChar();
                    //System.out.println(i+"  "+Nombre);
                }
                //System.out.println(Nombre+" "+NB);
                if(!Nombre.equals(NB))
                {
                    RAC.skipBytes(74+100);
                }
                else
                {
                    RAC.close();
                    //System.out.println("Existe");
                    return true;
                }
            }
            RAC.close();
            System.out.println("No existe");
            return false;
        }
        catch(IOException e)
        {
            return false;
        }
    }
    public long BuscarPunteroAtributo(String AT,String Codigo)
    {
        AT=AT.toUpperCase();
        long AP=BuscarPuntero(Codigo);
        //System.out.println("Puntero inicial en "+BuscarPuntero(Codigo));
        return switch (AT) {
            case "CODIGO"    -> AP+0;
            case "CATEGORIA" -> AP+12;
            case "NOMBRE"    -> AP+12+20;
            case "FABRICANTE"-> AP+12+20+30;
            case "CANTIDAD"  -> AP+12+20+30+30;
            case "PRECIO"    -> AP+12+20+30+30+4;
            case "FE"        -> AP+12+20+30+30+4+8;
            case "FA"        -> AP+12+20+30+30+4+8+16;
            case "DESCRIPCION"-> AP+12+20+30+30+4+8+16+16;
            default -> -1;
        };
    }
    public long BytesDe(String AT)
    {
        AT=AT.toUpperCase();
        return switch (AT) {
            case "CODIGO" -> 12;
            case "CATEGORIA" -> 20;
            case "NOMBRE" -> 30;
            case "FABRICANTE" -> 30;
            case "CANTIDAD" -> 4;
            case "PRECIO" -> 8;
            case "FE" -> 16;
            case "FA" -> 16;
            case "DESCRIPCION"->100;
            default -> -1;
        };
    }
      public long CharsDe(String AT)
    {
        AT=AT.toUpperCase();
        return switch (AT) {
            case "CODIGO" -> 6;
            case "CATEGORIA" -> 10;
            case "NOMBRE" -> 15;
            case "FABRICANTE" -> 15;
            case "FE" -> 8;
            case "FA" -> 8;
            case "DESCRIPCION"->50;
            default -> -1;
        };
    }
    
    public long BuscarPuntero(String NB)
    {
        long Puntero=-1;
                    //System.out.println("\n\nBuscando el puntero inicial del registro");
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(0);
            while(RAC.getFilePointer()<RAC.length())
            {
                RAC.skipBytes(32);
                String Nombre ="";
                for(int i =0;i<15;i++)
                {
                    Nombre=Nombre+RAC.readChar();
                }
                //System.out.println(Nombre+"**"+NB);
                if(!Nombre.equals(NB))
                {
                    RAC.skipBytes(74+100);
                }
                else
                {
                    Puntero=RAC.getFilePointer()-62;
                    RAC.close();
                    return Puntero;
                }
            }
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
        return Puntero;
    }
    public Object[] getListadoMedicinas(String Categoria)
    {
        ArrayList<String> listado = new ArrayList<String>();
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(0);
            while(RAC.getFilePointer()<RAC.length())
            {
                RAC.skipBytes(12);
                String Cat ="";
                for(int i =0;i<CharsDe("CATEGORIA");i++)
                {
                    Cat=Cat+RAC.readChar();
                }
                System.out.println("Se leyo la categoria "+Cat);
                if(Cat.equals(Categoria))
                {
                    String Prd ="";
                    for(int i =0;i<CharsDe("NOMBRE");i++)
                    {
                        Prd=Prd+RAC.readChar();
                    }
                    //System.out.println("Se leyo el producto "+Prd);
                    if(!listado.contains(Prd))
                    {
                        listado.add(Prd);
                    }
                    RAC.skipBytes(74+100);
                }
                else
                {
                    RAC.skipBytes(104+100);
                }    
            }
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
        Object[] x=listado.toArray(); 
        return x;
    }
    public Object[] getListadoCategorias()
    {
        ArrayList<String> listado = new ArrayList<String>();
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            while(RAC.getFilePointer()<RAC.length())
            {
                RAC.skipBytes(12);
                String Categoria ="";
                for(int i =0;i<10;i++)
                {
                    Categoria=Categoria+RAC.readChar();
                }
                if(!listado.contains(Categoria))
                {
                    listado.add(Categoria);
                }
                RAC.skipBytes(104+100);
            }
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
        Object[] x=listado.toArray(); 
        return x;
    }
    public void AgregarCantidad(String Nombre,int Cantidad)
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(BuscarPunteroAtributo("CANTIDAD",Nombre));
            int aux=RAC.readInt();
            RAC.seek(BuscarPunteroAtributo("CANTIDAD",Nombre));
            RAC.writeInt(aux+Cantidad);
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
    }
    
}
