
package Medicinas;
public class Cliente {
    //Clase que guarda datos del cliente
    //Nada del otro mundo
    private String Nombre;
    private String Cedula;
    private String Direccion;
    public Cliente(String N,String C, String D)
    {
        this.Nombre=N;
        this.Cedula=C;
        this.Direccion=D;
    }
    public Cliente()
    {
        this.Nombre="";
        this.Cedula="";
        this.Direccion="";
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
    public String get_Datos()
    {
        return "Nombre:"+ getNombre()+"\n"+"Cedula:"+getCedula()+"\n"+"Direccion:"+getDireccion()+"\n";
    }
}
