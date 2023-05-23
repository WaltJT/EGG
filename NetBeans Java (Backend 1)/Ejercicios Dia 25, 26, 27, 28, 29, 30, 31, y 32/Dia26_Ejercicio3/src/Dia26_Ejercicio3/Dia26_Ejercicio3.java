/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia26_Ejercicio3;

import Servicios.ArreglosServicios;

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

public class Dia26_Ejercicio3 {

    public static void main(String[] args) {
    
    ArreglosServicios servicio = new ArreglosServicios();     
        
        double[] arreglo1 = new double[50]; // arreglo de 50 números
        double[] arreglo2 = new double[20]; // arreglo de 20 números

        // Inicializar los arreglos con valores aleatorios
        servicio.inicializarA();

        // Mostrar los arreglos en consola
        servicio.mostrar();
        
        // Mostrar los arreglos ordenador por consola
        servicio.ordenar();
        
        // Metodo inicializarB copiar los primeros 10 elementos de arreglo1 a arreglo2 y llenar los elementos restantes de arreglo2 con el valor 0.5
        servicio.inicializarB();
        
    }
}
