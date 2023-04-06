/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia2_Ejercicio4_Guia;

//Ejercicio 4
//Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por pantalla.
//Recomendamos que hagan el siguiente experimento: tipear en minúsculas la palabra sout y apenas terminamos de escribirla tocar el botón tab o mejor dicho tabular.
//Esto nos va a generar un System.out.println() para poder escribir lo que queramos.


import java.util.Scanner;

public class Dia2_Ejercicio4_Guia {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
      
    System.out.print("Por favor ingrese su nombre y apellido: ");
    String Name = scanner.nextLine();
    
    System.out.print("Por favor ingrese su edad: ");
    int Age = scanner.nextInt();
    
    System.out.println("Su nomebre y apellido es: "+ Name);
    
    System.out.println("Su edad es: "+ Age);
    
    
    }
    
}
