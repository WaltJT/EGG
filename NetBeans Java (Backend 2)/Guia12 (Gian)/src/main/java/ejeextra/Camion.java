
package ejeextra;


public class Camion extends Logistica {
    
    private int capacidadCarga;
    private int ruedas;

    public Camion() {
        crearVehiculo();
    }

    
    // crearCamion
    @Override
    public void crearVehiculo() {
        super.crearVehiculo();
        capacidadCarga = 50;
        ruedas = 4;
    }
    
    
    
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return super.toString() + "Camion{" + "capacidadCarga=" + capacidadCarga + ", ruedas=" + ruedas + '}';
    }
    
    
}
