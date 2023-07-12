/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/*
EJERCICIO EXTRA 3 GUIA 12 HERENCIAS

 Una compañía de promociones turísticas desea mantener información sobre la 
infraestructura de alojamiento para turistas, de forma tal que los clientes 
puedan planear sus vacaciones de acuerdo con sus posibilidades. Los alojamientos 
se identifican por un nombre, una dirección, una localidad y un gerente 
encargado del lugar. La compañía trabaja con dos tipos de alojamientos: Hoteles 
y Alojamientos Extrahoteleros.
 Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, 
Cantidad de Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco 
estrellas. Las características de las distintas categorías son las siguientes:

• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, 
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Precio de las 
Habitaciones.

• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, 
Gimnasio, Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las 
Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo 
“B”, de acuerdo a las prestaciones observadas. Las limosinas están disponibles 
para cualquier cliente, pero sujeto a disponibilidad, por lo que cuanto más 
limosinas tenga el hotel, más caro será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por 
restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas).
Donde:

Valor agregado por el restaurante:

• $10 si la capacidad del restaurante es de menos de 30 personas.

• $30 si está entre 30 y 50 personas.

• $50 si es mayor de 50.

Valor agregado por el gimnasio:

• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.

En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a 
los de los hoteles, estando más orientados a la vida al aire libre y al turista 
de bajos recursos. Por cada Alojamiento Extrahotelero se indica si es privado o 
no, así como la cantidad de metros cuadrados que ocupa. Existen dos tipos de 
alojamientos extrahoteleros: los Camping y las Residencias. Para los Camping se 
indica la capacidad máxima de carpas, la cantidad de baños disponibles y si 
posee o no un restaurante dentro de las instalaciones. Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y 
si posee o no campo deportivo. Realizar un programa en el que se representen 
todas las relaciones descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por 
diferentes criterios:

• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.

*/

public class Hotel5Estrellas extends Hotel {
    
    private Gimnasio Gimnasio;
    private String Restaurante;
    private int capacidadRestaurante;
    private int Limosinas;
    private int salonesConf;
    private int Suites;

    public Hotel5Estrellas(int cantHabitaciones, int numCamas, int cantPisos, int precioHabitacion, String nombrehotel, String direccion, String localidad, String gerente, String encargado) {
        super(cantHabitaciones, numCamas, cantPisos, precioHabitacion, nombrehotel, direccion, localidad, gerente, encargado);
    }
    
    public void Hotel5Estrellas() {
      crearHotel();
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Tipo de hotel: Hotel 5 Estrellas");
        System.out.println("Tipo de gimnasio: " + Gimnasio);
        System.out.println("Nombre del restaurante: " + Restaurante);
        System.out.println("Capacidad restaurante: " + capacidadRestaurante);
        System.out.println("Salones de conferencia: " + salonesConf);
        System.out.println("Cantidad de suites: " + Suites);
        System.out.println("Limosinas disponibles: " + Limosinas);
        System.out.println("-----------");
    }
    
    @Override
    public void crearHotel() {
        super.crearHotel();
        switch((int)(Math.random()*2)){
            case 0:
                Gimnasio = Gimnasio.A;
                break;
            case 1:
                Gimnasio = Gimnasio.B;
                break;
        }
        Restaurante = restauranteRandom();
        capacidadRestaurante = (int)(Math.random()*60);
        capacidadRestaurante += 10;
        salonesConf = (int)(Math.random()*4);
        Suites = (int)(Math.random()*4);
        Limosinas = (int)(Math.random()*10);
        Limosinas+=1;
        precioHabitacion();
    }
    
    @Override
    public void precioHabitacion() {
        super.precioHabitacion();
        
        if(capacidadRestaurante<30){
            precioHabitacion+=10;
        }
        else if(capacidadRestaurante>30 && capacidadRestaurante<50){
            precioHabitacion+=30;
        }
        else{
            precioHabitacion+=50;
        }
        
        if(Gimnasio == Gimnasio.A){
            precioHabitacion+=50;
        }
        else{
            precioHabitacion+=30;
        }
        
        precioHabitacion += Limosinas*15;
        Value = precioHabitacion;
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
        return Gimnasio;
    }

    public void setGimnasio(Gimnasio Gimnasio) {
        this.Gimnasio = Gimnasio;
    }

    public String getRestaurante() {
        return Restaurante;
    }

    public void setRestaurante(String Restaurante) {
        this.Restaurante = Restaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public int getLimosinas() {
        return Limosinas;
    }

    public void setLimosinas(int Limosinas) {
        this.Limosinas = Limosinas;
    }

    public int getSalonesConf() {
        return salonesConf;
    }

    public void setSalonesConf(int salonesConf) {
        this.salonesConf = salonesConf;
    }

    public int getSuites() {
        return Suites;
    }

    public void setSuites(int suites) {
        this.Suites = suites;
    }
    
}
    


    

    
    
       

    
    


