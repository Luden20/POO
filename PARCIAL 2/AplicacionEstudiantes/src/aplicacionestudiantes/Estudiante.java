package aplicacionestudiantes;
//Codigo Reciclado con algunas modificaciones
//Semestre esta como INT porque segun yo el profe habia dicho que tenia mas sentido asi
//Pero puedo estar mal asi que si es asi y deberia ser String avisenme
public class Estudiante
{
	/**Definicion de Datos miembros en la clase*/
	private String Cedula;
	private String Nombre;
	private String Carrera;
	private int Semestre;
	/**Creacion del Constructor*/
	public  Estudiante (String Cedula, String Carrera,String Nombre, int Semestre )
	{
		this.Cedula = Cedula;
		this.Carrera = Carrera;
		this.Semestre = Semestre;
		this.Nombre = Nombre;
	}
        public Estudiante()
        {
            this.Cedula=this.Carrera=this.Nombre="No Existe";
            Semestre=-1;
        }
	/**Creacion funciones miembros que nos permiten consultar los datos miembros sin tener que romper la encapsulacion*/
	public String getCedula(){
		return this.Cedula;
	}
	public String getCarrera(){
		return this.Carrera;
	}
        public String getSemestre()
        {
            return this.Semestre+"";        
        }
        public String getNombre()
        {
            return this.Nombre;
        }
        public String[] getAll()
        {
            return new String[]{this.Cedula,this.Nombre,this.Carrera,this.Semestre+""};
        }
        //Es un override y le pego al que no sepa que es un override 
        @Override
	public String toString()
	{
		return "Cedula: "+this.Cedula+" Estudiante "+this.Nombre+" Carrera: "+this.Carrera+" Semestre : "+this.Semestre;
	}
}
