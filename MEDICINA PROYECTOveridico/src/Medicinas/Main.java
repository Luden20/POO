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
        a.Ingresar("AB1234", "Analgesia", "Paracetamol", "Genoma Lab", 20, 3.50, "01/01/2024", "01/01/2026", "Alivia dolor. (Paracetamol)");
        a.Ingresar("CD5678", "Analgesia", "Ibuprofeno", "Sandoz", 30, 7.00, "15/02/2024", "15/02/2026", "Reduce inflamación. (Ibuprofeno)");
        a.Ingresar("EF9012", "Antibiot.", "Amoxicilina", "Pfizer", 40, 5.50, "20/03/2024", "20/03/2026", "Trata infecciones. (Amoxicilina)");
        a.Ingresar("GH3456", "Antibiot.", "Ciprofloxacino", "Bayer", 25, 4.80, "05/04/2024", "05/04/2026", "Trata infecciones. (Ciprofloxacino)");
        a.Ingresar("IJ7890", "Antiinfl.", "Aspirina", "Bayer", 100, 8.20, "10/05/2024", "10/05/2026", "Reduce fiebre. (Aspirina)");
        a.Ingresar("KL2345", "Antiinfl.", "Diclofenaco", "Pfizer", 20, 12.50, "25/06/2024", "25/06/2026", "Reduce inflamación. (Diclofenaco)");
        a.Ingresar("MN6789", "Antihist.", "Loratadina", "Bayer", 25, 4.80, "01/07/2024", "01/07/2026", "Alivia alergias. (Loratadina)");
        a.Ingresar("OP1234", "Antihist.", "Cetirizina", "GSK", 35, 15.00, "15/08/2024", "15/08/2026", "Alivia alergias. (Cetirizina)");
        a.Ingresar("QR5678", "Antipirét.", "Paracetamol", "Genoma Lab", 20, 3.50, "01/09/2024", "01/09/2026", "Alivia dolor. (Paracetamol)");
        a.Ingresar("ST9012", "Antipirét.", "Ibuprofeno", "Pfizer", 40, 5.50, "20/03/2024", "20/03/2026", "Reduce inflamación. (Ibuprofeno)");
        ALMACENAMIENTO_CLIENTES cl=new ALMACENAMIENTO_CLIENTES(c);
        Almacenamiento_Medicinas f=new Almacenamiento_Medicinas(p);
        f.Borrar();
        //cl.Borrar();
        Menu ab=new Menu(a,cl,f);
        ab.setTitle("Menu");
        ab.setVisible(true);            
    }
    
}
