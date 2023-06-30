/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra1_Guia12_Herencias;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.YateLujo;
import java.time.LocalDate;

/*
EJERCICIOS EXTRA 1 GUIA 12 HERENCIAS

En un puerto se alquilan amarres para barcos de distinto tipo. Para cada 
Alquiler se guarda: el nombre, documento del cliente, la fecha de alquiler, 
fecha de devolución, la posición del amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de 
fabricación.
 Sin embargo, se pretende diferenciar la información de algunos tipos de barcos 
especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado 
con la fecha de alquiler y devolución), por un valor módulo de cada barco 
(obtenido simplemente multiplicando por 10 los metros de eslora).
 En los barcos de tipo especial el módulo de cada barco se calcula sacando el 
módulo normal y sumándole el atributo particular de cada barco. En los veleros 
se suma el número de mástiles, en los barcos a motor se le suma la potencia en 
CV y en los yates se suma la potencia en CV y el número de camarotes.
 Utilizando la herencia de forma apropiada, deberemos programar en Java, las 
clases y los métodos necesarios que permitan al usuario elegir el barco que 
quiera alquilar y mostrarle el precio final de su alquiler.
 
 */

public class EjerciciosExtra1_Guia12_Herencias {

    public static void main(String[] args) {

      Barco velero = new Velero("ABC123", 10.5, 2000, 2);
        Barco barcoMotor = new BarcoMotor("DEF456", 12.8, 2010, 250);
        Barco yateLujo = new YateLujo("GHI789", 15.2, 2015, 400, 4);

        Alquiler alquilerVelero = new Alquiler("Juan Perez", "12345678", LocalDate.of(2023, 6, 1),
                LocalDate.of(2023, 6, 7), 1, velero);
        Alquiler alquilerBarcoMotor = new Alquiler("Maria Lopez", "98765432", LocalDate.of(2023, 6, 10),
                LocalDate.of(2023, 6, 17), 2, barcoMotor);
        Alquiler alquilerYateLujo = new Alquiler("Carlos Gonzalez", "45678901", LocalDate.of(2023, 6, 20),
                LocalDate.of(2023, 6, 30), 3, yateLujo);

        double precioAlquilerVelero = alquilerVelero.calcularAlquiler();
        double precioAlquilerBarcoMotor = alquilerBarcoMotor.calcularAlquiler();
        double precioAlquilerYateLujo = alquilerYateLujo.calcularAlquiler();

        System.out.println("Precio de alquiler del velero: $" + precioAlquilerVelero);
        System.out.println("Precio de alquiler del barco a motor: $" + precioAlquilerBarcoMotor);
        System.out.println("Precio de alquiler del yate de lujo: $" + precioAlquilerYateLujo);

    }

}
