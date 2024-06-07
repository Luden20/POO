
package top25notas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

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
        System.out.println(sql);
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
    public void Instruccion(String sql)
    {
        try
        {
            PreparedStatement pstmt = Conexion.prepareStatement(sql);
            pstmt.executeUpdate();
        }
        catch(SQLException e)
        {
        
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
            System.out.println(e.getMessage());
        }
    }
    public Object[] Listado(String Tabla,String Atributo)
    {
        LinkedList<String> aux=new LinkedList<String>();
        aux.add("VACIO");
        try
        {
            aux.clear();
            PreparedStatement p=Conexion.prepareStatement("SELECT "+Atributo+" COUNT(*) FROM "+Tabla+" GROUP BY "+Atributo);
            ResultSet rs=p.executeQuery();
            while(rs.next())
            {
                aux.add(rs.toString());
                rs.next();
            }
        }
        catch(SQLException e)
        {
        
        }
        return aux.toArray();
        
    }
    public void MostrarTabla(String query,DefaultTableModel T) {
        try
        {
            ResultSet rs=ejecutarQuery(query);
            if(rs!=null)
            {
                T.setRowCount(0);
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();
                LinkedList<String> aux=new LinkedList<String>();
                for (int i = 1; i <= columnCount; i++) {
                    aux.add(metaData.getColumnName(i));
                }
                T.setColumnIdentifiers(aux.toArray());
                System.out.println();    
                LinkedList<String> aux2=new LinkedList<String>();
                while (rs.next()) {
                    aux2.clear();
                    for (int i = 1; i <= columnCount; i++) {
                        aux2.add(rs.getString(i));
                    }
                    T.addRow(aux2.toArray());
                }
            }
            else
            {
                T.setRowCount(0);
            }
            
        }
        catch(SQLException e)
        {
            T.setRowCount(0);
        }
    }
}
