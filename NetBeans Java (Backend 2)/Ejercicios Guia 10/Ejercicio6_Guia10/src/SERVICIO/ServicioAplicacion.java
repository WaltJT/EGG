/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SERVICIO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
EJERCICIO 6 GUIA 10

 Se necesita una aplicación para una tienda en la cual queremos almacenar los 
distintos productos que venderemos y el precio que tendrán. Además, se necesita 
que la aplicación cuente con las funciones básicas.
 Estas las realizaremos en el servicio. Como, introducir un elemento, modificar 
su precio,eliminar un producto y mostrar los productos que tenemos con su precio 
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio.
 Realizar un menú para lograr todas las acciones previamente mencionadas.

*/

public class ServicioAplicacion {
    
    private static Map<String, Integer> app = new HashMap<>();
    private static Scanner scanner = new Scanner (System.in).useDelimiter("\n");
    
    public void aplicacion() {
    
    String opcion;

        do {
        
            System.out.println("-------- Menú --------");
            System.out.println("A. Agregar un producto");
            System.out.println("B. Modificar precio de un producto");
            System.out.println("C. Eliminar un producto");
            System.out.println("D. Mostrar todos los productos");
            System.out.println("E. Salir");
            System.out.println("----------------------");
            System.out.println("Ingrese la opcion deseada:");
            
            opcion = scanner.next();
            
        switch (opcion) {
                case "A":
                case "a":
                    agregarProducto();
                    break;
                case "B":
                case "b":
                    modificarPrecioProducto();
                    break;
                case "C":
                case "c":    
                    eliminarProducto();
                    break;
                case "D":
                case "d":    
                    mostrarProductos();
                    break;
                case "E":
                case "e":    
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            
        System.out.println();
            
        } while (!opcion.equalsIgnoreCase("e"));
     
    }
        
        private static void agregarProducto() {
            
        System.out.println("Ingrese el nombre del producto:");
        String nombre = scanner.next();

        System.out.println("Ingrese el precio del producto:");
        int precio = scanner.nextInt();
        
        app.put(nombre, precio);
        System.out.println("El producto '" + nombre + "' ha sido agregado con éxito.");
    
        }
      private static void modificarPrecioProducto() {
        System.out.println("Ingrese el nombre del producto que desea modificar:");
        String nombre = scanner.next();

        if (app.containsKey(nombre)) {
            System.out.println("Ingrese el nuevo precio del producto:");
            int nuevoPrecio = scanner.nextInt();
            scanner.next();

            app.put(nombre, nuevoPrecio);
            System.out.println("El precio del producto '" + nombre + "' ha sido modificado con éxito.");
        
        } else {
        
            System.out.println("El producto '" + nombre + "' no existe en la tienda.");
    
        }
    
    }
        
        private static void eliminarProducto() {
        
        System.out.println("Ingrese el nombre del producto que desea eliminar: ");
        String nombre = scanner.next();
        
            if (app.containsKey(nombre)) {
                app.remove(nombre);
                System.out.println("El producto" + nombre + 
                "ha sido eliminado con exito.");
            
            } else {
            
                System.out.println("El producto '" + nombre + "' no existe en la tienda.");
     
            }
    }   
        private static void mostrarProductos() {
        
        System.out.println("Productos en la tienda:");
        app.entrySet().forEach((entry) -> {
            String producto = entry.getKey();
            int precio = entry.getValue();
            System.out.println("Producto: " + producto + ", Precio: " + precio);
        });
        
    }
        
}
 
    

