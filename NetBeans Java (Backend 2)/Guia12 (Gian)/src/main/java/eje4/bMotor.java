
package eje4;


public class bMotor extends Barco {
    
    private int potencia;

    public bMotor() {
    }
    
    @Override
    public void crearBarco() {
        super.crearBarco();
        crearEslora();
        potencia = 5000;
    }
    
    @Override
    public void crearEslora() {
        eslora = (int)(Math.random()*50);
        eslora = Math.max(24, eslora);
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("potencia: " + potencia);
    }
    
    @Override
    public int precioFinal(int a) {
        return a+potencia;
    }
    
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
