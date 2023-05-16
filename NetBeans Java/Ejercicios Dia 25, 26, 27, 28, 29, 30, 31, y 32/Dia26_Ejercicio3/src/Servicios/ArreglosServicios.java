/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.Arrays;

/*
EJERCICIO 3 POO Servicios de Utilidad

 Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo 
B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, 
con los siguientes métodos:

A- Método inicializarA recibe un arreglo por parámetro y lo inicializa con 
números aleatorios.

B- Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.

C- Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.

D- Método inicializarB copia los primeros 10 números del arreglo A en el 
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

E- En el Main nuevamente: inicializar A, mostrar A, ordenar A, 
inicializar B, mostrar A y B.

 */

public class ArreglosServicios {

double[] arreglo1 = new double[50]; // arreglo de 50 números
double[] arreglo2 = new double[20];
        
    
    public double[] getArreglo1() {
        return arreglo1;
    }

    public double[] getArreglo2() {
        return arreglo2;
    }

    public void inicializarA () {
        
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = (int) (Math.random() * 100); // números aleatorios entre 0 y 99
        }

        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i] = (int) (Math.random() * 100);
        }
    
    }
    
    public void mostrar () {
    
        System.out.println("Arreglo 1:");
        
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print(arreglo1[i] + " ");
        }

        System.out.println("\nArreglo 2:");

        for (int i = 0; i < arreglo2.length; i++) {
            System.out.print(arreglo2[i] + " ");
        }
    
    }
   
    public void ordenar () {
    
        
        Arrays.sort(arreglo1);
        Arrays.sort(arreglo2);
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Arreglo ordenado:");
        
        for (int i = 0; i < arreglo1.length; i++) {
        System.out.print(arreglo1[i] + " ");
        
        }
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Arreglo ordenado:");
        
        for (int i = 0; i < arreglo2.length; i++) {
        System.out.print(arreglo2[i] + " ");
        
        }
    
}
    
    public void inicializarB () {
        
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Llena el array con los primeros 10 numeros del arreglo 1: ");
        for (int i = 0; i < 10; i++) {
        arreglo2[i] = arreglo1[i]; // copiar los primeros 10 elementos de arreglo1 a arreglo2
        
        }
        
        System.out.println(" ");
        
        for (int i = 0; i < arreglo2.length; i++) {
        System.out.println(arreglo2[i]+ " ");

        }

        System.out.println(" ");
        
        System.out.println("Completa el arreglo con 0.5: ");
        for (int i = 10; i < arreglo2.length; i++) {
        arreglo2[i] = 0.5; // llenar los elementos restantes de arreglo2 con el valor 0.5
        
        }
        
        System.out.println(" ");
        
        for (int i = 0; i < arreglo2.length; i++) {
        System.out.println(arreglo2[i] + " ");
        
        }
        
    }
    
}