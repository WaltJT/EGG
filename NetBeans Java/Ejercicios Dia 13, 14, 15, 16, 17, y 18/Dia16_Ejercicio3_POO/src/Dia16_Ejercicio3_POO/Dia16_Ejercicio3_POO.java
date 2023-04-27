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

import java.util.Scanner;

public class Dia16_Ejercicio3_POO {

    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero para la operacion");
        int numero1=sc.nextInt();
        System.out.println("Ingrese el segundo numero para la operacion");
        int numero2=sc.nextInt();
        
        Operacion op=new Operacion(numero1,numero2);
        
        int SUMA = op.SUMA();
        System.out.println("EL resulttado de la Suma es " + SUMA);
        
        int RESTA = op.RESTA();
        System.out.println("EL resulttado de la Resta es " + RESTA);
        
        int MULTIPLICACION = op.MULTIPLICACION();
        System.out.println("EL resulttado de la Multiplicacion es " + MULTIPLICACION);
        
        int DIVISION = op.DIVISION();
        System.out.println("EL resulttado de la Division es " + DIVISION);

    }
    
}
