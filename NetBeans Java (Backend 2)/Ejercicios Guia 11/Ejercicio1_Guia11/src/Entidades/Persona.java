/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
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

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private int DNI;
    private List <Perro> perros;

    //List<Perro> perro
    
    public Persona(String nombre, String apellido, int edad, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.perros = new ArrayList<>();
    }

//    public Persona(String juan, String perez, int i, int i0) {
//        this.nombre = nombre;
//        this.apellido = apellido;
//        this.edad = edad;
//        this.DNI = DNI;
//        this.perro = perro;
//    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public List<Perro> getPerros() {
        return perros;
    }

    public void setPerro(Perro perro) {
        this.perros = (List<Perro>) perro;
    }

    public void agregarPerro(Perro perro) {
        perros.add(perro);
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", DNI=" + DNI + ", perro=" + perros + '}';
    
    }
    
}

