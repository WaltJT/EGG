/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia19_Ejercicio_VOID_POO;

/*
 Ejercicio void

* Crea un método void que reciba un objeto tipo persona como parámetro y 
* utilice el get para mostrar sus atributos. Llama ese método desde el main.

 */

import ENTIDAD.Persona;
import Dia19_Ejercicio_VOID_POO.Servicios.ServiciosPersona;

public class Dia19_Ejercicio_VOID_POO {

    public static void main(String[] args) {

        ServiciosPersona sp = new ServiciosPersona();
        
        Persona p1 = sp.crearPersona();
        
        sp.mostrarPersona(p1);
        
    }
    
}
