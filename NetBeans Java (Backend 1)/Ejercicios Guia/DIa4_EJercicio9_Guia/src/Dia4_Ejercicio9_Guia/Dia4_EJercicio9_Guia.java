/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia4_Ejercicio9_Guia; 

/*Ejercicio 9
Escriba un programa que lea 20 números. Si el número leído es igual 
a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números 
leídos, pero si el número es negativo no debe sumarse. 

Nota: recordar el uso de la sentencia break.*/

/* Esta es la manera correcta, tal como lo pide el ejercicio. */

import java.util.Scanner;

public class Dia4_EJercicio9_Guia {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int suma = 0;
        int contador = 0;
        
        while (contador < 20) {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();
            
            if (numero == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            
            }
            
            if (numero > 0) {
                suma += numero;
            }
            
            contador++;
        
        }
        
        System.out.println("La suma de los números positivos ingresados es: " + suma);
    
    }

}



/*Ejercicio 9
Escriba un programa que lea 20 números. Si el número leído es igual 
a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".  
El programa deberá calcular y mostrar el resultado de la suma de los números 
leídos, pero si el número es negativo no debe sumarse. 

Nota: recordar el uso de la sentencia break.*/

/* Esta manera si bien esta correcta, no es tal como lo pide el ejercicio 
(la misma se realiza haciendo el uso de for, if, y else if). */

 /* import java.util.Scanner;

public class Dia4_EJercicio9_Guia {
    
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);    
    int suma = 0; /* Inicializamos la variable que guardará 
    la suma de los números leídos */
               
  /*      for (int i = 0; i < 20; i++) {
    
            System.out.println("Por favor ingrese un valor: ");
            int var = scanner.nextInt(); // Leemos un número desde el teclado
            
            
           if (var==0) { 
            
            System.out.println("Por favor ingrese un valor: ");   
               
            break; // Salimos del bucle si se ingresa un cero
                        
           } else if (var < 0) {
               
            continue; /* Si el número es negativo, no se suma 
            y se continúa con el siguiente número*/  
                                        
    /*       }  
         
           suma += var; // Se suma el número si es positivo
               
        }
        
        System.out.println("La suma de los números ingresados es: " + suma);
        
    }
    
} */

