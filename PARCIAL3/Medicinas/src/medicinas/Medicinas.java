package medicinas;

import java.io.File;
import java.io.IOException;

public class Medicinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File u=new File("D://dato.dat");
        Almacenamiento_Medicinas a=new Almacenamiento_Medicinas(u);
        //a.Ingresar("cccccc", "catcatcat1", "nomnomnomnomnom", "facfacfacfacfac", 9999, 9999.99, "D1M1ANI1", "D2M2ANI2");
        //a.Ingresar("kkkkkk", "catcatcat2", "nomnomnomnomn23", "facfacfacfacfac", 4444, 9999.99, "D1M1ANI1", "D2M2ANI2");
        //a.Ingresar("kkkkkk", "catcatcat2", "nomnomnomno4323", "facfacfucfacfac", 4444, 929.9, "asM1ANI1", "D2M2ANI2");
        //System.out.println(a.get("nomnomnomnomn23", "CANTIDAD"));
        System.out.println(a.get("nomnomnomnomn23", "CANTIDAD"));
        a.AgregarCantidad("nomnomnomnomn23",3);
        System.out.println(a.get("nomnomnomnomn23", "CANTIDAD"));
        System.out.println(a.get("nomnomnomnomn23", "PRECIO"));


    }
    
}
