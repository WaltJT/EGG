/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Perro;
import java.util.ArrayList;

/**
 *
 * @author ruthe
 */
public class PerroService {
   
    private ArrayList<Perro> perros;

    public PerroService() {
        perros = new ArrayList<>();
    
    }

    public void agregarPerro(Perro perro) {
        perros.add(perro);
    
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    
    }

}

