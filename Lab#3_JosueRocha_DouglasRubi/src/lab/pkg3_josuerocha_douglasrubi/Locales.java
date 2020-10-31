 
package lab.pkg3_josuerocha_douglasrubi;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Locales {
    
    private String nombre;
    private ArrayList empleados;
    private ArrayList productos;
    private String gerente;

    public Locales() {
    }

    public Locales(String nombre, ArrayList<Empleados> empleados, ArrayList<Productos> productos, String gerente) {
        this.nombre = nombre;
        this.empleados = empleados;
        this.productos = productos;
        this.gerente = gerente;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleados> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleados> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Locales[" + "Nombre=" + nombre + "\n Productos=" + productos + "\n gerente=" + gerente + "]";
    }
    
    
    
    

     
    
    
}
