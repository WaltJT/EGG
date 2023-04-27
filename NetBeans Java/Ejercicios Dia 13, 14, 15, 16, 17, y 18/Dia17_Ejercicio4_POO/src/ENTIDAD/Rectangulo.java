/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

import java.util.Scanner;

public class Rectangulo {
    
    private double base;
    private double altura;
    
    public Rectangulo (double base, double altura) {
    
        this.base = base;
        this.altura = altura;
                
    }

    public Rectangulo() {
    
        Scanner scanner = new Scanner (System.in);
        System.out.print("Por favor introduzca un valor para la base del rectangulo: ");
        this.base = scanner.nextDouble();
        System.out.print("Por favor introduzca un valor para la altura del rectangulo: ");
        this.altura  = scanner.nextDouble();
    
    }

    public double getBase() {
    
        return base;
   
    }

    public void setBase(double base) {
    
        this.base = base;
    
    }
    
    public double getAltura() {
        
        return altura;
    
    }
    
    public void setAltura(double altura) {
    
        this.altura = altura;
    
    }
    
    public double Superficie(){
    
        return base * altura;
    
    }
    
    public double Perimetro() {
    
        return (base + altura) * 2;
    
    }

    public void dibujar() {
        for(int i = 0; i < altura; i++) {
            for(int j = 0; j < base; j++) {
                System.out.print("*");
            }
            System.out.println();
    
        }

    }

    public void setAltura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setBase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}