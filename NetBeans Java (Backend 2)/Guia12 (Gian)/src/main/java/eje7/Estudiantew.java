
package eje7;


public class Estudiantew extends Personas{
    
    private String curso;

    public Estudiantew() {
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Curso: " + curso);
    }
    
    
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
