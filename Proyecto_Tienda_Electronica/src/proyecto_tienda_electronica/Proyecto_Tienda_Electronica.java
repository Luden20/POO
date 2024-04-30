package proyecto_tienda_electronica;

import java.util.LinkedHashMap;

public class Proyecto_Tienda_Electronica {

    public static void main(String[] args) {
        // TODO code application logic here
        

        LinkedHashMap<String,Categoria> Existencias=new LinkedHashMap<String,Categoria>();
        Existencias.put("Componentes", new Categoria("Componentes"));
        Existencias.put("Consolas", new Categoria("Consolas"));
        Existencias.put("Celulares", new Categoria("Celulares"));
        Existencias.put("Computadores", new Categoria("Computadores"));
        
        Pantalla_Inicio a=new Pantalla_Inicio(Existencias);
        a.setTitle("Menu");
        a.setVisible(true);
        
        
    }
    
}
