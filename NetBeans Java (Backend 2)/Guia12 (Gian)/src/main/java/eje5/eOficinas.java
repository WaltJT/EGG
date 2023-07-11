
package eje5;


public class eOficinas extends Edificio {
    
    private int numDeOficinas;
    private int cantPersonasPorOficina;
    private int numeroDePisos;

    public eOficinas() {
        System.out.println("numero de oficinas por oficina");
        numDeOficinas = scan.nextInt();
        System.out.println("cantidad de personas que entran por planta");
        cantPersonasPorOficina = scan.nextInt();
        System.out.println("cantidad de pisos");
        numeroDePisos = scan.nextInt();
    }
    
    public void cantPersonas(){
        System.out.println("la cantidad de personas que entran en el edificio es: " + (numDeOficinas * cantPersonasPorOficina * numeroDePisos));
    }
    
    public int getNumDeOficinas() {
        return numDeOficinas;
    }

    public void setNumDeOficinas(int numDeOficinas) {
        this.numDeOficinas = numDeOficinas;
    }

    public int getCantPersonasPorOficina() {
        return cantPersonasPorOficina;
    }

    public void setCantPersonasPorOficina(int cantPersonasPorOficina) {
        this.cantPersonasPorOficina = cantPersonasPorOficina;
    }

    public int getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(int numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }
    
    
    
}
