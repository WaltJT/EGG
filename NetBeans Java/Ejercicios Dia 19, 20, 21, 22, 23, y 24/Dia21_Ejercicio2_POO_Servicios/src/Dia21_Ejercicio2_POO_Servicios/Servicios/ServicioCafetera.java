/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia21_Ejercicio2_POO_Servicios.Servicios;

import ENTIDAD.Cafetera;
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

public class ServicioCafetera {
    
    public void llenarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }
    
    public void servirTaza(Cafetera cafetera, int tamanoTaza) {
        if (cafetera.getCantidadActual() >= tamanoTaza) {
            cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanoTaza);
            System.out.println("Se llenó la taza.");
        } else {
            int cantidadServida = cafetera.getCantidadActual();
            cafetera.setCantidadActual(0);
            System.out.println("No se pudo llenar la taza. Quedó con " + cantidadServida + " unidades de café.");
        }
    }
    
    public void vaciarCafetera(Cafetera cafetera) {
        cafetera.setCantidadActual(0);
    }
    
    public void agregarCafe(Cafetera cafetera) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de café que desea agregar: ");
        int cantidad = scanner.nextInt();
        cafetera.setCantidadActual(Math.min(cafetera.getCapacidadMaxima(), cafetera.getCantidadActual() + cantidad));
    }

}

