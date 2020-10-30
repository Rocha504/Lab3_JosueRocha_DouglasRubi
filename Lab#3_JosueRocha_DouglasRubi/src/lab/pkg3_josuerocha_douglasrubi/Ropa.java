/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg3_josuerocha_douglasrubi;

/**
 *
 * @author josue
 */
public class Ropa extends Productos{
    
    private String genero;
    private String talla;

    public Ropa(String genero, String talla) {
        this.genero = genero;
        this.talla = talla;
    }

    public Ropa(String genero, String talla, String descripcion, double precio, String nombre) {
        super(descripcion, precio, nombre);
        this.genero = genero;
        this.talla = talla;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
    
    
}
