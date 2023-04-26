/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

import java.util.Scanner;

public class Circunferencia {

    private double radio;
    private final double PI = Math.PI;

    public Circunferencia(double radio) {
        this.radio = radio;

    }

    public double getRadio() {
        return radio;

    }

    public void setRadio(double radio) {
        this.radio = radio;

    }

    public void crearCircunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        this.radio = radio;

    }

    public double area() {
        return PI * Math.pow(radio, 2);

    }

    public double perimetro() {
        return 2 * PI * radio;

    }

}
