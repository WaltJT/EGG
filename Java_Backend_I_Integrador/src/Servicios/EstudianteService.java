/*

La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.

1.Calcular y mostrar el promedio de notas de todo el curso

2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso

3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.

*/

package Servicios;

import Entidades.Estudiante;
import java.util.Scanner;

public class EstudianteService {
    Scanner leer = new Scanner(System.in);

//METODO PARA CARGAR LOS ALUMNOS    
    public Estudiante cargar() {
        Estudiante alumno = new Estudiante();       //SE INSTANCIA ADENTO DEL METODO PARA CREAR UN OBJETO ESTUDIANTE CADA VEZ QUE SE INVOQUE
        System.out.print("Ingrese nombre: ");
        alumno.setNombre(leer.next());
        //System.out.print("Ingrese nota: ");
        int nota = (int) (Math.random() * 10);      //MANDÉ UN RANDOM PORQUE ME DIÓ PAJA CARGAR LAS NOTAS XD
        alumno.setNota(nota);
        return alumno;                              //DEVUELO EL OBJETO ESTUDIANTE EN LA VARIABLE ALUMNO
    }

//METODO EXTRA PARA CHECKEAR QUE ENTRARON BIEN LOS DATOS
    public void mostrar(Estudiante[] curso) {
        for (int i = 0; i < curso.length; i++) {
            System.out.println(curso[i].toString());    //CREE UN toString AL FINAL EN LA CLASE ESTUDIANTE
        }
    }
    
//1.Calcular y mostrar el promedio de notas de todo el curso        
    public double promedio(Estudiante[] curso) {        //TRAIGO EL VECTOR "curso" POR PARAMENTROS DESDE EL MAIN
        int suma = 0;
        for (int i = 0; i < curso.length; i++) {
            suma += curso[i].getNota();
        }
        double promedio = suma / curso.length;          //CALCULO Y DEVUELVO EL VALOR "promedio"
        System.out.println("El promedio gral es: " + promedio);
        return promedio;
    }

//2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
//nota mayor al promedio del curso    
    public String[] mejores(double promedio, Estudiante[] curso) {  //RECIBO DEL MAIN EL PROMEDIO Y EL ARREGLO CON EL CURSO COMPLETO POR PARAMETROS
        int cant = 0;                               //CONTADOR QUE LLEVA LA CUENTA DE LOS QUE ESTEN POR ENCIMA DE PROMEDIO
        for (int i = 0; i < curso.length; i++) {
            if (curso[i].getNota() > promedio) {    //REPASO EL VECTOR Y CUENTO
                cant++;                             //CANT VA A SER LA VARIABLE QUE ME VA A DAR EL LARGO DEL VECTOR"MEJORES"
            }
        }
        String[] mejores = new String [cant];       //CREE EL VECTOR QUE GUARDA LOS NOMBRES CON LAS NOTAS POR ENCIMA DEL PROMEDIO
        int j = 0;                                  //COMO LOS VECTORES NO TIENEN EL MISMO LARGO J VA A SER EL INDICE DE VECTOR "MEJORES"
        for (int i = 0; i < curso.length; i++) {
            if (curso[i].getNota() > promedio) {
                mejores[j] = curso[i].getNombre();
                j++;
            }
        }
        return mejores;                             //DEVUELVO EL VECTOR COMPLETO
    }

//3. Por último, deberemos mostrar todos los estudiantes con una nota
//mayor al promedio.    
    public void mostrar(String[] mejores) {         //TRAIGO EL VECTOR "mejores" DESDE EL MAIN
        for (int i = 0; i < mejores.length; i++) {
            System.out.println(mejores[i]);         //RECORRO VECTOR E IMPRIMO
        }
    }
}
