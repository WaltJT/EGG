/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author gianl
 */
public class Tienda {
    
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public void tienda(){
        
        HashMap<String,Integer> productos = new HashMap();
        
        OUTER:
        do{
            System.out.println("MENU DE ANTHONY BURGER");
            System.out.println("----------------------");
            System.out.println("1. AGREGAR UN PRODUCTO");
            System.out.println("2. ELIMINAR PRODUCTO");
            System.out.println("3. MODIFICAR PRECIO DEL PRODUCTO");
            System.out.println("4. MOSTRAR LISTA DE PRODUCTOS");
            System.out.println("5. SALIR");
            
            switch(scan.nextInt()){
                case 1:
                    productos.put(agregarProducto(), agregarPrecio());
                    break;
                case 2:
                    productos.remove(removerProducto(productos));
                    break;
                case 3:
                    modificarPrecio(productos);
                    break;
                case 4:
                    mostrar(productos);
                    break;
                case 5:
                    break OUTER;
                default:
                    System.out.println("respuesta no valida");
                    for (int i = 0; i < 20; i++) {
                        System.out.println("");
                    }
            }
            
            System.out.println("");
        }while(true);
    }
    
    public String agregarProducto(){
        System.out.println("que producto deseas agregar?");
        return (scan.next().toLowerCase());
    }
    
    public void modificarPrecio(HashMap<String,Integer> productos){
        System.out.println("que producto deseas modificar?");
        String producto = scan.next().toLowerCase();
        if(productos.containsKey(producto)){
            System.out.println("ingresa el nuevo precio");
            productos.replace(producto, scan.nextInt());
        }
        else{
            System.out.println("producto no encontrado");
        }
    }
    
    public int agregarPrecio(){
        System.out.println("cuanto vale el producto?");
        return scan.nextInt();
    }
    
    public String removerProducto(HashMap<String,Integer> productos){
        
        System.out.println("que producto deseas eliminar de la lista?");
        
        String resp = scan.next();
        
        if(productos.containsKey(resp.toLowerCase())){
            return resp;
        }
        else{
            System.out.println("producto no encontrado");
            return null;
        }
    }
    
    public void mostrar(HashMap<String,Integer> productos){
        System.out.println(productos);
    }
}

