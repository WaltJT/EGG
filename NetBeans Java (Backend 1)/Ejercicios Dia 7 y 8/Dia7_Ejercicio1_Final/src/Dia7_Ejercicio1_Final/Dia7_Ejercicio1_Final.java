/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia7_Ejercicio1_Final;

/*
Ejercicio1

Crea una aplicación que le pida dos números al usuario y este pueda elegir entre 
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para 
cada operación matemática y deben devolver sus resultados para imprimirlos 
en el main. 

*/

import java.util.Scanner;

public class Dia7_Ejercicio1_Final {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("Elige una operación a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("El resultado de la división es: " + dividir(num1, num2));
                break;
            case 5:
                    System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                    String confirmacion = sc.next();
                    if (confirmacion.toUpperCase().equals("S")) {
                        System.out.println("Saliendo del programa...");
                        System.exit(0); 
                    }    
            default:
                System.out.println("Opción inválida");
                break;
        }
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir entre cero");
            return Double.NaN; // Devuelve Not-a-Number (NaN) si se intenta dividir entre cero
        } else {
            return num1 / num2;
        }
    }

}
