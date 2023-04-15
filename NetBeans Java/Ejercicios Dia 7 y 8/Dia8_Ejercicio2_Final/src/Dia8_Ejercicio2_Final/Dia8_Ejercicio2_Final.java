/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia8_Ejercicio2_Final;

import java.util.Scanner;

public class Dia8_Ejercicio2_Final {
   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        int n;
        String continuar = "Sí";
        
        System.out.println("Ingrese el número de personas:");
        n = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < n && continuar.equalsIgnoreCase("Sí"); i++) {
            ingresarPersona(input);
            System.out.println("¿Desea ingresar otra persona? (Sí/No)");
            continuar = input.nextLine();
        }
    }
    
    public static void ingresarPersona(Scanner input) {
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = input.nextLine();
        
        System.out.println("Ingrese la edad de " + nombre + ":");
        int edad = input.nextInt();
        input.nextLine();
        
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " es menor de edad.");
        }
    }
}
