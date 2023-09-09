package eje4;

public abstract class Barco {
    
    protected String matricula;
    protected int eslora;
    protected int anioFab;
    
    public Barco() {
    }
    
    public void crearBarco(){
        crearMatricula();
        crearAnio();
    }
    
    public void info(){
        System.out.println("matricula: " + matricula);
        System.out.println("largo del eslora: " + eslora + " metros.");
        System.out.println("año fabricado: " + anioFab);
    }
    
    public int precioFinal(int a){
        return 0;
    }
    
    public void crearMatricula(){
        
        String aux = "";
        
        for (int i = 0; i < 6; i++) {
            var rand = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            rand = String.valueOf(rand.charAt((int)(Math.random()*35)));
            aux = aux.concat(rand);
        }
        
        matricula = aux;
    }
    
    public void crearEslora(){
    }
    
    public void crearAnio(){
        
        int aux = (int)(Math.random()*123);
        aux = Math.max(60, aux);
        anioFab = aux + 1900;
        
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(int anioFab) {
        this.anioFab = anioFab;
    }
    
    
}
