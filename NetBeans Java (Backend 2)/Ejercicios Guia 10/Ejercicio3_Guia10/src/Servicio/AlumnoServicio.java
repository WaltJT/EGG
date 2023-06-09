/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;

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

public class AlumnoServicio {

    private final List<Alumno> alumno;
    
    public AlumnoServicio(){
    
        alumno = new ArrayList<>();
    
    }
    
    public void agregarAlumno(Alumno alumno1) {
        alumno.add(alumno1);

    }
    
    public void mostrarAlumno () {
    
        System.out.println("Alumnos ingresados: ");
        alumno.stream().map((alumno1) -> {
            System.out.println("Nombre: " + alumno1.getNombre());
            return alumno1;
        }).map((alumno1) -> {
            System.out.println("Notas: " + alumno1.getNotas());
            return alumno1;
        
        });
    
    }
    
    public double notaFinal(String nombreAlumno) {
    
        for (Alumno alumno2 : alumno) {
        
            if (alumno2.getNombre().equalsIgnoreCase(nombreAlumno)) {
            
                List<Integer> notas = alumno2.getNotas();
                
                double suma = 0;

                for (int nota : notas) {
                    suma += nota;
                }

                return suma / notas.size();
            }
        }

        return -1; // Retorna -1 si el alumno no se encuentra en la lista
    }
}
    