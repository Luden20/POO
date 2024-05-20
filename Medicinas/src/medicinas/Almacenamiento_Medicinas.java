package medicinas;

import java.io.File;

public class Almacenamiento_Medicinas {
    private File file;
    public Almacenamiento_Medicinas(File A)
    {
        file=A;
    }
    //Cada registro tiene 7 atributos y 116 bytes
    //1.Codigo  6 chars 12 bytes,primeros 3 indican categoria y otros 3 indican numero "COD111", es obligatorio ocupar todo sin usar " " 
    //2.Nombre  15 chars ,30 bytes  
    //3.Fabricante 15 chars, 30 bytes
    //4.Cantidad int 4 bytes
    //5.Precio double 8 bytes
    //6.Fecha elaboracion 8 chars ,16 bytes "DDMMAAAA"
    //7.Fecha de vencimiento 8 chars ,16 bytes "DDMMAAAA"
}
