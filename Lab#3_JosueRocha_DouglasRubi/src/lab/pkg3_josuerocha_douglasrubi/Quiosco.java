
package lab.pkg3_josuerocha_douglasrubi;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Quiosco extends Locales {
    
    private String nombre1;

    public Quiosco() {
    }

    public Quiosco(String nombre) {
        this.nombre1 = nombre;
    }

    public Quiosco(String nombre, String nombre1, ArrayList<Empleados> empleados, ArrayList<Productos> productos, String gerente) {
        super(nombre, empleados, productos, gerente);
        this.nombre1 = nombre;
    }
    
    

    
    
    
}
