
package eje7;


public class PersonalServicio extends Empleado {
    
    private String seccion;

    @Override
    public void info() {
        super.info();
        System.out.println("Seccion: " + seccion);
    }

    
    
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    
}
