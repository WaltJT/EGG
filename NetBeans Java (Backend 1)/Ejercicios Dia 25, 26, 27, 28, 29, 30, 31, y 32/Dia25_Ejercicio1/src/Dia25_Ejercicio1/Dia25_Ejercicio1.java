/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia25_Ejercicio1;

import ENTIDADES.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

/*
Dia 25 Ejercicio 1 POO Servicios de Utilidad

Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como 
atributos una frase (String) y su longitud. Agregar constructor vacío y con 
atributo frase solamente. Agregar getters y setters. El constructor con frase 
como atributo debe setear la longitud de la frase de manera automática. Crear 
una clase CadenaServicio en el paquete servicios que implemente los 
siguientes métodos:

A- Método mostrarVocales(), deberá contabilizar la cantidad de vocales que 
tiene la frase ingresada.

B- Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por 
pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

C- Método vecesRepetido(String letra), recibirá un carácter ingresado por el 
usuario y contabilizar cuántas veces se repite el carácter en la frase, por 
ejemplo:

Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

D- Método compararLongitud(String frase), deberá comparar la longitud de la 
frase que compone la clase con otra nueva frase ingresada por el usuario.

E- Método unirFrases(String frase), deberá unir la frase contenida en la clase 
Cadena con una nueva frase ingresada por el usuario y mostrar la frase 
resultante.

F- Método reemplazar(String letra), deberá reemplazar todas las letras “a” que 
se encuentren en la frase, por algún otro carácter seleccionado por el usuario 
y mostrar la frase resultante.

G- Método contiene(String letra), deberá comprobar si la frase contiene una 
letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.

 */
public class Dia25_Ejercicio1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();

        Cadena cadena = new Cadena(frase);
        CadenaServicio servicio = new CadenaServicio();

        // Ejemplo de uso de los métodos
        int cantidadVocales = servicio.mostrarVocales(cadena);
        System.out.println("Cantidad de vocales: " + cantidadVocales);

        String fraseInvertida = servicio.invertirFrase(cadena);
        System.out.println("Frase invertida: " + fraseInvertida);

        System.out.print("Ingrese una letra para contar su cantidad de repeticiones: ");
        String letra = scanner.nextLine();
        int vecesRepetido = servicio.vecesRepetido(cadena, letra);
        System.out.println("Veces que se repite la letra '" + letra + "': " + vecesRepetido);

        System.out.print("Ingrese una frase para comparar con la original: ");
        String otraFrase = scanner.nextLine();
        boolean comparacion = servicio.compararLongitud(cadena, otraFrase);
        System.out.println("¿La longitud de la frase es igual a '" + otraFrase + "'?: " + comparacion);

        System.out.print("Ingrese una frase para unir con la original: ");
        String fraseUnida = scanner.nextLine();
        fraseUnida = servicio.unirFrases(cadena, fraseUnida);
        System.out.println("Frase unida: " + fraseUnida);

        System.out.print("Ingrese una letra para reemplazar todas las ocurrencias de 'a': ");
        String letraAReemplazar = scanner.nextLine();
        System.out.print("Ingrese el caracter que quiere usar para reemplazar: ");
        String nuevoCaracter = scanner.nextLine();
        String fraseReemplazada = servicio.reemplazar(cadena, letraAReemplazar, nuevoCaracter);
        System.out.println("Frase con letras '" + letraAReemplazar + "' reemplazadas: " + fraseReemplazada);

        System.out.print("Ingrese una letra para verificar si está en la frase: ");
        String letraAVerificar = scanner.nextLine();
        boolean contieneLetra = servicio.contiene(cadena, letraAVerificar);
        System.out.println("¿La frase contiene la letra '" + letraAVerificar + "'?: " + contieneLetra);

        scanner.close();

    }

}
