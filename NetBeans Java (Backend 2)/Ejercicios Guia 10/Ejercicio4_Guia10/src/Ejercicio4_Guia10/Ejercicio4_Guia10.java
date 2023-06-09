/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4_Guia10;

import Entidad.Pelicula;
import Servicio.peliculaServicio;
import java.util.Scanner;

/*
EJERCICIO 4 GUIA 10

 Un cine necesita implementar un sistema en el que se puedan cargar peliculas. 
Para esto,tendremos una clase Pelicula con el título, director y duración de la 
película (en horas).
 Implemente las clases y métodos necesarios para esta situación, teniendo en 
cuenta lo que se pide a continuación:

 En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole 
al usuario todos sus datos y guardándolos en el objeto Pelicula.
 Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al 
usuario si quiere crear otra Pelicula o no.

Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo 
en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo 
en pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
*/

public class Ejercicio4_Guia10 {

    public static void main(String[] args) {
 
        peliculaServicio servicio = new peliculaServicio();
        
        Scanner scanner = new Scanner (System.in);
        String respuesta;

        do {
            
            System.out.println("Ingrese el nombre de pelicula: ");
            String titulo = scanner.nextLine();
    
            System.out.println("Ingrese el nombre del director de la pelicula: ");
            String director = scanner.nextLine();
            
            System.out.println("Ingrese la duracion de la pelicula en horas: ");
            double duracion = scanner.nextDouble();
        
            scanner.nextLine();
            
            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            servicio.agregarPelicula(pelicula);
            
            System.out.println("¿Desea ingresar otra pelicula? (s/n): ");
            respuesta = scanner.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
        
        servicio.Pelicula();
        
        servicio.mostrarPeliculas();
        System.out.println();
        
        servicio.mostrarPeliculasDuracionMayorAUnaHora();
        System.out.println();
        
        servicio.ordenarPeliculasPorDuracionDescendente();
        System.out.println();
        
        servicio.ordenarPeliculasPorDuracionDescendente();
        System.out.println();
        
        servicio.ordenarPeliculasPorTitulo();
        System.out.println();
        
        servicio.ordenarPeliculasPorDirector();
        System.out.println();
        
    }
    
}
