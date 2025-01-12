/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tienda_electronica;

import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.ImageIcon;

/**
 *
 * @author polip
 */
public class Producto {
    //La categoria va a fuera de esto pero ocuparia tambien hasta 15 char  30 bytes
    private String Codigo;//Codigo debe ser de 5 caracteres       10 bytes
    private String Nombre;//Nombre de hasta 15 caracteres         30 bytes
    private String Marca;//Marca hasta 15 caracteres              30 bytes
    private double Precio;                                //       8 bytes
    private String Descripcion;// Descripcion hasta 40 caracteres 80 bytes
    private int Cantidad;//                                        4 bytes
    private ImageIcon Imagen;
    //                                                            162 bytes por registro+30 por categoria=192
public Producto(String Cod,String Nom,String Marca,double Pre,String Desc,int Cant,ImageIcon imagen)
{
this.Codigo=Cod;
this.Nombre=Nom;
this.Marca=Marca;
this.Precio=Pre;
this.Descripcion=Desc;
this.Cantidad=Cant;
this.Imagen=imagen;
}
public Producto(String Cod,String Nom,String Marca,double Pre,String Desc,int Cant)
{
this.Codigo=Cod;
this.Nombre=Nom;
this.Marca=Marca;
this.Precio=Pre;
this.Descripcion=Desc;
this.Cantidad=Cant;
this.Imagen=null;
}

public void EscribirProducto(RandomAccessFile Archivo)
{
try
{
    Archivo.writeChars(getCodigo());
    System.out.println(getCodigo());
    Archivo.writeChars(getNombre());
    System.out.println(getNombre());
    Archivo.writeChars(getMarca());
    System.out.println(getMarca());
    Archivo.writeDouble(getPrecioUnitarioDouble());
    System.out.println(getPrecioUnitarioDouble()+"");
    Archivo.writeChars(getDescripcion());
    System.out.println(getDescripcion());
    Archivo.writeInt(getCantidadINT());
    System.out.println(""+getCantidadINT());
}
catch(IOException e)
{
 System.out.println("FALLO");
}

}
public ImageIcon getImagen()
{
return Imagen;
}
public String getMarca()
{
return Marca;
}
public String getCodigo()
{
return Codigo;
}
public String getNombre()
{
return Nombre;
}

public String getPrecioUnitario()
{
return String.format("%.2f", Precio);
}
public double getPrecioUnitarioDouble()
{
return Precio;
}
public String getDescripcion()
{
return Descripcion;
}
public String getCantidad()
{
return Cantidad+"";
}
public int getCantidadINT()
{
return Cantidad;
}
public void ReducirCantidad(int c)
{
Cantidad=Cantidad-c;
}
public void AumentarCantidad(int c)
{
Cantidad=Cantidad+c;
}
public void Vaciar()
{
Cantidad=0;
}

public void setCantidad(int cantidad) {
this.Cantidad = cantidad;
}
public String[] getAll()
{
return new String[]{getCodigo(),getNombre(),getCantidad(),getPrecioUnitario(),String.format("%.2f", CalcularPrecioTotal())};
}
public String getAllStr()
{
return "Codigo:"+getCodigo()+"|"+getNombre()+"|"+getCantidad()+" Unidades|"+getPrecioUnitario()+"USD Precio Unitario|"+String.format("%.2f", CalcularPrecioTotal())+"USD Precio";
}
public String[] getAllCompleto()
{
return new String[]{getCodigo(),getNombre(),getMarca(),getCantidad(),getPrecioUnitario(),getDescripcion()};
}
public double CalcularPrecioTotal()
{
return (double)Cantidad*Precio;
}
public void ModificarImagen(ImageIcon imagen)
{
 this.Imagen=imagen;
}
@Override
public String toString() {
return "Nombre:"+Nombre+"Cantidad:"+Cantidad;
}
}
