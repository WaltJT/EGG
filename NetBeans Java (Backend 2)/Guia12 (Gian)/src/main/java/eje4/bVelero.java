
package eje4;


public class bVelero extends Barco {

    private int mastiles;
    
    public bVelero() {
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        crearEslora();
        mastiles = (int)(Math.random()*6);
        mastiles = Math.max(1, eslora);
    }
    
    @Override
    public void crearEslora() {
        eslora = (int)(Math.random()*40);
        eslora = Math.max(2, eslora);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("numero de mastiles: " + mastiles);
    }

    @Override
    public int precioFinal(int a) {
        return a+mastiles;
    }
    
    
    
    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
    
}
