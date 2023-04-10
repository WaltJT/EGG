/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia2_Ejercicio5;

//Ejercicio5
//5. Escribir un programa que lea un número entero por teclado 
//y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 

//Nota: investigar la función Math.sqrt().

import java.util.Scanner;

public class Dia2_Ejercicio5 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor ingrese un numero entero, " 
        + "para poder mostrar por pantalla, el doble del mismo, " 
                + "el triple, y su raiz: ");
        
        int ent = scanner.nextInt();
        
        int Rta1 = ent * 2;
        
        int Rta2 = ent * 3;
                
        System.out.println( + Rta1);
        
        System.out.println( + Rta2);
        
        System.out.println(Math.sqrt(ent));
        
    }
    
}
