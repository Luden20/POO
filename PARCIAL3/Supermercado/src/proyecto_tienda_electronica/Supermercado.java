package proyecto_tienda_electronica;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

public class Supermercado {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Inventariado inventariado=new Inventariado();
        //inventariado.agregar_Producto(new Producto("01234","012345678912345","012345678912345",1,"0123456789012345678901234567890123456789",1), "012345678912345");
        Pantalla_Inicio a=new Pantalla_Inicio(inventariado);
        a.setTitle("Menu");
        a.setVisible(true);            
    }
    
}
