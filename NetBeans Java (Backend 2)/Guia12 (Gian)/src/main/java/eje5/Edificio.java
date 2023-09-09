
package eje5;

import java.util.Scanner;

public abstract class Edificio {
    
    protected int ancho;
    protected int largo;
    protected int alto;

    protected Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Edificio(int ancho, int largo, int alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }
    
    
    
    public Edificio() {
        
        System.out.println("ingrese altura");
        alto = scan.nextInt();
        System.out.println("ingrese ancho");
        ancho = scan.nextInt();
        System.out.println("ingrese largo");
        largo = scan.nextInt();
        
    }
    
    public void calcularSuperficie(){
        System.out.println(largo * ancho);
    }
    
    public void calcularVolumen(){
        System.out.println(largo * ancho * alto);
    }
    
    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    
    
}
