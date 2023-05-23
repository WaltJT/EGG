/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

/*
EJERCICIO 2 POO Servicios

Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con 
los atributos capacidadMáxima (la cantidad máxima de café que puede contener la 
cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). 
Agregar constructor vacío y con parámetros así como setters y getters. Crear 
clase CafeteraServicio en el paquete Servicios con los siguiente:

A- Método llenarCafetera(): hace que la cantidad actual sea igual a la 
capacidad máxima. 

B- Método servirTaza(int): se pide el tamaño de una taza vacía, el método 
recibe el tamaño de la taza y simula la acción de servir la taza con la 
capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar 
la taza, se sirve lo que quede. El método le informará al usuario si se llenó 
o no la taza, y de no haberse llenado en cuanto quedó la taza.

C- Método vaciarCafetera(): pone la cantidad de café actual en cero. 

D- Método agregarCafe(int): se le pide al usuario una cantidad de café, el 
método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

//    public void llenarCafetera() {
//        cantidadActual = capacidadMaxima;
//    }
//
//    public void servirTaza(int tamanoTaza) {
//        if (cantidadActual >= tamanoTaza) {
//            cantidadActual -= tamanoTaza;
//            System.out.println("Se sirvió la taza correctamente");
//        } else {
//            System.out.println("No hay suficiente café para llenar la taza");
//        }
//    }
//
//    public void vaciarCafetera() {
//        cantidadActual = 0;
//    }
//
//    public void agregarCafe(int cantidad) {
//        cantidadActual += cantidad;
//        if (cantidadActual > capacidadMaxima) {
//            cantidadActual = capacidadMaxima;
//        }

}
