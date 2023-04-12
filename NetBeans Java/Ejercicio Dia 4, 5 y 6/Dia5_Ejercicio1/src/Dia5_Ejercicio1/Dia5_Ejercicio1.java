/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia5_Ejercicio1;

/*EJERCICIO1

Crear un programa que dado un número determine si es par o impar.*/

import java.util.Scanner;

public class Dia5_Ejercicio1 {

    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        
        System.out.println("Por favor ingrese un número por pantalla, "
           + "para que el programa, defina si el número ingresado es par o impar: ");
        int num=scanner.nextInt();
        
        if (num % 2 == 0) {
            
            System.out.println("El numero ingresado es par.");
            
        }
        
        else {
            
            System.out.println("El numero ingresado es impar.");
            
    }    
        
    }
    
}
