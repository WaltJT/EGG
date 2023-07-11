
package eje7;


public abstract class Empleado extends Personas {
    
    protected int incorporacion;
    protected int numeroDespacho;

    public Empleado() {
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Año de incorporación: " + incorporacion);
        System.out.println("Numero de despacho: " + numeroDespacho);
    }
    
    
    
    public int getIncorporacion() {
        return incorporacion;
    }

    public void setIncorporacion(int incorporacion) {
        this.incorporacion = incorporacion;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }
    
    
}
