/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia5_Ejercicio6;

/*
EJERCICIO6

 Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú: El usuario deberá elegir una opción y el
programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona 
el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

MENU
1.Sumar
2.Restar
3.Multiplicar
4.Dividir.
5.Salir
Elija opción:

*/

import java.util.Scanner;

public class Dia5_Ejercicio6 {

    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    
    int num1, num2, opcion;
        while (true) {
            System.out.println("Ingrese el primer número entero positivo: ");
            num1 = scanner.nextInt();
            System.out.println("Ingrese el segundo número entero positivo: ");
            num2 = scanner.nextInt();
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("El resultado de la suma es: " + suma);
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
        }
    }
}
 
