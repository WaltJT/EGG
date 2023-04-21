/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia10_Ejercicio6;

/*
EJERCICIOS6

Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear 
un programa que permita introducir un cuadrado por teclado y determine si este 
cuadrado es mágico o no. El programa deberá comprobar que los números 
introducidos son correctos, es decir, están entre el 1 y el 9.

 */

import java.util.Scanner;

public class Dia10_Ejercicio6 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); 
    int [][] matriz = new int [3][3];
    
   
    
     // Introducir los números del cuadrado por teclado
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            
                System.out.println("Ingrese un valor entero para la posición: ");
                int num = scanner.nextInt();
    
                while (num < 1 || num > 9) {
                
                    System.out.println("El numero ingresado no es valido; "
                            + "por favor, ingrese un valor entero entre 1 y 9.");
                            return;
                
                            
                            
                }
                
                matriz[i][j]=num;
                
            }
            
            System.out.println("");
        
        }
      
        // Mostrar la matriz por pantalla
        System.out.println("La matriz introducida es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    // Comprobar si el cuadrado es mágico
        
        int sumaFila1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
        int sumaFila2 = matriz[1][0] + matriz[1][1] + matriz[1][2];
        int sumaFila3 = matriz[2][0] + matriz[2][1] + matriz[2][2];
        int sumaColumna1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
        int sumaColumna2 = matriz[0][1] + matriz[1][1] + matriz[2][1];
        int sumaColumna3 = matriz[0][2] + matriz[1][2] + matriz[2][2];
        int sumaDiagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int sumaDiagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];
         
        System.out.println("");
        System.out.println(sumaFila1 = matriz[0][0] + matriz[0][1] + matriz[0][2]);
        //System.out.println("");
        
        System.out.println(sumaFila2 = matriz[1][0] + matriz[1][1] + matriz[1][2]);
        //System.out.println("");
        
        System.out.println(sumaFila3 = matriz[2][0] + matriz[2][1] + matriz[2][2]);
        //System.out.println("");
        
        System.out.println(sumaColumna1 = matriz[0][0] + matriz[1][0] + matriz[2][0]);
        //System.out.println("");
        
        System.out.println(sumaColumna2 = matriz[0][1] + matriz[1][1] + matriz[2][1]);
        //System.out.println("");
        
        System.out.println(sumaColumna3 = matriz[0][2] + matriz[1][2] + matriz[2][2]);
        //System.out.println("");
        
        System.out.println(sumaDiagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2]);
        //System.out.println("");
        
        System.out.println(sumaDiagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0]);
        System.out.println("");
        
        
        // Comprobar si las sumas son iguales
            
            if (sumaFila1 == sumaFila2 && sumaFila2 == sumaFila3 && sumaFila3 == sumaColumna1
                
                    && sumaColumna1 == sumaColumna2 && sumaColumna2 == sumaColumna3
                
                    && sumaColumna3 == sumaDiagonal1 && sumaDiagonal1 == sumaDiagonal2) {
            
                System.out.println("El cuadrado introducido es un cuadrado mágico.");
        
            } else {
            
                System.out.println("El cuadrado introducido no es un cuadrado mágico.");
        
            }
    
        }

    }
