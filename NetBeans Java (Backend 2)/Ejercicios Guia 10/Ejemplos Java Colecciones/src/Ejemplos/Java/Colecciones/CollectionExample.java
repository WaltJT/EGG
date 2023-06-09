/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplos.Java.Colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author wjter
 */
public class CollectionExample {
    
    public static void main(String[] args) {

/*
    Claro, aquí tienes un resumen de los conceptos básicos sobre las colecciones en Java:

Introducción a las colecciones:

En Java, las colecciones son estructuras de datos que permiten almacenar, 
manipular y organizar grupos de objetos.
 Proporcionan diferentes interfaces y clases para representar diferentes tipos 
de colecciones, como listas, conjuntos y mapas.

Interfaces de colección:

Las interfaces de colección son contratos que especifican un conjunto de 
operaciones comunes que se pueden realizar en una colección, independientemente 
de su implementación subyacente.
Algunas interfaces de colección comunes son: Collection, List, Set y Map.

Implementaciones de colección:

Las implementaciones de colección son clases concretas que implementan las 
interfaces de colección y proporcionan la funcionalidad real de almacenamiento y 
manipulación de elementos.
Algunas implementaciones populares son: ArrayList, LinkedList, HashSet, TreeSet 
y HashMap.

Listas:

La interfaz List representa una secuencia ordenada de elementos, donde los 
elementos pueden repetirse.
 ArrayList y LinkedList son implementaciones comunes de la interfaz List.
 ArrayList almacena elementos en un arreglo dinámico, mientras que LinkedList 
utiliza una estructura de lista enlazada.

Conjuntos:

 La interfaz Set representa una colección de elementos únicos, sin ningún orden 
específico.
 HashSet y TreeSet son implementaciones comunes de la interfaz Set.
 HashSet almacena elementos en una tabla hash, mientras que TreeSet mantiene 
los elementos ordenados según un criterio específico.

Mapas:

La interfaz Map representa una asociación de pares clave-valor, donde cada clave 
es única y se utiliza para acceder a su respectivo valor.
 HashMap y TreeMap son implementaciones comunes de la interfaz Map.
 HashMap almacena los pares clave-valor en una tabla hash, mientras que TreeMap 
mantiene los pares ordenados según el orden de las claves.

*/
        
        //Ejemplo de uso de la interfaz Collection:
        
        /*
        import java.util.ArrayList;
        import java.util.Collection;
        */
        
        Collection<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");

        System.out.println(nombres); // Output: [Juan, María, Pedro]
        System.out.println("Tamaño de la colección: " + nombres.size()); // Output: 3

        nombres.remove("María");
        System.out.println(nombres); // Output: [Juan, Pedro]

        nombres.clear();
        System.out.println(nombres); // Output: []
    
        System.out.println("");
        System.out.println("");
    
        
    CollectionExample example = new CollectionExample();
    
    // Ejemplo de uso de la interfaz List
    example.ListExample();

    System.out.println("");
    System.out.println("");

    // Ejemplo de uso de la interfaz Set
    example.SetExample();

    System.out.println("");
    System.out.println("");

    // Ejemplo de uso de la interfaz Map
    example.MapExample();
        
    }
     
    private void ListExample () {
    
        //Ejemplo de uso de la interfaz List:
        
        /*
        import java.util.ArrayList;
        import java.util.List;
        */
        
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10); // Posisción 0
        numeros.add(20); // Posisción 1
        numeros.add(30); // Posisción 2
        numeros.add(20); // Posisción 3

        System.out.println(numeros); // Output: [10, 20, 30, 20]
        System.out.println("Tamaño de la lista: " + numeros.size()); // Output: 4

        numeros.remove(1);
        System.out.println(numeros); // Output: [10, 30, 20]

        int numero = numeros.get(1);
        System.out.println("Elemento en la posición 1: " + numero); // Output: 30
        
    }
    
    private void SetExample () {
    
        //Ejemplo de uso de la interfaz Set:
        
        /*
        import java.util.HashSet;
        import java.util.Set;
        */
        
        Set<String> colores = new HashSet<>();

        /*HashSet y TreeSet son implementaciones comunes de la interfaz Set.
        HashSet almacena elementos en una tabla hash, mientras que TreeSet 
        mantiene los elementos ordenados según un criterio específico.*/
        
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Rojo");

        System.out.println(colores); // Output: [Rojo, Verde, Azul]
        System.out.println("Tamaño del conjunto: " + colores.size()); // Output: 3

        colores.remove("Verde");
        System.out.println(colores); // Output: [Rojo, Azul]

        boolean contieneRojo = colores.contains("Rojo");
        System.out.println("¿Contiene Rojo? " + contieneRojo); // Output: true

    }

    private void MapExample () {

        //Ejemplo de uso de la interfaz Map:

        /*
        import java.util.HashMap;
        import java.util.Map;
        */
        
        Map<String, Integer> edades = new HashMap<>();
        
        /*HashMap y TreeMap son implementaciones comunes de la interfaz Map.
        HashMap almacena los pares clave-valor en una tabla hash, mientras que 
        TreeMap mantiene los pares ordenados según el orden de las claves.*/
        
        edades.put("Juan", 30);
        edades.put("María", 25);
        edades.put("Pedro", 35);

        System.out.println(edades); // Output: {Juan=30, Pedro=35, María=25}
        System.out.println("Tamaño del mapa: " + edades.size()); // Output: 3

        int edadJuan = edades.get("Juan");
        System.out.println("Edad de Juan: " + edadJuan); // Output: 30

        edades.remove("María");
        System.out.println(edades); // Output: {Juan=30, Pedro=35}
    
    }

}   

