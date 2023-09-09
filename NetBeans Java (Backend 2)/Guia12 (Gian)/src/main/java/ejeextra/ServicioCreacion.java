
package ejeextra;


public class ServicioCreacion {
    
    public int crearAnioFabricacion(){
        
        int anioFabricacion = (int)(Math.random()*70);
        anioFabricacion+=1950;
        return anioFabricacion;
    }
    
    public Combustibles crearCombustible(){
        int aux = (int)(Math.random()*5);
        switch(aux){
            case 0:
                return Combustibles.DIESEL;
            case 1:
                return Combustibles.ELECTRICIDAD;
            case 2:
                return Combustibles.GAS;
            case 3:
                return Combustibles.GASOIL;
            case 4:
                return Combustibles.NAFTA;
        }
        return null;
    }
    
    public String crearMatricula(){
        String aux = "";
        
        for (int i = 0; i < 6; i++) {
            var rand = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            rand = String.valueOf(rand.charAt((int)(Math.random()*35)));
            aux = aux.concat(rand);
        }
        
        return aux;
    }
    
    public Marca crearMarca(){
        
        int aux = (int)(Math.random()*6);
        switch(aux){
            case 0:
                return Marca.AUDI;
            case 1:
                return Marca.CHEVROLET;
            case 2:
                return Marca.FIAT;
            case 3:
                return Marca.FORD;
            case 4:
                return Marca.PEUGEOT;
            case 5:
                return Marca.VOLKSVAGEN;
        }
        return null;
    }
    
}
