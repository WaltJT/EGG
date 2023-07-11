package eje6;

public abstract class Alojamiento {
    
    protected String nombre;
    protected String direccion;
    protected String localidad;
    protected String gerente;
    protected Integer value;
    
    
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
        "Chiquito"};
        
        aux = aux.concat(nombres[(int)(Math.random()*14)]);
        return aux;
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

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
