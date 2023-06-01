/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1x2_Guia;

import Entidad.Perro;
import Servicios.PerroService;
import java.util.Scanner;

public class Ejercicio1x2_Guia {
        
public static void main(String[] args) {

        PerroService perroService = new PerroService();
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

        System.out.println("Perros guardados: ");
        for (Perro perro : perroService.getPerros()) {
            System.out.println(perro.getRaza());

        }

}

}
