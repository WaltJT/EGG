/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia9_Ejercicio13_Guia;

/*
EJERCICIO13 GUIA

Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros 
de equipo y define su tipo de dato de tal manera que te permita alojar sus 
nombres más adelante.

*/

import java.util.Scanner;

public class Dia9_Ejercicio13_Guia {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

        System.out.print("Ingrese la cantidad de compañeros de equipo: ");
        int cantidadCompaneros = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        
        String[] equipo = new String[cantidadCompaneros];
        
        for (int i = 0; i < cantidadCompaneros; i++) {
            System.out.print(String.format("Ingrese el nombre del compañero %d: ", i+1));
            equipo[i] = scanner.nextLine();
        }
        
        System.out.println("El equipo está formado por: ");
        for (int i = 0; i < cantidadCompaneros; i++) {
            System.out.println("- " + equipo[i]);

        }

    }

}
