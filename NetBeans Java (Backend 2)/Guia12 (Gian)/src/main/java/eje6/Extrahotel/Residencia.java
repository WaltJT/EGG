
package eje6.Extrahotel;


public final class Residencia extends Extrahotel {
    
    private int cantidadHab;
    private boolean descuento;
    private boolean campo;

    public Residencia() {
        crearAlojamiento();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Tipo de hotel: Residencia");
        System.out.println("Cantidad de habitaciones: " + cantidadHab);
        System.out.println("Descuento para gremio: " + descuento);
        System.out.println("Campo deportivo: " + campo);
        System.out.println("----------");
    }
    
    
    
    @Override
    public void crearAlojamiento() {
        super.crearAlojamiento();   
        cantidadHab = (int)(Math.random()*50);
        cantidadHab += 10;
        switch((int)(Math.random()*2)){
            case 0:
                descuento = true;
                break;
            case 1:
                descuento = false;
                break;
        }
        switch((int)(Math.random()*2)){
            case 0:
                campo = true;
                break;
            case 1:
                campo = false;
                break;
        }
        precio();
    }

    @Override
    public void precio() {
        super.precio();  
        if(descuento){
            precioHab-=(int)(precioHab*25/100);
        }
        if(campo){
            precioHab+=50;
        }
        precioHab+=cantidadHab;
        value = precioHab;
    
    }

    
    
    
    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampo() {
        return campo;
    }

    public void setCampo(boolean campo) {
        this.campo = campo;
    }

    public int getCantidadHab() {
        return cantidadHab;
    }

    public void setCantidadHab(int cantidadHab) {
        this.cantidadHab = cantidadHab;
    }
    
    
}
