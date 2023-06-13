/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Jugador;
import Entidad.RevolverAgua;
import java.util.ArrayList;

/*

EJERCICIO 2 GUIA 11 - Relacion entre clases.

 Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el 
juego se trata de un número de jugadores, que, con un revolver de agua, el cual 
posee una sola carga de agua, se dispara y se moja. Las clases por hacer del 
juego son las siguientes:

Clase Revolver de agua: esta clase posee los siguientes atributos: posición 
actual (posición del tambor que se dispara, puede que esté el agua o no) y 
posición agua (la posición del tambor donde se encuentra el agua). Estas dos 
posiciones, se generarán aleatoriamente.

Métodos:

• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.

• mojar(): devuelve true si la posición del agua coincide con la posición actual

• siguienteChorro(): cambia a la siguiente posición del tambor

• toString(): muestra información del revolver (posición actual y donde está el 
agua)

• Clase Jugador: esta clase posee los siguientes atributos: id (representa el 
número del jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por 
ejemplo) y mojado (indica si está mojado o no el jugador). El número de 
jugadores será decidido por el usuario, pero debe ser entre 1 y 6. Si no está en 
este rango, por defecto será 6.

Métodos:

• disparo(Revolver r): el método, recibe el revolver de agua y llama a los 
métodos de mojar() y siguienteChorro() de Revolver. El jugador se apunta, 
aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El 
atributo mojado pasa a false y el método devuelve true, sino false.

Clase Juego: esta clase posee los siguientes atributos: Jugadores 
(conjunto de Jugadores) y Revolver

Métodos:

• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los 
jugadores y el revolver para guardarlos en los atributos del juego.
 
*/

public class Juego {
    
    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua r) {
        this.jugadores = jugadores;
        this.revolver = r;
    
    }

    public void jugar() {
        revolver.llenarRevolver();

        boolean finJuego = false;
        int i = 0;

        while (!finJuego) {
            Jugador jugadorActual = jugadores.get(i);
            System.out.println(jugadorActual);

            if (jugadorActual.disparo(revolver)) {
                finJuego = true;
                System.out.println("¡El jugador " + jugadorActual + " ha perdido!");
            
            } else {
                i = (i + 1) % jugadores.size();
                revolver.siguienteChorro();
       
            }
        
        }
    
    }

}
    

