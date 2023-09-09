
package eje2;

public class Televisor extends Electrodomestico {
    
    private int pulgadas;
    private boolean TDT;

    public Televisor() {
    }
    
    @Override
    public void crearElectrodomestico() {
        
        super.crearElectrodomestico();
        
        
        
        System.out.println("tiene sintonizador TDT? s/n");
        String aux = scan.next();
        TDT = aux.equalsIgnoreCase("s");
        System.out.println("cuantas pulgadas tiene?");
        pulgadas = scan.nextInt();
        
        
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(pulgadas>40){
            precio += (precio / 100 * 30) + precio;
        }
        if(TDT){
            precio += 500;
        }
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    
    
}
