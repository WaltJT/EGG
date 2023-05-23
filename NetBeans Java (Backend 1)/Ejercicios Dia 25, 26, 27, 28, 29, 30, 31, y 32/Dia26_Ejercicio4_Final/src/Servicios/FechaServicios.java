/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import ENTIDAD.Fecha;
import java.util.Date;
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

public class FechaServicios {
    
    private Scanner scanner;

    public FechaServicios(Scanner scanner) {
        this.scanner = scanner;
    
    }

    public Fecha fechaNacimiento() {
        System.out.print("Ingrese su fecha de nacimiento (dd mm aaaa): ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();
        return new Fecha(dia, mes, anio);
    
    }

    public Date fechaActual() {
        return new Date();
    
    }

    public int diferencia(Fecha fecha1, Fecha fecha2) {
        Date fecha1Date = fecha1.toDate();
        Date fecha2Date = fecha2.toDate();
        long diffMillis = fecha2Date.getTime() - fecha1Date.getTime();
        long diffYears = diffMillis / (1000L * 60L * 60L * 24L * 365L);
        return (int) diffYears;
    
    }

}

