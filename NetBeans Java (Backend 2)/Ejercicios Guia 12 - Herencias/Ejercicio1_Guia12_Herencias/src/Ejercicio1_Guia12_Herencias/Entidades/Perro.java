/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1_Guia12_Herencias.Entidades;

/*
EJERCICIO 1 GUIA 12 HERENCIAS

 Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, 
Caballo.
 La clase Animal tendrá como atributos el nombre, alimento, edad y raza del 
Animal.
 Crear un método en la clase Animal a través del cual cada clase hija deberá 
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar una 
clase Main que realice lo siguiente:
 */

public class Perro extends Animal {

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }
    
}
