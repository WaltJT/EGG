
package eje7;

public abstract class Personas {
    
    protected String nombre;
    protected String apellido;
    protected String DNI;
    protected EstadoCivil estadoCivil;

    
    public Personas() {
    }
    
    public void info(){
        System.out.println("----------");
        System.out.println("Nombre: "+ nombre + " " +apellido);
        System.out.println("DNI:" + DNI);
        System.out.println("Estado Civil: " + estadoCivil);
        System.out.println("Tipo: " + getClass());
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    
}
