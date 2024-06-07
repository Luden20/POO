package proyecto_mascotas;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DATOS {
    private String Direccion = "D:\\Universidad\\POO\\Bases de Datos SQLite\\MASCOTAS.db";
    private Connection Conexion;
    private List<String[]> ListaMascotas;

    public DATOS() {
        ListaMascotas = new ArrayList<>();
    }
    public List<String[]> Conectar(String querry) {
        Conexion = null;
        try {
            Conexion = DriverManager.getConnection("jdbc:sqlite:" + Direccion);
            System.out.println("Conexion exitosa");
            try (Statement estatuto = Conexion.createStatement();
                 ResultSet rs = estatuto.executeQuery(querry)) {
                while (rs.next()) {
                    ListaMascotas.add(new String[]{
                            rs.getString("MCT_CODIGO"),
                            rs.getString("MCT_NOM"),
                            rs.getString("MCT_TIPO"),
                            rs.getString("MCT_RAZA"),
                            rs.getString("MCT_GENERO"),
                            rs.getString("MCT_COLOR"),
                            rs.getString("MCT_TELF_DUEÑO"),
                            rs.getString("MCT_NOM_DUEÑO")
                    });
                }
            }
        } catch (SQLException e) {
            System.out.println("Conexion Fallida: " + e.getMessage());
        }
        return ListaMascotas;
    }
}
    