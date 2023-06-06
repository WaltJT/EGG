/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/*
EJERCICIO 5 GUIA 10

 Se requiere un programa que lea y guarde países, y para evitar que se ingresen 
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se 
guardará el país en el conjunto y después se le preguntará al usuario si quiere 
guardar otro país o si quiere salir, si decide salir, se mostrará todos 
los países guardados en el conjunto. (Recordemos hacer los servicios en la clase 
correspondiente).
 Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto 
recordar cómo se ordena un conjunto.
 Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un 
Iterator, se buscará el país en el conjunto y si está en el conjunto se 
eliminará el país que ingresó el usuario y se mostrará el conjunto. Si el país 
no se encuentra en el conjunto se le informará al usuario.
*/

public class ServicioPaises {
    
    private final List<Paises>listaPaises; 

    public ServicioPaises () {
    
        listaPaises = new ArrayList<>();
    
    }
    
    HashSet<String> paises = new HashSet();
    
    public void paises () {
          
        Scanner scanner = new Scanner (System.in);
        String respuesta;

        do {
            
            System.out.println("Ingrese el nombre de un pais: ");
            paises.add(scanner.next().toLowerCase());
    
            System.out.println("¿Desea ingresar otro pais? (s/n): ");
            respuesta = scanner.next();
            
        } while (respuesta.equalsIgnoreCase("s"));
        
    }
    
    public void mostrarPaises () {
        System.out.println("Lista de Paises: " + paises);
        listaPaises.forEach(System.out::println);
  
    }    

    public void ordenar() {
    List<String> paisesOrdenados = new ArrayList<>(paises);
    Collections.sort(paisesOrdenados);
    
    System.out.println("Lista de Paises (Ordenados): ");
    for (String pais : paisesOrdenados) {
        System.out.println(pais);
    
    }

}
    
    public void buscarPais () {
    Scanner scanner = new Scanner (System.in);
    
        System.out.println("Que pais quiere seleccionar: ");
        String selectPais = scanner.next().toLowerCase();
        
        boolean encontrado = false;
        
        for (String paise : paises) {
            
            if(paise.equals(selectPais)){
                encontrado = true;
                System.out.println(paise + " fue eliminado");
                break;
        
            }
        
        }
        
        if(!encontrado){
        
            System.out.println("el pais no fue encontrado");
        
        }
        
        System.out.println("Lista de paises: " + paises);
    
    }
        
}    
    

