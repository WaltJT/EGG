/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entity.PERRO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class PerroService {
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public String devolverRaza(){
        
        PERRO perro = new PERRO();
        
        return perro.getRaza();
    }
    
    public ArrayList<String> borrarPerro(ArrayList<String> razas){
        Iterator iterator = razas.iterator();
        
        System.out.println("perro a masacrar elige");
        String razaamatar = scan.next();
        
        while(iterator.hasNext()){
            if(iterator.next().equals(razaamatar)){
                System.out.println("el perro fue masacrado con exito");
                iterator.remove();
            }
            }
        System.out.println(razas);
        
        Collections.sort(razas);
        
        return razas;
    }
    
    public ArrayList<String> agregarPerros(ArrayList<String> razas){
        OUTER:
            while (true) {
                System.out.println("queres agregar un perro? si(1),no(2)");
                switch (scan.nextInt()) {
                    case 1:
                        razas.add(devolverRaza());
                        break;
                    case 2:
                        break OUTER;
                    default:
                        System.out.println("RESPUESRTA BNO BKALIDA");
                        break;
                        }
                    }
        System.out.println("terminado de agregarse.");
        System.out.println(razas);
        
        return razas;
        
    }
}
