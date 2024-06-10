package proyectoclientes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
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
            System.out.println("Se hizo bien");
            JOptionPane.showMessageDialog(null, "Salió bien la operación", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Ocurrió un error en la operación: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
    public DefaultComboBoxModel Listado(String Tabla,String Atributo)
    {
        LinkedList<String> aux=new LinkedList<String>();
        aux.add("VACIO");
        try
        {
            aux.clear();
            PreparedStatement p=Conexion.prepareStatement("SELECT "+Atributo+" FROM "+Tabla+" GROUP BY "+Atributo+";");
            ResultSet rs=p.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    aux.add(rs.getString(i));
                }
            };
           
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return new DefaultComboBoxModel(aux.toArray());
    }
    public DefaultComboBoxModel ListadoComplejo(String SQL)
    {
        LinkedList<String> aux=new LinkedList<String>();
        aux.add("VACIO");
        try
        {
            aux.clear();
            PreparedStatement p=Conexion.prepareStatement(SQL);
            ResultSet rs=p.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    aux.add(rs.getString(i));
                }
            };
           
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return new DefaultComboBoxModel(aux.toArray());
    }
    public DefaultComboBoxModel ListadoAtributos(String sql)
    {
        LinkedList<String> aux=new LinkedList<String>();
        aux.add("VACIO");
        try
        {
            aux.clear();
            PreparedStatement p=Conexion.prepareStatement(sql+" LIMIT 1;");
            ResultSet rs=p.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                aux.add(metaData.getColumnName(i));
            }
           
        }
        catch(SQLException e)
        {
            System.out.println(e.getMessage());
        }
        return new DefaultComboBoxModel(aux.toArray());
    }
    public int getID(String sql)
    {
        //Esta funcion asume que el query de seleccion esta bien hecho y devuelve un  solo registro con un solo atriubto
        //HAGANLO BIEN O DEVOLVERLA CUALQUIER COSA
        try
        {
            PreparedStatement p=Conexion.prepareStatement(sql);
            ResultSet rs=p.executeQuery();
            return rs.getInt(1);
        }
        catch(SQLException e)
        {
            return 0;
        }
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
