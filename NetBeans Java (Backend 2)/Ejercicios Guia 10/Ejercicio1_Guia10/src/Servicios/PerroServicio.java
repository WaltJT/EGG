/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Perro;
import java.util.ArrayList;

/*
EJERCICIO 1 Guia 10

 Diseñar en java un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

 */

public class PerroServicio {
    
    private final ArrayList<Perro> perros;

    public PerroServicio() {
        perros = new ArrayList<>();
    
    }

    public void agregarPerro(Perro perro) {
        perros.add(perro);
    
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    
    }

}

