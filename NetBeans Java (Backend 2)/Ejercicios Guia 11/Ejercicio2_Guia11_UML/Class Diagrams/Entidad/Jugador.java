/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/*
EJERCICIO 2 GUIA 11 - Relacion entre clases.

 Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el 
juego se trata de un n�mero de jugadores, que, con un revolver de agua, el cual 
posee una sola carga de agua, se dispara y se moja. Las clases por hacer del 
juego son las siguientes:

Clase Revolver de agua: esta clase posee los siguientes atributos: posici�n 
actual (posici�n del tambor que se dispara, puede que est� el agua o no) y 
posici�n agua (la posici�n del tambor donde se encuentra el agua). Estas dos 
posiciones, se generar�n aleatoriamente.

M�todos:

� llenarRevolver(): le pone los valores de posici�n actual y de posici�n del agua. Los valores
deben ser aleatorios.

� mojar(): devuelve true si la posici�n del agua coincide con la posici�n actual

� siguienteChorro(): cambia a la siguiente posici�n del tambor

� toString(): muestra informaci�n del revolver (posici�n actual y donde est� el 
agua)

� Clase Jugador: esta clase posee los siguientes atributos: id (representa el 
n�mero del jugador), nombre (Empezara con Jugador m�s su ID, �Jugador 1� por 
ejemplo) y mojado (indica si est� mojado o no el jugador). El n�mero de 
jugadores ser� decidido por el usuario, pero debe ser entre 1 y 6. Si no est� en 
este rango, por defecto ser� 6.

M�todos:

� disparo(Revolver r): el m�todo, recibe el revolver de agua y llama a los 
m�todos de mojar() y siguienteChorro() de Revolver. El jugador se apunta, 
aprieta el gatillo y si el revolver tira el agua, el jugador se moja. El 
atributo mojado pasa a false y el m�todo devuelve true, sino false.

Clase Juego: esta clase posee los siguientes atributos: Jugadores 
(conjunto de Jugadores) y Revolver

M�todos:

� llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este m�todo recibe los 
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
        return nombre + (mojado ? " está mojado" : " no está mojado");

    }

}  

