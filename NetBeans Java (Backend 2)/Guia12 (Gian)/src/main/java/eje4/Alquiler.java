
package eje4;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Alquiler {
    
    private String nombre;
    private String dni;
    private Calendar fechaAlquiler;
    private Calendar fechaDevolucion;
    private Barco barco;

    private final Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    
    public Alquiler() {
        
        System.out.println("introduzca su nombre");
        nombre = scan.next();
        System.out.println("introduzca DNI");
        dni = scan.next();
        System.out.println("ingrese fecha del alquiler(AÑO,MES,DIA)");
        fechaAlquiler = new GregorianCalendar(scan.nextInt(),scan.nextInt(),scan.nextInt());
        System.out.println("ingrese fecha de devolucion(AÑO,MES,DIA)");
        fechaDevolucion = new GregorianCalendar(scan.nextInt(),scan.nextInt(),scan.nextInt());
        
        boolean choosed = false;
        while(choosed==false){
        OUTER:
        do{
        System.out.println("que barco quisieras usar?");
        System.out.println("1. Velero");
        System.out.println("2. Motorizado");
        System.out.println("3. Yate");
        switch(scan.nextInt()){
            
            case 1:
                barco = new bVelero();
                break OUTER;
            case 2:
                barco = new bMotor();
                break OUTER;
            case 3:
                barco = new bYate();
                break OUTER;
            default:
                System.out.println("respuesta no valida, intente denuevo");
        }
        }while(true);
        
        barco.crearBarco();
        
        System.out.println("desea este barco?");
        
        barco.info();
        
        System.out.println("s/n");
        
        boolean aux = scan.next().equalsIgnoreCase("s");
        
        if(aux){
            choosed=true;
        }
        else{
            System.out.println("se lo tomara como un no");
        }
        }
    }
    
    public void precioFinal(){
        
        long aux =fechaDevolucion.getTimeInMillis() - fechaAlquiler.getTimeInMillis();
        
        int dias = (int)(aux / 86400000);
        System.out.println(dias);
        
        int precio = (barco.getEslora()*10) * dias;
        
        precio = barco.precioFinal(precio);
        
        System.out.println("EL PRECIO FINAL DEL ALQUILER ES DE: ");
        System.out.println(precio);
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Calendar getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Calendar fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public Calendar getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Calendar fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", dni=" + dni + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", barco=" + barco + ", scan=" + scan + '}';
    }
    
    
}
