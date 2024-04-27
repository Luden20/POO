package proyecto_tienda_electronica;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Categoria {
    private String Nombre;
    private LinkedHashMap<String,Producto> ProductosAlmacenados;
    public Categoria(String Nombre)
    {
        this.Nombre=Nombre;
        ProductosAlmacenados=new LinkedHashMap<String,Producto>();
    }
    public boolean Existe(Producto Buscado)
    {
        if(ProductosAlmacenados.get(Buscado.getNombre())==null)
        {
            return false;
        }
        return true;
    }
    public void agregarProducto(Producto agregado)
    {
        ProductosAlmacenados.put(agregado.getNombre(),agregado);
    }
    public Object[] getListado()
    {
        LinkedList<String> lista=new LinkedList<String>();
        for (Map.Entry<String, Producto> entry : ProductosAlmacenados.entrySet()) 
            {
                lista.add(entry.getKey());
            }
        return lista.toArray();
    }
            
}
