/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

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

public class Jugador {
  private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public boolean disparo(RevolverAgua r) {
        if (r.mojar()) {
            mojado = true;
            return true;
        } else {
            r.siguienteChorro();
            return false;
        }
    }

    @Override
    public String toString() {
        return nombre + (mojado ? " estÃ¡ mojado" : " no estÃ¡ mojado");

    }

}  

