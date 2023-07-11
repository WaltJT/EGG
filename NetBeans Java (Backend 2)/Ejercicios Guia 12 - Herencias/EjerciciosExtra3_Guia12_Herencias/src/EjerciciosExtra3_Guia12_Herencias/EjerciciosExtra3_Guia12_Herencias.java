/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra3_Guia12_Herencias;

import Entidades.Servicios;

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

public class EjerciciosExtra3_Guia12_Herencias {

    public static void main(String[] args) {
    
    Servicios alojamiento = new Servicios();
    alojamiento.menu();       
        
  }
    
}
//
//    Hotel4Estrellas hotel1 = new Hotel4Estrellas("Hotel 1", "Dirección 1", "Localidad 1", "Gerente 1", 100, 200, 5, "A", "Restaurante 1", 40);
//    Hotel5Estrellas hotel2 = new Hotel5Estrellas("Hotel 2", "Dirección 2", "Localidad 2", "Gerente 2", 200, 400, 10, "B", "Restaurante 2", 60, 3);
//    Camping camping1 = new Camping("Camping 1", "Dirección 3", "Localidad 3", "Gerente 3",
//                false, 1000, 50, 20, true);
//    Camping camping2 = new Camping("Camping 2", "Dirección 4", "Localidad 4", "Gerente 4",
//                true, 1500, 100, 30, false);
//    Residencia residencia1 = new Residencia("Residencia 1", "Dirección 5", "Localidad 5", "Gerente 5",
//                true, 500, 10, true, true);
//    Residencia residencia2 = new Residencia("Residencia 2", "Dirección 6", "Localidad 6", "Gerente 6",
//                false, 800, 15, false, false);
//
//        // Agregar los alojamientos a una lista
//        List<Alojamiento> alojamientos = new ArrayList<>();
//        alojamientos.add(hotel1);
//        alojamientos.add(hotel2);
//        alojamientos.add(camping1);
//        alojamientos.add(camping2);
//        alojamientos.add(residencia1);
//        alojamientos.add(residencia2);
//
//        // Consulta: todos los alojamientos
//        System.out.println("Todos los alojamientos:");
//        for (Alojamiento alojamiento : alojamientos) {
//            System.out.println(alojamiento.getNombrehotel());
//        }
//
//        // Consulta: todos los hoteles de más caro a más barato
//        System.out.println("\nHoteles de más caro a más barato:");
//        List<Hotel> hoteles = new ArrayList<>();
//        for (Alojamiento alojamiento : alojamientos) {
//            if (alojamiento instanceof Hotel) {
//                hoteles.add((Hotel) alojamiento);
//            }
//        }
//        Collections.sort(hoteles, Comparator.comparingDouble(Hotel::getPrecioHabitacion).reversed());
//        for (Hotel hotel : hoteles) {
//            System.out.println(hotel.getNombrehotel()+ " - Precio: $" + hotel.getCantHabitaciones());
//        }
//
//        // Consulta: todos los campings con restaurante
//        System.out.println("\nCampings con restaurante:");
//        for (Alojamiento alojamiento : alojamientos) {
//            if (alojamiento instanceof Camping && ((Camping) alojamiento).isTieneRestaurante()) {
//                System.out.println(alojamiento.getNombrehotel());
//            }
//        }
//
//        // Consulta: todas las residencias que tienen descuento
//        System.out.println("\nResidencias con descuento:");
//        for (Alojamiento alojamiento : alojamientos) {
//            if (alojamiento instanceof Residencia && ((Residencia) alojamiento).isDescuentoGremios()) {
//                System.out.println(alojamiento.getNombrehotel());
//           
//            }
//        
//        }
//    
//    }
//
//}

