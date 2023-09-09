
package eje2;

import java.util.Scanner;


public abstract class Electrodomestico {
    
    protected int precio;
    protected String color;
    protected char consumoEnergetico;
    protected int peso;

    protected final Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Electrodomestico() {
    }
    
    public void comprobarConsumoEnergetico(char aux){
        switch(aux){
            case 'a':
            case 'A':
                consumoEnergetico = 'A';
                break;
            case 'b':
            case 'B':
                consumoEnergetico = 'B';
                break;
            case 'c':
            case 'C':
                consumoEnergetico = 'C';
                break;
            case 'd':
            case 'D':
                consumoEnergetico = 'D';
                break;
            case 'e':
            case 'E':
                consumoEnergetico = 'E';
                break;
            default:
                consumoEnergetico = 'F';
        }
        
    }
  
    public void comprobarColor(String aux){
        aux = aux.toLowerCase();
        switch(aux){
            case "negro":
                color = "negro";
                break;
            case "rojo":
                color = "rojo";
                break;
            case "azul":
                color = "azul";
                break;
            case "gris":
                color = "gris";
                break;
            default:
                color = "blanco";
        }
    }
    
    public void crearElectrodomestico(){
        
        System.out.println("introduce el tipo de consumo energetico (A-F)");
        String letra = scan.next();
        comprobarConsumoEnergetico(letra.charAt(0));
        
        System.out.println("introduce el color del electrodomestico:");
        System.out.println("blanco, negro, rojo, azul o gris");
        comprobarColor(scan.next());
        
        System.out.println("introduce el peso del electrodomestico");
        peso = scan.nextInt();
    }
    
    public void precioFinal(){
        
        precio = 1000;
        
        int auxCon = 0;
        int auxPeso = 0;
        
        switch(consumoEnergetico){
            case 'A':
                auxCon=1000;
                break;
            case 'B':
                auxCon=800;
                break;
            case 'C':
                auxCon=600;
                break;
            case 'D':
                auxCon=500;
                break;
            case 'E':
                auxCon=300;
                break;
            case 'F':
                auxCon=100;
                break;
        }
        if(peso>1 && peso<19){
            auxPeso = 100;
        }
        else if(peso>20 && peso<49){
            auxPeso = 500;
        }
        else if(peso>50 && peso<79){
            auxPeso = 800;
        }
        else if(peso>80){
            auxPeso = 1000;
        }
        
        peso = auxPeso+auxCon+peso;
    }
    
    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}
