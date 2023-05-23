/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia28_Ejercicio5;

import ENTIDAD.Persona;
import Servicios.ServicioPersona;

/*
Ejercicio 5 POO Servicios de Utilidad

Implemente la clase Persona en el paquete entidades. Una persona tiene un 
nombre y una fecha de nacimiento (Tipo Date), constructor vacío, constructor 
parametrizado, get y set. Crear una clase PersonaService, en el paquete 
servicio, con los siguientes métodos:

A- Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la 
persona a crear. Retornar el objeto Persona creado.

B- Método calcularEdad que calcule la edad del usuario utilizando el atributo 
de fecha de nacimiento y la fecha actual.

C- Método menorQue recibe como parámetro una Persona y una edad. Retorna true 
si la persona es menor que la edad consultada o false en caso contrario.

D- Método mostrarPersona que muestra la información de la persona deseada.

 */

public class Dia28_Ejercicio5 {

    public static void main(String[] args) {
    ServicioPersona personaService = new ServicioPersona();

        // Crear una persona
        Persona persona = personaService.crearPersona();

        // Mostrar información de la persona
        personaService.mostrarPersona(persona);

        // Calcular edad y verificar si es menor que una edad dada
        int edadConsultada = 18;

        boolean esMenor = personaService.menorQue(persona, edadConsultada);

        if (esMenor) {

            System.out.println(persona.getNombre() + " es menor que " + edadConsultada + " años.");

        } else {

            System.out.println(persona.getNombre() + " no es menor que " + edadConsultada + " años.");

        }

    }

}
