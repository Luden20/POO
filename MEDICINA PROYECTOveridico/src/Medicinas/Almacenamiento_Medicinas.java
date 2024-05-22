package Medicinas;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Almacenamiento_Medicinas {
    private File file;
    public Almacenamiento_Medicinas(File A)
    {
        file=A;
    }
    //Cada registro tiene 7 atributos y 336 bytes
    //1.Codigo  6 chars 12 bytes 
    //2.Categoria 10 chars 20 bytes
    //3.Nombre  15 chars ,30 bytes  
    //4.Fabricante 15 chars, 30 bytes
    //5.Cantidad int 4 bytes
    //6.Precio double 8 bytes
    //7.Fecha elaboracion 8 chars ,16 bytes "DDMMAAAA"
    //8.Fecha de vencimiento 8 chars ,16 bytes "DDMMAAAA"
    //9.Descripcion 50 chars,100 bytes
    //10.Direccion de una foto 50 chars,100 bytes
    public void Ingresar(String Codigo,String Categoria,String Nombre,String Fabricante,int Cantidad,double Precio,String FE,String FV,String Des,String FD)
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            if(!Existe(Nombre))
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
                RAC.writeChars(FD);
            }
            else if (Existe(Nombre))
            {
                AgregarCantidad(Nombre,Cantidad);
            }
            
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
    }
    public void Ingresar(String Codigo,String Categoria,String Nombre,String Fabricante,int Cantidad,double Precio,String FE,String FV,String Des)
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            if(Existe(Nombre))
            {
                AgregarCantidad(Nombre,Cantidad);
            }
            else
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
                RAC.writeChars("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");//En caso de ser en otra pese, adjuntar una imagen cualquiera
            }
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
    }
    public void Borrar()
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.setLength(0);
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
                    case "CODIGO", "CATEGORIA", "NOMBRE", "FABRICANTE", "FE", "FA","DESCRIPCION","DI" -> {
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
                RAC.skipBytes((int)BytesHasta("NOMBRE"));
                String Nombre ="";
                for(int i =0;i<CharsDe("NOMBRE");i++)
                {
                    Nombre=Nombre+RAC.readChar();
                    System.out.println(i+"  "+Nombre);
                }
                System.out.println(Nombre+" "+NB);
                if(!Nombre.equals(NB))
                {
                    RAC.skipBytes((int)BytesHastaFinalPartiendoDe("NOMBRE"));
                }
                else
                {
                    RAC.close();
                    System.out.println("Existe");
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
            case "DI"           -> AP+12+20+30+30+4+8+16+16+100;
            default -> -1;
        };
    }
    public long BytesHasta(String AT) {
        AT = AT.toUpperCase();
        long bytesHasta = -1;
        switch (AT) {
            case "CODIGO":
                bytesHasta = 0;
                break;
            case "CATEGORIA":
                bytesHasta = 12;
                break;
            case "NOMBRE":
                bytesHasta = 12 + 20;
                break;
            case "FABRICANTE":
                bytesHasta = 12 + 20 + 30;
                break;
            case "CANTIDAD":
                bytesHasta = 12 + 20 + 30 + 30;
                break;
            case "PRECIO":
                bytesHasta = 12 + 20 + 30 + 30 + 4;
                break;
            case "FE":
                bytesHasta = 12 + 20 + 30 + 30 + 4 + 8;
                break;
            case "FA":
                bytesHasta = 12 + 20 + 30 + 30 + 4 + 8 + 16;
                break;
            case "DESCRIPCION":
                bytesHasta = 12 + 20 + 30 + 30 + 4 + 8 + 16 + 16;
                break;
            case "DI":
                bytesHasta = 12 + 20 + 30 + 30 + 4 + 8 + 16 + 16 + 100;
                break;
            default:
                bytesHasta = -1;
                break;
        }
        System.out.println("Salte "+bytesHasta+" bytes");
        return bytesHasta;
    }

    public long BytesHastaFinalPartiendoDe(String at) {
        long aux = 336;
        at.toUpperCase();
        switch (at) {
            case "CODIGO":
                aux -= 12;
                break;
            case "CATEGORIA":
                aux -= (12 + 20);
                break;
            case "NOMBRE":
                aux -= (12 + 20 + 30);
                break;
            case "FABRICANTE":
                aux -= (12 + 20 + 30 + 30);
                break;
            case "CANTIDAD":
                aux -= (12 + 20 + 30 + 30 + 4);
                break;
            case "PRECIO":
                aux -= (12 + 20 + 30 + 30 + 4 + 8);
                break;
            case "FE":
                aux -= (12 + 20 + 30 + 30 + 4 + 8 + 16);
                break;
            case "FA":
                aux -= (12 + 20 + 30 + 30 + 4 + 8 + 16 + 16);
                break;
            case "DESCRIPCION":
                aux -= (12 + 20 + 30 + 30 + 4 + 8 + 16 + 16 + 100);
                break;
            case "DI":
                aux -= (12 + 20 + 30 + 30 + 4 + 8 + 16 + 16 + 100 + 100);
                break;
            default:
                break;
        }
        System.out.println("salto de "+aux+" bytes");
        return aux;
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
            case "DI"->100;
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
            case "DI"->50;
            default -> -1;
        };
    }
    public void Cambiar(String Nombre,String Atributo,String Nuevo)
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(BuscarPunteroAtributo(Atributo,Nombre));
            RAC.writeChars(Nuevo);
            RAC.close();
        }
        catch(IOException e)
        {
        
        }
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
                RAC.skipBytes((int)BytesHasta("NOMBRE"));
                String Nombre ="";
                for(int i =0;i<CharsDe("NOMBRE");i++)
                {
                    Nombre=Nombre+RAC.readChar();
                }
                //System.out.println(Nombre+"**"+NB);
                if(!Nombre.equals(NB))
                {
                    RAC.skipBytes((int)BytesHastaFinalPartiendoDe("NOMBRE"));
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
                RAC.skipBytes((int)BytesDe("CODIGO"));
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
                    RAC.skipBytes((int)BytesHastaFinalPartiendoDe("NOMBRE"));
                }
                else
                {
                    RAC.skipBytes((int)BytesHastaFinalPartiendoDe("CATEGORIA"));
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
    public Object[] getListadoCategorias(boolean xf)
    {
        ArrayList<String> listado = new ArrayList<String>();
        if(xf)
        {
            listado.add("NaN");
        }     
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            while(RAC.getFilePointer()<RAC.length())
            {
                RAC.skipBytes((int)BytesHasta("CATEGORIA"));
                String Categoria ="";
                for(int i =0;i<CharsDe("CATEGORIA");i++)
                {
                    Categoria=Categoria+RAC.readChar();
                }
                if(!listado.contains(Categoria)&&!Categoria.equals(""))
                {
                    listado.add(Categoria);
                }
                RAC.skipBytes((int)BytesHastaFinalPartiendoDe("CATEGORIA"));
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
        public void RestarCantidad(String Nombre,int Cantidad)
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(BuscarPunteroAtributo("CANTIDAD",Nombre));
            int aux=RAC.readInt();
            RAC.seek(BuscarPunteroAtributo("CANTIDAD",Nombre));
            RAC.writeInt(aux-Cantidad);
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
    }
    public void MostrarTabla(String CategoriaB,DefaultTableModel TC)
    {
        TC.setRowCount(0);
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(0);
            while(RAC.getFilePointer()<RAC.length())
            {
                String CODIGO="";
                for(int i=0;i<CharsDe("CODIGO");i++)
                {
                    CODIGO=CODIGO+RAC.readChar();
                }

                String CATEGORIA="";
                for(int i=0;i<CharsDe("CATEGORIA");i++)
                {
                    CATEGORIA=CATEGORIA+RAC.readChar();
                }           
                String NOMBRE="";
                for(int i=0;i<CharsDe("NOMBRE");i++)
                {
                    NOMBRE=NOMBRE+RAC.readChar();
                }

                String FABRICANTE="";
                for(int i=0;i<CharsDe("NOMBRE");i++)
                {
                    FABRICANTE=FABRICANTE+RAC.readChar();
                }
                String CANTIDAD=""+RAC.readInt();
                String PRECIO=""+RAC.readDouble();
                String FE="";
                for(int i=0;i<CharsDe("FE");i++)
                {
                    FE=FE+RAC.readChar();
                }
                String FA="";
                for(int i=0;i<CharsDe("FA");i++)
                {
                    FA=FA+RAC.readChar();
                }
                String DESCRIPCION="";
                for(int i=0;i<CharsDe("DESCRIPCION");i++)
                {
                    DESCRIPCION=DESCRIPCION+RAC.readChar();
                }
                String DI="";
                for(int i=0;i<CharsDe("DI");i++)
                {
                    DI=DI+RAC.readChar();
                }
                if(CATEGORIA.equals(CategoriaB))
                {
                    TC.addRow(new String[]{CODIGO,NOMBRE,FABRICANTE,CANTIDAD,PRECIO,FE,FA,DESCRIPCION});
                }
            }
            
                   
        }
        catch(IOException e)
        {
            
        }
    }
    public void MostrarTabla(DefaultTableModel TC)
    {
        TC.setRowCount(0);
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(0);
            while(RAC.getFilePointer()<RAC.length())
            {
                String CODIGO="";
                for(int i=0;i<CharsDe("CODIGO");i++)
                {
                    CODIGO=CODIGO+RAC.readChar();
                }

                String CATEGORIA="";
                for(int i=0;i<CharsDe("CATEGORIA");i++)
                {
                    CATEGORIA=CATEGORIA+RAC.readChar();
                }           
                String NOMBRE="";
                for(int i=0;i<CharsDe("NOMBRE");i++)
                {
                    NOMBRE=NOMBRE+RAC.readChar();
                }

                String FABRICANTE="";
                for(int i=0;i<CharsDe("NOMBRE");i++)
                {
                    FABRICANTE=FABRICANTE+RAC.readChar();
                }
                String CANTIDAD=""+RAC.readInt();
                String PRECIO=""+RAC.readDouble();
                String FE="";
                for(int i=0;i<CharsDe("FE");i++)
                {
                    FE=FE+RAC.readChar();
                }
                String FA="";
                for(int i=0;i<CharsDe("FA");i++)
                {
                    FA=FA+RAC.readChar();
                }
                String DESCRIPCION="";
                for(int i=0;i<CharsDe("DESCRIPCION");i++)
                {
                    DESCRIPCION=DESCRIPCION+RAC.readChar();
                }
                String DI="";
                for(int i=0;i<CharsDe("DI");i++)
                {
                    DI=DI+RAC.readChar();
                }
                TC.addRow(new String[]{CODIGO,NOMBRE,FABRICANTE,CANTIDAD,PRECIO,FE,FA,DESCRIPCION});
                
            }
            
                   
        }
        catch(IOException e)
        {
            
        }
    }  
}