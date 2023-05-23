/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import ENTIDAD.Persona;
import java.util.Scanner;

/*
EJERCICIO 3 POO Servicios.

Realizar una clase llamada Persona en el paquete de entidades que tengan los 
siguientes atributos: nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, 
‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede 
hacerlo. Agregar constructores, getters y setters.

En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los 
atributos al usuario y después se le asignan a sus respectivos atributos para 
llenar el objeto Persona. Además, comprueba que el sexo introducido sea 
correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje

Método calcularIMC(): calculara si la persona está en su peso ideal 
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor 
que 20, significa que la persona está por debajo de su peso ideal y la función 
devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 
(incluidos), significa que la persona está en su peso ideal y la función 
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor 
que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e 
indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y 
esMayorDeEdad en distintas variables(arrays), para después calcular un 
porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en 
su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de 
cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos 
métodos adicionales.

*/

public class ServicioPersona {
    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    int mayorEdad = 0;
    
    int bajoPeso = 0;
    int pesoIdeal = 0;
    int sobrePeso = 0;
    
    
    public Persona crearPersona() {
        
        System.out.println("Ingrese el nombre de la persona: ");
        String nombre = scanner.next();

        System.out.println("Ingrese el apellido de la persona: ");
        String apellido = scanner.next();

        System.out.println("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.println("Ingrese la estatura de la persona: ");
        double estatura = scanner.nextDouble();
        
        System.out.println("Ingrese el peso actual de la persona: ");
        int peso = scanner.nextInt();
        
        System.out.println("Ingrese su sexo por favor; M para masculino, y F para feminino: ");
        String sexo = scanner.next();
        
        System.out.println("El nombre es de la persona es: " + nombre);
        
        System.out.println("El apelldio de la persona es: " + apellido);
        
        System.out.println("La edad de la persona es: " + edad + " años");
        
        System.out.println("La estatura de la persona es: " + estatura + " M");
        
        System.out.println("El peso de la persona es: "+ peso + " Kg");
        
            if ("m".equals(sexo.toLowerCase())) {
            
            System.out.println("La persona es de sexo masculino.");    
            
        }else if ("f".equals(sexo.toLowerCase())){
            
            System.out.println("La persona es de sexo femenino.");
        
        } else {    
          
            System.out.println("La letra indicada, no es parte de la lista, para poder indicar sexualidad.");
            
        } 
        
        return new Persona (nombre, apellido, edad, estatura, peso);
        
    }
        
    public int calcularIMC (Persona persona){
        
        double IMC = (persona.getPeso() / (persona.getEstatura() * persona.getEstatura()));

        System.out.println("El indice de masa corporal es " + (int)IMC);
        
        if (IMC >= 20 && IMC <= 25){
            
        System.out.println("Estas en tu peso ideal.");
        
        pesoIdeal++;
        
        }else if (IMC <=20) {
   
        System.out.println("Estas por debajo de tu peso ideal (¡Cuidado!, puede que tenga desnutrición).");
        
        bajoPeso++;
        
        }else{    
        
        System.out.println("Estas por encima de tu peso ideal (¡Cuidado!, puede que tenga sobrepeso).");    
        
        sobrePeso++;
        
        }
     
        return (int)IMC;
        
    }
        
        public boolean esMayorDeEdad(Persona persona){
            
            if (persona.getEdad()>= 18) {
            
            System.out.println("La persona es mayor de edad.");
        
            mayorEdad++;
            
        } else {    
            
            System.out.println("La persona es menor de edad.");
            
        }
        
        return false;

    }

        public void porcentajeImc (int[]imc){
        
//        int bajoPeso = 0;
//        int pesoIdeal = 0;
//        int sobrePeso = 0;
        
        for(int i= 0; i< imc.length;i++){
            int resultado =imc[i];
            
            if(resultado == -1){
                bajoPeso++;
            }else if(resultado == 0){
                pesoIdeal++;
            }else {
                sobrePeso++;
            }            
        }
        double porcentajeBajoPeso = (double) bajoPeso / imc.length * 100;
        double porcentajePesoIdeal = (double) pesoIdeal / imc.length * 100;
        double porcentajeSobrepeso = (double) sobrePeso / imc.length * 100;

        System.out.println("Porcentaje de personas con bajo peso: " + 			 	  porcentajeBajoPeso + "%");
        System.out.println("Porcentaje de personas con peso ideal: " + 	 	 	     	  porcentajePesoIdeal + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + 				  porcentajeSobrepeso + "%");
        
    }
        
        public void porcentajeMayorDeEdad (){
        
            int porcMayordEdad = (mayorEdad * 100) / 4;
            System.out.println("El porcentaje de personas mayor de edad es " + porcMayordEdad + "%");
            
        }
        
}    

