/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia4_Ejericio8_Guia;

/* Ejercicio 8
 
 Escriba un programa que valide si una nota está entre 0 y 10, sino está 
entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.*/

import java.util.Scanner;

public class Dia4_Ejericio8_Guia {
 
    public static void main(String[] args) {
    
       Scanner scanner = new Scanner (System.in);
               
       System.out.println("Por favor ingrese cual fue su nota, del 1 al 10: ");
       
       int nota = scanner.nextInt();    
              
       while (nota>=0 && nota<=10) {
           
       System.out.println("Por favor ingrese cual fue su nota, del 1 al 10: ");
              
       nota = scanner.nextInt();
       
       }    
               
       
    }
    
}
