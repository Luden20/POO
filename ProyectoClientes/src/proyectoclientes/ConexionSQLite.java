package proyectoclientes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;



public class ConexionSQLite {
    private String Direccion;
    private Connection Conexion;
    public ConexionSQLite(String Dir)
    {
        Conectar(Dir);
    }
    public void Conectar(String Dir)
    {
    Conexion=null;
        Direccion=Dir;
        try
        {
            Conexion = DriverManager.getConnection("jdbc:sqlite:"+Direccion);
            System.out.println("Conexion exitosa");

        }
        catch(SQLException e)
        {
            System.out.println("Conexion Fallida: "+e.getMessage());

        }
    }
    public ResultSet ejecutarQuery(String sql) 
    {
        ResultSet rs = null;
        try {
            PreparedStatement pstmt = Conexion.prepareStatement(sql);
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            
        }
        return rs;
    }
    public void desconectar()
    {
        try
        {
            Conexion.close();
            System.out.println("Desconectado");
        }
        catch(SQLException e)
        {
             System.out.println("NO Conectado");
        }
    }
    public static void printResultSet(ResultSet rs) {
        try
        {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(metaData.getColumnName(i)+"\t");
            }
            System.out.println();         
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }
        }
        catch(SQLException e)
        {
        }
    }
}
