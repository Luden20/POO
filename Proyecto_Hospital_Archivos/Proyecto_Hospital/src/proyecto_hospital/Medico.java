package proyecto_hospital;
public class Medico extends Persona{
  private String NLicencia;  
  private String Especialidad;
  public Medico(String Cedula, String Nombre, String Apellido, String Contacto, String NLicencia, String Especialidad){
  super(Cedula,Nombre,Apellido,Contacto);
  this.NLicencia=NLicencia;
  this.Especialidad=Especialidad;  
  }
  public String getNLicencia(){
      return this.NLicencia;
  }
  public String getEspecialidad(){
      return this.Especialidad;
  }
  public String getCedula(){
      return super.getCedula();
  }
  public String getNombre(){
      return super.getNombre();
  }
  public String getApellido(){
      return super.getApellido();
  }
  public String getContacto(){
      return super.getContacto();
  }     
}