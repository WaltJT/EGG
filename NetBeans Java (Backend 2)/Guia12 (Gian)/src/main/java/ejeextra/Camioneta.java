
package ejeextra;


public final class Camioneta extends Logistica {
    
    private int capacidadTrasera;

    public Camioneta() {
        crearVehiculo();
    }
    
    @Override
    public void crearVehiculo() {
        super.crearVehiculo();
        System.out.println("indique la capacidad trasera");
        capacidadTrasera = scan.nextInt();
    }

    public int getCapacidadTrasera() {
        return capacidadTrasera;
    }

    public void setCapacidadTrasera(int capacidadTrasera) {
        this.capacidadTrasera = capacidadTrasera;
    }

    @Override
    public String toString() {
        return super.toString()+"Camioneta{" + "capacidadTrasera=" + capacidadTrasera + '}';
    }
    
    
}
