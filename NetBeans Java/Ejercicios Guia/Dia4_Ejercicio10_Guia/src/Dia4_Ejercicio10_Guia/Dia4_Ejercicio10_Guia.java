/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia4_Ejercicio10_Guia;

import java.util.Scanner;

/*  Ejercicio 10

Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:

5 *****
3 ***
11 ***********
2 ** */

public class Dia4_Ejercicio10_Guia {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);    
    int[] numeros = new int[4];
    
        for (int i = 0; i < 4; i++) {
            
            System.out.println("Ingrese un numero del 1 al 20: ");
            int num = scanner.nextInt();
            
        while (num < 1 || num > 20) {
  
            System.out.println("El numero ingresado no es correcto, "
                    + "por favor ingrese un numero valido: ");
            num = scanner.nextInt();
            
        }        
        
        numeros[i] = num;
        
        }
            for (int num : numeros) {
            System.out.print(num + " ");
            
            for (int i = 0; i < num; i++) {
            System.out.print("*");

        }
        
            System.out.println();
        
    }
    
  }

}