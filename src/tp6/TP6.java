/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6;

import CP2.Autor;
import CP2.Biblioteca;
import CP2.Libro;

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
        /*Inventario inventario = new Inventario();

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
        inventario.mostrarCategoriasDisponibles();*/

        // CASO PRACTICO 2
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        Autor a1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor a2 = new Autor("A002", "J.K. Rowling", "Británica");
        Autor a3 = new Autor("A003", "Julio Verne", "Francés");

        // Agregar libro
        biblioteca.agregarLibro("L001", "Cien años de soledad", 1967, a1);
        biblioteca.agregarLibro("L002", "Harry Potter y la piedra filosofal", 1997, a2);
        biblioteca.agregarLibro("L003", "Viaje al centro de la Tierra", 1864, a3);
        biblioteca.agregarLibro("L004", "El amor en los tiempos del cólera", 1985, a1);
        biblioteca.agregarLibro("L005", "Harry Potter y el prisionero de Azkaban", 1999, a2);

        // Listar libros
        biblioteca.listarLibros();

        // Buscar por ISBN
        System.out.println("\n--- BÚSQUEDA POR ISBN 'L003' ---");
        Libro encontrado = biblioteca.buscarLibroPorIsbn("L003");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }

        // Filtro por año
        biblioteca.filtrarLibrosPorAnio(1997);

        // Eliminar por ISBN
        biblioteca.eliminarLibro("L002");
        biblioteca.listarLibros();

        // Mostrar total de libros
        System.out.println("\nCantidad total de libros en la biblioteca: " + biblioteca.obtenerCantidadLibros());

        // Autores disponibles
        biblioteca.mostrarAutoresDisponibles();

        // Eliminar la biblioteca 
        biblioteca.eliminarBiblioteca();
        // CASO PRACTICO 3
    }

}
