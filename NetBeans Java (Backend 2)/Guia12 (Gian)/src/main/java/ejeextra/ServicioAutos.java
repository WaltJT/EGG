
package ejeextra;

import java.util.Scanner;


public class ServicioAutos {
    
    public void menu(){
        
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        
        Logistica aux = null;
        
        System.out.println("elige tipo de vehiculo para viajar");
        OUTER:
        do{
            System.out.println("1. TRASLADO POR AUTO");
            System.out.println("2. TRASLADO POR CAMIONETA");
            System.out.println("3. TRASLADO POR CAMION");
            switch(scan.nextInt()){
                case 1:
                    aux = new Auto();
                    break OUTER;
                case 2:
                    aux = new Camioneta();
                    break OUTER;
                case 3:
                    aux = new Camion();
                    break OUTER;
                default:
                    System.out.println("no");
            }
        }while(true);
        
        System.out.println(aux.toString());
        
    }
    
}
