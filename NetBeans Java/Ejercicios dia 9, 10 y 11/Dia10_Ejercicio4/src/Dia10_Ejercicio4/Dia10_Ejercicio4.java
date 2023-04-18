/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia10_Ejercicio4;

/*
EJERCICIO4

 Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A se 
denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

 */

import java.util.Random;
import java.util.Scanner;

public class Dia10_Ejercicio4 {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);    
    Random rand = new Random(); 
    
    int[][] matriz = new int[4][4];
    
        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                matriz[i][j] = rand.nextInt(100);
                
                System.out.print(matriz[i][j] + " ");

            }

            System.out.println();

        }

        // Mostrar la traspuesta de la matriz
        System.out.println("Matriz traspuesta:");
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
            System.out.print(matriz[j][i] + " ");
            
            }
            
            System.out.println();
        
        }
    
    }

}