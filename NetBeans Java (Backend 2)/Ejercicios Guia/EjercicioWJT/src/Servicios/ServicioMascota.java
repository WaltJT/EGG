/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Mascota;
import java.util.ArrayList;
import java.util.List;

/*
EJERCICIO WJTerranova.

    Crear un programa POO en Java, en el que pida nombre, apodo, raza, con o 
sin cola (boolean), edad, y  tipo de animal, en el que el programa guarde lo 
cargado en un arraylist de tipo Integer, y una vez que el usuario indique salir 
esta salga mostrando lo cargado por pantalla.

 */

public class ServicioMascota {
    
    private List<Mascota> animales;

    public ServicioMascota() {
        animales = new ArrayList<>();

    }

    public void agregarAnimal(Mascota mascota) {
        animales.add(mascota);

    }

    public void mostrarAnimales() {
        System.out.println("Animales ingresados:");
        for (Mascota animal : animales) {
            System.out.println("Nombre: " + animal.getNombre());
            System.out.println("Apodo: " + animal.getApodo());
            System.out.println("Raza: " + animal.getRaza());
            System.out.println("Tiene cola: " + (animal.tieneCola() ? "Sí" : "No"));
            System.out.println("Edad: " + animal.getEdad());
            System.out.println("Tipo: " + animal.getTipo());
            System.out.println();

        }

    }

}
