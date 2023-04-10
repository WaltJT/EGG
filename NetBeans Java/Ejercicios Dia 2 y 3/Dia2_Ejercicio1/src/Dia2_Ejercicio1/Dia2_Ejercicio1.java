/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia2_Ejercicio1;

//Ejercicio1
/*1. Escribir un programa que pida dos números enteros por teclado 
y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma.*/

import java.util.Scanner;

public class Dia2_Ejercicio1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);    
    
    System.out.println("Por favor ingrese un numero, el cual se almacenera en la "
            + "variable num1: ");
    
    int num1 = scanner.nextInt();

    System.out.println(" ");
    
    System.out.println("Por favor ingrese un numero, el cual se almacenera en la "
    + "variable num2: ");
    
    int num2 = scanner.nextInt();
    
    int suma = num1 + num2;
    
    System.out.println(" ");
    
    System.out.println("El resueltado de la suma es: "+ suma);
    
    System.out.println(" ");
    
    }
    
}
