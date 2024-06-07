package proyecto_hospital;
public class Persona {
  private String Cedula;  
  private String Nombre;
  private String Apellido;
  private String Contacto;
  public Persona(String Cedula, String Nombre, String Apellido, String Contacto){
  this.Cedula=Cedula;
  this.Nombre=Nombre;
  this.Apellido=Apellido;
  this.Contacto=Contacto;
  }
  public String getCedula(){
      return this.Cedula;
  }
  public String getNombre(){
      return this.Nombre;
  }
  public String getApellido(){
      return this.Apellido;
  }
  public String getContacto(){
      return this.Contacto;
  }     
}
