/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author gianl
 */
public class PeliculaService {
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Pelicula> peliculaBucle(){
        
        ArrayList<Pelicula> peliculas = new ArrayList();
        
        OUTER:
        do {
            Pelicula pelicula = new Pelicula();
            System.out.println("escribe el nombre de la pelicula");
            pelicula.setTitulo(scan.next());
            System.out.println("escribe el director de la pelicula");
            pelicula.setDirector(scan.next());
            System.out.println("escribe la duracion de la pelicula en horas");
            pelicula.setDuracion(scan.nextDouble());
            peliculas.add(pelicula);
            System.out.println("queres agregar otra pelicula? s/n");
            switch (scan.next()) {
                case "n":
                    break OUTER;
                case "s":
                    continue;
                default:
                    System.out.println("respuesta no valida");
                    break;
            }
        } while (true);
        
        return peliculas;
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> peliculas){
        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula pelicula = peliculas.get(i);
            System.out.println(pelicula.getTitulo());
        }
    }
    
    public void mostrarMayorA1(ArrayList<Pelicula> peliculas){
        
        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula pelicula = peliculas.get(i);
            if(pelicula.getDuracion()>1){
                System.out.println(pelicula.getDuracion());
            }
        }
        
    }
    
    public void mostrarOrdenes(ArrayList<Pelicula> peliculas){
        
        ArrayList<Double> mayor = new ArrayList();
        
        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula pelicula = peliculas.get(i);
            mayor.add(pelicula.getDuracion());
            Collections.sort(mayor);
        }
        System.out.println(mayor);
        
        ArrayList<Double> menor = new ArrayList();
        
        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula pelicula = peliculas.get(i);
            menor.add(pelicula.getDuracion());
            Collections.sort(menor);
            Collections.reverse(menor);
        }
        
        System.out.println(menor);
    }
    
    public void ordenarTitulo(ArrayList<Pelicula> peliculas){
        ArrayList<String> orden = new ArrayList();
        
        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula pelicula = peliculas.get(i);
            orden.add(pelicula.getTitulo());
            Collections.sort(orden);
        }
        System.out.println(orden);
    }
    
    public void ordenarDirector(ArrayList<Pelicula> peliculas){
        ArrayList<String> orden = new ArrayList();
        
        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula pelicula = peliculas.get(i);
            orden.add(pelicula.getDirector());
            Collections.sort(orden);
        }
        System.out.println(orden);
    }
}
