
package eje6.Hotel;

import eje6.Alojamiento;

public abstract class Hotel extends Alojamiento {
    
    protected int cantidadHab;
    protected int numeroCamas;
    protected int pisos;
    protected int precioHab;

    @Override
    public void info() {
        super.info();
        System.out.println("Cantidad de habitaciones: " + cantidadHab);
        System.out.println("Numero de camas por habitacion: " + numeroCamas);
        System.out.println("Pisos totales: " + pisos);
        System.out.println("Precio de hospedaje: $" + precioHab);
    }
    
    public void crearHotel(){
        crearAlojamiento();
        cantidadHab = (int)(Math.random()*30);
        cantidadHab += 20;
        numeroCamas = (int)(Math.random()*3);
        numeroCamas += 1;
        pisos = (int)(Math.random()*10);
        pisos += 5;
    }
    
    public void precioHabitacion(){
        precioHab = 50;
        precioHab += numeroCamas*pisos*cantidadHab;
    }
    
    public int getCantidadHab() {
        return cantidadHab;
    }

    public void setCantidadHab(int cantidadHab) {
        this.cantidadHab = cantidadHab;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getPrecio() {
        return precioHab;
    }

    public void setPrecio(int precio) {
        this.precioHab = precio;
    }
    
    
}
