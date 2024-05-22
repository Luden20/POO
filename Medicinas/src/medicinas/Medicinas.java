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
        a.Ingresar("123456", "1111111111", "222222222222222", "333333333333333", 9999, 9999.99, "31122024", "31122030");
        System.out.println(a.get("123456","PRECIO"));

    }
    
}
