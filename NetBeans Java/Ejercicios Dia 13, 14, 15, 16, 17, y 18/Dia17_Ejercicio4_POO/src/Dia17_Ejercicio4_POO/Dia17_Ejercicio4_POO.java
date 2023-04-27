/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia17_Ejercicio4_POO;

import ENTIDAD.Rectangulo;

/*
EJERCICIO 4 POO

Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
privado base y un atributo privado altura. La clase incluirá un método para 
crear el rectángulo con los datos del Rectángulo dados por el usuario. También 
incluirá un método para calcular la superficie del rectángulo y un método para 
calcular el perímetro del rectángulo. Por último, tendremos un método que 
dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores 
correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
public class Dia17_Ejercicio4_POO {

    public static void main(String[] args) {

        Rectangulo R = new Rectangulo();
        System.out.println("Base: " + R.getBase());
        System.out.println("Altura: " + R.getAltura());
        System.out.println("La superficie del rectangulo es: " + R.Superficie());
        System.out.println("El perimetro del rectangulo es: " + R.Perimetro());
        R.dibujar();
        
    }
    
}
