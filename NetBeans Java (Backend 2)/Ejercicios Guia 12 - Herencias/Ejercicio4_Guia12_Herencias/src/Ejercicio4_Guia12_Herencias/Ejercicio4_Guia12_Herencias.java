/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4_Guia12_Herencias;

import Entidades.Circulo;
import Entidades.Rectangulo;

/*
EJERCICIO 4 GUIA 12 HERENCIAS

Se plantea desarrollar un programa que nos permita calcular el área y el 
perímetro de formas geométricas, en este caso un círculo y un rectángulo. Ya que 
este cálculo se va a repetir en las dos formas geométricas, vamos a crear una 
Interfaz, llamada calculosFormas que tendrá, los dos métodos para calcular el 
área, el perímetro y el valor de PI como constante.
 Desarrollar el ejercicio para que las formas implementen los métodos de la 
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán 
las formas y se mostrará el resultado final.

 *Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 
 *Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.

 */

public class Ejercicio4_Guia12_Herencias {

    public static void main(String[] args) {
       
        Circulo circulo = new Circulo(5);
        double areaCirculo = circulo.calcularArea();
        double perimetroCirculo = circulo.calcularPerimetro();
        System.out.println("Área del círculo: " + areaCirculo);
        System.out.println("Perímetro del círculo: " + perimetroCirculo);

        Rectangulo rectangulo = new Rectangulo(4, 6);
        double areaRectangulo = rectangulo.calcularArea();
        double perimetroRectangulo = rectangulo.calcularPerimetro();
        System.out.println("Área del rectángulo: " + areaRectangulo);
        System.out.println("Perímetro del rectángulo: " + perimetroRectangulo);
        
    }
    
}
