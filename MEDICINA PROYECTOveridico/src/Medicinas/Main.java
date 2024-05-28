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
        File c=new File("D://cliente.dat");
        File p=new File("D://facaux.dat");
        System.out.println(u.getAbsolutePath());
        Almacenamiento_Medicinas a=new Almacenamiento_Medicinas(u);
        a.Borrar();
        a.Ingresar("cccccc", "lllllllllx", "NNNNNNNNNNNNNNN", "FFFFFFFFFFFFFF1", 99, 9999.99, "D1/M1/ANI1", "D2/M2/ANI2","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        a.Ingresar("kkkkkk", "lllllllllx", "OOOOOOOOOOOOOOO", "FFFFFFFFFFFFFFF", 44, 9999.99, "D1/M3/ANI1", "D2/M2/ANI2","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        a.Ingresar("kkkkkk", "xxxxxxxxxl", "PPPPPPPPPPPPPPP", "FFFFFFFFFFFFFF1", 11, 9291.91, "D2/M1/ANI1", "D2/M2/ANI2","xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        ALMACENAMIENTO_CLIENTES cl=new ALMACENAMIENTO_CLIENTES(c);
        Almacenamiento_Medicinas f=new Almacenamiento_Medicinas(p);
        f.Borrar();
        //cl.Borrar();
        Menu ab=new Menu(a,cl,f);
        ab.setTitle("Menu");
        ab.setVisible(true);            
    }
    
}
