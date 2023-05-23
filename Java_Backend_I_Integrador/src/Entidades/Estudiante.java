/*

 Para esto vamos a tener que crear un objeto de tipo Estudiante, sus atributos
van a ser nombre y nota (representando la nota obtenida en el final)

*/

package Entidades;

/*

La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.

1.Calcular y mostrar el promedio de notas de todo el curso

2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso

3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.

*/

public class Estudiante {
    private String nombre;
    private int nota;

    public Estudiante() {
    }

    //NO ES NECESARIO UN CONSTRUCTOR POR PARAMETROS PORQUE NO INSTANCIÉ OBJETOS POR PARAMETRO EN NINGUNA OCACIÓN
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override                       //LO AGREGUE PARA CHECKEAR SI ENTRABAN LOS DATOS
    public String toString() {      //(y para ver como se usa...)
        return "Nombre: " + nombre + " - Nota: " + nota;
    }
    
}
