/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia9_Ejercicio2;

/*
EJERCICIO2

Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido

*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dia9_Ejercicio2 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    
    System.out.print("Ingrese el tamaño del vector: ");
    int n = scanner.nextInt();
    
    int[] vector = new int[n];
    int[] repetidos = new int[n];
    int k = 0;
    
        // Llenar el vector con valores aleatorios
        for (int i = 0; i < vector.length; i++) {
            
            vector[i] = rand.nextInt(100);
            
        }
            
            // Pedir al usuario el número a buscar
            System.out.print("Ingrese el número a buscar: ");
            int num = scanner.nextInt();
            
            
            // Buscar el número en el vector y contar repeticiones
            
            for (int i = 0; i < n; i++) {
            
            if (vector[i] == num) {
            
                repetidos[k] = i; // Almacena la posición del número repetido
                
                k++;
            
            }
        }

        // Mostrar resultados
        if (k > 0) {

            System.out.printf("El número %d se encontró en las posiciones: %s%n", num, Arrays.toString(repetidos));

        } else {

            System.out.printf("El número %d no se encontró en el vector.%n", num);
         
        }    
                
        // Mostrar los números aleatorios generados en el vector
        System.out.print("Números aleatorios generados en el vector: ");
        
        for (int i = 0; i < n; i++) {
        
            System.out.println(vector[i] + " "); 
        
        }

    }

}
    

    

