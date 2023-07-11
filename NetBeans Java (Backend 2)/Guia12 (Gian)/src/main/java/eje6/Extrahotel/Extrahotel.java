
package eje6.Extrahotel;

import eje6.Alojamiento;


public abstract class Extrahotel extends Alojamiento {
    
    protected boolean privado;
    protected int metrosCuadrados;
    protected int precioHab;

    @Override
    public void info() {
        super.info();
        System.out.println("Categoria privado: " + privado);
        System.out.println("Metros cuadrados de espacio: " + metrosCuadrados);
        System.out.println("Precio de hospedaje: $" + precioHab);
    }
    
    
    
    @Override
    public void crearAlojamiento() {
        super.crearAlojamiento();
        switch((int)(Math.random()*2)){
            case 0:
                privado = true;
                break;
            case 1:
                privado = false;
                break;
        }
        metrosCuadrados = (int)(Math.random()*1000);
        metrosCuadrados+= (metrosCuadrados+100);
    }
    
    public void precio(){
        precioHab = metrosCuadrados/4;
        if(privado){
            precioHab+=50;
        }
        else{
            precioHab+=20;
        }
        
    }
    
    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public int getPrecio() {
        return precioHab;
    }

    public void setPrecio(int precio) {
        this.precioHab = precio;
    }
    
    
    
    
}
