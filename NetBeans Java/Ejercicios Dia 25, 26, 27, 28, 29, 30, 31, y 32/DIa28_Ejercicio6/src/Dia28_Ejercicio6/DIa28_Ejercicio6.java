/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia28_Ejercicio6;

import ENTIDAD.Curso;
import Servicios.CursoServicio;

/*
Ejercicio6 POO Servicios de Utilidad

Un profesor particular está dando cursos para grupos de cinco alumnos y necesita 
un programa para organizar la información de cada curso. Para ello, crearemos 
una clase entidad llamada Curso, cuyos atributos serán: nombreCurso, 
cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de 
dimensión 5 (cinco), donde se alojarán los nombres de cada alumno. A 
continuación, se implementarán los siguientes métodos:

A- Un constructor por defecto.

B- Un constructor con todos los atributos como parámetro.

C- Métodos getters y setters de cada atributo.

D- Método cargarAlumnos(): este método le permitirá al usuario ingresar los 
alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta 
información en un arreglo e iterar con un bucle, solicitando en cada repetición 
que se ingrese el nombre de cada alumno.

E- Método crearCurso(): el método crear curso, le pide los valores de los 
atributos al usuario y después se le asignan a sus respectivos atributos para 
llenar el objeto Curso. En este método invocamos al método cargarAlumnos() 
para asignarle valor al atributo alumnos

F- Método calcularGananciaSemanal(): este método se encarga de calcular la 
ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad 
de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de 
días a la semana que se repite el encuentro.

 */

public class DIa28_Ejercicio6 {

    public static void main(String[] args) {

        CursoServicio cursoService = new CursoServicio();

        // Crear curso
        Curso curso = cursoService.crearCurso();

        // Calcular ganancia semanal del curso
        double gananciaSemanal = curso.calcularGananciaSemanal();

        // Mostrar información del curso y ganancia semanal
        System.out.println("Información del Curso:");
        System.out.println("Nombre: " + curso.getNombreCurso());
        System.out.println("Horas por día: " + curso.getCantidadHorasPorDia());
        System.out.println("Días por semana: " + curso.getCantidadDiasPorSemana());
        System.out.println("Turno: " + curso.getTurno());
        System.out.println("Precio por hora: $" + curso.getPrecioPorHora());

        System.out.println("\nAlumnos:");
        String[] alumnos = curso.getAlumnos();
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + alumnos[i]);

        }

        System.out.println("\nGanancia semanal del curso: $" + gananciaSemanal);

    }

}
