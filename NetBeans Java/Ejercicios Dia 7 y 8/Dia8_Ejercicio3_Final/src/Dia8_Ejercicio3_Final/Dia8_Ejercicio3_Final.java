/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia8_Ejercicio3_Final;

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

public class Dia8_Ejercicio3_Final {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);    
    
        System.out.println("Ingrese el monto de euros que quiere convertir a "
                + "otra diviza: ");                
        double moneda = scanner.nextInt();
        
        System.out.println("Por favor ingrese a que moneda desea realizae el"
                + "cambio de divisa: ");
        String cambio = scanner.next();
        
        cambiopesoadolar (moneda,cambio);
        
    }    
     
    public static void cambiopesoadolar (double moneda, String cambio){   
        
        double resultado;
                
        switch (cambio.toLowerCase()){
            
            case "libras":
                resultado = moneda * 0.86;
                System.out.println(moneda + " euros son " + resultado + " libras.");
                break;
            
            case "dolares":
                resultado = moneda * 1.28611;
                System.out.println(moneda + " euros son " + resultado + " dólares.");
                break;
            
            case "yenes":
                resultado = moneda * 129.852;
                System.out.println(moneda + " euros son " + resultado + " yenes.");
                break;
            
            default:
                System.out.println("Moneda no reconocida.");
                break;
    }
        
}

}
