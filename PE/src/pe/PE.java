/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class PE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            FileReader e=new FileReader("D:\\Universidad\\4to Sync\\POO\\POO\\a.txt");
            BufferedReader b=new BufferedReader(e);
            String x;
            while((x=b.readLine())!=null)
            {
                StringTokenizer st=new StringTokenizer(x,",");
                while(st.hasMoreElements())
                {
                   System.out.println(st.nextToken());
                }
                   System.out.println("-------------");   
            }
        }
        catch (IOException e) {
            // Manejar cualquier error de lectura de archivo
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
       
        
    }
    
}
