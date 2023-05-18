/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

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

import ENTIDAD.Curso;
import java.util.Scanner;

public class CursoServicio {
  
        public Curso crearCurso() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del curso:");
        String nombreCurso = scanner.nextLine();

        System.out.println("Ingrese la cantidad de horas por día:");
        int cantidadHorasPorDia = scanner.nextInt();

        System.out.println("Ingrese la cantidad de días por semana:");
        int cantidadDiasPorSemana = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Ingrese el turno (mañana o tarde):");
        String turno = scanner.nextLine();

        System.out.println("Ingrese el precio por hora:");
        double precioPorHora = scanner.nextDouble();

        Curso curso = new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora);

        curso.cargarAlumnos();

        return curso;

  }

}