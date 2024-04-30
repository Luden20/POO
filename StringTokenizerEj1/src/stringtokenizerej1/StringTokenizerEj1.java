/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringtokenizerej1;

import java.util.StringTokenizer;

/**
 *
 * @author polip
 */
public class StringTokenizerEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comentario c=new Comentario("Alfonso","la wea la re concha wea me cago en la saco wea que te pario wea");
        System.out.print(c.getDatos()+" Total palabras"+c.ContarNumeroPalabras()+" wea se repite "+c.ContarRepeticiones("wea")+"la mas rep es"+c.ObtenerPalabraMasRepetida());
    }
    
}
