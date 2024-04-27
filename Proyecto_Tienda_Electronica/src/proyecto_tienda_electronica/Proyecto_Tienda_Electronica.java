package proyecto_tienda_electronica;

import java.util.LinkedHashMap;

public class Proyecto_Tienda_Electronica {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto producto1 = new Producto("001", "Camiseta", 19.99, "Camiseta de algodón", 50);
        Producto producto2 = new Producto("002", "Pantalón", 29.99, "Pantalón vaquero", 30);
        Producto producto3 = new Producto("003", "Zapatos", 39.99, "Zapatos de cuero", 20);
        Categoria c=new Categoria("Xd");
        c.agregarProducto(producto1);
        c.agregarProducto(producto2);
        c.agregarProducto(producto3);
        LinkedHashMap<String,Categoria> Existencias=new LinkedHashMap<String,Categoria>();
        Existencias.put("Componentes", new Categoria("Componentes"));
        Existencias.put("Consolas", new Categoria("Consolas"));
        Existencias.put("Celulares", new Categoria("Celulares"));
        Existencias.put("Computadores", new Categoria("Computadores"));
        Existencias.get("Computadores").agregarProducto(producto1);
        Existencias.get("Celulares").agregarProducto(producto1);
        Pantalla_Inicio a=new Pantalla_Inicio(Existencias);
        a.setTitle("Menu");
        a.setVisible(true);
        
        
    }
    
}
