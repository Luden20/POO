package proyecto_tienda_electronica;

import java.util.LinkedHashMap;

public class Factura {
   private Cliente Comprador;
   private LinkedHashMap<String,Producto> Carrito;
   public Factura(Cliente c)
   {
       Comprador=c;
       Carrito=new LinkedHashMap<String,Producto>();
   }
   public void agregarProducto(Producto prod)
   {
       Producto aux=prod;
       
       Carrito.put(key, value)
   }
}
