/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia6_Ejercicio8;

/*
EJERCICIO8

Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. 
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá 
dibujar lo siguiente:

* * * *
*     *
*     *
* * * *

 */

import java.util.Scanner;

public class Dia6_Ejercicio8 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);    
        
        System.out.println("Por favor ingrese un numero entero para generar un "
                + "cuadrado o rectangulo, de * segun el numero : ");
        int var = scanner.nextInt();
        
        System.out.println();
        
        for(int i = 1; i <= var; i++){
        
            for(int j = 1; j <= var; j++){

                if(var == j || i == var || i == 1 || j == 1){

                    System.out.print("* ");

                } else {

                    System.out.print("  ");

                }

            }
            
            System.out.println();
            
        }
            
    }
    
        
        
        
}
    

