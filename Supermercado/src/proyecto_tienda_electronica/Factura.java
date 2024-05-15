package proyecto_tienda_electronica;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;
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
   //El producto se agrega en esta funcion y ademas se le ingresa una cantidad que se va a comprar
   //El producto ingresado es el del inventario
   //copiamos sus datos para generar un nuevo producto igual pero que que tiene la cantidad que compramos
   //Este ultumo se le agrega a la factura
   public void agregarProducto(Producto prod,int CantidadComprada)
   {
       Producto aux=new Producto(prod.getCodigo(),prod.getNombre(),prod.getMarca(),prod.getPrecioUnitarioDouble(),prod.getDescripcion(),0);
       aux.AumentarCantidad(CantidadComprada);
       if(Carrito.containsKey(aux.getNombre()))
       {
           Carrito.get(aux.getNombre()).AumentarCantidad(CantidadComprada);
       }
       else
       {
           Carrito.put(aux.getNombre(), aux);
       }
       
   }
   //Sirve para calcular el precio total de los productos
   public double getTotalProd()
   {
       double precio=0;
       for (Map.Entry<String, Producto> entry : Carrito.entrySet()) 
            {
                precio=precio+entry.getValue().CalcularPrecioTotal();
            }
       return precio;
   }
   //Sirve para mostrar recibe un tablemodel y lo modifica con los datos
   public void mostratTabla(DefaultTableModel TC)
   {
       //borro todo
       TC.setRowCount(0);
       //agrego producto por producto
       for (Map.Entry<String, Producto> entry : Carrito.entrySet()) 
            {
                TC.addRow(entry.getValue().getAll());
            }
   }
   public void Escribir(File Archivo)
   {
       try
        {
            RandomAccessFile Arc=new RandomAccessFile(Archivo,"rw");
            Arc.writeChars(InfoFactura());
            Arc.close();
            JOptionPane.showMessageDialog(null, "Factura guardada con exito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(IOException e)
        {
         System.out.println("FALLO");
        }
   }
   public String Leer(File Archivo)
   {
       String x="Error";
       try
       {
           
           RandomAccessFile Arc=new RandomAccessFile(Archivo,"rw");
           x="";
           while(Arc.getFilePointer()<Arc.length())
           {
               x=x+Arc.readChar();
           }
           Arc.close();
       }
       catch(IOException e)
       {
           JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       }
       return x;
   }
   public String InfoFactura()
   {
           String x="";
           x=x+"FACTURA BUDGET GALAXY\n";
           x=x+Comprador.get_Datos();
           x=x+"PRODUCTOS\n";
                  for (Map.Entry<String, Producto> entry : Carrito.entrySet()) 
            {
                x=x+entry.getValue().getAllStr()+"\n";
            }
           x=x+"Total: "+getTotalProd()+"USD\n";
           x=x+"Gracias por comprar con nosotros =D";
           return x;
             
   }
}
