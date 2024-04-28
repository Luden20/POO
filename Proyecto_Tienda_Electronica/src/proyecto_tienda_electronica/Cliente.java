
package proyecto_tienda_electronica;
public class Cliente {
    private String Nombre;
    private String Cedula;
    private String Direccion;
    public Cliente(String N,String C, String D)
    {
        this.Nombre=N;
        this.Cedula=C;
        this.Direccion=D;
    }
    public String getNombre()
    {
        return this.Nombre;
    }
    public String getCedula()
    {
        return this.Cedula;
    }
    public String getDireccion()
    {
        return this.Direccion;
    }
}
