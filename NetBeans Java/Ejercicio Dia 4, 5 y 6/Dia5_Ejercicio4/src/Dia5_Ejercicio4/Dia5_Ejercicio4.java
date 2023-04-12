/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia5_Ejercicio4;

/*
EJERCICIO4

Escriba un programa que pida una frase o palabra y valide si la primera 
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de 
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
se deberá imprimir “INCORRECTO”. 

Nota: investigar la función Substring y equals() de Java.
 */

import java.util.Scanner;

public class Dia5_Ejercicio4 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);    
    
    System.out.println("Por favor ingrese una palabra por pantalla: ");
    String letra = scanner.nextLine();
    
    if (letra.substring(0, 1).equalsIgnoreCase("a")) { //De esta manera el programa chequea que la primer letra ingresada de la palabra sea tanto "a" minuscula como mayuscula.
                
            System.out.println("CORRECTO");
        
        } else {
        
            System.out.println("INCORRECTO");
        
        }
    
    }

}
