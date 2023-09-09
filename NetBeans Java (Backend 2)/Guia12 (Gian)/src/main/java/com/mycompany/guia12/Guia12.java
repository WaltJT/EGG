package com.mycompany.guia12;

import eje1.Animal;
import eje1.Caballo;
import eje1.Gato;
import eje1.Perro;
import eje2.Electrodomestico;
import eje2.Lavadora;
import eje2.Televisor;
import eje3.Circulo;
import eje3.Rectangulo;
import eje4.Alquiler;
import eje5.Edificio;
import eje5.eOficinas;
import eje5.ePolideportivos;
import eje6.Servicio;
import eje7.Personas;
import eje7.ServicioCreador;
import eje7.ServicioGeneral;
import ejeextra.ServicioAutos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Guia12 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        do{
            
            System.out.println("EJERCICIO 1");
            System.out.println("EJERCICIO 2");
            System.out.println("EJERCICIO 3");
            System.out.println("EJERCICIO 4");
            System.out.println("EJERCICIO 5");
            System.out.println("EJERCICIO 6");
            System.out.println("EJERCICIO 7");
            System.out.println("ejercicio con los chicos 8");
            
            switch(scan.nextInt()){
                case 1:
                    
                    Animal perro = new Perro("Stich","Galletitas",15,"Doberman");
                    perro.alimentarse();
                    
                    Animal perro2 = new Perro("Teddy","Croquetas",10,"Chihuahua");
                    perro2.alimentarse();
                    
                    Animal gato = new Gato("Pelusa","Galletas",15,"Siames");
                    gato.alimentarse();
                    
                    Animal caballo = new Caballo("Spark","Pasto",20,"Fino");
                    caballo.alimentarse();
                    
                    break;
                case 2:
                    
                    ArrayList<Electrodomestico> lista = new ArrayList();
                    
                    int precioFinal = 0;
                    
                    for (int i = 0; i < 4; i++) {
                        Electrodomestico aux;
                        System.out.println("que deseas producir?");
                        System.out.println("1. televisor");
                        System.out.println("2. lavadora");
                        switch(scan.nextInt()){
                            case 1:
                                aux = new Televisor();
                                aux.crearElectrodomestico();
                                break;
                            case 2:
                                aux = new Lavadora();
                                aux.crearElectrodomestico();
                                break;
                            default:
                                System.out.println("no es una respuesta valida");
                                System.out.println("se hara una lavadora");
                                aux = new Lavadora();
                                aux.crearElectrodomestico();
                        }
                        lista.add(aux);
                    }
                    
                    for (Electrodomestico electrodomestico : lista) {
                        electrodomestico.precioFinal();
                        System.out.println(electrodomestico.getPrecio());
                        precioFinal += electrodomestico.getPrecio();
                    }
                    
                    System.out.println(precioFinal);
                    
                    break;
                case 3:
                    
                    Rectangulo rect = new Rectangulo();
                    double peri = rect.perimetro();
                    System.out.println("perimetro: " + peri);
                    System.out.println("area: " + rect.area(peri));
                    
                    Circulo circ = new Circulo();
                    double peri2 = circ.perimetro();
                    System.out.println("perimetro: " + peri2);
                    System.out.println("area: " + rect.area(peri2));
                    
                    break;
                case 4:
                    
                    Alquiler alquiler = new Alquiler();
                    alquiler.precioFinal();
                    alquiler.toString();
                    
                    break;
                case 5:
                    
                    ArrayList<Edificio> edificios = new ArrayList();
                    
                    edificios.add(new eOficinas());
                    edificios.add(new eOficinas());
                    edificios.add(new ePolideportivos());
                    edificios.add(new ePolideportivos());
                    
                    int techado = 0;
                    int abierto = 0;
                    
                    for (Edificio edificio : edificios) {
                        
                        edificio.calcularSuperficie();
                        edificio.calcularVolumen();
                        
                        if(edificio instanceof eOficinas){
                            ((eOficinas) edificio).cantPersonas();
                        }
                        if(edificio instanceof ePolideportivos){
                            if(((ePolideportivos) edificio).isTechado()){
                                techado+=1;
                            }
                            else{
                                abierto+=1;
                            }
                        }
                    }
                    System.out.println("techados: " + techado);
                    System.out.println("abiertos: " + abierto);
                    
                    break;
                case 6:
                    
                    Servicio alojamiento = new Servicio();
                    alojamiento.menu();
                    
                    break;
                case 7:
                    
                    ServicioCreador serv = new ServicioCreador();
                    ServicioGeneral serv2 = new ServicioGeneral();
                    
                    ArrayList<Personas> personas = new ArrayList();
                    
                    for (int i = 0; i < 100; i++) {
                        personas.add(serv.crearIndividuo("Estudiante"));
                    }
                    for (int i = 0; i < 5; i++) {
                        personas.add(serv.crearIndividuo("Profesor"));
                    }
                    for (int i = 0; i < 10; i++) {
                        personas.add(serv.crearIndividuo("Servicio"));
                    }
                    
                    Collections.shuffle(personas);
                    Collections.reverse(personas);
                    
                    OUTER:
                    do{
                        System.out.println("1. CAMBIAR ESTADO CIVIL");
                        System.out.println("2. REASIGNACION DE DESPACHO");
                        System.out.println("3. MATRICULACION A UN NUEVO CURSO");
                        System.out.println("4. CAMBIAR DEPARTAMENTO");
                        System.out.println("5. TRASLADO DE SECCION");
                        System.out.println("6. MOSTRAR A TODOS");
                        System.out.println("7. SALIR");
                        switch(scan.nextInt()){
                            case 1:
                                serv2.cambiarEstadoCivil(personas);
                                break;
                            case 2:
                                serv2.cambiarDespacho(personas);
                                break;
                            case 3:
                                serv2.cambiarCurso(personas);
                                break;
                            case 4:
                                serv2.cambiarDepartamento(personas);
                                break;
                            case 5:
                                serv2.cambiarSeccion(personas);
                                break;
                            case 6:
                                serv2.info(personas);
                                break;
                            case 7:
                                break OUTER;
                            default:
                                System.out.println("NO VALID BRO");
                        }
                        
                    }while(true);
                    break;
                case 8:
                    ServicioAutos s = new ServicioAutos();
                    s.menu();
                default:
                    System.out.println("NO VALIDO");
            }
            
        }while(true);
    }
}
