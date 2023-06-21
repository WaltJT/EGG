/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2_Guia11;

import Entidad.Jugador;
import Entidad.RevolverAgua;
import Servicios.Juego;
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

public class Ejercicio2_Guia11 {

    public static void main(String[] args) {

        int numJugadores = 6; // NÃºmero predeterminado de jugadores
        ArrayList<Jugador> jugadores = new ArrayList<>();

        // Solicitar nÃºmero de jugadores al usuario
        System.out.println("Ingrese el nÃºmero de jugadores (entre 1 y 6): ");
        // AquÃ­ deberÃ­as aÃ±adir la lÃ³gica para obtener el nÃºmero de jugadores ingresado por el usuario

        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6; // Valor predeterminado si el nÃºmero estÃ¡ fuera del rango
        }

        // Crear jugadores
        for (int i = 1; i <= numJugadores; i++) {
            jugadores.add(new Jugador(i));
        }

        // Crear juego
        Juego juego = new Juego();
        juego.llenarJuego(jugadores, new RevolverAgua());

        // Jugar
        juego.jugar();

    }

}

    
