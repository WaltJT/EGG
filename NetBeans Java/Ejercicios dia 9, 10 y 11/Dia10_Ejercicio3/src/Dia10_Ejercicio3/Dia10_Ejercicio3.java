/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia10_Ejercicio3;

/*
EJERCICIO3

Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, 
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

*/

import java.util.Random;
import java.util.Scanner;

public class Dia10_Ejercicio3 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);    
    Random rand = new Random();  
    
    System.out.print("Ingrese la longuitud del vector: ");
    int longitud = scanner.nextInt();
    
    int[]vector = new int[longitud];
    
    for (int i = 0; i < longitud; i++) {
        System.out.print("Ingrese un número entero: ");
        vector[i] = scanner.nextInt();
    
        }
        
        int[] digitos = new int[6];

        for (int i = 0; i < longitud; i++) {
            int cantidadDigitos = String.valueOf(Math.abs(vector[i])).length();
            if (cantidadDigitos > 5) {
                digitos[5]++;
            } else {
                digitos[cantidadDigitos]++;
            }
        
        }

            for (int i = 1; i <= 5; i++) {
            System.out.println("Cantidad de números de " + i + " dígito(s): " + digitos[i]);
        
            }

    
        }

    }
    


    

    

