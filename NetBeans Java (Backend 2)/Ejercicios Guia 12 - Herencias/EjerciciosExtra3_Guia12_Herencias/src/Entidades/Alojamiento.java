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

/*Una compañía de promociones turísticas desea mantener información sobre la 
infraestructura de alojamiento para turistas, de forma tal que los clientes 
puedan planear sus vacaciones de acuerdo con sus posibilidades. Los alojamientos 
se identifican por un nombre, una dirección, una localidad y un gerente 
encargado del lugar. La compañía trabaja con dos tipos de alojamientos: Hoteles 
y Alojamientos Extrahoteleros.*/

public class Alojamiento {
    
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;
    protected String encargado;
    protected Integer Value;
    
    public Alojamiento() {
    }

    public void info(){
        System.out.println("");
        System.out.println("----------");
        System.out.println("Nombre del hotel: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Localidad: " + localidad);
        System.out.println("Gerente encargado: " + gerente);
    }
    
    public void crearAlojamiento(){
        nombre = nombresRandom();
        direccion = direccionRandom();
        localidad = localidadRandom();
        gerente = gerenteRandom();
    }
    
    public String nombresRandom(){
        String aux = "";
        
        String[] articulos = {"El","La","Gran","Con","Tan","Sin"
        ,"En","Los","Las","Soy"};
        
        String[] nombres = {"Hotel","Residencia","Camping","Playa","Costa",
            "Valle","Montaña","Villa","Paraiso","Sendero","Cordillera","Entorno",
            "Altos","Bajos","Naturaleza","Natural"
        };
        
        aux = aux.concat(articulos[(int)(Math.random()*10)]);
        aux = aux.concat(" ");
        aux = aux.concat(nombres[(int)(Math.random()*16)]);
        return aux;
    }
    
    public String direccionRandom(){
        String aux = "";
        
        String[] direcciones = {"Avellaneda","Santa Fe","Sarmiento","Colon","Villa Elisa","Flores"
        ,"San Martin","Vaca Muerta","Las Heras","San Fierro","Los Santos"};
        
        aux = aux.concat(direcciones[(int)(Math.random()*10)]);
        aux = aux.concat(" ");
        aux = aux.concat(String.valueOf((int)(Math.random()*3000)));
        
        return aux;
        
    }
    
    public String localidadRandom(){
        
        String aux = "";
        
        String[] nombres = {"Santa Fe","Buenos Aires","Entre Rios","Corrientes","Misiones",
            "Jujuy","Salta","Tucuman","San Juan","Cordoba","Mendoza","San Luis",
            "Santiago del Estero","La Pampa","Neuquen","Chubut","La Rioja","Rio Negro",
            "Santa Cruz","Tierra Del Fuego"};
        
        aux = aux.concat(nombres[(int)(Math.random()*20)]);
        return aux;
    }
    
    public String gerenteRandom(){
        String aux = "";
        
        String[] nombres = {"Juan","Ezequiel","Gian","Oscar","Ramon","Milena",
        "Marcela","Ana","Jonatan","Pablo","Federico","Matias","Hernan",
        "Walter"};
        
        aux = aux.concat(nombres[(int)(Math.random()*14)]);
        return aux;
    }
    
    public String encargadoRandom(){
        String aux = "";
        
        String[] nombres = {"Juan","Ezequiel","Gian","Oscar","Ramon","Milena",
        "Marcela","Ana","Jonatan","Pablo","Federico","Matias","Hernan",
        "Walter"};
        
        aux = aux.concat(nombres[(int)(Math.random()*14)]);
        return aux;
    }
    
    public Alojamiento(String nombrehotel, String direccion, String localidad, String gerente, String encargado) {
        this.nombre = nombrehotel;
        this.direccion = direccion;
        this.localidad = localidad;
        this.gerente = gerente;
        this.encargado = encargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public Integer getValue() {
        return Value;
    }

    public void setValue(Integer Value) {
        this.Value = Value;
    }
        
}
 

