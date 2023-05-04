/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

import java.util.Scanner;

public class Operacion {
    private int numero1;
    private int numero2;

    // Constructor con todos los atributos pasados por parámetro
    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Constructor sin los atributos pasados por parámetro
    public Operacion() {
    
    }

    // Métodos get y set
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    // Método para crearOperacion()
    public void crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Método sumar()
    public int sumar() {
        return numero1 + numero2;
    }

    // Método restar()
    public int restar() {
        return numero1 - numero2;
    }

    // Método multiplicar()
    public int multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("No se puede multiplicar por cero");
            return 0;
        }
        else {
            return numero1 * numero2;
        }
    }

    // Método dividir()
    public double dividir() {
        if (numero2 == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        }
        else {
            return (double)numero1 / numero2;
        }
    }
}
    

     
 
   
    

