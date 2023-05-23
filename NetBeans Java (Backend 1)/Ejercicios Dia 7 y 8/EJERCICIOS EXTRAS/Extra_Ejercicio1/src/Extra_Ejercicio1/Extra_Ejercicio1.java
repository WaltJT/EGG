/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extra_Ejercicio1;

/*
EXTRA EJERCICIO1

Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 
1 día, 2 horas.

 */

import java.util.Scanner;

public class Extra_Ejercicio1 {

    
 
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner (System.in);
    String continuar = "si";
    
    while (continuar.equalsIgnoreCase("si")){
    
        System.out.println("Por favor ingrese los minutos, "
                + "para calcular el mismo en días, y/o horas: ");
        int min = scanner.nextInt();
    
        System.out.println("");
        
        System.out.println("Usted ingreso "+ min + " minutos.");
       
        System.out.println("");
        
        int dia = min;
        
        int horas = min;
        
        int dia2 = min;
        
        int horas2 = min;
    
        
    calculardia(min,dia);    
    calcularhoras (min,horas);    
    calculardiasyhoras (min,horas2,dia2);
    
    System.out.println("¿Desea continuar? (si/no): ");
    continuar = scanner.next();
    
    }    
   System.out.println("¡Gracias por usar el programa!");
}
    
public static void calculardia (int min, int dia){
  
    //dia = 1440;
    dia = min / 1440;
    
    if (true){
    
        System.out.println("Han transcurrido "+ dia + " dia/dias.");
        
    }

}   

public static void calcularhoras (int min, int horas){
  
    //horas = 60;
    horas = min / 60;
    
    if (true){
    
        System.out.println("Han transcurrido "+ horas + " hora/horas.");
        
    }
    
}

public static void calculardiasyhoras (int min,int horas2, int dia2){
Scanner scanner = new Scanner (System.in);   
    //horas2 = 60;
    horas2 = min / 60;
    
    //dia2 = 1440;
    dia2 = min / 1440;
    
    int rta = min % (24*60) / 60;
    
        
        System.out.println("Han transcurrido "+ dia2 + " dia/dias "
                + "y aun quedan por transcurrir "+ rta + " hora/horas.");
        System.out.println("");
    
        
    }
    
}




