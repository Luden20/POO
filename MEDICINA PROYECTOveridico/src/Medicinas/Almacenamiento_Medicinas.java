package Medicinas;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Almacenamiento_Medicinas {
    private File file;
    public Almacenamiento_Medicinas(File A)
    {
        file=A;
    }
    public void Copiar(File Dest)
    {
        try {
                Files.copy(file.toPath(), Dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } 
        catch (IOException e) {
        }
    }
    //ES IMPORTANTE DIFINIR BIEN QUE ATRIBUTOS HABARA Y QUE BYTES OCUPARAN
    //EL ORDEN ES IMPORTANTE
    //Cada registro tiene 7 atributos y 344 bytes
    //1.CODIGO  6 chars 12 bytes 
    //2.CATEGORIA 10 chars 20 bytes
    //3.NOMBRE  15 chars ,30 bytes  
    //4.FABRICANTE 15 chars, 30 bytes
    //5.CANTIDAD int 4 bytes
    //6.PRECIO double 8 bytes
    //7.FE(Fecha elaboracion) 10 chars ,20 bytes "DD/MM/AAAA"
    //8.FA(Fecha de vencimiento) 10 chars ,20 bytes "DD/MM/AAAA"
    //9.DESCRIPCION 50 chars,100 bytes
    //10.DI (Direccion de una foto) 50 chars,100 bytes
    
    //EN EL INGRESO DE DATOS SE DEFINEN LOS ORDENES DE LOS DATOS
    //ES IMPORTANTE RESPETAR ESTE ORDEN SIEMPRE
    //EN CASO DE AGREGAR MAS ATRIBUTOS SE RECOMIENDA AGREGAR DESDE EL FINAL Y NO REORGANIZAR TODO
    
    //PESE A QUE EXISTE CODIGO, LO QUE REALMENTE SE USA COMO IDENTIFICADOR ES EL NOMBRE DE LA MEDICINA
    //TODO GIRA EN TORNO A ESO
    
        public void Ingresar(String Codigo,String Categoria,String Nombre,String Fabricante,int Cantidad,double Precio,String FE,String FA,String Des,String FD)
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
                RAC.writeChars(FA);
                RAC.writeChars(Des);
                RAC.writeChars(FD);
            }
            else if (Existe(Identificador()))
            {
                AgregarCantidad(Identificador(),Cantidad);
            }
            
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
    }
    public void Ingresar(String Codigo,String Categoria,String Nombre,String Fabricante,int Cantidad,double Precio,String FE,String FA,String Des)
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            if(Existe(Nombre))
            {
                System.out.print("YA EXISTE SOLO SE AGREGA");
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
                RAC.writeChars(FA);
                RAC.writeChars(Des);
                RAC.writeChars("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");//En caso de ser en otra pese, adjuntar una imagen cualquiera
            }
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
    }
    //ESTAS SON FUNCIONES AUXILIARES
    //NOS SERVIRAN PARA QUE LAS FUNCIONES MAS COMPLEJAS FUNCIONEN
    //LOS NOMBRES DE LOS ATRIBUTOS SE MANEJAN EN MAYUSCULAS
    //ES IMPORTANTE QUE LOS NOMBRES SEAN IGUALES EN TODAS LAS FUNCIONES SIGUIENTES
    public int BytesPorRegistro()
    {
        return 344;
    }
    //AQUI SELECCIONAR EL ATRIBUTO A USAR COMO CLAVE DE UN REGISTRO
    public String Identificador()
    {
        return "NOMBRE";
    } 
    //CON ESTA DEFINO LOS BYTES DE CADA ATRIBUTO PARA USARLOS POR REFERNCIA EN LAS DEMAS FUNCIONES
    //BYTES DE Y CHARS DE DEBEN IR EN CONSONANCIA
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
            case "FE" -> 20;
            case "FA" -> 20;
            case "DESCRIPCION"->100;
            case "DI"->100;
            default -> -1;
        };
    }
        //PARA LAS VARIABLES STRING DEBO ESPECIFICAR CUANTOS CHARACTERES OCUPO
          public long CharsDe(String AT)
    {
        AT=AT.toUpperCase();
        return switch (AT) {
            case "CODIGO" -> 6;
            case "CATEGORIA" -> 10;
            case "NOMBRE" -> 15;
            case "FABRICANTE" -> 15;
            case "FE" -> 10;
            case "FA" -> 10;
            case "DESCRIPCION"->50;
            case "DI"->50;
            default -> -1;
        };
    }
    //ME DICE CUANTOS BYTES TENGO QUE SALTAR DESDE EL INICIO DEL REGISTRO HASTA EL INICIO DEL ATRIBUTO REQUERIDO
    //SI AGREGO MAS ATRIBUTOS DEBO MANEJARO DESDE AQUI 
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
                bytesHasta = 12 + 20 + 30 + 30 + 4 + 8 + 20;
                break;
            case "DESCRIPCION":
                bytesHasta = 12 + 20 + 30 + 30 + 4 + 8 + 20 + 20;
                break;
            case "DI":
                bytesHasta = 12 + 20 + 30 + 30 + 4 + 8 + 20 + 20 + 100;
                break;
            default:
                bytesHasta = -1;
                break;
        }
        //System.out.println("Salte "+bytesHasta+" bytes");
        return bytesHasta;
    }
    
    //ESTA EN ESPECIFICO NOS DICE DONDE LA POSICION EN BYTES DE EL INICIO DE UNA TRIBUTO DE UN REGISTRO CON UN NOMBRE ESPECIFICO
    //SI QUISIERA AGREGAR MAS ATRIBUTOS ESTA NO TOPO, LA DE ARRIBA MANEJA ESO
        public long BuscarPunteroAtributo(String AT,String Nombre)
    {
        AT=AT.toUpperCase();
        long AP=BuscarPuntero(Nombre);
        //System.out.println("Puntero inicial en "+BuscarPuntero(Codigo));
        return AP+BytesHasta(AT);
    }
    //ME DICE CUANTOS BYTES DEBO SALTAR DESDE EL FINAL DEL ATRIBUTO EN EL QUE ESTOY PARA LLEGAR AL FINAL DEL REGISTRO
    // SI QUIERO AGREGAR NUEVOS ATRIBUTOS DEBO AGREGAR MANUALMENTE AQUI
    //ES IMPORTANTE TOMAR EN CUENTA QUE ESTO NO ES IGUAL A LAS FUNCIONES ANTERIORES
    //ESTE CUENTA DESDE EL FINAL DELA TRIBUTO AL FINAL DEL REGISTRO
    public long BytesHastaFinalPartiendoDe(String at) {
        long aux = BytesPorRegistro();
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
                aux -= (12 + 20 + 30 + 30 + 4 + 8 + 20);
                break;
            case "FA":
                aux -= (12 + 20 + 30 + 30 + 4 + 8 + 20 + 20);
                break;
            case "DESCRIPCION":
                aux -= (12 + 20 + 30 + 30 + 4 + 8 + 20 + 20 + 100);
                break;
            case "DI":
                aux -= (12 + 20 + 30 + 30 + 4 + 8 + 20 + 20 + 100 + 100);
                break;
            default:
                break;
        }
        return aux;
    }
    //SI HASTA AQUI TODO SE HA DEFINIDO BIEN , EL RESTO SE HACE SOLO
    
    
    //FUNCION QUE BORRA TODO EL RANDOMICO
    //USAR CON EXTREMO CUIDADO
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
    
    //METODO PARA EXTRAER UN ATRIBUTO ESPECIFICO DE UN REGISTRO ESPECIFICO EN FORMATO DE STRING
    public String get(String Nombre,String Atributo)
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            if(Existe(Nombre))
            {
                RAC.seek(BuscarPunteroAtributo(Atributo,Nombre)); 
                switch(Atributo)
                {
                    //AQUI ES DONDE DEBO HACER DIFERENTES COSAS EN FUNCION DE QUE REQUIERA
                    //SI EL ATRIBUTO ES UN INT DEBO AGREGARLO AQUI
                    case "CANTIDAD" -> {
                        return ""+RAC.readInt();
                    }
                    //SI ES UN DOUBLE AQUI
                    case "PRECIO" -> {
                        return ""+RAC.readDouble();
                    }
                    //SI ES UN STRING AQUI, PERO ES IMPORTANTE QUE LA CANTIDAD DE CHARS ESTE BIEN DEFINIDA
                    case "CODIGO", "CATEGORIA", "NOMBRE", "FABRICANTE","DESCRIPCION","DI","FA","FE" -> {
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
            return "null";
        }
        catch(IOException e)
        {
            System.out.println("IOE");
            return "IOException";
        }
    }
    //FUNCION QUE VALIDA QUE EXISTA EL NOMBRE BUSCADO
    public boolean Existe(String NB)
    {
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            while(RAC.getFilePointer()<RAC.length())
            {
                RAC.skipBytes((int)BytesHasta(Identificador()));
                String Nombre ="";
                for(int i =0;i<CharsDe(Identificador());i++)
                {
                    Nombre=Nombre+RAC.readChar();
                }
                if(!Nombre.equals(NB))
                {
                    RAC.skipBytes((int)BytesHastaFinalPartiendoDe(Identificador()));
                }
                else
                {
                    RAC.close();
                    //System.out.println("Existe");
                    return true;
                }
            }
            RAC.close();
            //System.out.println("No existe");
            return false;
        }
        catch(IOException e)
        {
            return false;
        }
    }
    //SOBREESCRITURA DE DATOS
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
    //FUNCION QUE DEVUELVE EL PUNTERO INICIAL DE UN REGISTRO EN BASE AL NOMBRE BUSCADO
    public long BuscarPuntero(String NB)
    {
        long Puntero=-1;
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(0);
            while(RAC.getFilePointer()<RAC.length())
            {
                RAC.skipBytes((int)BytesHasta(Identificador()));
                String Nombre ="";
                for(int i =0;i<CharsDe(Identificador());i++)
                {
                    Nombre=Nombre+RAC.readChar();
                }
                if(!Nombre.equals(NB))
                {
                    RAC.skipBytes((int)BytesHastaFinalPartiendoDe(Identificador()));
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
    //ESTA FUNCION NOS DA EL LISTADO DE MEDICINAS/NOMBRES EN FUNCION DE LA CATEGORIA INGRESADA
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
    //ESTA FUNCION DEVUELE TODAS LAS CATEGORIAS
    
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
    
    //ESTA FUNCION FUNCIONA CON EL ATRIBUTO CANTIDAD, AGREGA CANTIDAD AL REGISTRO CORRESPONDIENTE
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
    //MISMO FUNCIONAMIENTO, PERO CON RESTA
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
    //ESTA FUNCION MANEJA LAS TABLAS, PERO SOLO DE LOS PRODUCTOS DE UNA CATEGORIA
    public void MostrarTabla(String CategoriaB,DefaultTableModel TC)
    {
        //EN FUNCION DE LOS REGISTROS CREEO LOS IDS PARA LAS COLUMNAS
        String ids [] = {"Codigo","Nombre","Fabricante","Cantidad","Precio","FE","FA","Descripcion"};
        TC.setColumnIdentifiers(ids);
        //BORRO EL CONTENIDO DE LA TABLA 
        TC.setRowCount(0);
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(0);
            while(RAC.getFilePointer()<RAC.length())
            {
                //RECORRIDO COMPLETO DE UN REGISTRO Y ALMACENAMIENTO EN VARIABLES AUXILIARES
                //EN CASO DE AGREGAR ATRIBUTOS DEBO CAMBIAR AQUI TAMBIEN
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
                //AQUI IRIAN NUEVOS ATRIBUTOS
                
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
    //TABLA QUE MUESTRA TODO SIN DISCRIMAR POR CATEGORIAS
    public void MostrarTabla(DefaultTableModel TC)
    {
        String ids [] = {"Codigo","Nombre","Fabricante","Cantidad","Precio","FE","FA","Descripcion"};
        TC.setColumnIdentifiers(ids);
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
    //LA SIGUIENTE SECCION SE ENCARGA DE MANEJAR LAS ESTADISTICAS, COMO CANTIDAD DE PRODUCTOS EN CATEGORIA Y CANTIDAD POR PRODUCTOS
    
    //ESTA ME DICE CUANTOS PRODUCTOS HAY POR CATEGORIA, PRODUCTOS NO CANTIDAD DE PRODUCTOS
    //UN PRODUCTO CON 1 SERIA IGUALA AUNO CON 100
    public LinkedHashMap<String, Integer> RepeticionesDe(String At) 
    {
        LinkedHashMap<String, Integer> aux = new LinkedHashMap<String, Integer>();
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(0);
            while(RAC.getFilePointer()<RAC.length())
            {
                RAC.skipBytes((int)BytesHasta(At));
                String Saux ="";
                for(int i =0;i<CharsDe(At);i++)
                {
                    Saux=Saux+RAC.readChar();
                }
                 if(aux.containsKey(Saux))
                 {
                    aux.put(Saux,aux.get(Saux)+1);
                 }
                 else
                 {
                    aux.put(Saux,1);
                 }
                 RAC.skipBytes((int)BytesHastaFinalPartiendoDe(At));
   
            }
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
        return aux;
    } 
    public LinkedHashMap<String, Integer> RepeticionesDeTomandoEnCuentaCantidad(String At) 
    {
        LinkedHashMap<String, Integer> aux = new LinkedHashMap<String, Integer>();
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(0);
            while(RAC.getFilePointer()<RAC.length())
            {
                RAC.skipBytes((int)BytesHasta(At));
                String Saux ="";
                for(int i =0;i<CharsDe(At);i++)
                {
                    Saux=Saux+RAC.readChar();
                }
                //Regreso al inicio
                 RAC.seek(RAC.getFilePointer()-BytesPorRegistro()+BytesHastaFinalPartiendoDe(At));
                 RAC.skipBytes((int)BytesHasta("CANTIDAD"));
                 int Cantidad=RAC.readInt();
                 if(aux.containsKey(Saux))
                 {
                    aux.put(Saux,aux.get(Saux)+Cantidad);
                 }                
                 else
                 {
                    aux.put(Saux,Cantidad);
                 }
                 RAC.skipBytes((int)BytesHastaFinalPartiendoDe("CANTIDAD"));
   
            }
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
        return aux;
    }
    public LinkedHashMap<String, Double> RepeticionesDeTomandoEnCuentaCantidadyPrecio(String At) 
    {
        LinkedHashMap<String, Double> aux = new LinkedHashMap<String, Double>();
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(0);
            while(RAC.getFilePointer()<RAC.length())
            {
                RAC.skipBytes((int)BytesHasta(At));
                String Saux ="";
                for(int i =0;i<CharsDe(At);i++)
                {
                    Saux=Saux+RAC.readChar();
                }
                //Regreso al inicio
                 RAC.seek(RAC.getFilePointer()-BytesPorRegistro()+BytesHastaFinalPartiendoDe(At));
                 RAC.skipBytes((int)BytesHasta("CANTIDAD"));
                 int Cantidad=RAC.readInt();
                 double Precio=RAC.readDouble();
                 if(aux.containsKey(Saux))
                 {
                    aux.put(Saux,aux.get(Saux)+((double)Cantidad*Precio));
                 }                
                 else
                 {
                    aux.put(Saux,(double)Cantidad*Precio);
                 }
                 RAC.skipBytes((int)BytesHastaFinalPartiendoDe("PRECIO"));
   
            }
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
        return aux;
    } 
    //ESTOS ME DICEN CUANTOS DIFERENTES HAY DE ALGO, POR EJEMPLO ME CUENTA 
    //SOLO FUNCIONA CON DATOS DE TIPO STRING
     public void graficoBarrasDeDiferentesDe(String At) 
    {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        LinkedHashMap<String, Integer> aux=RepeticionesDe(At);
        for (Map.Entry<String, Integer> entry : aux.entrySet()) {
            String categoria = entry.getKey();
            Integer cantidad = entry.getValue();
            datos.addValue(cantidad, categoria, categoria);
        }
        JFreeChart grafico = ChartFactory.createBarChart("Cantidad por "+At+" sin tomar en cuenta cantidad", At, "Cantidad", datos);
        ChartFrame frame = new ChartFrame("Gráfico de barras  sin tomar en cuenta cantidad", grafico);
        frame.setVisible(true);
        frame.setSize(800, 600);
    }
    public void graficoPastelDeDiferentesDe(String At)  {
        DefaultPieDataset datos = new DefaultPieDataset();
        LinkedHashMap<String, Integer> aux=RepeticionesDe(At);
        for (Map.Entry<String, Integer> entry : aux.entrySet()) {
            String categoria = entry.getKey();
            Integer cantidad = entry.getValue();
            datos.setValue(categoria,cantidad);
        }
        JFreeChart grafico = ChartFactory.createPieChart("Cantidad por "+At+" sin tomar en cuenta cantidad", datos);
        ChartFrame frame = new ChartFrame("Gráfico de pastel sin tomar en cuenta cantidad", grafico);
        frame.setVisible(true);
        frame.setSize(800, 600);
    }
    
         public void graficoBarrasDeDiferentesDeTomandoCuentaCantidad(String At) 
    {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        LinkedHashMap<String, Integer> aux=RepeticionesDeTomandoEnCuentaCantidad(At);
        for (Map.Entry<String, Integer> entry : aux.entrySet()) {
            String categoria = entry.getKey();
            Integer cantidad = entry.getValue();
            datos.addValue(cantidad, categoria, categoria);
        }
        JFreeChart grafico = ChartFactory.createBarChart("Cantidad por "+At+" tomando en cuenta cantidad", At, "Cantidad", datos);
        ChartFrame frame = new ChartFrame("Gráfico de barras tomando en cuenta cantidad", grafico);
        frame.setVisible(true);
        frame.setSize(800, 600);
    }
    public void graficoPastelDeDiferentesDeTomandoEnCuentaCantidad(String At)  {
        DefaultPieDataset datos = new DefaultPieDataset();
        LinkedHashMap<String, Integer> aux=RepeticionesDeTomandoEnCuentaCantidad(At);
        for (Map.Entry<String, Integer> entry : aux.entrySet()) {
            String categoria = entry.getKey();
            Integer cantidad = entry.getValue();
            datos.setValue(categoria,cantidad);
        }
        JFreeChart grafico = ChartFactory.createPieChart("Cantidad por "+At+" tomando en cuenta cantidad", datos);
        ChartFrame frame = new ChartFrame("Gráfico de pastel tomando en cuenta cantidad", grafico);
        frame.setVisible(true);
        frame.setSize(800, 600);
    }
    
    public void graficoBarrasDeDiferentesDeTomandoCuentaCantidadyPrecio(String At) 
    {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        LinkedHashMap<String, Double> aux=RepeticionesDeTomandoEnCuentaCantidadyPrecio(At);
        for (Map.Entry<String, Double> entry : aux.entrySet()) {
            String categoria = entry.getKey();
            Double cantidad = entry.getValue();
            datos.addValue(cantidad, categoria, categoria);
        }
        JFreeChart grafico = ChartFactory.createBarChart("Cantidad por "+At+" tomando en cuenta cantidad por precio", At, "Cantidad X Precio", datos);
        ChartFrame frame = new ChartFrame("Gráfico de barras tomando en cuenta cantidad * precio", grafico);
        frame.setVisible(true);
        frame.setSize(800, 600);
    }
    public void graficoPastelDeDiferentesDeTomandoEnCuentaCantidadyPrecio(String At)  {
        DefaultPieDataset datos = new DefaultPieDataset();
        LinkedHashMap<String, Double> aux=RepeticionesDeTomandoEnCuentaCantidadyPrecio(At);
        for (Map.Entry<String, Double> entry : aux.entrySet()) {
            String categoria = entry.getKey();
            Double cantidad = entry.getValue();
            datos.setValue(categoria,cantidad);
        }
        JFreeChart grafico = ChartFactory.createPieChart("Cantidad por "+At+" tomando en cuenta cantidad por precio", datos);
        ChartFrame frame = new ChartFrame("Gráfico de pastel tomando en cuenta cantidad * precio", grafico);
        frame.setVisible(true);
        frame.setSize(800, 600);
    }
    
    public void graficoBarrasProductosyCategorias()
    {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(0);
            while(RAC.getFilePointer()<RAC.length())
            {
                RAC.skipBytes((int)BytesHasta("CATEGORIA"));
                String Cat ="";
                for(int i =0;i<CharsDe("CATEGORIA");i++)
                {
                    Cat=Cat+RAC.readChar();
                }
                String Prd ="";
                for(int i =0;i<CharsDe("NOMBRE");i++)
                {
                    Prd=Prd+RAC.readChar();
                }
                RAC.skipBytes((int)BytesDe("FABRICANTE"));
                int cantidad=RAC.readInt();
                RAC.skipBytes((int)BytesHastaFinalPartiendoDe("CANTIDAD"));
                datos.addValue(cantidad, Cat, Prd);
            }
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
        JFreeChart grafico = ChartFactory.createBarChart("Cantidad por Producto y Categoria", "Categoría", "Cantidad", datos);
        ChartFrame frame = new ChartFrame("Gráfico de barras", grafico);
        frame.setVisible(true);
        frame.setSize(800, 600);
    }
    
        public void graficoPastelProductos()
    {
        DefaultPieDataset datos = new DefaultPieDataset();
        try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
        {
            RAC.seek(0);
            while(RAC.getFilePointer()<RAC.length())
            {
                RAC.skipBytes((int)BytesHasta("NOMBRE"));
                String Prd ="";
                for(int i =0;i<CharsDe("NOMBRE");i++)
                {
                    Prd=Prd+RAC.readChar();
                }
                RAC.skipBytes((int)BytesDe("FABRICANTE"));
                int cantidad=RAC.readInt();
                RAC.skipBytes((int)BytesHastaFinalPartiendoDe("CANTIDAD"));
                datos.setValue(Prd,cantidad);
            }
            RAC.close();         
        }
        catch(IOException e)
        {
            
        }
        JFreeChart grafico = ChartFactory.createPieChart("Cantidad por Producto", datos);
        ChartFrame frame = new ChartFrame("Gráfico de pastel", grafico);
        frame.setVisible(true);
        frame.setSize(800, 600);
    }
        public double ValorTotal()
        {
            double PTotal=0;
            try(RandomAccessFile RAC=new RandomAccessFile(file,"rw"))
            {
                RAC.seek(0);
                while(RAC.getFilePointer()<RAC.length())
                {
                    RAC.skipBytes((int)BytesHasta("CANTIDAD"));
                    int Cantidad=RAC.readInt();
                    double Precio=RAC.readDouble();
                    PTotal=PTotal+(Precio*(double)Cantidad);
                    RAC.skipBytes((int)BytesHastaFinalPartiendoDe("PRECIO"));
                }
                    RAC.close();         
                }
                catch(IOException e)
                {

                }
            return PTotal;
        }
}