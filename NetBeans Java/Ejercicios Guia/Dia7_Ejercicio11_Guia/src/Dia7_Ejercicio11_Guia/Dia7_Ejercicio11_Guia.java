/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia7_Ejercicio11_Guia;

/*
EJERCICIO11

Escribir un programa que procese una secuencia de caracteres ingresada por 
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de 
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en 
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) 
se mantienen sin cambios.

a - e - i - o - u
@ - # - $ - % - *

Realice un subprograma que reciba una secuencia de caracteres y retorne la 
codificación correspondiente. Utilice la estructura “según” para la 
transformación. 

Por ejemplo, si el usuario ingresa:  Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */

import java.util.Scanner;

public class Dia7_Ejercicio11_Guia {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);    
    
    System.out.println("Por favor ingrese una frase, o una oracion de su agrado,"
            + "para que el programa lo decodifique: ");
    String caracter = scanner.nextLine();
        
   System.out.println("La oració ingresada es: " + caracter);
        
        String decodificador = codificador(caracter);
   
   System.out.println("Oración decodificada: " + decodificador);
 
}   
    
public static String codificador(String caracter) {

    String decodificador = "";

    for (int i = 0; i < caracter.length(); i++) {
         
      char decod = caracter.charAt(i);

      switch(decod){      
    
        case 'a':
           decodificador += "@";
           break;
        case 'e':
            decodificador += "#";
            break;
        case 'i':
            decodificador += "$";
            break;
        case 'o':
            decodificador += "%";
            break;
        case 'u':
            decodificador += "*";
            break;
        case 'A':
            decodificador += "@";
            break;
        case 'E':
            decodificador += "#";
            break;
        case 'I':
            decodificador += "$";
            break;
        case 'O':
            decodificador += "%";
            break;
        case 'U':
            decodificador += "*";
            break;
        default:
            decodificador += decod;
    
    }
   
}
    
return decodificador;

}
    
}





