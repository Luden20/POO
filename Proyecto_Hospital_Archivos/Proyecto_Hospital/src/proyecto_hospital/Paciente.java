package proyecto_hospital;
import java.util.LinkedHashMap;
public class Paciente extends Persona {
    private String NroPaciente;  
    private String TipoDeSeguro;
    private String TipoDeSangre;
    private String Alergias;
    private LinkedHashMap<String,Ficha_Medica> ListaCitas = new LinkedHashMap<String,Ficha_Medica>();
    public Paciente(String Cedula, String Nombre, String Apellido, String Contacto, String NroPaciente, String TipoDeSeguro,String TipoDeSangre,String Alergias){
        super(Cedula,Nombre,Apellido,Contacto);
        this.NroPaciente= NroPaciente;
        this.TipoDeSeguro = TipoDeSeguro;
        this.Alergias = Alergias;
        this.TipoDeSangre = TipoDeSangre;
    }
    public String getAlergia(){
        return this.Alergias;
    }
    public String getNroPaciente(){
        return this.NroPaciente;
    }
    public String getTipoDeSangre(){
        return this.TipoDeSangre;
    }
    public String getTipoDeSeguro(){
        return this.TipoDeSeguro;
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
    public void IngresoRegistro(Ficha_Medica Ficha){ 
        ListaCitas.put(Ficha.getNroCita(),Ficha);
    }
    public LinkedHashMap<String,Ficha_Medica> getListaCitas(){
        return this.ListaCitas;
    }
}