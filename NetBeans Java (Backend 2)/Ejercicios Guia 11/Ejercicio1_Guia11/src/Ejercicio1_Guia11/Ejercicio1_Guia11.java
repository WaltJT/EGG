/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1_Guia11;

import Entidades.Perro;
import Entidades.Persona;
import java.util.List;

/*
EJERCICIO 1 GUIA 11 - Relaciones entre clases.

 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a 
contar de dos clases. Perro, que tendrá como atributos: nombre, raza, edad y 
tamaño; y la clase Persona con atributos: nombre, apellido, edad, documento y 
Perro.

Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a 
tener que pensar la lógica necesaria para asignarle a cada Persona un Perro y 
por ultimo, mostrar desde la clase Persona, la información del Perro y de la 
Persona.

*/

public class Ejercicio1_Guia11 {

    public static void main(String[] args) {
        
        // Crear perros
        
        Perro perro1 = new Perro("Max", "Labrador", 3, "Grande");
        Perro perro2 = new Perro("Bella", "Chihuahua", 2, "Pequeño");
        
        System.out.println("");
        
        // Crear personas
        
        Persona persona1 = new Persona("Juan", "Perez", 30, 12345678);
        Persona persona2 = new Persona("Maria", "Lopez", 25, 98765432);
        
        // Asignar perros a personas
        
        persona1.agregarPerro(perro1);
        persona2.agregarPerro(perro2);
        
        // Mostrar información de las personas y sus perros
        
        mostrarInformacion(persona1);
        mostrarInformacion(persona2);
    
    }
    
    public static void mostrarInformacion(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Documento: " + persona.getDNI());
        
        List<Perro> perros = persona.getPerros();
        System.out.println("Perros:");
        for (Perro perro : perros) {
            System.out.println("Nombre: " + perro.getNombre());
            System.out.println("Raza: " + perro.getRaza());
            System.out.println("Edad: " + perro.getEdad());
            System.out.println("Tamaño: " + perro.getTamaño());
            System.out.println();
        
        }
    
    }

}
    
