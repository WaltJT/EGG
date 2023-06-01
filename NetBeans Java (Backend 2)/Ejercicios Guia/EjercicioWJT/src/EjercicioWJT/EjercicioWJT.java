/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioWJT;

import Entidad.Mascota;
import Servicios.ServicioMascota;
import java.util.Scanner;

/*
EJERCICIO WJTerranova.

    Crear un programa con POO en Java, en el que pida nombre, apodo, raza, con o 
sin cola (boolean), edad, y  tipo de animal, en el que el programa guarde lo 
cargado en un arraylist de tipo Integer, y una vez que el usuario indique salir 
esta salga mostrando lo cargado por pantalla.

 */

public class EjercicioWJT {

    public static void main(String[] args) {
    
        ServicioMascota animalService = new ServicioMascota();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el nombre del animal (o 'salir' para terminar):");
            String nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("salir")) {
                break;
            
            }

            System.out.println("Ingrese el apodo del animal:");
            String apodo = scanner.nextLine();

            System.out.println("Ingrese la raza del animal:");
            String raza = scanner.nextLine();

            System.out.println("¿El animal tiene cola? (true/false):");
            boolean tieneCola = scanner.nextBoolean();
            scanner.nextLine(); // Consumir la nueva línea después de leer el booleano

            System.out.println("Ingrese la edad del animal:");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el entero

            System.out.println("Ingrese el tipo de animal:");
            String tipo = scanner.nextLine();

            Mascota animal = new Mascota(nombre, apodo, raza, tieneCola, edad, tipo);
            animalService.agregarAnimal(animal);

        }

        animalService.mostrarAnimales();

    }

}
