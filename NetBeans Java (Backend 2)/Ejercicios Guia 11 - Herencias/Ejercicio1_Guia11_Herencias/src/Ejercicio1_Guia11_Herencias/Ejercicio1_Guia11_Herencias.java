/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1_Guia11_Herencias;

import Ejercicio1_Guia11_Herencias.Entidades.Animal;
import Ejercicio1_Guia11_Herencias.Entidades.Caballo;
import Ejercicio1_Guia11_Herencias.Entidades.Gato;
import Ejercicio1_Guia11_Herencias.Entidades.Perro;

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

public class Ejercicio1_Guia11_Herencias {

    public static void main(String[] args) {

        //Declaracion del objeto Perro
        Animal perro1 = new Perro("Stich", " Es carnivoro", 15, "Doberman");
        perro1.alimentarse();
        
        //Declaracion del objeto Perro
        Animal perro2 = new Perro("Teddy", " Croquetas", 10, "Chihuahua");
        perro2.alimentarse();
        
        //Declaracion del objeto Gato
        Animal gato = new Gato("Pelusa", " Galletas", 15, "Siamés");
        gato.alimentarse();
        
        //Declaracion del objeto Caballo
        Animal caballo = new Caballo("Spark", " pasto", 25, "Fino");
        caballo.alimentarse();

        System.out.println("");
        
        System.out.println("Perro 1: \n");
        System.out.println(perro1);
                
        System.out.println("Perro 2: \n");
        System.out.println(perro2);
        
        System.out.println("Gato: \n");
        System.out.println(gato);
        
        System.out.println("Caballo: \n");
        System.out.println(caballo);
        
    }
    
}
