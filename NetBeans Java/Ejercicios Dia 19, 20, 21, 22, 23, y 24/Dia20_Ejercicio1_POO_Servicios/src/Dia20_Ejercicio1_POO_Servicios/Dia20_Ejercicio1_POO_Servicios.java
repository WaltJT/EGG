/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia20_Ejercicio1_POO_Servicios;

import java.util.Scanner;
import ENTIDAD.CuentaBancaria;
import ServicioCuentaBancaria.ServicioBanco;

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


public class Dia20_Ejercicio1_POO_Servicios {

    public static void main(String[] args) {

        ServicioBanco servicio = new ServicioBanco();
        CuentaBancaria cuenta = new CuentaBancaria();

        servicio.crearCuenta();

        servicio.ingresar(cuenta, 10000000);
        servicio.consultarSaldo(cuenta);

        servicio.retirar(cuenta, 500);
        servicio.consultarSaldo(cuenta);

        servicio.extraccionRapida(cuenta);
        servicio.consultarSaldo(cuenta);

        servicio.consultarDatos(cuenta);

    }

}
