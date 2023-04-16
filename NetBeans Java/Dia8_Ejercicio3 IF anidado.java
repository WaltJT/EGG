Este es el mismo ejercicio realizado, con la diferencia que se puede elegir la opcion de a que diviza convertir, seleccionando anteriormente en que importe de dinero realizar el cambio, siendo en pesos o en euros (de la mano de Chat GPT 4). 

import java.util.Scanner;

public class ConversorDivisas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de euros o pesos que quieres convertir: ");
        double cantidad = sc.nextDouble();
        System.out.print("Introduce la moneda a la que quieres convertir (dolares, yenes o libras): ");
        String moneda = sc.next();
        convertirDivisa(cantidad, moneda);
    }
    
    public static void convertirDivisa(double cantidad, String moneda) {
        double cambio;
        if (moneda.equals("dolares")) {
            if (cantidad < 1) {
                System.out.println("No se pueden convertir cantidades inferiores a 1 dólar.");
            } else {
                cambio = cantidad * 1.28611;
                System.out.println(cantidad + " euros/pesos son " + cambio + " dólares.");
            }
        } else if (moneda.equals("yenes")) {
            if (cantidad < 1) {
                System.out.println("No se pueden convertir cantidades inferiores a 1 yen.");
            } else {
                cambio = cantidad * 129.852;
                System.out.println(cantidad + " euros/pesos son " + cambio + " yenes.");
            }
        } else if (moneda.equals("libras")) {
            if (cantidad < 1) {
                System.out.println("No se pueden convertir cantidades inferiores a 1 libra.");
            } else {
                cambio = cantidad * 0.86;
                System.out.println(cantidad + " euros/pesos son " + cambio + " libras.");
            }
        } else if (moneda.equals("pesos")) {
            System.out.print("Introduce la moneda a la que quieres convertir (dolares, yenes o libras): ");
            String monedaDestino = sc.next();
            double tasaCambio;
            if (monedaDestino.equals("dolares")) {
                tasaCambio = 0.057;
            } else if (monedaDestino.equals("yenes")) {
                tasaCambio = 0.68;
            } else if (monedaDestino.equals("libras")) {
                tasaCambio = 0.0079;
            } else {
                System.out.println("Moneda no válida.");
                return;
            }
            cambio = cantidad * tasaCambio;
            System.out.println(cantidad + " pesos son " + cambio + " " + monedaDestino + ".");
        } else {
            System.out.println("Moneda no válida.");
        }
    }
}
