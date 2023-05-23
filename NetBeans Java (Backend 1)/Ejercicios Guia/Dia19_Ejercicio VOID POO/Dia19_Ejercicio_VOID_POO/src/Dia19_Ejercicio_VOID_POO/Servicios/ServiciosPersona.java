/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia19_Ejercicio_VOID_POO.Servicios;

import java.util.Scanner;

import ENTIDAD.Persona;

    public class ServiciosPersona {

    private final Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona (){        
    
        System.out.println("introducir nombre: ");
        String nombre = scanner.next();
 
        System.out.println("introducir apellido: ");
        String apellido = scanner.next();
        
        System.out.println("introducir edad: ");
        int edad = scanner.nextInt();
    
        System.out.println("introducir estatura: ");
        double estatura = scanner.nextDouble();
        
        return new Persona(nombre, apellido, edad, estatura);
        
    }
   
public void mostrarPersona(Persona p) {
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Apellido: " + p.getApellido());
        System.out.println("Edad: " + p.getEdad());
        System.out.println("Estatura: " + p.getEstatura());
    }
    
}    


