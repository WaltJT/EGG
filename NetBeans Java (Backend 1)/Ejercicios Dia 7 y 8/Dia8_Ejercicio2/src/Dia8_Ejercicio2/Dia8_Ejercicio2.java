/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia8_Ejercicio2;

/*
EJERCICIO2

 Diseñe una función que pida el nombre y la edad de N personas e imprima los 
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si 
quiere seguir mostrando personas y frenar cuando el usuario 
ingrese la palabra “No”.

*/

import java.util.Scanner;

public class Dia8_Ejercicio2 {
        
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    
    String respuesta = "si";
    
    int contarmayores = 0;
    int contarmenores = 0;
    
    int sumar1 = 0;
    int sumar2 = 0;
    
    while (respuesta.equalsIgnoreCase("Si")) {     
    
    System.out.println("Por favor ingrese su nombre y apellido: ");
    String nombreApellido = scanner.nextLine();    
    
    System.out.println("Por favor ingrese su edad: ");
    int edad = scanner.nextInt();
       
    scanner.nextLine();
    
    System.out.println("La persona " + nombreApellido + " tiene " + edad + " años.");
    
    if (edad >= 18) {    
        
        System.out.println("Es mayor de edad.");
        contarmayores++;
                
    } else {
    
        System.out.println("Es menor de edad.");
        contarmenores++;
        
           }           

    System.out.println("¿Desea ingresar otra persona? (Si/No)");
    respuesta = scanner.nextLine();
    
        }
    
    System.out.println("Informe:");
    System.out.println("Las personas ingresadar mayores de edad son: " + contarmayores);
    System.out.println("Las personas ingresadar menores de edad son: " + contarmenores);
    
    }
    
    }
    
    

    

