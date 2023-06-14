/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Carta;
import Entidad.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
EJERCICIO 3 GUIA 11 - Relaciones entre clases. 
  
 Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un 
número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo 
(espadas, bastos, oros y copas). Esta clase debe contener un método toString() 
que retorne el número de carta y el palo. La baraja estará compuesta por un 
conjunto de cartas, 40 exactamente.

Las operaciones que podrá realizar la baraja son:

• barajar(): cambia de posición todas las cartas aleatoriamente.

• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no 
haya más o se haya llegado al final, se indica al usuario que no hay más cartas.

• cartasDisponibles(): indica el número de cartas que aún se puede repartir.

• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese 
número de cartas. En caso de que haya menos cartas que las pedidas, no 
devolveremos nada, pero debemos indicárselo al usuario.

• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido 
ninguna indicárselo al usuario

• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca 
una carta y luego se llama al método, este no mostrara esa primera carta.
 */

public class Baraja {
   private List<Carta> cartas;
   private List<Carta> monton;

    public Baraja() {
        cartas = new ArrayList<>();
        monton = new ArrayList<>();

        // Crear las 40 cartas de la baraja española
        for (Palo palo : Palo.values()) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
            
                }
        
            }
    
        }
    
    }

    public void barajar() {
        Collections.shuffle(cartas);
 
    }

    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }

        Carta siguienteCarta = cartas.remove(0);
        monton.add(siguienteCarta);
        return siguienteCarta;

    }

    public int cartasDisponibles() {
        return cartas.size();

    }

    public List<Carta> darCartas(int cantidad) {
        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas disponibles.");
            return null;

        }

        List<Carta> cartasRepartidas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            cartasRepartidas.add(siguienteCarta());

        }

        return cartasRepartidas;

    }

    public List<Carta> cartasMonton() {
        return monton;

    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);

        }

    }

}