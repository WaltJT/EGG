/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

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

import java.util.Scanner;

public class Curso {
    
    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    public Curso() {
        this.alumnos = new String[5];
    
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = new String[5];
    
    }

    public String getNombreCurso() {
        return nombreCurso;
    
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;

    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;

    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;

    }

    public String getTurno() {
        return turno;

    }

    public void setTurno(String turno) {
        this.turno = turno;

    }

    public double getPrecioPorHora() {
        return precioPorHora;

    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;

    }

    public String[] getAlumnos() {
        return alumnos;

    }

    public void cargarAlumnos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los nombres de los alumnos:");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            alumnos[i] = scanner.nextLine();

        }

    }

    public double calcularGananciaSemanal() {
        return cantidadHorasPorDia * precioPorHora * cantidadDiasPorSemana * alumnos.length;

    }

}
