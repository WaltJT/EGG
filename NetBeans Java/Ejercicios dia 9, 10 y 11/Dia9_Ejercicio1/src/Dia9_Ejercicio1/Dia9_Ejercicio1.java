/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia9_Ejercicio1;

/*
EJERCICIO1

 Realizar un algoritmo que llene un vector con los 100 primeros números enteros
Y los muestre por pantalla en orden descendente.

 */

import java.util.Scanner;

public class Dia9_Ejercicio1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);    
    
    int[] vector = new int[100];
    
        for (int i = 0; i < 100; i++) {
            
            vector[i]=i+1;
        
        }
        
        System.out.println("Descendente: ");  
        
        System.out.println("");
        
        for (int i = 99; i >=0; i--) {
            
            System.out.println(vector[i]);
        
        }    
        
        System.out.println("");
        
        System.out.println("Ascendente: ");
        
        System.out.println("");
        
        for (int i = 0; i < 100; i++) {
        
            System.out.println(vector[i]);
        
        }
        
        System.out.println("");
        
    }

}