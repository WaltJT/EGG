
package ejeextra;

import java.util.Scanner;


public abstract class Logistica {
    
    protected String patente;
    protected Marca marca;
    protected int anioFabricacion;
    protected Combustibles combustible;
    
    protected final Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Logistica() {
        
    }

    public Logistica(String patente, Marca marca, int anioFabricacion, Combustibles combustible) {
        this.patente = patente;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.combustible = combustible;
    }
    
    public void crearVehiculo(){
        ServicioCreacion s = new ServicioCreacion();
        
        patente = s.crearMatricula();
        marca = s.crearMarca();
        anioFabricacion = s.crearAnioFabricacion();
        combustible = s.crearCombustible();
    }
    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Logistica{" + "patente=" + patente + ", marca=" + marca + ", anioFabricacion=" + anioFabricacion + ", combustible=" + combustible + '}';
    }
}
