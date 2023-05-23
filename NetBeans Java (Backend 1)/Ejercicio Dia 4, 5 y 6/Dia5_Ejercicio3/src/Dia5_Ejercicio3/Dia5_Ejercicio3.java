/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia5_Ejercicio3;

/*
EJERCICIO3

 Realizar un programa que solo permita introducir solo frases o palabras de 
8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá 
de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se 
deberá imprimir “INCORRECTO”. 

Nota: investigar la función Lenght() en Java.
*/

import java.util.Scanner;

public class Dia5_Ejercicio3 {

    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);    
    
    System.out.println("Por favor ingrese una palabra o frase, "
            + "que contenga mmenos u 8 letras como maximo: ");
    String letter = scanner.nextLine();
    
    if (letter.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
      }
        
    }

}
