/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

/*
EJERCICIO 6 GUIA 10

 Se necesita una aplicación para una tienda en la cual queremos almacenar los 
distintos productos que venderemos y el precio que tendrán. Además, se necesita 
que la aplicación cuente con las funciones básicas.
 Estas las realizaremos en el servicio. Como, introducir un elemento, modificar 
su precio,eliminar un producto y mostrar los productos que tenemos con su precio 
(Utilizar Hashmap). El HashMap tendrá de llave el nombre del producto y de valor
el precio.
 Realizar un menú para lograr todas las acciones previamente mencionadas.

*/

public class Aplicacion {
    
    private final String aplicacion;

    public Aplicacion(String aplicacion) {
        this.aplicacion = aplicacion;
    }

    public String getAplicacion() {
        return aplicacion;
    }

    @Override
    public String toString() {
        return "Aplicacion{" + "aplicacion=" + aplicacion + '}';
    }
    
}
