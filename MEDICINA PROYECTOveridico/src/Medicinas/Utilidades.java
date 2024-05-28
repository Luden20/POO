/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medicinas;

import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author polip
 */
public class Utilidades {
    public static String Aumentar_Espacios(String Str,int CD){
        for(int i=Str.length();i<CD;i++)
        {
            Str=Str+" ";
        }
        return Str;
    }
    
    public static boolean ValidarLongitud(String str,int max)
    {
        return str.length()>0&&str.length()<max;
    }
    public static DefaultComboBoxModel<String> ModeloCant(int i)
    {
        String[] elementos = new String [i];
        for (int x = 0; x < i; x++)
        {
            elementos[x] = String.valueOf(x );
        }
        return new DefaultComboBoxModel<>(elementos);
    }
    public static String rellenarEspacios(String str, int longitud) 
    {
      for (int i =str.length();i < longitud;i++) 
        {
            str =str+ " ";
        }
        return str;
    }
    public static File obtenerArchivo(String extension,String Mensaje)
    {
        JFileChooser jFileChooser3 = new JFileChooser();
            File file=null;
            jFileChooser3.setDialogTitle(Mensaje);
            jFileChooser3.setAcceptAllFileFilterUsed(false); 
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de datos(*."+extension+")", extension);
            jFileChooser3.addChoosableFileFilter(filter); 
            if (jFileChooser3.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                file = jFileChooser3.getSelectedFile();
                String fileName = file.getName();
                 if (!fileName.toLowerCase().endsWith("." + extension.toLowerCase())) 
                 {
                    fileName += "." + extension;
                }
                file= new File(file.getParent(),fileName);
                JOptionPane.showMessageDialog(null, "Operacion exitoso", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }
            return file;
    }
    public static File obtenerArchivo(String Mensaje)
    {
        JFileChooser jFileChooser3 = new JFileChooser();
            File file=null;
            jFileChooser3.setDialogTitle(Mensaje);
            jFileChooser3.setAcceptAllFileFilterUsed(false); 
            if (jFileChooser3.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                file = jFileChooser3.getSelectedFile();
            }
            return file;
    }
    public static String PasswordToString(JPasswordField PASSWORD)
    {
        return new String(PASSWORD.getPassword());
    }
    
}
