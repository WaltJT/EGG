
package eje7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ServicioGeneral {
    
    public void info(ArrayList<Personas> personas) {
        for (Personas persona : personas) {
            persona.info();
        }
    }
    
    public void cambiarEstadoCivil(ArrayList<Personas> personas){
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        int aux = personas.size();
        for (Personas persona : personas) {
            aux-=1;
            System.out.print(aux + ": ");
            System.out.println(persona.getNombre() +" "+ persona.getApellido() + ". Estado: " + persona.getEstadoCivil());
            
        }
        Collections.reverse(personas);
        System.out.println("desplazar hacia arriba para seguir la lista");
        do{
            System.out.println("escriba el numero correspondiente");
            System.out.println("para cambiar su estado civil");
            int a = scan.nextInt();
            if(personas.get(a)==null){
                System.out.println("fuera de rango");
            }
            else{
                Personas b = personas.get(a);
                personas.remove(a);
                OUTER:
                do{
                System.out.println("Estado civil actual: " + b.getEstadoCivil());
                System.out.println("Cambiar estado civil a: ");
                System.out.println("1. SOLTERO");
                System.out.println("2. CASADO");
                System.out.println("3. VIUDO");
                switch(scan.nextInt()){
                    case 1:
                        b.setEstadoCivil(EstadoCivil.SOLTERO);
                        break OUTER;
                    case 2:
                        b.setEstadoCivil(EstadoCivil.CASADO);
                        break OUTER;
                    case 3:
                        b.setEstadoCivil(EstadoCivil.VIUDO);
                        break OUTER;
                    default:
                        System.out.println("NO VALID BRO");
                }
                }while(true);
                personas.add(b);
            }
            Collections.reverse(personas);
            break;
        }while(true);
    }
    
    public void cambiarDespacho(ArrayList<Personas> personas){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        int aux = 0;
        
        for (Personas persona : personas) {
            if(persona instanceof Empleado){
                aux+=1;
            }
        }
        
        ArrayList<Personas> personasAux = new ArrayList();
        
        for (Personas persona : personas) {
            if(persona instanceof Empleado){
                aux-=1;
                personasAux.add(persona);
                System.out.print(aux + ": ");
                System.out.println(persona.getNombre() +" "+ persona.getApellido() + ". Despacho: "+ ((Empleado) persona).getNumeroDespacho());
            }
        }
        Collections.reverse(personasAux);
        System.out.println("desplazar hacia arriba para seguir la lista");
        do{
        System.out.println("escriba el numero correspondiente");
        System.out.println("para cambiar su despacho");
        int a = scan.nextInt();
        if(personasAux.get(a)==null){
                System.out.println("fuera de rango");
                continue;}
        else{
            Personas b = personasAux.get(a);
            personas.remove(b);
            if(b instanceof Empleado){
               System.out.println("Despacho actual: " + ((Empleado) b).getNumeroDespacho());
               System.out.println("Ingrese nuevo despacho");
               ((Empleado) b).setNumeroDespacho(scan.nextInt());
            }
            personas.add(b);
        }
        break;
        }while(true);
    }
    
    public void cambiarCurso(ArrayList<Personas> personas){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        int aux = 0;
        
        for (Personas persona : personas) {
            if(persona instanceof Estudiantew){
                aux+=1;
            }
        }
        
        ArrayList<Personas> personasAux = new ArrayList();
        
        for (Personas persona : personas) {
            if(persona instanceof Estudiantew){
                aux-=1;
                personasAux.add(persona);
                System.out.print(aux + ": ");
                System.out.println(persona.getNombre() +" "+ persona.getApellido()+". Curso: " + ((Estudiantew) persona).getCurso());
            }
        }
        Collections.reverse(personasAux);
        System.out.println("desplazar hacia arriba para seguir la lista");
        do{
        System.out.println("escriba el numero correspondiente");
        System.out.println("para cambiar su curso");
        int a = scan.nextInt();
        if(personasAux.get(a)==null){
                System.out.println("fuera de rango");
                continue;}
        else{
            Personas b = personasAux.get(a);
            personas.remove(b);
            if(b instanceof Estudiantew){
               System.out.println("Curso actual: " + ((Estudiantew) b).getCurso());
               System.out.println("Ingrese nuevo curso");
               ((Estudiantew) b).setCurso(scan.next());
            }
            personas.add(b);
        }
        break;
        }while(true);
    }
    
    public void cambiarDepartamento(ArrayList<Personas> personas){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        int aux = 0;
        
        for (Personas persona : personas) {
            if(persona instanceof Profesor){
                aux+=1;
            }
        }
        
        ArrayList<Personas> personasAux = new ArrayList();
        
        for (Personas persona : personas) {
            if(persona instanceof Profesor){
                aux-=1;
                personasAux.add(persona);
                System.out.print(aux + ": ");
                System.out.println(persona.getNombre() +" "+ persona.getApellido()+". Curso: " + ((Profesor) persona).getDepartamento());
            }
        }
        Collections.reverse(personasAux);
        System.out.println("desplazar hacia arriba para seguir la lista");
        do{
        System.out.println("escriba el numero correspondiente");
        System.out.println("para cambiar su departamento");
        int a = scan.nextInt();
        if(personasAux.get(a)==null){
                System.out.println("fuera de rango");
                continue;}
        else{
            Personas b = personasAux.get(a);
            personas.remove(b);
            if(b instanceof Profesor){
               System.out.println("Departamento actual: " + ((Profesor) b).getDepartamento());
               System.out.println("Ingrese nuevo departamento");
               ((Estudiantew) b).setCurso(scan.next());
            }
            personas.add(b);
        }
        break;
        }while(true);
    }
    
    public void cambiarSeccion(ArrayList<Personas> personas){
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        int aux = 0;
        
        for (Personas persona : personas) {
            if(persona instanceof PersonalServicio){
                aux+=1;
            }
        }
        
        ArrayList<Personas> personasAux = new ArrayList();
        
        for (Personas persona : personas) {
            if(persona instanceof PersonalServicio){
                aux-=1;
                personasAux.add(persona);
                System.out.print(aux + ": ");
                System.out.println(persona.getNombre() +" "+ persona.getApellido()+". Curso: " + ((PersonalServicio) persona).getSeccion());
            }
        }
        Collections.reverse(personasAux);
        System.out.println("desplazar hacia arriba para seguir la lista");
        do{
        System.out.println("escriba el numero correspondiente");
        System.out.println("para cambiar su sector");
        int a = scan.nextInt();
        if(personasAux.get(a)==null){
                System.out.println("fuera de rango");
                continue;}
        else{
            Personas b = personasAux.get(a);
            personas.remove(b);
            if(b instanceof PersonalServicio){
               System.out.println("Seccion actual: " + ((PersonalServicio) b).getSeccion());
               System.out.println("Ingrese nuevo sector");
               ((Estudiantew) b).setCurso(scan.next());
            }
            personas.add(b);
        }
        break;
        }while(true);
    }
    
}
