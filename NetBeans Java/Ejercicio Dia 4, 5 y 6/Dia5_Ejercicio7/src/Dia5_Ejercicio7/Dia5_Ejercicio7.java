/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia5_Ejercicio7;

/*
EJERCICIO7

Realizar un programa que simule el funcionamiento de un dispositivo RS232, este 
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de 
largo, el primer carácter tiene que ser X y el último tiene que ser una O.

Las secuencias leídas que respeten el formato se consideran correctas, 
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), 
y toda secuencia distinta de FDE, que no respete el formato se considera 
incorrecta.

Al finalizar el proceso, se imprime un informe indicando la cantidad de 
lecturas correctas e incorrectas recibidas. 
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java Substring(), Length(), equals().

 */

import java.util.Scanner;

public class Dia5_Ejercicio7 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
        System.out.println();

    }
    
}


//if (letter.length() == 5) {

//if (letra.substring(0, 1).equalsIgnoreCase("x")) {

//if (letra.substring(0, 5).equalsIgnoreCase("o")) {

//while (frase.equals("eureka")) {