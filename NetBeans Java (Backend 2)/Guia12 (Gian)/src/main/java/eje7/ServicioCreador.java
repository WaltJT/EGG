
package eje7;

import java.util.ArrayList;


public class ServicioCreador {
    
    public Personas crearIndividuo(String a){
        Personas aux = null;
        switch(a){
            case "Estudiante":
                aux = new Estudiantew();
                break;
            case "Profesor":
                aux = new Profesor();
                break;
            case "Servicio":
                aux = new PersonalServicio();
                break;
        }
        
        Personas b = crearPersona(aux);
        
        aux.setNombre(b.getNombre());
        aux.setApellido(b.getApellido());
        aux.setDNI(b.getDNI());
        aux.setEstadoCivil(b.getEstadoCivil());
        if(aux instanceof Estudiantew){
            ((Estudiantew) aux).setCurso(cursoRandom());
            return aux;
        }
        else if(aux instanceof Profesor){
            ((Profesor) aux).setIncorporacion(anioRandom());
            ((Profesor) aux).setNumeroDespacho(despachoRandom());
            ((Profesor) aux).setDepartamento(departamentoRandom());
            return aux;
        }
        else if(aux instanceof PersonalServicio){
            ((PersonalServicio) aux).setIncorporacion(anioRandom());
            ((PersonalServicio) aux).setNumeroDespacho(despachoRandom());
            ((PersonalServicio) aux).setSeccion(seccionRandom());
            return aux;
        }
        return aux;
    }
    
    public Personas crearPersona(Personas a){
       a.setNombre(nombreRandom());
       a.setApellido(apellidoRandom());
       a.setDNI(dniRandom());
       a.setEstadoCivil(estadoCivilRandom());
       return a;
    }
    
    public Personas crearAlumno(){
        Personas aux = new Estudiantew();
        Personas a = crearPersona(aux);
        
        aux.setNombre(a.getNombre());
        aux.setApellido(a.getApellido());
        aux.setDNI(a.getDNI());
        aux.setEstadoCivil(a.getEstadoCivil());
        if(aux instanceof Estudiantew){
            ((Estudiantew) aux).setCurso(cursoRandom());
        }
        return aux;
    }
    
    public String nombreRandom(){
        String aux = "";
        
        String[] nombres = {"Juan","Ezequiel","Gian","Oscar","Ramon","Milena",
        "Marcela","Ana","Jonatan","Pablo","Federico","Walter","Hernan",
        "Chiquito","Roberto","Juan","Fernando","Ulises","Emilio","Santiago","Gonzalo"
        ,"Camilo","Camila","Lourdes","Ian","Christian","Thiago"};
        
        aux = aux.concat(nombres[(int)(Math.random()*26)]);
        return aux;
    }
    
    public String apellidoRandom(){
        String aux = "";
        
        String[] apellidos = {"Mattera","Graffigna","Esteve","Prada","Flores","Pronsky",
        "Ortiz","Atencio","Benitez","Terranova","Melin","Moffa","Herrera",
        "Chiquito"};
        
        aux = aux.concat(apellidos[(int)(Math.random()*14)]);
        return aux;
    }
    
    public String dniRandom(){
        int aux = (int)(Math.random()*25000000);
        aux+= 20000000;
        return String.valueOf(aux);
    }
    
    public EstadoCivil estadoCivilRandom(){
        int aux = (int)(Math.random()*3);
        EstadoCivil a = EstadoCivil.SOLTERO;
        switch(aux){
            case 0:
                a = EstadoCivil.SOLTERO;
                break;
            case 1:
                a = EstadoCivil.CASADO;
                break;
            case 2:
                a = EstadoCivil.VIUDO;
                break;
        }
        return a;
    }
    
    public String cursoRandom(){
        
        String aux = "";
        
        String[] apellidos = {"Matematicas","Logica","Ingenieria","Historia","Fisica","Logaritmos",
        "Medicina","Filosofia","Musica"};
        
        aux = aux.concat(apellidos[(int)(Math.random()*9)]);
        return aux;
        
    }
    
    public int anioRandom(){
        int aux = (int)(Math.random()*20);
        aux+=2000;
        return aux;
    }
    
    public int despachoRandom(){
        int aux = (int)(Math.random()*20);
        return aux;
    }
    
    public String departamentoRandom(){
        
        String aux = "";
        
        for (int i = 0; i < 2; i++) {
            var rand = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            rand = String.valueOf(rand.charAt((int)(Math.random()*35)));
            aux = aux.concat(rand);
        }
        
        return aux;
        
    }
    
    public String seccionRandom(){
        String aux = "";
        
        String[] apellidos = {"Piso Bajo","Piso Medio","Piso Alto","Techo","Sotano","Oficinas",
        "Patio","Entrada","Salida"};
        
        aux = aux.concat(apellidos[(int)(Math.random()*9)]);
        return aux;
    }
}
