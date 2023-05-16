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
    
        public Fecha fechaNacieminto() {
            
            System.out.println("Ingrese el dia de su naciemiento: ");
            int dia = scanner.nextInt();
            
            System.out.println("Ingrese el mes de su naciemiento: ");
            int mes = scanner.nextInt();
            
            System.out.println("Ingrese el año de su naciemiento: ");
            int anio = scanner.nextInt();
            
            return new Fecha(dia, mes, anio);
            
        }

        public Date fechaActual() {
        return new Date();
    
        }
        
        public Fecha fechaActual(Fecha fecha) {
            
            System.out.println("Ingrese el dia de la fecha actual: ");
            int dia = scanner.nextInt();
            
            System.out.println("Ingrese el mes de la fecha actual: ");
            int mes = scanner.nextInt();
                       
            System.out.println("Ingrese el año de la fecha actual: ");
            int anio = scanner.nextInt();

            return new Fecha(dia, mes, anio);
        
        }
    
        public int diferencia(Fecha fecha1, Fecha fecha2){
        
            
            int diffYears = fecha2.getAnio() - fecha1.getAnio();
    //if (fecha2.getMes() < fecha1.getMes() || (fecha2.getMes() == fecha1.getMes() && fecha2.getDia() < fecha1.getDia())) {
        diffYears--;
    //}
    return diffYears;
    
    }
        
}

            

    


    


