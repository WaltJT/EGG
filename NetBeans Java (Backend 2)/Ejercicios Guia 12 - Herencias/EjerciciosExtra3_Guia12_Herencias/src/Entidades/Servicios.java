/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author wjter
 */
public class Servicios {
  Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    private ArrayList<Alojamiento> hoteles;
    
    public void menu(){
        
        System.out.println("de cuantos hoteles por argentina");
        System.out.println("quisiera averiguar?");
        hoteles = crearHoteles(scan.nextInt());
        
        int vuelta = 0;
        
        OUTER:
        do{
            System.out.println("1. MOSTRAR TODOS LOS ALOJAMIENTOS");
            System.out.println("2. HOTELES DE MAS CARO A MAS BARATO");
            System.out.println("3. TODOS LOS CAMPINGS CON RESTAURANTES");
            System.out.println("4. TODAS LAS RESIDENCIAS QUE TIENEN DESCUENTO");
            System.out.println("5. SALIR");
            switch(scan.nextInt()){
                case 1:
                    
                    for (Alojamiento hotele : hoteles) {
                        System.out.println((vuelta+1)+":");
                        hotele.info();
                        vuelta+=1;
                    }
                    vuelta=0;
                    break;
                case 2:
                    
                    ArrayList<Alojamiento> aux = hoteles;
                    Collections.sort(aux,Comparador.ordenar);
                    Collections.reverse(aux);
                    for (Alojamiento au : aux) {
                        System.out.println((vuelta+1)+":");
                        au.info();
                        vuelta+=1;
                    }
                    vuelta=0;
                    break;
                case 3:
                    for (Alojamiento hotele : hoteles) {
                        if(hotele instanceof Camping){
                            if(((Camping) hotele).isRestaurante()){
                                hotele.info();
                            }
                        }
                    }
                    break;
                case 4:
                    for (Alojamiento hotele : hoteles) {
                        if(hotele instanceof Residencia){
                            if(((Residencia) hotele).isDescuentoGremios()){
                                hotele.info();
                            }
                        }
                    }
                    break;
                case 5:
                    break OUTER;
                default:
                    System.out.println("respuesta no valida");
            }
            
        }while(true);
        
    }
    
    public ArrayList<Alojamiento> crearHoteles(int a){
        
        if(a<=0){
            a=1;
        }
        
        ArrayList<Alojamiento> lista = new ArrayList();
        
        for (int i = 0; i < a; i++) {
            int aux = (int)(Math.random()*4)+1;
            switch(aux){
                case 1:
                    lista.add(new Hotel4Estrellas());
                    break;
                case 2:
                    lista.add(new Hotel5Estrellas());
                    break;
                case 3:
                    lista.add(new Camping());
                    break;
                case 4:
                    lista.add(new Residencia());
                    break;
            }
        }
        return lista;
    }
    
}
