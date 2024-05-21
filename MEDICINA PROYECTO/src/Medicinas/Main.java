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
        a.Ingresar("cccccc", "llllllllll", "NNNNNNNNNNNNNNN", "FFFFFFFFFFFFFFF", 99, 9999.99, "D1M1ANI1", "D2M2ANI2","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        a.Ingresar("kkkkkk", "xxxxxxxxxx", "OOOOOOOOOOOOOOO", "FFFFFFFFFFFFFFF", 44, 9999.99, "D1M1ANI1", "D2M2ANI2","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        a.Ingresar("kkkkkk", "xxxxxxxxxx", "PPPPPPPPPPPPPPP", "FFFFFFFFFFFFFFF", 11, 9291.91, "asM1ANI1", "D2M2ANI2","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        //System.out.println(a.get("NNNNNNNNNNNNNNN", "CANTIDAD"));
        a.getListadoCategorias(true);
        Pantalla_Inicio ab=new Pantalla_Inicio(a);
        ab.setTitle("Menu");
        ab.setVisible(true);            
    }
    
}
