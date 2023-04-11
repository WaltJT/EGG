/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia4_Ejercicio6_Guia;

/*    Ejercicio 6
    Implementar un programa que le pida dos números enteros al usuario 
y determine si ambos o alguno de ellos es mayor a 25.*/

import java.util.Scanner;

public class Dia4_Ejercicio6_Guia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    System.out.println("Por favor ingrese un valor para la primer variable: ");
    int var1 = scanner.nextInt();    
    
    System.out.println("Por favor ingrese un valor para la segunda variable: ");
    int var2 = scanner.nextInt();    
    
        if ( var1 >= 25 ) {
            
            System.out.println("La variable uno es mayor o igual a 25");
       
        }    
            
        else if( var2 >= 25 ) {   
            
            System.out.println("La variable dos es mayor o igual a 25");
            
        }
        
        else {
        
        System.out.println("Ninguna de las variables es mayor o igual a 25");
         
        }
    

    }
    
}
