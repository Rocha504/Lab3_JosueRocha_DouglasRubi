 
package lab.pkg3_josuerocha_douglasrubi;

/**
 *
 * @author josue
 */
public class Juguetes extends Productos {
    
    private String descripcion1;

    public Juguetes() {
    }

    public Juguetes(String descripcion1) {
        this.descripcion1 = descripcion1;
    }

    public Juguetes(String descripcion, String descripcion1, double precio, String nombre) {
        super(descripcion, precio, nombre);
        this.descripcion1 = descripcion1;
    }

    public String getDescripcion1() {
        return descripcion1;
    }

    public void setDescripcion1(String descripcion1) {
        this.descripcion1 = descripcion1;
    }
    

    
    
     
    
    
}
