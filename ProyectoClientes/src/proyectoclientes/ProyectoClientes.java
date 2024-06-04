/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoclientes;
import java.sql.ResultSet;
/**
 *
 * @author polip
 */
public class ProyectoClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConexionSQLite  db=new ConexionSQLite("D:/Universidad/POO/Bases de Datos SQLite/Ciudades.db");
        ResultSet x=db.ejecutarQuery("SELECT * FROM CLIENTES");
        ConexionSQLite.printResultSet(x);
    }
    
}
