
package eje5;

public class ePolideportivos extends Edificio{
    
    private String nombre;
    private boolean techado;

    public ePolideportivos() {
        System.out.println("ingrese el nombre del polideportivo");
        nombre = scan.next();
        System.out.println("ES TECHADO? s/n");
        techado = scan.next().equalsIgnoreCase("s");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }
    
    
}
