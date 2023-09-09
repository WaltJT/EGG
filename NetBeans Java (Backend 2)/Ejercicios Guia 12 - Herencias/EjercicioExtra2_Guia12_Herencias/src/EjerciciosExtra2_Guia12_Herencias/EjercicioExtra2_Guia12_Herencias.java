/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra2_Guia12_Herencias;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

/*
EJERCICIO EXTRA 2 GUIA 12 HERENCIAS

Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto 
y largo. La clase edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado 
o Abierto, esta clase implementará los dos métodos abstractos y los atributos 
del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de 
personas por oficina y número de pisos. Esta clase implementará los dos métodos 
abstractos y los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el 
edificio, el usuario dirá cuántas personas entran en cada oficina, cuantas 
oficinas y el número de piso (suponiendo que en cada piso hay una oficina). 
Crear el método cantPersonas(), que muestre cuantas personas entrarían en un 
piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList 
debe contener dos polideportivos y dos edificios de oficinas. Luego, recorrer 
este array y ejecutar los métodos calcularSuperficie y calcularVolumen en cada 
Edificio. Se deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos 
polideportivos son techados y cuantos abiertos. Y para la clase 
EdificioDeOficinas deberemos llamar al método cantPersonas() y mostrar los 
resultados de cada edificio de oficinas.

 */

public class EjercicioExtra2_Guia12_Herencias {

    public static void main(String[] args) {
       ArrayList<Edificio> edificios = new ArrayList<>();
       
        // Crear polideportivos
        Polideportivo polideportivo1 = new Polideportivo(30, 20, 40, "Polideportivo 1", "Techado");
        Polideportivo polideportivo2 = new Polideportivo(25, 15, 35, "Polideportivo 2", "Abierto");

        edificios.add(polideportivo1);
        edificios.add(polideportivo2);

        // Crear edificios de oficinas
        EdificioDeOficinas edificioOficinas1 = new EdificioDeOficinas(50, 30, 60, 5, 10, 3);
        EdificioDeOficinas edificioOficinas2 = new EdificioDeOficinas(40, 25, 55, 8, 12, 5);

        edificios.add(edificioOficinas1);
        edificios.add(edificioOficinas2);

        // Calcular superficie y volumen de cada edificio
        for (Edificio edificio : edificios) {
            System.out.println("Superficie: " + edificio.calcularSuperficie());
            System.out.println("Volumen: " + edificio.calcularVolumen());

            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio;
                if (polideportivo.getTipoInstalacion().equals("Techado")) {
                    System.out.println("Polideportivo techado.");
                } else {
                    System.out.println("Polideportivo abierto.");
                }
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edifOficinas = (EdificioDeOficinas) edificio;
                edifOficinas.cantPersonas();

            }

            System.out.println();

        }

    }

}
