/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia7_Ejercicio12_Guia;

/*
EJERCICIO12

Crea un procedimiento EsMultiplo que reciba los dos números pasados por el 
usuario, validando que el primer número sea múltiplo del segundo número, e 
imprima si el primer número es múltiplo del segundo, sino informe que no lo son.

 */

import java.util.Scanner;

public class Dia7_Ejercicio12_Guia {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    System.out.println("Por favor ingrese un primer valor: ");
    int valor1 = scanner.nextInt();
    
    System.out.println("Por favir ingrese un segundo valor: ");
    int valor2 = scanner.nextInt();
    
    int retorno = EsMultiplo(valor1,valor2);
    
    
    }
    
    public static int EsMultiplo (int valor1, int valor2) {
                      
        if (valor1 % valor2 == 0) {
                
            System.out.println("El primer número es múltiplo del segundo número");
            
        } else {
        
            System.out.println("El primer número no es múltiplo del segundo número");
            
        }
        
        return 0;

    }
    
}
    
    
    
            
            
    
   
   
    
    


