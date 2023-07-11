package eje6.Hotel;


public final class HotelCinco extends Hotel {
    
    private Gimnasio gimnasio;
    private String restaurante;
    private int capacidadRest;
    private int salonesConf;
    private int suites;
    private int limosinas;

    public HotelCinco() {
        crearHotel();
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Tipo de hotel: Hotel 5 Estrellas");
        System.out.println("Tipo de gimnasio: " + gimnasio);
        System.out.println("Nombre del restaurante: " + restaurante);
        System.out.println("Capacidad restaurante: " + capacidadRest);
        System.out.println("Salones de conferencia: " + salonesConf);
        System.out.println("Cantidad de suites: " + suites);
        System.out.println("Limosinas disponibles: " + limosinas);
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
        restaurante = restauranteRandom();
        capacidadRest = (int)(Math.random()*60);
        capacidadRest += 10;
        salonesConf = (int)(Math.random()*4);
        suites = (int)(Math.random()*4);
        limosinas = (int)(Math.random()*10);
        limosinas+=1;
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
        
        precioHab += limosinas*15;
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

    public int getSalonesConf() {
        return salonesConf;
    }

    public void setSalonesConf(int salonesConf) {
        this.salonesConf = salonesConf;
    }

    public int getSuites() {
        return suites;
    }

    public void setSuites(int suites) {
        this.suites = suites;
    }

    public int getLimosinas() {
        return limosinas;
    }

    public void setLimosinas(int limosinas) {
        this.limosinas = limosinas;
    }
    
    
}
