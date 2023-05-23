/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia8_Ejercicio3;

/*
EJERCICIO3

Crea una aplicación que a través de una función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes 
o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a 
convertir que será una cadena, este no devolverá ningún valor y mostrará 
un mensaje indicando el cambio (void).

El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */

import java.util.Scanner;

public class Dia8_Ejercicio3 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);    
    
        System.out.println("Ingrese el monto en su valor en pesos, para poderlo "
                + "convertir a dolares: ");                
        int moneda = scanner.nextInt();
        
        cambiopesoadolar (moneda);
        
    }    
     
    public static void cambiopesoadolar (double moneda){   
        
        double resultado = 0;
        double dolar = 0.0057;
        double libras = 0.0079;
        double yenes = 0.68;
        
        resultado = moneda * dolar;
        System.out.println("El su valor en dolares es: "+resultado);
        
        resultado = moneda * libras;
        System.out.println("El su valor en libras es: "+resultado);
        
        resultado = moneda * yenes;
        System.out.println("El su valor en yenes es: "+resultado);
        
    }
    
}
