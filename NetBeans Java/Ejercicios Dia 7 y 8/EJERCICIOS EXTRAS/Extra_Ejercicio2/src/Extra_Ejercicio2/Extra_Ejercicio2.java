/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra_Ejercicio2;

/*
EXTRA EJERCICIO2    

 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias 
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
tome el valor de B. Mostrar los valores iniciales y los valores finales de cada 
variable. 

Utilizar sólo una variable auxiliar.

 */

import java.util.Scanner;

public class Extra_Ejercicio2 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);    
        
        System.out.println("Ingresa un numero entero para el valor A: ");
        int A = scanner.nextInt();
        
        System.out.println("Ingresa un numero entero para el valor B: ");
        int B = scanner.nextInt();
        
        System.out.println("Ingresa un numero entero para el valor C: ");
        int C = scanner.nextInt();
        
        System.out.println("Ingresa un numero entero para el valor D: ");
        int D = scanner.nextInt();
        
        System.out.println("");
        
        System.out.println("El valor de A es: " + A);
    
        System.out.println("El valor de B es: " + B);
            
        System.out.println("El valor de C es: " + C);
    
        System.out.println("El valor de D es: " + D);
        
        cambioLetras1(A,B,C,D);
        cambioLetras2(A,B,C,D);
    
    }
    
public static void cambioLetras1 (int A,int B,int C,int D){
    
        A = D;
        B = C;
        
        
        System.out.println("");
        
        System.out.println("INTERCAMBIO: ");
        
        System.out.println("El valor de A es: " + A);
    
        System.out.println("El valor de B es: " + B);
        
        
    }
   
public static void cambioLetras2 (int A,int B,int C,int D){
            
        C = A;
        D = B;
        
            
        System.out.println("El valor de C es: " + C);
    
        System.out.println("El valor de D es: " + D);
        
    }    

}

