/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia9_ejercicio13_guia2;

/*
EJERCICIO13 GUIA

Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros 
de equipo y define su tipo de dato de tal manera que te permita alojar sus 
nombres más adelante.

*/

import java.util.Scanner;

public class Dia9_Ejercicio13_Guia2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
        
    String[] vector = new String[9];
    
    vector[0] = "Astrid Acosta";
    vector[1] = "Alfonso Quinzio";
    vector[2] = "Carlos Calderon";
    vector[3] = "Federico Araya";
    vector[4] = "Jose Luis Ceballos";
    vector[5] = "Mayra Patiño";
    vector[6] = "Nicolas Aguero";
    vector[7] = "Walter Becerra";
    vector[8] = "Walter Javier Terranova";        
    
    System.out.println("Lista de nombres:");
        for (int i = 0; i < vector.length; i++) {
            System.out.println("* " + vector[i]+ ".");


    }
    
  }

}