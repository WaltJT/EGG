/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


public class AlumnoService {
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Alumno> bucleAlumno(ArrayList<Alumno> alumnos){
        
        do{
            System.out.println("queres agregar un alumno? s/n");
            String respuesta = scan.next();
            respuesta = respuesta.toLowerCase();
            if(respuesta.equals("s")){
                alumnos.add(crearAlumno());
            }
            else if(respuesta.equals("n")){
                break;
            }
        }while(true);
        return alumnos;
    }
    
    public Alumno crearAlumno(){
        
        Alumno alumno = new Alumno();
        
        System.out.println("ingrese el nombre del estudiante");
        alumno.setNombre(scan.next());
        ArrayList<Integer> notas = new ArrayList();
        System.out.println("primera nota:");
        notas.add(Integer.valueOf(scan.next()));
        System.out.println("segunda nota:");
        notas.add(Integer.valueOf(scan.next()));
        System.out.println("tercera nota:");
        notas.add(Integer.valueOf(scan.next()));
        alumno.setNotas(notas);
        
        return alumno;
    }
    
    public void notaFinal(ArrayList<Alumno> alumnos){
        
        System.out.println("que alumno quisieras saber la nota final?");
        String respuesta = scan.next();
        boolean encontrado = false;
        
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alumno = alumnos.get(i);
            
            if(alumno.getNombre().equals(respuesta)){
                calcular(alumno.getNotas());
                encontrado = true;
                break;
            }
            
        }
        if(!encontrado){
            System.out.println("alumno no encontrado");
        }
    }
    
    public void calcular(ArrayList<Integer> notas){
        
        int total = 0;
        for (int i = 0; i < notas.size(); i++) {
            total+=notas.get(i);
        }
        System.out.println((total/3) + " es la nota final");
    }
}
