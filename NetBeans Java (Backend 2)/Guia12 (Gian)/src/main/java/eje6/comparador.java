
package eje6;

import java.util.Comparator;

public class comparador{

    public static Comparator<Alojamiento> ordenar = new Comparator<Alojamiento>() {
        @Override
        public int compare(Alojamiento o1, Alojamiento o2) {
            return o1.getValue().compareTo(o2.getValue());
        }
    };
    
    
}
