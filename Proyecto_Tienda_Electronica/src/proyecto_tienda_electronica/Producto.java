/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tienda_electronica;

/**
 *
 * @author polip
 */
public class Producto {
    private String Codigo;
    private String Nombre;
    private double Precio;
    private String Descripcion;
    private int Cantidad;
    public Producto(String Cod,String Nom,double Pre,String Desc,int Cant)
    {
        this.Codigo=Cod;
        this.Nombre=Nom;
        this.Precio=Pre;
        this.Descripcion=Desc;
        this.Cantidad=Cant;
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
        return Precio+"";
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

    public String[] getAll()
    {
        return new String[]{getCodigo(),getNombre(),getCantidad(),getPrecioUnitario()};
    }
    public double CalcularPrecioTotal()
    {
        return (double)Cantidad*Precio;
    }
}
