/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/*
EJERCICIO WJTerranova.

    Crear un programa POO en Java, en el que pida nombre, apodo, raza, con o 
sin cola (boolean), edad, y  tipo de animal, en el que el programa guarde lo 
cargado en un arraylist de tipo Integer, y una vez que el usuario indique salir 
esta salga mostrando lo cargado por pantalla.

 */

public class Mascota {
    
    private String nombre;
    private String apodo;
    private String raza;
    private boolean tieneCola;
    private int edad;
    private String tipo;

    public Mascota(String nombre, String apodo, String raza, boolean tieneCola, int edad, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.raza = raza;
        this.tieneCola = tieneCola;
        this.edad = edad;
        this.tipo = tipo;
    
    }

    public String getNombre() {
        return nombre;
    
    }

    public String getApodo() {
        return apodo;
    
    }

    public String getRaza() {
        return raza;
    
    }

    public boolean tieneCola() {
        return tieneCola;
    
    }

    public int getEdad() {
        return edad;
    
    }

    public String getTipo() {
        return tipo;
    
    }

}

