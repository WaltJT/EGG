/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia5_Ejercicio2;

import java.util.Scanner;

public class Dia5_Ejercicio2 {

   /* EJERCICIO2 
    
    Crear un programa que pida una frase y si esa frase es igual a “eureka” 
    el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
    Incorrecto. 
    
    Nota: investigar la función equals() en Java.*/

    
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);   
    
     System.out.println("Por favor ingrese un texto o frase de su preferencia"
             + "para adivinar la palabra oculta: ");
     String frase = scanner.nextLine();
    
            while (frase.equals("eureka")) {
      	 
    	System.out.println("¡Correcto!");
    	frase = scanner.nextLine();

        }    
        
        System.out.println("¡La palabra o frase ingresada es incorrecta!");
    
    }
    
}
