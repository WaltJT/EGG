/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import ENTIDAD.Persona;

/*
Ejercicio 5 POO Servicios de Utilidad

Implemente la clase Persona en el paquete entidades. Una persona tiene un 
nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor 
parametrizado, get y set. Crear una clase PersonaService, en el paquete 
servicio, con los siguientes métodos:

A- Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la 
persona a crear. Retornar el objeto Persona creado.

B- Método calcularEdad que calcule la edad del usuario utilizando el atributo 
de fecha de nacimiento y la fecha actual.

C- Método menorQue recibe como parámetro una Persona y una edad. Retorna true 
si la persona es menor que la edad consultada o false en caso contrario.

D- Método mostrarPersona que muestra la información de la persona deseada.

 */

public class ServicioPersona {
 
    public Persona crearPersona() {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento (formato: dd/mm/aaaa):");
        String fechaNacimientoStr = scanner.nextLine();
        Date fechaNacimiento = parseFecha(fechaNacimientoStr);

        return new Persona(nombre, fechaNacimiento);
    
    }

    private Date parseFecha(String fechaStr) {
        String[] partes = fechaStr.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);

        Calendar cal = Calendar.getInstance();
        cal.set(anio, mes - 1, dia); // El mes en Calendar es zero-based (enero es 0)
        return cal.getTime();
    }

    public int calcularEdad(Persona persona) {
        Date fechaActual = new Date();
        Calendar calPersona = Calendar.getInstance();
        calPersona.setTime(persona.getFechaNacimiento());
        Calendar calActual = Calendar.getInstance();
        calActual.setTime(fechaActual);

        int edad = calActual.get(Calendar.YEAR) - calPersona.get(Calendar.YEAR);
        if (calActual.get(Calendar.MONTH) < calPersona.get(Calendar.MONTH)
                || (calActual.get(Calendar.MONTH) == calPersona.get(Calendar.MONTH)
                && calActual.get(Calendar.DAY_OF_MONTH) < calPersona.get(Calendar.DAY_OF_MONTH))) {
            edad--;
        }
        return edad;
    }

    public boolean menorQue(Persona persona, int edad) {
        int edadPersona = calcularEdad(persona);
        return edadPersona < edad;

}

    public void mostrarPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
        System.out.println("Edad: " + calcularEdad(persona));

}

}
