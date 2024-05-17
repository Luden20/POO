package ventavehiculos;

import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class Factura {
    private String Nombre;
    private String Cedula;
    private String Direccion;
    private LinkedHashMap<String, Vehiculo> Carrito;

    public Factura(String Nombre, String Cedula, String Direccion) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.Direccion = Direccion;
        Carrito = new LinkedHashMap<>();
    }

    public void agregarProducto(Vehiculo vehiculo, int CantidadComprada) {
        Vehiculo aux = new Vehiculo(vehiculo.getCodigo(), vehiculo.getModelo(), vehiculo.getMarca(), vehiculo.getCantidad(), vehiculo.getColor(), vehiculo.getDescripcion(), vehiculo.getCategoria(), vehiculo.getAño(), vehiculo.getPrecio(), null);
        aux.setCantidad(CantidadComprada);
        if (Carrito.containsKey(aux.getModelo())) {
            Carrito.get(aux.getModelo()).setCantidad(Carrito.get(aux.getModelo()).getCantidad() + CantidadComprada);
        } else {
            Carrito.put(aux.getModelo(), aux);
        }
    }

    public double getTotalProd() {
        double precio = 0;
        for (Map.Entry<String, Vehiculo> entry : Carrito.entrySet()) {
            precio += entry.getValue().getPrecioTotal();
        }
        return precio;
    }

    public void mostrarTabla(DefaultTableModel TC) {
        TC.setRowCount(0);
        for (Map.Entry<String, Vehiculo> entry : Carrito.entrySet()) {
            TC.addRow(entry.getValue().getAll());
        }
    }

    public void Escribir(File Archivo) {
        try (RandomAccessFile Arc = new RandomAccessFile(Archivo, "rw")) {
            Arc.writeChars(InfoFactura());
            JOptionPane.showMessageDialog(null, "Factura guardada con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la factura", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public String Leer(File Archivo) {
        StringBuilder factura = new StringBuilder();
        try (RandomAccessFile Arc = new RandomAccessFile(Archivo, "rw")) {
            while (Arc.getFilePointer() < Arc.length()) {
                factura.append(Arc.readChar());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer la factura", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return factura.toString();
    }

    public String InfoFactura() {
        StringBuilder factura = new StringBuilder();
        factura.append("FACTURA AUTOÑITO\n");
        factura.append(Nombre).append("\n");
        factura.append(Cedula).append("\n");
        factura.append(Direccion).append("\n");
        factura.append("PRODUCTOS\n");
        for (Map.Entry<String, Vehiculo> entry : Carrito.entrySet()) {
            factura.append(entry.getValue().getAllString()).append("\n");
        }
        factura.append("Total: ").append(getTotalProd()).append(" USD\n");
        factura.append("Gracias por comprar con nosotros =D");
        return factura.toString();
    }
}

