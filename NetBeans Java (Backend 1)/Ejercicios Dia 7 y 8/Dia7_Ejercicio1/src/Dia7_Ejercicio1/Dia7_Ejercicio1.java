/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia7_Ejercicio1;

/*
EJERCICIO1

Crea una aplicación que le pida dos números al usuario y este pueda elegir 
entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función 
para cada operación matemática y deben devolver sus resultados para imprimirlos 
en el main.

 */

import java.util.Scanner;

public class Dia7_Ejercicio1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
          
   while (true) {
            
            System.out.println("Ingrese el primer número entero positivo: ");
            int num1 = scanner.nextInt();
            
            System.out.println();
            
            System.out.println("Ingrese el segundo número entero positivo: ");
            int num2 = scanner.nextInt();
    
            System.out.println();
            
            int retorno;
            
            retorno = menu(num1,num2);
            
   }
    
   
    
    }
    
    public static int menu (int num1, int num2) {
    Scanner scanner = new Scanner (System.in);
     
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opción: ");
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("El resultado de la resta es: " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resta);
                    break;
                case 3:
                    int multiplicacion = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + multiplicacion);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: no se puede dividir por cero.");
                    } else {
                        float division = (float) num1 / num2;
                        System.out.println("El resultado de la división es: " + division);
                    }
                    break;
                case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    String confirmacion = scanner.next();
                    if (confirmacion.toUpperCase().equals("S")) {
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        
        return 0;
   
    }
    
}
