/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;

//import ENTIDAD.ParDeNumeros;

/*
EJERCICIO 2 POO Servicios de Utilidad

Realizar una clase llamada ParDeNumeros que tenga como atributos dos números 
reales con los cuales se realizarán diferentes operaciones matemáticas. La 
clase debe tener un constructor vacío, getters y setters.  En el constructor 
vacío se usará el Math.random para generar los dos números. Crear una clase 
ParDeNumerosService, en el paquete Servicios, que deberá además implementar 
los siguientes métodos:

A- Método mostrarValores que muestra cuáles son los dos números guardados.

B- Método devolverMayor para retornar cuál de los dos atributos tiene 
el mayor valor

C- Método calcularPotencia para calcular la potencia del mayor valor de la 
clase elevado al menor número. Previamente se deben redondear ambos valores.

D- Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos 
valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto 
del número.

 */

public class ParDeNumerosServicios {

    double a = Math.random()*100+1;
    double b = Math.random()*100+1;
    double countA = 0;
    double countB = 0;

    public ParDeNumerosServicios() {
    }
    
    public double getA() {
        
        return a;
    
    }

    public double getB() {
        
        return b;
        
    }
    
    
    public void mostrarValores() {
     
        System.out.println("");
        
        System.out.println("Los numeros para la variable 'A' es: " + getA());
        countA++;
        
        System.out.println("Los numeros para la variable 'B' es: " + getB());
        countB++;
        
        System.out.println("");
        
    }
 
    
    public void devolverMayor (){
        
        if (a > b ) {
            
            System.out.println("'A' es mayor que 'B': " + a);
            System.out.println("");
            
        } else {   
            
            System.out.println("'B' es mayor que 'A': " + b);
            System.out.println("");
            
        }  
            
        }
    
    public void calcularPotencia () {
        
        if (a > b ) {
            
            //System.out.println("'A' es mayor que 'B': " + a);
            
            double resultadoA1 = Math.pow(a, 2); // Elevar "a" al cuadrado
            double resultadoA2 = Math.pow(a, 3); // Elevar "a" al cubo
            
            System.out.println("El resultado de a^2 (A al cuadrado) es: " + resultadoA1);
            System.out.println("El resultado de a^3 (A al cubo) es: " + resultadoA2);
            System.out.println("");
            
        } else {   
            
            //System.out.println("'B' es mayor que 'A': " + b);
            
            double resultadoB1 = Math.pow(b, 2); // Elevar "b" al cuadrado
            double resultadoB2 = Math.pow(b, 3); // Elevar "b" al cubo

            System.out.println("El resultado de b^2 (B al cuadrado) es: " + resultadoB1);
            System.out.println("El resultado de b^3 (B al cubo) es: " + resultadoB2);
            System.out.println("");
            
        }  
        
    }
    
    
    public void calcularRaiz () {
            
            double menor = Math.min(a, b);
            double valorAbsoluto = Math.abs(menor);
            System.out.println("El valor absoluto del menor numero es: " + valorAbsoluto);
            System.out.println("");
            double raizCuadrada = Math.sqrt(valorAbsoluto);
            System.out.println("La raíz cuadrada del menor de los dos números es: " + raizCuadrada);
            System.out.println("");
            
    }
            
            
}
    
    
    
    

