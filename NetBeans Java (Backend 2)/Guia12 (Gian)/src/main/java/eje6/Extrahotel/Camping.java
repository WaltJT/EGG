
package eje6.Extrahotel;

public final class Camping extends Extrahotel {
    
    private int carpas;
    private int banios;
    private boolean restaurante;

    public Camping() {
        crearAlojamiento();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Tipo de hotel: Camping");
        System.out.println("Total de carpas: " + carpas);
        System.out.println("Total de banios: " + banios);
        System.out.println("Restaurante: " + restaurante);
        System.out.println("----------");
    }
    
    
    
    @Override
    public void crearAlojamiento() {
        super.crearAlojamiento();
        carpas = (int)(Math.random()*50);
        carpas += 10;
        banios = (int)(Math.random()*5);
        banios += 1;
        switch((int)(Math.random()*2)){
            case 0:
                restaurante = true;
                break;
            case 1:
                restaurante = false;
                break;
        }
        precio();
        
    }

    @Override
    public void precio() {
        super.precio();
        precioHab += carpas;
        precioHab += banios*2;
        if(restaurante){
            precioHab+=20;
        }
        value = precioHab;
    }
    
    
    
    public int getCarpas() {
        return carpas;
    }

    public void setCarpas(int carpas) {
        this.carpas = carpas;
    }

    public int getBanios() {
        return banios;
    }

    public void setBanios(int banios) {
        this.banios = banios;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }
    
    
}
