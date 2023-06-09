/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3_Guia10;

import Entidad.Alumno;
import Servicio.AlumnoServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
EJERCICIO 3 GUIA 10

 Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main. 
*/

public class Ejercicio3_Guia10 {

    public static void main(String[] args) {
    
        AlumnoServicio alumnoservice = new AlumnoServicio ();
        
        Scanner scanner = new Scanner(System.in);
        
        while (true){
           
        System.out.println("Quiere ingresar un alumno, (si / no): ");
        String pregunta = scanner.next();
        
        if (pregunta.equalsIgnoreCase("no")) {
        
        break;
            
        }
                
        System.out.println("Ingrese el nombre del alumno");
        String nombre = scanner.next();
        
        List<Integer> notas = new ArrayList<>();
        
        for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + ": ");
                int nota = scanner.nextInt();
                notas.add(nota);
        
        Alumno alumno1 = new Alumno (nombre, notas);
        
        alumnoservice.agregarAlumno(alumno1);        
        }
        
        alumnoservice.mostrarAlumno();
        
    }
 
        System.out.println("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombreAlumno = scanner.next();

        double notaFinal = alumnoservice.notaFinal(nombreAlumno);

        if (notaFinal == -1) {
        
            System.out.println("El alumno no se encuentra en la lista.");
        
        } else {
        
            System.out.println("La nota final de " + nombreAlumno + " es: " + notaFinal);
    
        }
    
    }
   
}