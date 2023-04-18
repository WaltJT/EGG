/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia9_Ejercicio14_Guia;

/*
EJERCICIO14 GUIA

Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus 
compañeros de equipo

 */

import java.util.Scanner;

public class Dia9_Ejercicio14_Guia {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

        System.out.print("Ingrese la cantidad de compañeros de equipo: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        
        String[] equipo = new String[cantidad];
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print(String.format("Ingrese el nombre del compañero %d: ", i+1));
            equipo[i] = scanner.nextLine();
        }
        
        System.out.println("El equipo está formado por: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("* " + equipo[i] + ".");

            
            
        }

    }

}
