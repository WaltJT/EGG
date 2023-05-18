/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

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

public class Arreglos {
    
    private double arreglo1;
    private double arreglo2;

    public Arreglos() {
    }

    public Arreglos(double arreglo1, double arreglo2) {
        this.arreglo1 = arreglo1;
        this.arreglo2 = arreglo2;
    }

    public double getArreglo1() {
        return arreglo1;
    }

    public double getArreglo2() {
        return arreglo2;
    }

    public void setArreglo1(double arreglo1) {
        this.arreglo1 = arreglo1;
    }

    public void setArreglo2(double arreglo2) {
        this.arreglo2 = arreglo2;
    }
    
}
