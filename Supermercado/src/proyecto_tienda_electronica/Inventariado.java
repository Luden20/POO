package proyecto_tienda_electronica;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.swing.JOptionPane;

public class Inventariado {
    //Podran arguemntar que esta clase es innecesaria, pero es para gestionarlo todo de una manera mucho mas facil y sencilla.
    private LinkedHashMap<String,Categoria> Inventario ;
    public Inventariado()        
    {
        Inventario=new LinkedHashMap<String,Categoria>(); 
    }
    public boolean Existe_Categoria(String Categoria)
    {
        return Inventario.containsKey(Categoria);
    }
    public Categoria getCategoria(String Categoria)
    {
        if(Categoria!="NaN")
        {
            return Inventario.get(Categoria);
        }
        return null;
        
    }
    public void agregar_Categoria(String Cat)
    {
        if(!Existe_Categoria(Cat))
        {
            Inventario.put(Cat,new Categoria(Cat));
        }
    }
    public void agregar_Producto(Producto prd,String cat)
    {
        if(!Existe_Categoria(cat))
        {
           agregar_Categoria(cat);
        }
        getCategoria(cat).agregarProducto(prd);
    }
        public void GuardarTodo(File Archivo)
        {
            try{
                RandomAccessFile Arc=new RandomAccessFile(Archivo,"rw");
                Arc.setLength(0);//Importante, borro todo lo que haya en el archivo seleccionado para escribir sin
                Arc.seek(Arc.length());//Me voy hasta bien el final del archivo
                for (Map.Entry<String, Categoria> entry : Inventario.entrySet()) 
                {
                    entry.getValue().Escribir(Arc);
                }
                Arc.close();
            }
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, "Error al guardar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        public void Leer(File Archivo)
        {
            try{
                RandomAccessFile Arc=new RandomAccessFile(Archivo,"rw");
                Arc.seek(0);
                while(Arc.getFilePointer()<Arc.length())//Mientras mi puntero sea menor que la longitud seguire leyendo
                {
                    String Cat="";
                    for(int i =0;i<15;i++)
                    {
                        Cat=Cat+Arc.readChar();
                    }
                    System.out.println("cat"+Cat);
                    String Codigo="";
                    for(int i =0;i<5;i++)
                    {
                        Codigo=Codigo+Arc.readChar();
                    }
                    System.out.println("cod"+Codigo);
                    String Nombre="";
                    for(int i =0;i<15;i++)
                    {
                        Nombre=Nombre+Arc.readChar();
                    }
                    System.out.println("nom"+Nombre);
                    String Marca="";
                    for(int i =0;i<15;i++)
                    {
                        Marca=Marca+Arc.readChar();
                    }
                    System.out.println("mar"+Marca);
                    double Pre=Arc.readDouble();
                    System.out.println("pre"+Pre);
                    String Des="";
                    for(int i =0;i<40;i++)
                    {
                        Des=Des+Arc.readChar();
                    }
                    System.out.println("Des"+Des);
                    int cant=Arc.readInt();
                    System.out.println("CATN"+cant);
                    Producto aux=new Producto(Codigo,Nombre,Marca,Pre,Des,cant);
                    agregar_Producto(aux,Cat);
                }
                Arc.close();
                
                JOptionPane.showMessageDialog(null, "Leido con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(IOException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        public String getContenidoStr()
        {
            String a="";
            for (Map.Entry<String, Categoria> entry : Inventario.entrySet()) 
             {
                 a=a+entry.getValue().get_AllProductosStr();
             }
            return a;
        }
    public Object[] getListado(boolean x)
    {
        LinkedList<String> lista=new LinkedList<String>();
        for (Map.Entry<String, Categoria> entry : Inventario.entrySet()) 
            {
                lista.add(entry.getKey());
            }
        if(x)
        {
            lista.add("NaN");
        }
        
        return lista.toArray();
    }
}
