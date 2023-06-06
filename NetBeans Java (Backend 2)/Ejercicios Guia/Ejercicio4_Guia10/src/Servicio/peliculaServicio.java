/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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

public class peliculaServicio {
    
    private final List<Pelicula> listaPelicula;
    
    public peliculaServicio(){
    
        listaPelicula = new ArrayList<>();
        
    }
    
    public void Pelicula(){
    
    }

    public void agregarPelicula(Pelicula pelicula) {
        listaPelicula.add(pelicula);
    
    }    
        
    public void mostrarPeliculas () {
        System.out.println("Lista de Peliculas:");
        for (Pelicula pelicula : listaPelicula) {
            System.out.println(pelicula);
            
        }
    
}

        public void mostrarPeliculasDuracionMayorAUnaHora() {
        System.out.println("Peliculas con duracion mayor a 1 hora:");
        for (Pelicula pelicula : listaPelicula) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void ordenarPeliculasPorDuracionDescendente() {
        System.out.println("Peliculas ordenadas por duracion (de mayor a menor):");
        Collections.sort(listaPelicula, Comparator.comparingDouble(Pelicula::getDuracion).reversed());
        for (Pelicula pelicula : listaPelicula) {
            System.out.println(pelicula);
        }
    }

    public void ordenarPeliculasPorDuracionAscendente() {
        System.out.println("Peliculas ordenadas por duracion (de menor a mayor):");
        Collections.sort(listaPelicula, Comparator.comparingDouble(Pelicula::getDuracion));
        for (Pelicula pelicula : listaPelicula) {
            System.out.println(pelicula);
        }
    }

    public void ordenarPeliculasPorTitulo() {
        System.out.println("Peliculas ordenadas por titulo:");
        Collections.sort(listaPelicula, Comparator.comparing(Pelicula::getTitulo));
        for (Pelicula pelicula : listaPelicula) {
            System.out.println(pelicula);
        }
    }

    public void ordenarPeliculasPorDirector() {
        System.out.println("Peliculas ordenadas por director:");
        Collections.sort(listaPelicula, Comparator.comparing(Pelicula::getDirector));
        for (Pelicula pelicula : listaPelicula) {
            System.out.println(pelicula);
        }
    }
    
}