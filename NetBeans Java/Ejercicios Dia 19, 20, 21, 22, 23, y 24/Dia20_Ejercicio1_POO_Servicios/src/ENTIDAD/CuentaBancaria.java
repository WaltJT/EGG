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

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    
    public String Nombre;
    public String Apellido;
    public int numerodecuenta;
    public long DNICliente;
    public long SaldoActual;
    public double IngresarSaldo;
    public double RetirarSaldo;
    public double ExtraccionRapida;
    public double consultarSaldo;
    public double consultarDatos;
    
    public CuentaBancaria() {
    
    }

    public CuentaBancaria(int numerodecuenta, int DNICliente, int SaldoActual, double IngresarSaldo, double RetirarSaldo, double ExtraccionRapida, double consultarSaldo, double consultarDatos, String Nombre, String Apellido) {
    
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.numerodecuenta = numerodecuenta;
        this.DNICliente = DNICliente;
        this.SaldoActual = SaldoActual;
        this.IngresarSaldo = IngresarSaldo;
        this.RetirarSaldo = RetirarSaldo;
        this.ExtraccionRapida = ExtraccionRapida;
        this.consultarSaldo = consultarSaldo;
        this.consultarDatos = consultarDatos;
        
    }

    public CuentaBancaria(int numeroCuenta, long dniCliente, long saldoActual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }
    
    public int getNumerodecuenta() {
        return numerodecuenta;
    }

    public long getDNICliente() {
        return DNICliente;
    }

    public long getSaldoActual() {
        return SaldoActual;
    }

    public double getIngresarSaldo() {
        return IngresarSaldo;
    }

    public double getRetirar() {
        return RetirarSaldo;
    }

    public double getExtraccionRapida() {
        return ExtraccionRapida;
    }

    public double getConsultarSaldo() {
        return consultarSaldo;
    }

    public double getConsultarDatos() {
        return consultarDatos;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
           
    public void setNumerodecuenta(int numerodecuenta) {
        this.numerodecuenta = numerodecuenta;
    }

    public void setDNICliente(int DNICliente) {
        this.DNICliente = DNICliente;
    }

    public void setSaldoActual(int SaldoActual) {
        this.SaldoActual = SaldoActual;
    }

    public void setIngresar(double IngresarSaldo) {
        this.IngresarSaldo = IngresarSaldo;
    }

    public void setRetirar(double RetirarSaldo) {
        this.RetirarSaldo = RetirarSaldo;
    }

    public void setExtraccionRapida(double ExtraccionRapida) {
        this.ExtraccionRapida = ExtraccionRapida;
    }

    public void setConsultarSaldo(double consultarSaldo) {
        this.consultarSaldo = consultarSaldo;
    }

    public void setConsultarDatos(double consultarDatos) {
        this.consultarDatos = consultarDatos;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "scanner =" + scanner + ", Nombre =" + Nombre + ", Apellido =" + Apellido + ", numerodecuenta=" + numerodecuenta + ", DNICliente =" + DNICliente + ", SaldoActual =" + SaldoActual + ", IngresarSaldo =" + IngresarSaldo + ", RetirarSaldo =" + RetirarSaldo + ", ExtraccionRapida =" + ExtraccionRapida + ", consultarSaldo =" + consultarSaldo + ", consultarDatos =" + consultarDatos + '}';
    }

    public void CrearCuentaBanco(ServicioBanco sb1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
