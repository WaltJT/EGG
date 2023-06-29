/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/*
EJERCICIO 3 GUIA 12 HERENCIAS

Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de 
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o 
televisores, con valores ya asignados. Luego, recorrer este array y ejecutar el 
método precioFinal() en cada electrodoméstico. Se deberá también mostrar el 
precio de cada tipo de objeto, es decir, el precio de todos los televisores y el 
de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con 
un precio de 2000 y un televisor de 5000, el resultado final será de 
7000 (2000+5000) para electrodomésticos, 2000 para lavadora y 5000 para 
televisor.

****

Crear una superclase llamada Electrodoméstico con los siguientes atributos: 
precio, color, consumo energético (letras entre A y F) y peso.

Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es 
correcta, sino es correcta usara la letra F por defecto. Este método se debe 
invocar al crear el objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si 
no lo es, usa el color blanco por defecto. Los colores disponibles para los 
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre 
está en mayúsculas o en minúsculas. Este método se invocará al crear el objeto 
y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. 
Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el 
valor del precio. Esta es la lista de precios:

A continuación, se debe crear una subclase llamada Lavadora, con el atributo 
carga, además de los atributos heredados.

Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda 
que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la 
clase padre, lo utilizamos para llenar los atributos heredados del padre y 
después llenamos el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, 
si la carga es menor o igual, no se incrementará el precio. Este método debe 
llamar al método padre y añadir el código necesario. Recuerda que las 
condiciones que hemos visto en la clase Electrodoméstico también deben afectar 
al precio.
Se debe crear también una subclase llamada Televisor con los siguientes 
atributos:
Resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.

Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.

LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000


Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la 
clase padre, lo utilizamos para llenar los atributos heredados del padre y 
después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, 
aumentará $500. Recuerda que las condiciones que hemos visto en la clase 
Electrodomestico también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para 
mostrar el precio final de los dos electrodomésticos.

 */

public class Electrodomesticos {
    
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomesticos() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 1;
    }

    public Electrodomesticos(Integer precio, String color, char consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
     
    // Método privado para comprobar el consumo energético
    private void comprobarConsumoEnergetico(char letra) {
        // Comprobar si la letra está en el rango A-F
        if (letra >= 'A' && letra <= 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'F'; // Usar F por defecto si la letra es incorrecta
        }
    }
    
    // Método privado para comprobar el color
    private void comprobarColor(String color) {
        // Convertir el color a minúsculas y comparar con los colores disponibles
        String colorMinusculas = color.toLowerCase();
        String[] coloresDisponibles = { "blanco", "negro", "rojo", "azul", "gris" };
        
        // Comprobar si el color ingresado está en la lista de colores disponibles
        boolean colorValido = false;
        for (String c : coloresDisponibles) {
            if (colorMinusculas.equals(c)) {
                colorValido = true;
                break;
            }
        }
        
        // Establecer el color válido o usar blanco por defecto
        if (colorValido) {
            this.color = colorMinusculas;
        } else {
            this.color = "blanco";
        }
    }

    // Método para crear un electrodoméstico solicitando la información al usuario
    public void crearElectrodomestico() {
        // Solicitar información al usuario y establecer los atributos
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del electrodoméstico:");
        double precio = scanner.nextDouble();
        
        System.out.println("Ingrese el color del electrodoméstico:");
        String color = scanner.next();
        
        System.out.println("Ingrese el consumo energético del electrodoméstico:");
        char consumoEnergetico = scanner.next().charAt(0);
        
        System.out.println("Ingrese el peso del electrodoméstico:");
        double peso = scanner.nextDouble();
        
        // Llamar a los métodos para comprobar el color y el consumo energético
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        
        // Establecer los atributos del electrodoméstico
        this.precio = precio;
        this.peso = peso;
        
    }

    // Método para calcular el precio final del electrodoméstico
    public double precioFinal() {
        double precioFinal = this.precio;

        // Aumentar el precio según el consumo energético
        switch (this.consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        // Aumentar el precio según el peso del electrodoméstico
        if (this.peso >= 0 && this.peso < 19) {
            precioFinal += 100;
        } else if (this.peso >= 20 && this.peso < 49) {
            precioFinal += 500;
        } else if (this.peso >= 50 && this.peso < 79) {
            precioFinal += 800;
        } else if (this.peso >= 80) {
            precioFinal += 1000;
        }

        return precioFinal;
    
    }

    @Override
    public String toString() {
    
        System.out.println("");
        
        return "Electrodomesticos: \n {" + " precio=" + precio + "\n color=" + color + "\n consumoEnergetico=" + consumoEnergetico + "\n peso=" + peso ;
    
    }
    
}