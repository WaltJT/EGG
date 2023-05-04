/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia16_Ejercicio3_POO;

/*
EJERCICIO 3 POO

Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
A- Método constructor con todos los atributos pasados por parámetro.
B- Método constructor sin los atributos pasados por parámetro.
C- Métodos get y set.
D- Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
E- Método sumar(): calcular la suma de los números y devolver el resultado al main.
F- Método restar(): calcular la resta de los números y devolver el resultado al main
G- Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
H- Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

 */

import ENTIDAD.Operacion;

public class Dia16_Ejercicio3_POO {

    public static void main(String[] args) {

        Operacion operacion1 = new Operacion(5, 2);
        Operacion operacion2 = new Operacion();
        operacion2.crearOperacion();

        System.out.println("");
        
        System.out.println("La primer operacion tiene como numeros predefinidos");
        System.out.println("5 y 2; la operacion 2, la debera ingresar el usuario");
        System.out.println("por pantalla.");
        
        System.out.println("");
        
        System.out.println("La suma de los números es: " + operacion1.sumar());
        System.out.println("La resta de los números es: " + operacion1.restar());
        System.out.println("La multiplicación de los números es: " + operacion1.multiplicar());
        System.out.println("La división de los números es: " + operacion1.dividir());

        System.out.println("");
        
        System.out.println("La suma de los números es: " + operacion2.sumar());
        System.out.println("La resta de los números es: " + operacion2.restar());
        System.out.println("La multiplicación de los números es: " + operacion2.multiplicar());
        System.out.println("La división de los números es: " + operacion2.dividir());

    }

}

       

