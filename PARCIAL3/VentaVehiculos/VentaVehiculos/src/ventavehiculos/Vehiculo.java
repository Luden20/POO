package ventavehiculos;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class Vehiculo {
    private String Codigo;//Codigo debe ser de 5 caracteres       10 bytes
    private String Modelo;//Nombre de hasta 15 caracteres         30 bytes
    private String Marca;//Marca hasta 15 caracteres              30 bytes
    private int Año;//Debe tener como maximo 4 caracteres          4 bytes
    private String Color;//Marca hasta 10 caracteres              20 bytes
    private String Descripcion;// Descripcion hasta 40 caracteres 80 bytes
    private int Cantidad;//                                        4 bytes
    private double Precio;//                                       8 bytes
    private String Categoria;//Hasta 10 caracteres                20 bytes
    private ImageIcon Imagen;
    //Total bytes 206
      public Vehiculo(String Codigo, String Modelo, String Marca, int Cantidad, String Color, String Descripcion, String Categoria, int Año, double Precio, ImageIcon imagen) {
        this.Codigo = Codigo;
        this.Modelo = Modelo;
        this.Marca = Marca;
        this.Año = Año;
        this.Color = Color;
        this.Descripcion = Descripcion;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Imagen = imagen;
        this.Categoria = Categoria;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        this.Codigo = codigo;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        this.Año = año;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        this.Cantidad = cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    public ImageIcon getImagen() {
        return Imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.Imagen = imagen;
    }

    public double getPrecioTotal() {
        return Precio * Cantidad;
    }
    public String getCategoria() {
        return Categoria;
    }

    public void escribirVehiculo(RandomAccessFile archivo) throws IOException {
        escribirString(archivo, Codigo, 5);
        escribirString(archivo, Modelo, 15);
        escribirString(archivo, Marca, 15);
        archivo.writeInt(Año);
        escribirString(archivo, Color, 10);
        escribirString(archivo, Descripcion, 40);
        archivo.writeInt(Cantidad);
        archivo.writeDouble(Precio);
        escribirString(archivo, Categoria, 10);
    }

    private void escribirString(RandomAccessFile archivo, String cadena, int longitud) throws IOException {
        StringBuffer buffer = new StringBuffer();

        if (cadena != null) {
            buffer.append(cadena);
        }

        buffer.setLength(longitud);
        archivo.writeChars(buffer.toString());
    }

    public static Vehiculo leerVehiculo(RandomAccessFile archivo) throws IOException {
        String codigo = leerString(archivo, 5);
        String modelo = leerString(archivo, 15);
        String marca = leerString(archivo, 15);
        int año = archivo.readInt();
        String color = leerString(archivo, 10);
        String descripcion = leerString(archivo, 40);
        int cantidad = archivo.readInt();
        double precio = archivo.readDouble();
        String categoria = leerString(archivo, 10);

        return new Vehiculo(codigo, modelo, marca, cantidad, color, descripcion, categoria, año, precio, null);
    }

    private static String leerString(RandomAccessFile archivo, int longitud) throws IOException {
        StringBuilder buffer = new StringBuilder(longitud);
        for (int i = 0; i < longitud; i++) {
            buffer.append(archivo.readChar());
        }
        return buffer.toString().trim();
    }

    public static void guardarVehiculos(List<Vehiculo> vehiculos, File archivo) {
        try (RandomAccessFile raf = new RandomAccessFile(archivo, "rw")) {
            raf.setLength(0);
            for (Vehiculo vehiculo : vehiculos) {
                vehiculo.escribirVehiculo(raf);
            }
            JOptionPane.showMessageDialog(null, "Escrito con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public Object[] getAll() {
        Object[] datos = new Object[9];
        datos[0] = Codigo;
        datos[1] = Modelo;
        datos[2] = Marca;
        datos[3] = Año;
        datos[4] = Color;
        datos[5] = Descripcion;
        datos[6] = Cantidad;
        datos[7] = Precio;
        datos[8] = Categoria;
        return datos;
    }

    public String getAllString() {
        return String.format("%-5s %-15s %-15s %4d %-10s %-40s %4d %8.2f %-10s",
                Codigo, Modelo, Marca, Año, Color, Descripcion, Cantidad, Precio, Categoria);
    }
    public static List<Vehiculo> leerVehiculos(File archivo) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        try (RandomAccessFile raf = new RandomAccessFile(archivo, "rw")) {
            while (raf.getFilePointer() < raf.length()) {
                vehiculos.add(leerVehiculo(raf));
            }
            JOptionPane.showMessageDialog(null, "Leído con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return vehiculos;
    }
}

