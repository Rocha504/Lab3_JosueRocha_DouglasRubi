 
package lab.pkg3_josuerocha_douglasrubi;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Clientes extends Personas {
    
    private double dinero;
    private ArrayList<Productos> carrito;

    public Clientes(double dinero, ArrayList<Productos> carrito) {
        this.dinero = dinero;
        this.carrito = carrito;
    }

    public Clientes(double dinero, ArrayList<Productos> carrito, String id, String username, String password, String correo, String nombre) {
        super(id, username, password, correo, nombre);
        this.dinero = dinero;
        this.carrito = carrito;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Productos> getCarrito() {
        return carrito;
    }

    public void setCarrito(ArrayList<Productos> carrito) {
        this.carrito = carrito;
    }
    
    
    
    
}
