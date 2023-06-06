/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2_Guia10;

import Entidad.Perro;
import Servicio.PerroServicio;
import java.util.Iterator;
import java.util.Scanner;

/*
EJERCICIO 2 GUIA 10

 Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */

public class Ejercicio2_Guia10 {

    public static void main(String[] args) {

        PerroServicio perroService = new PerroServicio();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {

            System.out.println("Ingrese una raza de perro (o 'salir' para finalizar): ");
            String raza = scanner.nextLine();

            if (raza.equalsIgnoreCase("salir")) {
                salir = true;

            } else {

                Perro perro = new Perro(raza);
                perroService.agregarPerro(perro);

            }

        }

        System.out.println("Perros guardados:");
        perroService.mostrarPerrosOrdenados();

        System.out.println("Ingrese un perro para eliminar: ");
        String perroEliminar = scanner.nextLine();

        Iterator<Perro> iterator = perroService.getPerros().iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
          
            Perro perro = iterator.next();
            
            if (perro.getRaza().equalsIgnoreCase(perroEliminar)) {
            
                iterator.remove();
                encontrado = true;

            }

        }

        System.out.println("Perros guardados después de eliminar:");
        if (encontrado) {
            perroService.mostrarPerrosOrdenados();

        } else {

            System.out.println("El perro no se encuentra en la lista.");
            perroService.mostrarPerrosOrdenados();

        }

    }

}