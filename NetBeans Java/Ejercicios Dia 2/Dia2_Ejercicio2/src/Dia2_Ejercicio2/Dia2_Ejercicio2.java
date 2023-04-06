/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia2_Ejercicio2;

//Ejercicio2
/*2. Escribir un programa que pida tu nombre, 
lo guarde en una variable y lo muestre por pantalla.*/

import java.util.Scanner;

public class Dia2_Ejercicio2 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Por favor ingrese su nombre y apellido: ");
    String name = scanner.nextLine();    
    
    System.out.println(" ");    
    
    System.out.println("su nombre y apellido es: " + name);
    
    System.out.println(" ");

    }
    
}
