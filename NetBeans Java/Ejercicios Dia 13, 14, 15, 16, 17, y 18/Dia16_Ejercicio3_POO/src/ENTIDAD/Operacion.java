/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ENTIDAD;

public class Operacion {

 int A;
 int B;
    
    public Operacion(int a, int b){
        
        A=a;
        B=b;
    
    }
    
    public int SUMA(){
    
        int resultado=0;
        resultado=this.A+this.B;
        return resultado;
    
    }
    
    public int RESTA(){
    
        int resultado=0;
        resultado=this.A-this.B;
        return resultado;
    
    }
    
    public int MULTIPLICACION(){
    
        int resultado=0;
        resultado=this.A*this.B;
        return resultado;
    
    }
    
    public int DIVISION(){
    
        int resultado=0;
        resultado=this.A/this.B;
        return resultado;
        
    }
   
    
}
