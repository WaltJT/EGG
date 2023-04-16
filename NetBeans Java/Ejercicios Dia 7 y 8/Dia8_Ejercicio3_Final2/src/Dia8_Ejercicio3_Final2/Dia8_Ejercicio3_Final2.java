/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia8_Ejercicio3_Final2;

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

public class Dia8_Ejercicio3_Final2 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);    
    
        System.out.println("Ingrese el monto de euros que quiere convertir a "
                + "otra diviza: ");                
        double moneda = scanner.nextInt();
                
        System.out.println("Ingrese el monto de pesos que quiere convertir a "
                + "otra diviza: ");                
        double pesos = scanner.nextInt();
                
        cambiopesoadolar1 (moneda);
        cambiopesoadolar2 (pesos);
        
    }    
     
    public static void cambiopesoadolar1 (double moneda){   
        
        double resultado1 = 0;
        double dolar = 0.86;
        double libras = 1.28611;
        double yenes = 129.852;
        
        System.out.println();
        
        System.out.println("INFORME");
        
        System.out.println("Conversión de euros a diversas divizas:");
        
        System.out.println();
        
        resultado1 = moneda * dolar;
        System.out.println("El su valor en dolares es: "+resultado1);
        
        resultado1 = moneda * libras;
        System.out.println("El su valor en libras es: "+resultado1);
        
        resultado1 = moneda * yenes;
        System.out.println("El su valor en yenes es: "+resultado1);
        
    } 

    public static void cambiopesoadolar2 (double pesos){   
        
        double resultado2 = 0;
        double dolar = 0.0057;
        double libras = 0.0079;
        double yenes = 0.68;
        
        System.out.println();
        
        System.out.println("INFORME");
        
        System.out.println("Conversión de pesos a diversas divizas:");
        
        System.out.println();
        
        resultado2 = pesos * dolar;
        System.out.println("El su valor en dolares es: "+resultado2);
        
        resultado2 = pesos * libras;
        System.out.println("El su valor en libras es: "+resultado2);
        
        resultado2 = pesos * yenes;
        System.out.println("El su valor en yenes es: "+resultado2);
        
    }
    
}



   
 
