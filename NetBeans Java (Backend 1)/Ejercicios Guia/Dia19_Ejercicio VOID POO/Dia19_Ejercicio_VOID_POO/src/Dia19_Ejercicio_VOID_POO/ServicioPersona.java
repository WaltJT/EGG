/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia19_Ejercicio_VOID_POO;

import java.util.Scanner;
import ENTIDAD.Persona;

class ServicioPersona {

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido de la persona: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese la estatura de la persona: ");
        double estatura = scanner.nextDouble();

        return new Persona(nombre, apellido, edad, estatura);

    }

    public void mostrarPersona(Persona p) {

        System.out.println(p.toString());

    }

    public void actualizarPersona(Persona p) {

        System.out.print("Ingrese el nuevo nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el nuevo apellido de la persona: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese la nueva edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese la nueva estatura de la persona: ");
        double estatura = scanner.nextDouble();

        p.setNombre(nombre);

        p.setApellido(apellido);

        p.setEdad(edad);

        p.setEstatura(estatura);

    }

    public void eliminarPersona(Persona p) {

        p = null;

    }

}

    

