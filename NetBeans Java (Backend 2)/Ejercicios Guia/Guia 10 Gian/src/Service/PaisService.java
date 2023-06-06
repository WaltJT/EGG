/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


public class PaisService {
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<String> guardarPaises(){
        
        HashSet<String> paises = new HashSet();
        
        boolean agregar = true;
        
        OUTER:
        do{
            if(agregar){
            System.out.println("que pais queres agregar?");
            paises.add(scan.next().toLowerCase());
            }
            System.out.println("queres agregar otro pais? s/n");
            switch (scan.next().toLowerCase()){
                case "s":
                case "si":
                    agregar = true;
                    System.out.println("okey");
                    break;
                case "n":
                case "no":
                    break OUTER;
                default:
                    System.out.println("respuesta no valida");
                    agregar = false;
            }
        }while(true);
        
        
        return new ArrayList(paises);
        
    }
    
    public void ordenar(ArrayList<String> paises){
        Collections.sort(paises);
        System.out.println(paises);
    }
    
    public void buscar(ArrayList<String> paises){
        
        System.out.println("que pais quieres eliminar de la lista?");
        String resp = scan.next().toLowerCase();
        boolean encontrado = false;
        for (String paise : paises) {
            if(paise.equals(resp)){
                encontrado = true;
                System.out.println(paise + " fue eliminado");
                break;
            }
        }
        if(!encontrado){
            System.out.println("el pais no fue encontrado");
        }
        
        System.out.println(paises);
    }
    
    
}
