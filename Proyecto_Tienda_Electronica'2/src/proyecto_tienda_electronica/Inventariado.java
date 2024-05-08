package proyecto_tienda_electronica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;

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
        return Inventario.get(Categoria);
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
    public void ingresar_datos(FileReader v)
    {
        try
        {
            FileReader e=v;
            BufferedReader b=new BufferedReader(e);
            String x;
            while((x=b.readLine())!=null)
            {
                System.out.println("linea leida");
                StringTokenizer st=new StringTokenizer(x,",");
                String Categoria=st.nextToken();
                String Codigo=st.nextToken();
                String Nombre=st.nextToken();
                double Precio = Double.parseDouble(st.nextToken()); 
                String Descripcion = st.nextToken();
                int Cantidad = Integer.parseInt(st.nextToken());
                Producto aux=new Producto(Codigo,Nombre,Precio,Descripcion,Cantidad);
                agregar_Producto(aux,Categoria);
            }
        }
        catch (IOException e) {
            // Manejar cualquier error de lectura de archivo
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    public Object[] getListado()
    {
        LinkedList<String> lista=new LinkedList<String>();
        for (Map.Entry<String, Categoria> entry : Inventario.entrySet()) 
            {
                lista.add(entry.getKey());
            }
        return lista.toArray();
    }
}
