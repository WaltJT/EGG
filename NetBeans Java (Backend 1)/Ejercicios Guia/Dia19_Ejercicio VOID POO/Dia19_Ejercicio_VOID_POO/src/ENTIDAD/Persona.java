/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

import java.util.Scanner;

public class Persona {

    Scanner scanner = new Scanner (System.in);
    
    public String nombre;
    public String apellido;
    public int edad;
    public double estatura;

    public Persona() {
    
    }

    public Persona(String nombre, String apellido, int edad, double estatura) {
    
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estatura = estatura;
    
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    @Override
    
    public String toString() {
    
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", estatura=" + estatura + '}';
    
    }
     
}
