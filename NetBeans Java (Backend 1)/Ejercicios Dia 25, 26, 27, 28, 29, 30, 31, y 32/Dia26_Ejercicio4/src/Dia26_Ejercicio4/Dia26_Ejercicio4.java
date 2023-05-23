/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia26_Ejercicio4;

import ENTIDAD.Fecha;
import Servicios.FechaServicios;
import java.util.Scanner;

/*
EJERCICIO 4 POO Servicios de Utilidad

Vamos a usar la clase Date que ya existe en Java. Crearemos la clase 
FechaService, en paquete Servicios, que tenga los siguientes métodos:

A- Método fechaNacimiento que pregunte al usuario día, mes y año de su 
nacimiento. Luego los pase por parámetro a un nuevo objeto Date. El método debe 
retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);

B -Método fechaActual que cree un objeto fecha con el día actual. Para esto 
usaremos el constructor vacío de la clase Date. 

Ejemplo: Date fechaActual = new  Date();

El método debe retornar el objeto Date.

C- Método diferencia que reciba las dos fechas por parámetro y retorna la 
diferencia de años entre una y otra (edad del usuario).

 */

public class Dia26_Ejercicio4 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);    
        
        
        FechaServicios fechaService = new FechaServicios(scanner);
        
        Fecha fechaNacimiento = fechaService.fechaNacieminto();
        System.out.println("Su fecha de nacimiento es: " + fechaNacimiento.getDia() + "/" +
        fechaNacimiento.getMes() + "/" + fechaNacimiento.getAnio());
        
        Fecha fechaActual = fechaService.fechaActual(fechaNacimiento);
        System.out.println("La fecha actual es: " + fechaActual.getDia() + "/" +
        fechaActual.getMes() + "/" + fechaActual.getAnio());
        
        int edad = fechaService.diferencia(fechaNacimiento, new Fecha(fechaActual.getDia(), fechaActual.getMes()+ 1, fechaActual.getAnio()));
        System.out.println("Usted tiene " + edad + " años.");
    
        
    }
    
}
