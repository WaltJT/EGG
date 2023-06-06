/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.Collections;

/*
EJERCICIO 2 GUIA 10

 Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
*/

public class PerroServicio {
        private ArrayList<Perro> perros;

    public PerroServicio() {
        perros = new ArrayList<>();
    }

    public void agregarPerro(Perro perro) {
        perros.add(perro);
    }

    public void eliminarPerro(Perro perro) {
        perros.remove(perro);
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void mostrarPerrosOrdenados() {
        Collections.sort(perros, (p1, p2) -> p1.getRaza().compareToIgnoreCase(p2.getRaza()));
        perros.forEach((perro) -> {
        System.out.println(perro.getRaza());
        });

    }

}

