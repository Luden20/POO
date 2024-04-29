package proyecto_hospital;
public class Ficha_Medica {
    private String NroCita;
    private String Motivo;
    private String Medicamentos;
    private String Examenes;
    private String Fecha;
    private String Diagnostico;
    private Medico Doctor;
   public Ficha_Medica(String NroCita,String Motivo,String Medicamentos,String Examenes,String Fecha,String Diagnostico,Medico Doctor){
       this.NroCita=NroCita;
       this.Motivo=Motivo;
       this.Medicamentos=Medicamentos;
       this.Examenes=Examenes;
       this.Fecha=Fecha;
       this.Diagnostico=Diagnostico;
       this.Doctor=Doctor;
    }
    public String getNroCita(){
       return this.NroCita;
    }
    public String getMotivo(){
        return this.Motivo;
    }
    public String getMedicamentos(){
        return this.getMedicamentos();
    }
    public String getExamenes(){
        return this.Examenes;
    }
    public String getFecha(){
        return this.Diagnostico;
    }
    public Medico getDoctor(){
        return this.Doctor;
    }
}
