
package eje3;

import java.util.Scanner;


public class Circulo implements Calculos{
    
    private final Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    @Override
    public double area(double a) {
        System.out.println("introduce el radio del circulo");
        return Math.pow(pi * scan.nextDouble(),2) / a;
    }

    @Override
    public double perimetro() {
        System.out.println("diametro del circulo");
        return pi * scan.nextDouble();
    }
    
}
