/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_tienda_electronica;

import java.io.ByteArrayOutputStream;

/**
 *
 * @author polip
 */
public class Producto {
    private String Codigo;//Codigo debe ser de 5 caracteres       10 bytes
    private String Nombre;//Nombre de hasta 15 caracteres         30 bytes
    private String Marca;//Marca hasta 15 caracteres              30 bytes
    private double Precio;                                //       8 bytes
    private String Descripcion;// Descripcion hasta 40 caracteres 80 bytes
    private int Cantidad;//                                        4 bytes
    //                                                            162 bytes por registro
    public Producto(String Cod,String Nom,String Marca,double Pre,String Desc,int Cant)
    {
        this.Codigo=Cod;
        this.Nombre=Nom;
        this.Marca=Marca;
        this.Precio=Pre;
        this.Descripcion=Desc;
        this.Cantidad=Cant;
    }
    public byte[] getProductoByte()
    {
        ByteArrayOutputStream arr = new ByteArrayOutputStream();
        arr.write(Codigo.getBytes());
        arr.write(Nombre.getBytes());
        arr.write(Marca.getBytes());
        arr.write(Precio.byteValue());
        arr.write(Descripcion.getBytes());
        arr.write(Cantidad.getBytes());
        return new byte[]{getCodigo().getBytes()+getNombre().getBytes()+getPrecioUnitario().getBytes()+getDescripcion().getBytes()+getCantidad().getBytes()};
    }
    public int getBytesPorRegistro()
    {
        return 162;
    }
    public String getCodigo()
    {
        return Codigo;
    }
    public String getNombre()
    {
        return Nombre;
    }
    public String getMarca()
    {
        return Marca;
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
    public String getAllGuardar()
    {
            return getCodigo()+","+getNombre()+","+getPrecioUnitario()+","+getDescripcion()+","+getCantidad();
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
        return new String[]{getCodigo(),getNombre(),getCantidad(),getPrecioUnitario(),getDescripcion()};
    }
    public double CalcularPrecioTotal()
    {
        return (double)Cantidad*Precio;
    }
    @Override
    public String toString() {
        return "Nombre:"+Nombre+"Cantidad:"+Cantidad;
    }
}
