/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

package Dia10_Ejercicio5_Final;

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

public class Dia10_Ejercicio5_Final {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);    

        System.out.println("Ingrese un valor entero para las filas: ");
        int filas = scanner.nextInt();
        
        System.out.println("Ingrese un valor entero para las columnas: ");
        int columnas = scanner.nextInt();
        
    int [][] matriz = new int [filas][columnas];
    
    System.out.println("Introduce los elementos de la matriz:");
    
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextInt();    
                
                
    
            }
            
             System.out.println();
             
        }
        
        boolean esAntisimetrica = true;
        
        for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
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
