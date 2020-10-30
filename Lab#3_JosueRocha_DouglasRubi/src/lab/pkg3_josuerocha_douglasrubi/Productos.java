 
package lab.pkg3_josuerocha_douglasrubi;

/**
 *
 * @author josue
 */
public class Productos {
    
    private String descripcion;
    private double precio;
    private String nombre;

    public Productos() {
    }

    public Productos(String descripcion, double precio, String nombre) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
