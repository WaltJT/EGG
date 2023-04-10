/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia2_Ejercicio3;

//Ejercicio3
/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 

Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/

import java.util.Scanner;

public class Dia2_Ejercicio3 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    System.out.println("Por favor ingrese una frase o texto de su agrado, "
            + "para que el programa lo muestre por pantalla "
            + "en mayuscula y minuscula : ");
        
    String frase = scanner.nextLine();
    
    //Esta es una manera, si se quiere
    
    String S1 = frase;       
    
        // Convertir a LowerCase     
        
        System.out.println (" ");
        
        System.out.println(S1.toUpperCase());
    
        System.out.println (" ");
        
        System.out.println(S1.toLowerCase());
    
        System.out.println (" ");
        
    //Y esta es otra manera, de hacer el ejercicio   
       
    /* System.out.println (" ");
     
    System.out.println(frase.toUpperCase());
    
    System.out.println (" ");
    
    System.out.println(frase.toLowerCase());
    
    System.out.println (" ");*/
    
    }
    
}
