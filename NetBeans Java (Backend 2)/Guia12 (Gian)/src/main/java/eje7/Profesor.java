
package eje7;


public class Profesor extends Empleado {
    
    private String departamento;

    public Profesor() {
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Departamento: " + departamento);
    }
    
    
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
}
