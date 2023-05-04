/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioCuentaBancaria;

import ENTIDAD.CuentaBancaria;
import java.util.Scanner;

/**

EJERCICIO 1 POO Servicios.

 Realizar una clase llamada CuentaBancaria en el paquete Entidades con los 
siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), 
saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:

A- Método para crear cuenta pidiéndole los datos al usuario.

B- Método ingresar(double): recibe una cantidad de dinero a ingresar y se le 
sumará al saldo actual.

C- Método retirar(double): recibe una cantidad de dinero a retirar y se le 
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar 
se retirará el máximo posible hasta dejar la cuenta en 0.

D- Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar 
que el usuario no saque más del 20%.

E- Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.

F- Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 
 */

public class ServicioBanco {

    public void crearCuenta() {
   CuentaBancaria cuenta = new CuentaBancaria();
   
   Scanner sc = new Scanner (System.in).useDelimiter("\n");
   
        System.out.print("Ingrese el número de cuenta: ");
        cuenta.setNumeroCuenta(sc.nextInt());
       
        System.out.print("Ingrese el DNI del cliente: ");
        cuenta.setDniCliente(sc.nextLong());
        
        System.out.print("Ingrese el saldo actual: ");
        cuenta.setSaldoActual(sc.nextInt()); }

    public class CuentaBancariaServicio {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    }

    public void ingresar(CuentaBancaria cuenta, double cantidad) {
    
        cuenta.setSaldoActual((int) (cuenta.getSaldoActual() + cantidad));
        System.out.println("Se han ingresado " + cantidad + " euros a la cuenta.");
    
    }

    public void retirar(CuentaBancaria cuenta, double cantidad) {
        
        if (cuenta.getSaldoActual() >= cantidad) {
            cuenta.setSaldoActual((int) (cuenta.getSaldoActual() - cantidad));
            System.out.println("Se han retirado " + cantidad + " euros de la cuenta.");
        
        } else {
        
            System.out.println("No hay suficiente saldo para retirar esa cantidad.");
            cantidad = cuenta.getSaldoActual();
            cuenta.setSaldoActual(0);
            System.out.println("Se han retirado " + cantidad + " euros de la cuenta.");
    
        }
    
    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        double limite = cuenta.getSaldoActual() * 0.2;
        System.out.print("¿Cuánto dinero desea retirar? (Máximo " + limite + " euros): ");
        
        double cantidad = sc.nextDouble();
        
        if (cantidad > limite) {
            System.out.println("No se puede retirar esa cantidad. El límite es de " + limite + " euros.");
        
        } else {
            retirar(cuenta, cantidad);
    
        }
    
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("El saldo actual de la cuenta es de " + cuenta.getSaldoActual() + " euros.");
    
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual() + " euros.");
 
    }

  }


    

