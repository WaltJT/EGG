/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1_Guia10;

import Entidad.Perro;
import Servicios.PerroServicio;
import java.util.Scanner;

/*
EJERCICIO 1 Guia 10

 Diseñar en java un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

 */

public class Ejercicio1_Guia10 {

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
        perroService.getPerros().forEach((perro) -> {
            System.out.println(perro.getRaza());
        });

    }

}