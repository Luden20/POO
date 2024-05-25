package Medicinas;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import Medicinas.Almacenamiento_Medicinas;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        File u=new File("D://dato.dat");
        Almacenamiento_Medicinas a=new Almacenamiento_Medicinas(u);
        a.Borrar();
        a.Ingresar("cccccc", "llllllllll", "NNNNNNNNNNNNNNN", "FFFFFFFFFFFFFF1", 99, 9999.99, "D1/M1/ANI1", "D2/M2/ANI2","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        a.Ingresar("kkkkkk", "xxxxxxxxxx", "OOOOOOOOOOOOOOO", "FFFFFFFFFFFFFFF", 44, 9999.99, "D1/M3/ANI1", "D2/M2/ANI2","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        a.Ingresar("kkkkkk", "xxxxxxxxxx", "PPPPPPPPPPPPPPP", "FFFFFFFFFFFFFF1", 11, 9291.91, "D2/M1/ANI1", "D2/M2/ANI2","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
       // a.getListadoCategorias(true);
        a.graficoBarrasDeDiferentesDeTomandoCuentaCantidadyPrecio("FABRICANTE");
        //Pantalla_Inicio ab=new Pantalla_Inicio(a);
        //ab.setTitle("Menu");
        //ab.setVisible(true);            
    }
    
}
