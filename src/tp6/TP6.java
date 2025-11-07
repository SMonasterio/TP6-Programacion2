/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6;

import CP1.CategoriaProducto;
import CP1.Inventario;
import CP1.Producto;

/**
 *
 * @author sofim
 */
public class TP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CASO PRACTICO 1
        Inventario inventario = new Inventario();

        // Crear productos y agregarlos al inventario
        Producto p1 = new Producto("P001", "Arroz", 850, 30, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Televisor", 2500, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 1200, 50, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla", 3000, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Notebook", 2800, 8, CategoriaProducto.ELECTRONICA);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        // Listar productos
        inventario.listarProductos();

        // Buscar por ID
        System.out.println("\n--- BÚSQUEDA POR ID 'P003' ---");
        Producto encontrado = inventario.buscarProductoPorId("P003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }

        // Filtrar por categoria
        inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        // Eliminar producto por ID
        inventario.eliminarProducto("P002");
        inventario.listarProductos();

        // Actualizar stock
        inventario.actualizarStock("P003", 100);

        // Mostrar stock
        System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock());

        // Producto con mayor stock
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        System.out.println("\nProducto con mayor stock:");
        if (mayorStock != null) {
            mayorStock.mostrarInfo();
        }

        // Filtro por precio
        inventario.filtrarProductosPorPrecio(1000, 3000);

        // Categorias disponibles
        inventario.mostrarCategoriasDisponibles();

        // CASO PRACTICO 2
        // CASO PRACTICO 3
    }

}
