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
encargado del lugar. La compañía trabaja con dos tipos de alojamientos: Hotel 
y Alojamientos Extrahoteleros.
 Los Hotel tienen como atributos: Cantidad de Habitaciones, Número de Camas, 
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

/*****************************************************************************/

/*Los Hotel tienen como atributos: Cantidad de Habitaciones, Número de Camas, 
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
restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas).*/

public class Hotel extends Alojamiento{
    
    protected int cantHabitaciones;
    protected int numCamas;
    protected int cantPisos;
    protected int precioHabitacion;

    public Hotel(int cantHabitaciones, int numCamas, int cantPisos, int precioHabitacion, String nombrehotel, String direccion, String localidad, String gerente, String encargado) {
        super(nombrehotel, direccion, localidad, gerente, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.numCamas = numCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

     @Override
    public void info() {
        super.info();
        System.out.println("Cantidad de habitaciones: " + cantHabitaciones);
        System.out.println("Numero de camas por habitacion: " + numCamas);
        System.out.println("Pisos totales: " + cantPisos);
        System.out.println("Precio de hospedaje: $" + precioHabitacion);
    }
    
    public void crearHotel(){
        crearAlojamiento();
        cantHabitaciones = (int)(Math.random()*30);
        cantHabitaciones += 20;
        numCamas = (int)(Math.random()*3);
        numCamas += 1;
        cantPisos = (int)(Math.random()*10);
        cantPisos += 5;
    }
    
    public void precioHabitacion(){
        precioHabitacion = 50;
        precioHabitacion += numCamas*cantPisos*cantHabitaciones;
    }
    
    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getNumCamas() {
        return numCamas;
    }

    public void setNumCamas(int numCamas) {
        this.numCamas = numCamas;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    public int getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(int precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }
    
     private double calcularPrecioHabitaciones() {
     double precio = 50 + (1 * cantHabitaciones);
     
// Valor agregado por el restaurante

    if (this instanceof Hotel4Estrellas) {
            if (((Hotel4Estrellas) this).getCapacidadRestaurante() < 30) {
                precio += 10;
            } else if (((Hotel4Estrellas) this).getCapacidadRestaurante() >= 30 &&
                    ((Hotel4Estrellas) this).getCapacidadRestaurante() <= 50) {
                precio += 30;
            } else {
                precio += 50;
            }
        } else if (this instanceof Hotel5Estrellas) {
            if (((Hotel5Estrellas) this).getCapacidadRestaurante() < 30) {
                precio += 10;
            } else if (((Hotel5Estrellas) this).getCapacidadRestaurante() >= 30 &&
                    ((Hotel5Estrellas) this).getCapacidadRestaurante() <= 50) {
                precio += 30;
            } else {
                precio += 50;
            }
        }

        // Valor agregado por el gimnasio
        if (this instanceof Hotel4Estrellas && ((Hotel4Estrellas) this).getGimnasio().equals("A")) {
            precio += 50;
        } else if (this instanceof Hotel4Estrellas && ((Hotel4Estrellas) this).getGimnasio().equals("B")) {
            precio += 30;
        } else if (this instanceof Hotel5Estrellas && ((Hotel5Estrellas) this).getGimnasio().equals("A")) {
            precio += 50;
        } else if (this instanceof Hotel5Estrellas && ((Hotel5Estrellas) this).getGimnasio().equals("B")) {
            precio += 30;
        }

        // Valor agregado por las limosinas
        if (this instanceof Hotel5Estrellas) {
            precio += 15 * ((Hotel5Estrellas) this).getLimosinas();
     
        }

        return precio;

     }

}


