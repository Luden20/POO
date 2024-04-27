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
   public Producto agregarProducto(Producto prod,int CantidadComprada)
   {
       Producto aux=prod;
       aux.Vaciar();
       aux.AumentarCantidad(CantidadComprada);
       prod.ReducirCantidad(CantidadComprada);
       Carrito.put(aux.getNombre(), aux);
       return aux;
   }
}
