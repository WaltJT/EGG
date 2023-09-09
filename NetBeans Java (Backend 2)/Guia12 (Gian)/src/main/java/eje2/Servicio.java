
package eje2;

import java.util.ArrayList;
import java.util.Scanner;

public class Servicio {
    
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public void ejecutar(){
        
        ArrayList<Electrodomestico> electros = new ArrayList();
        
        do{
            System.out.println("1. CREAR ELECTRODOMESTICO");
            System.out.println("2. SABER PRECIO FINAL");
            switch(scan.nextInt()){
                case 1:
                    electros.add(crearElectrodomestico());
                    break;
                case 2:
                    
            }
            
        }while(true);
        
    }
    
    public Electrodomestico crearElectrodomestico(){
        
        ColorEnum color = elegirColor();
        char consumo = comprobarConsumoElectrico();
        int precio = 1000;
        System.out.println("cuanto pesa el electrodomestico");
        int peso = scan.nextInt();
        return new Electrodomestico(precio,color,consumo,peso);
    }
    
    public ColorEnum elegirColor(){
        
        ColorEnum color;
        
        OUTER:
        do{
            System.out.println("1. BLANCO");
            System.out.println("2. NEGRO");
            System.out.println("3. ROJO");
            System.out.println("4. AZUL");
            System.out.println("5. GRIS");
            switch(scan.nextInt()){
                case 1 -> {
                    color = ColorEnum.BLANCO;
                    break OUTER;
                }
                case 2 -> {
                    color = ColorEnum.NEGRO;
                    break OUTER;
                }
                case 3 -> {
                    color = ColorEnum.ROJO;
                    break OUTER;
                }
                case 4 -> {
                    color = ColorEnum.AZUL;
                    break OUTER;
                }
                case 5 -> {
                    color = ColorEnum.GRIS;
                    break OUTER;
                }
                default -> System.out.println("respuesta no valida");
            }
            
        }while(true);
        
        return color;
    }
    
    public char comprobarConsumoElectrico(){
        
        System.out.println("introduce el tipo de electrodomestico");
        
        String letra = scan.next();
        
        return switch (letra.charAt(0)) {
            case 'a', 'A' -> 'A';
            case 'b', 'B' -> 'B';
            case 'c', 'C' -> 'C';
            case 'd', 'D' -> 'D';
            case 'e', 'E' -> 'E';
            default -> 'F';
        };
}
    
    public int pedirPeso(){
        
        int precio;
        int aux = scan.nextInt();
                
        if(aux>1 && aux<19){
            precio = 100; 
        }
        else if(aux>20 && aux<49){
            precio = 500;
        }
        else if(aux>50 && aux<79){
            precio = 800;
        }
        else if(aux>80){
            precio = 1000;
        }
        else{
            precio = 0;
        }
        
        return precio;
    }
}