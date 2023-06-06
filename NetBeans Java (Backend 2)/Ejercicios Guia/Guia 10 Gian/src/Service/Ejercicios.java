package Service;

import java.util.Scanner;
import Entity.Alumno;
import Entity.Pelicula;
import java.util.ArrayList;

public class Ejercicios {
    
    
    public void ejecutar(){
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        PerroService perroService = new PerroService();
                    
        ArrayList<String> razas = new ArrayList<>();
        
        do{
            System.out.println("EJERCICIO 1");
            System.out.println("EJERCICIO 2");
            System.out.println("EJERCICIO 3");
            System.out.println("EJERCICIO 4");
            System.out.println("EJERCICIO 5");
            System.out.println("EJERCICIO 6");
            int resp = scan.nextInt();
            switch(resp){
                case 1:
                    
                    razas = perroService.agregarPerros(razas);
                    
                    break;
                case 2:
                    razas = perroService.borrarPerro(razas);
                    System.out.println(razas);
                    break;
                case 3:
                    
                    ArrayList<Alumno> alumnos = new ArrayList<>();
                    
                    AlumnoService alumnoService = new AlumnoService();
                    
                    alumnos = alumnoService.bucleAlumno(alumnos);
                    
                    alumnoService.notaFinal(alumnos);
                    
                    break;
                case 4:
                    
                    PeliculaService peliculaService = new PeliculaService();
                    
                    ArrayList<Pelicula> peliculas = peliculaService.peliculaBucle();
                    
                    peliculaService.mostrarPeliculas(peliculas);
                    peliculaService.mostrarMayorA1(peliculas);
                    peliculaService.mostrarOrdenes(peliculas);
                    peliculaService.ordenarTitulo(peliculas);
                    peliculaService.ordenarDirector(peliculas);
                    
                    
                    break;
                case 5:
                    
                    PaisService paisService = new PaisService();
                    ArrayList<String> paises = paisService.guardarPaises();
                    paisService.ordenar(paises);
                    paisService.buscar(paises);
                    
                    break;
                case 6:
                    
                    Tienda tienda = new Tienda();
                    tienda.tienda();
                    break;
                default:
                    System.out.println("RESPUESTA NO VALIDA");
            }
        }while(true);
        
        
    }
    
    
}
