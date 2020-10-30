 
package lab.pkg3_josuerocha_douglasrubi;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Restaurantes extends Locales{

   private Productos platillo;

    public Restaurantes() {
    }

    public Restaurantes(Productos platillo) {
        this.platillo = platillo;
    }

    public Restaurantes(Productos platillo, String nombre, ArrayList<Empleados> empleados, ArrayList<Productos> productos, String gerente) {
        super(nombre, empleados, productos, gerente);
        this.platillo = platillo;
    }
   
   
    
    
    
}
