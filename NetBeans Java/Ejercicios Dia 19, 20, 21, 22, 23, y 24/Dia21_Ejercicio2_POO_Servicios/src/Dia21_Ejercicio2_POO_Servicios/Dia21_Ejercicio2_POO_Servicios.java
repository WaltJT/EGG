/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia21_Ejercicio2_POO_Servicios;

import ENTIDAD.Cafetera;
import Dia21_Ejercicio2_POO_Servicios.Servicios.ServicioCafetera;
import java.util.Scanner;

/*
EJERCICIO 2 POO Servicios

Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con 
los atributos capacidadMáxima (la cantidad máxima de café que puede contener la 
cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). 
Agregar constructor vacío y con parámetros así como setters y getters. Crear 
clase CafeteraServicio en el paquete Servicios con los siguiente:

A- Método llenarCafetera(): hace que la cantidad actual sea igual a la 
capacidad máxima. 

B- Método servirTaza(int): se pide el tamaño de una taza vacía, el método 
recibe el tamaño de la taza y simula la acción de servir la taza con la 
capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar 
la taza, se sirve lo que quede. El método le informará al usuario si se llenó 
o no la taza, y de no haberse llenado en cuanto quedó la taza.

C- Método vaciarCafetera(): pone la cantidad de café actual en cero. 

D- Método agregarCafe(int): se le pide al usuario una cantidad de café, el 
método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */

public class Dia21_Ejercicio2_POO_Servicios {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in).useDelimiter("\n");    
                
        // Crear una cafetera con capacidad máxima de 1000 y cantidad actual de 500
        Cafetera miCafetera = new Cafetera(1000, 500); 
        
        ServicioCafetera servicio = new ServicioCafetera();
    
        int opcion = 0;
                
        while (opcion != 5){
            
        System.out.println("Ingrese la opcion a elegir: ");
                
            System.out.println("1 - Llenar Cafetera");
            System.out.println("2 - Servir una taza");
            System.out.println("3 - Vaciar la cafetera");
            System.out.println("4 - Agregar cafe");
            System.out.println("5 - Salir");
        
            opcion = scanner.nextInt();
        
    switch(opcion){        
    
        case 1:  
    // Llenar la cafetera y mostrar su cantidad actual
    servicio.llenarCafetera(miCafetera);
    System.out.println("Cantidad actual de café en la cafetera: " + miCafetera.getCantidadActual()); // Debería imprimir "Cantidad actual de café en la cafetera: 1000"
    break;
    
        case 2:
    // Servir una taza de tamaño 200 y mostrar la cantidad actual de café en la cafetera
    servicio.servirTaza(miCafetera, 200);
    System.out.println("Cantidad actual de café en la cafetera: " + miCafetera.getCantidadActual()); // Debería imprimir "Cantidad actual de café en la cafetera: 800"
    break;
    
        case 3:
    // Vaciar la cafetera y mostrar su cantidad actual
    servicio.vaciarCafetera(miCafetera);
    System.out.println("Cantidad actual de café en la cafetera: " + miCafetera.getCantidadActual()); // Debería imprimir "Cantidad actual de café en la cafetera: 0"
    break;
    
        case 4:
    // Agregar 300 unidades de café a la cafetera y mostrar su cantidad actual
    servicio.agregarCafe(miCafetera);
    System.out.println("Cantidad actual de café en la cafetera: " + miCafetera.getCantidadActual()); // Debería imprimir "Cantidad actual de café en la cafetera: 300"
    break;
    
        case 5:
            System.out.println("Gracias por hacer uso de este sistema");
            break;
        default:
            System.out.println("El numero ingresado no es correcto");
            
    }

    }      
        
}
    
}