
package eje4;

public class bYate extends Barco {
    
    private int potencia;
    private int camarotes;

    public bYate() {
    }
    
    @Override
    public void crearBarco() {
        super.crearBarco();
        crearEslora();
        
        potencia = 2000;
        camarotes = (int)(Math.random()*10);
        camarotes += 10;
    }
    
    @Override
    public void crearEslora() {
        eslora = (int)(Math.random()*50);
        eslora = Math.max(40, eslora);
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("potencia: " + potencia);
        System.out.println("camarotes en total: " + camarotes);
    }
    
    @Override
    public int precioFinal(int a) {
        return a+potencia+camarotes;
    }
    
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
}
