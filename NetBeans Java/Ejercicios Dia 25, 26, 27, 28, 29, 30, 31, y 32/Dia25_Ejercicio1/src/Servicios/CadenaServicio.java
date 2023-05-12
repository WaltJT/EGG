/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import ENTIDADES.Cadena;
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

public class CadenaServicio {
Scanner scanner = new Scanner (System.in);
    
     public int mostrarVocales(Cadena cadena) {
        int cantidad = 0;
        String frase = cadena.getFrase().toLowerCase();
        for(int i=0; i<frase.length(); i++) {
            char c = frase.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cantidad++;
        
            }
       
        }
        return cantidad;

     }

    public String invertirFrase(Cadena cadena) {
        StringBuilder sb = new StringBuilder(cadena.getFrase());
        return sb.reverse().toString();

    }

    public int vecesRepetido(Cadena cadena, String letra) {
        int cantidad = 0;
        String frase = cadena.getFrase().toLowerCase();
        char c = letra.toLowerCase().charAt(0);
        for(int i=0; i<frase.length(); i++) {
            if(frase.charAt(i) == c) {
                cantidad++;

            }

        }

        return cantidad;

    }

    public boolean compararLongitud(Cadena cadena, String frase) {
        return cadena.getLongitud() == frase.length();

    }

    public String unirFrases(Cadena cadena, String frase) {
        return cadena.getFrase() + " " + frase;

    }

    public String reemplazar(Cadena cadena, String letra, String reemplazo) {
        return cadena.getFrase().replace(letra, reemplazo);

    }

    public boolean contiene(Cadena cadena, String letra) {
        String frase = cadena.getFrase().toLowerCase();
        char c = letra.toLowerCase().charAt(0);
        return frase.indexOf(c) >= 0;

    }

}




