
package eje2;


public class Lavadora extends Electrodomestico {

    private int carga;

    public Lavadora() {
    }
    
    @Override
    public void crearElectrodomestico() {
        super.crearElectrodomestico();
        System.out.println("introduce la capacidad de la lavadora");
        carga = scan.nextInt();
        precioFinal();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(carga>30){
            precio+=500;
        }
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    
}
