/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

import ServicioCuentaBancaria.ServicioBanco;
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

public class CuentaBancaria {

    private int numeroCuenta;
    private long dniCliente;
    private int saldoActual;
    
    public CuentaBancaria() {
        
    }
    
    public CuentaBancaria(int numeroCuenta, long dniCliente, int saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }
    
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public long getDniCliente() {
        return dniCliente;
    }
    
    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }
    
    public double getSaldoActual() {
        return saldoActual;
    }
    
    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }
}