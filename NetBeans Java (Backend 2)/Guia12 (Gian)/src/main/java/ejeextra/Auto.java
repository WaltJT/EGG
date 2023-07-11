
package ejeextra;

public class Auto extends Logistica{
    
    private boolean intacto;
    private int capacidadPasajeros;
    private int cantidadDePuertas;

    public Auto() {
        crearVehiculo();
    }
    
    @Override
    public void crearVehiculo() {
        super.crearVehiculo();
        intacto = false;
        capacidadPasajeros = 10;
        cantidadDePuertas = 1;
    }
    

    public boolean isIntacto() {
        return intacto;
    }

    public void setIntacto(boolean intacto) {
        this.intacto = intacto;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }

    @Override
    public String toString() {
        return super.toString() + "Auto{" + "intacto=" + intacto + ", capacidadPasajeros=" + capacidadPasajeros + ", cantidadDePuertas=" + cantidadDePuertas + '}';
    }
    
    
}
