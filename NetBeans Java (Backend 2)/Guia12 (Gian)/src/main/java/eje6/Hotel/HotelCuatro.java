


package eje6.Hotel;

public final class HotelCuatro extends Hotel {
    
    private Gimnasio gimnasio;
    private String restaurante;
    private int capacidadRest;

    public HotelCuatro() {
        crearHotel();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Tipo de hotel: Hotel 4 Estrellas");
        System.out.println("Tipo de gimnasio: " + gimnasio);
        System.out.println("Nombre del restaurante: " + restaurante);
        System.out.println("-----------");
    }
    
    @Override
    public void crearHotel() {
        super.crearHotel();
        switch((int)(Math.random()*2)){
            case 0:
                gimnasio = Gimnasio.A;
                break;
            case 1:
                gimnasio = Gimnasio.B;
                break;
        }
        capacidadRest = (int)(Math.random()*60);
        capacidadRest += 10;
        restaurante = restauranteRandom();
        precioHabitacion();
    }

    @Override
    public void precioHabitacion() {
        super.precioHabitacion();
        
        if(capacidadRest<30){
            precioHab+=10;
        }
        else if(capacidadRest>30 && capacidadRest<50){
            precioHab+=30;
        }
        else{
            precioHab+=50;
        }
        
        if(gimnasio == Gimnasio.A){
            precioHab+=50;
        }
        else{
            precioHab+=30;
        }
        value = precioHab;
    }

    public String restauranteRandom(){
        String aux = "";
        
        String[] nombres = {"Salchicha","Ensalada","Tuco","Milanesa","Fruta","Manzana",
        "Ciruela","Anana","Jamon","Pesto","Flan","Masa","Higo",
        "Chile"};
        
        aux = aux.concat(nombres[(int)(Math.random()*14)]);
        return aux;
    }
    
    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Gimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public int getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(int capacidadRest) {
        this.capacidadRest = capacidadRest;
    }
    
    
}
