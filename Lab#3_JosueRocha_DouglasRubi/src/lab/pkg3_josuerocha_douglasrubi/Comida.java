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
public class Comida extends Productos {
    
    private String tipo;
    private String vence;

    public Comida(String tipo, String vence) {
        this.tipo = tipo;
        this.vence = vence;
    }

    public Comida(String tipo, String vence, String descripcion, double precio, String nombre) {
        super(descripcion, precio, nombre);
        this.tipo = tipo;
        this.vence = vence;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVence() {
        return vence;
    }

    public void setVence(String vence) {
        this.vence = vence;
    }
    
    
    
}
