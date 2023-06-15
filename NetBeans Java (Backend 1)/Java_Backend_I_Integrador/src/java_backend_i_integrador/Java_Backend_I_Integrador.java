/*

La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.

1.Calcular y mostrar el promedio de notas de todo el curso

2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso

3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.

*/

package java_backend_i_integrador;

import Entidades.Estudiante;
import Servicios.EstudianteService;

/**
 *
 * @author Seba
 */
public class Java_Backend_I_Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteService servicio = new EstudianteService();
        Estudiante[] curso = new Estudiante [8];
        for (int i = 0; i < curso.length; i++) {
            curso[i] = servicio.cargar();
        }
        servicio.mostrar(curso);
//1.Calcular y mostrar el promedio de notas de todo el curso
        double promedio = servicio.promedio(curso);
        
//2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
//nota mayor al promedio del curso
        String[] mejores = servicio.mejores(promedio, curso);
        
//3. Por último, deberemos mostrar todos los estudiantes con una nota
//mayor al promedio.
        servicio.mostrar(mejores);
    }
    
}
