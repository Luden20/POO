import java.io.*;
public class Archivo {
    private String Nombre;
    private String Path;
    private String Contenido;
    
    public Archivo (String Nombre, String Path, String Contenido){
        this.Nombre = Nombre;
        this.Path = Path;
        this.Contenido = Contenido;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public String getPath(){
        return this.Path;
    }
    public String getContenido(){
        return this.Contenido;
    }
    public void guardarContenido() throws IOException {
    File file = new File(Path, Nombre);
    try (PrintWriter out = new PrintWriter(new FileWriter(file))) {
            out.print(Contenido);
<<<<<<< HEAD
            
=======
>>>>>>> 8860b61f906033e9a85cd36af7d961f72a78e4c7
        }
    }
}
