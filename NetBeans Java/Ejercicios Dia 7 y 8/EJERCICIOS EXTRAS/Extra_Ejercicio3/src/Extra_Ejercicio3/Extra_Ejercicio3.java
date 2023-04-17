/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra_Ejercicio3;

/*
EXTRA EJERCICIO3

Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata 
de una vocal. Caso contrario mostrar un mensaje. 

**Nota: investigar la función equals() de la clase String.**

*/

import java.util.Scanner;

public class Extra_Ejercicio3 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    String pregunta = "si";
    
    while(pregunta.equalsIgnoreCase("si")) { 
        
        System.out.println("Por favor ingrese una letra: ");
        String letter = scanner.next();        
        
        letra(letter,pregunta);
        
        System.out.println("Desea continuar (si/no): ");
        pregunta = scanner.next();
        
    }
    
    System.out.println("¡Gracias por usar el programa!");

}
     
public static void letra (String letter,String pregunta) {
        
    if (letter.equalsIgnoreCase("a")) {
    
        System.out.println("La letra ingresada es una vocal.");
        
    } else if (letter.equalsIgnoreCase("e")) {
        
        System.out.println("La letra ingresada es una vocal.");
       
    }else{
                
        //System.out.println("La letra ingresada es una consonante.");    }
    
    if (letter.equalsIgnoreCase("i")) {
        
        System.out.println("La letra ingresada es una vocal.");
        
    }else if (letter.equalsIgnoreCase("o")) {
        
        System.out.println("La letra ingresada es una vocal.");
        
    }else{
        
        //System.out.println("La letra ingresada es una consonante.");
        
        if (letter.equalsIgnoreCase("u")) {
            
        System.out.println("La letra ingresada es una vocal.");
        
    }else{
        
        System.out.println("La letra ingresada es una consonante."); 
            
        }
        
        }
        
    }
    
  }

}


  




