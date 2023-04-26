/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia15_Ejercicio2_POO;

import ENTIDAD.Circunferencia;

/*
EJERCICIO 2 POO

 Declarar una clase llamada Circunferencia que tenga como atributo privado el 
radio de tipo real. A continuación, se deben crear los siguientes métodos:
A- Método constructor que inicialice el radio pasado como parámetro.
B- Métodos get y set para el atributo radio de la clase Circunferencia.
C- Método para crearCircunferencia(): que le pide el radio y lo guarda  en el 
atributo del objeto.
D- Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
E- Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
public class Dia15_Ejercicio2_POO {

    public static void main(String[] args) {

        Circunferencia c = new Circunferencia(5.0);
        System.out.println("Radio: " + c.getRadio());
        System.out.println("Área: " + c.area());
        System.out.println("Perímetro: " + c.perimetro());
        c.setRadio(7.5);
        System.out.println("Radio: " + c.getRadio());
        System.out.println("Área: " + c.area());
        System.out.println("Perímetro: " + c.perimetro());
        c.crearCircunferencia();
        System.out.println("Radio: " + c.getRadio());
        System.out.println("Área: " + c.area());
        System.out.println("Perímetro: " + c.perimetro());
        
    }
    
}

