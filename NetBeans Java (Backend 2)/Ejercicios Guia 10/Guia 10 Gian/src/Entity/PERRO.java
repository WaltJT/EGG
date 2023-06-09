/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Scanner;

public class PERRO {
    
    private String raza;
    private Scanner scan;

    public PERRO() {
        
        System.out.println("escribi la raza de tu perrito");
        scan = new Scanner(System.in).useDelimiter("\n");
        
        String respuesta = scan.next();
        
        raza = respuesta;
        
    }
    
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
}
