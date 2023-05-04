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

    public ServicioBanco(String Nombre, String Apellido, int numerodecuenta, long SaldoActual, int DNICliente) {
    }
   
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    public ServicioBanco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ServicioBanco CrearCuentaBanco (){
        
        long SaldoActual = 6515487932L;
        
        System.out.println("Por favor ingrese su nombre/s: ");
        String Nombre = scanner.next();

        System.out.println("Por favor ingrese su apellido: ");
        String Apellido = scanner.next();
        
        System.out.println("Por favor ingrese su numero de cuenta: ");
        int numerodecuenta = scanner.nextInt();

        System.out.println("Por favor ingrese su numero de DNI: ");
        long DNICliente = scanner.nextInt();
        
        return new ServicioBanco(Nombre, Apellido, numerodecuenta, SaldoActual, (int) DNICliente);
        
    }

    public void ExtraccionRapida() {

    }

    public void ExtraccionRapida(CuentaBancaria cuenta, double cantidadRetirar) {
    
    }
    
    public void IngresarSaldo(int SaldoActual){
    
        System.out.println("Ingrese la cantidad de dinero que desea ingresar: ");
        int IngresarSaldo = scanner.nextInt();
        SaldoActual += IngresarSaldo;
    
    }
    
    public void RetirarSaldo(int SaldoActual){
        System.out.println("Ingrese la cantidad de dinero que desea retirar:");
        int retirarSaldo = scanner.nextInt();
        
        if (retirarSaldo > SaldoActual){
            retirarSaldo = SaldoActual;
        }
        SaldoActual -= retirarSaldo;
    }
    
    
    public void ExtraccionRapida(int SaldoActual){
        System.out.println("Ingrese la cantidad de dinero que desea retirar de manera rápida:");
        int RetirarSaldo = scanner.nextInt();
        
        if (RetirarSaldo <= SaldoActual*0.20){
            SaldoActual -= RetirarSaldo;
        } else if (RetirarSaldo > SaldoActual*0.20){
            System.out.println("No se puede retirar tal cantidad de dinero en el modo Extracción Rápida");
        }
    }

   
}
        

    

