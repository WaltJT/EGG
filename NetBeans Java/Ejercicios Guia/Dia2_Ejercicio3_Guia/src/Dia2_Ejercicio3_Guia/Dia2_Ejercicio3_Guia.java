/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia2_Ejercicio3_Guia;

//Ejercicio 3
//Define variables donde puedas alojar los resultados 
//y prueba usar dos operadores de cada tipo.

import java.util.Scanner;

public class Dia2_Ejercicio3_Guia {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor ingrese un valor para el primer numero: ");
    
    int num1 = scanner.nextInt();
    
    System.out.println("Por favor ingrese un valor para el segundo numero: ");
       
    int num2 = scanner.nextInt();
    
    int suma = num1 + num2;
    
    System.out.println( + suma);
    
    int resta = num1 - num2;
    
    System.out.println( + resta);
    
    int division = num1 / num2;
    
    System.out.println( + division);
         
    System.out.println ( "El siguiente resueltado surge de la suma de: "+ num1
    + " que es el primer valor ingresado por el usuario (num1) + 1");
   
    num1++;
    
    System.out.println( + num1++);
    
    System.out.println ( "El siguiente resueltado surge de la resta de: "+ num2
    + " que es el primer valor ingresado por el usuario (num2) - 1"); 
     
    num2--;
    
    System.out.println( + num2--);
   
    
    boolean logico1 = num1 < num2;
    
    System.out.println( + num1 < num2);
    
    boolean logico2 = num1 != num2;
    
    System.out.println( + num1 != num2);
    
    }
    
}
