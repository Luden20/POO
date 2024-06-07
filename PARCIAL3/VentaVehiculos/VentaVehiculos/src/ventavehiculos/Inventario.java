package ventavehiculos;
import java.io.*;
import java.util.ArrayList;

public class Inventario {
    private ArrayList<Vehiculo> vehiculos;

    public Inventario() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void eliminarVehiculo(String codigo) {
        vehiculos.removeIf(v -> v.getCodigo().equals(codigo));
    }

    public Vehiculo buscarVehiculo(String codigo) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getCodigo().equals(codigo)) {
                return vehiculo;
            }
        }
        return null;
    }

    public ArrayList<Vehiculo> buscarVehiculosPorMarca(String marca) {
        ArrayList<Vehiculo> encontrados = new ArrayList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMarca().equalsIgnoreCase(marca)) {
                encontrados.add(vehiculo);
            }
        }
        return encontrados;
    }

    public ArrayList<Vehiculo> getTodosVehiculos() {
        return new ArrayList<>(vehiculos);
    }

    public void guardarInventario(File archivo) {
        try (RandomAccessFile raf = new RandomAccessFile(archivo, "rws")) {
            raf.setLength(0); // Limpiar el archivo antes de escribir
            for (Vehiculo vehiculo : vehiculos) {
                vehiculo.escribirVehiculo(raf);
            }
            System.out.println("Inventario guardado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar el inventario: " + e.getMessage());
        }
    }

    public void leerInventario(File archivo) {
        try (RandomAccessFile raf = new RandomAccessFile(archivo, "r")) {
            while (raf.getFilePointer() < raf.length()) {
                vehiculos.add(Vehiculo.leerVehiculo(raf));
            }
            System.out.println("Inventario cargado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al leer el inventario: " + e.getMessage());
        }
    }
}