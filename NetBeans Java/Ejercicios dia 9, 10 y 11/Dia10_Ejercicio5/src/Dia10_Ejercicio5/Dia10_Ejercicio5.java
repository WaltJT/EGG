/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia10_Ejercicio5;

/*
EJERCICIO5

 Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice 
que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, 
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz 
traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas 
por columnas (o viceversa).

 */

import java.util.Random;
import java.util.Scanner;

public class Dia10_Ejercicio5 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);    
    Random rand = new Random(); 
        
    int [][] matriz = new int [3][3];
    
    System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                matriz[i][j] = rand.nextInt(100);
                
                System.out.print(matriz[i][j] + " ");
    
            }
            
             System.out.println();
            
        }
        
        boolean esAntisimetrica = true;
        
        for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[0].length; j++) {
            if (matriz[i][j] != -matriz[j][i]) {
                esAntisimetrica = false;
                break;
            }
            
        }

            if (esAntisimetrica) {
               break; 
            }
        
    }
    
        if (esAntisimetrica) {
        
            System.out.println("La matriz es antisimétrica.");
        
        } else {
        
            System.out.println("La matriz no es antisimétrica.");
        
        }

        scanner.close(); 

    }
    
}