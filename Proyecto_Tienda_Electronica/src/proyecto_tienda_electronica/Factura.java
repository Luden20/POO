package proyecto_tienda_electronica;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

public class Factura {
    //Atributos de la factura
   private Cliente Comprador;
   private LinkedHashMap<String,Producto> Carrito;
   //El contructor solo requiere cliente 
   public Factura(Cliente c)
   {
       Comprador=c;
       Carrito=new LinkedHashMap<String,Producto>();
   }
   //Funcion para agregar productos y una cantidad
   //El producto
   public void agregarProducto(Producto prod,int CantidadComprada)
   {
       Producto aux=new Producto(prod.getCodigo(),prod.getNombre(),prod.getPrecioUnitarioDouble(),prod.getDescripcion(),0);
       aux.AumentarCantidad(CantidadComprada);
       prod.ReducirCantidad(CantidadComprada);
       if(Carrito.containsKey(aux.getNombre()))
       {
           Carrito.get(aux.getNombre()).AumentarCantidad(CantidadComprada);
       }
       else
       {
           Carrito.put(aux.getNombre(), aux);
       }
       
   }
   public double getTotalProd()
   {
       double precio=0;
       for (Map.Entry<String, Producto> entry : Carrito.entrySet()) 
            {
                precio=precio+entry.getValue().CalcularPrecioTotal();
            }
       return precio;
   }
   public void mostratTabla(DefaultTableModel TC)
   {
       TC.setRowCount(0);
       for (Map.Entry<String, Producto> entry : Carrito.entrySet()) 
            {
                TC.addRow(entry.getValue().getAll());
            }
   }
}
