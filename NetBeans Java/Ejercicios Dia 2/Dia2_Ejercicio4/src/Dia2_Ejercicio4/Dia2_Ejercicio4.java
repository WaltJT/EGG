/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia2_Ejercicio4;

//Ejercicio4
/*4. Dada una cantidad de grados centígrados se debe mostrar su equivalente 
en grados Fahrenheit.*/ 

//La fórmula correspondiente es: F = 32 + (9 * C / 5).

import java.util.Scanner;

public class Dia2_Ejercicio4 {
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor ingrese la temperatura actual para "
                + "convertir los grados a farenheit: ");
        int grados = scanner.nextInt();
     
        int resultado = 32 + ( 9 * grados / 5 );
        
        // Mostramos el resultado por pantalla
        System.out.println("El resultado en grados Farenheit es: " + resultado 
                + " °F");
    }
    
}
