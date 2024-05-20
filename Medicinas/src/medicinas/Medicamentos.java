package medicinas;
public class Medicamentos {
    //1.Codigo  6 chars 12 bytes,primeros 3 indican categoria y otros 3 indican numero "COD111", es obligatorio ocupar todo sin usar " " 
    //2.Nombre  15 chars ,30 bytes  
    //3.Fabricante 15 chars, 30 bytes
    //4.Cantidad int 4 bytes
    //5.Precio double 8 bytes
    //6.Fecha elaboracion 8 chars ,16 bytes "DDMMAAAA"
    //7.Fecha de vencimiento 8 chars ,16 bytes "DDMMAAAA"
    private String Codigo;
    private String Nombre;
    private String Fabricante;
    private int Cantidad;
    private double Precio;
    private String Fecha_Elaboracion;
    private String Fecha_Vencimiento;
    public Medicamentos(String Cod,String Nom,String Fab,int Cant,double Pre,String FE,String FV)
    {
        this.Codigo=Cod;
        this.Nombre=Nom;
        this.Fabricante=Fab;
        this.Cantidad =Cant;
        this.Precio=Pre;
        this.Fecha_Elaboracion=FE;
        this.Fecha_Vencimiento=FV;
    }  
}
