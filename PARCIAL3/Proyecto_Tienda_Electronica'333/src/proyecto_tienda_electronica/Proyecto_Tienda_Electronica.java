package proyecto_tienda_electronica;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;

public class Proyecto_Tienda_Electronica {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Inventariado inventariado=new Inventariado();
        Pantalla_Inicio a=new Pantalla_Inicio(inventariado);
        a.setTitle("Menu");
        a.setVisible(true);            
    }
    
}
