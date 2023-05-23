/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia5_Ejercicio5;

/*
EJERCICIO5

Escriba un programa en el cual se ingrese un valor límite positivo, y a 
continuación solicite números al usuario hasta que la suma de los números 
introducidos supere el límite inicial.

*/

import java.util.Scanner;

public class Dia5_Ejercicio5 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);  
    
    System.out.println("Ingrese un valor inicial: ");
    int valor1 = scanner.nextInt();
    
    int suma = 0;
    int contador = 0;
    
    int valor2;
    
        do {
            
        System.out.println("por favor ingrese un nuevo valor: ");
        valor2 = scanner.nextInt();
        
        suma += valor2;
        contador++;
            
        } while (suma<=valor1);
      
        System.out.println("Se ingresaron " + contador + " números.");
        System.out.println("La suma total es " + suma + ".");
       
    }
       
}
