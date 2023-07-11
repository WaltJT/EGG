
package eje3;

import java.util.Scanner;

public class Rectangulo implements Calculos {

    private final Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    private int base;
    private int altura;
    
    @Override
    public double area(double a) {
        return base * altura / a;
    }

    @Override
    public double perimetro() {
        System.out.println("base y altura del rectangulo");
        base = scan.nextInt();
        altura = scan.nextInt();
        return (base + altura) * 2;
    }
    
    
    
}
