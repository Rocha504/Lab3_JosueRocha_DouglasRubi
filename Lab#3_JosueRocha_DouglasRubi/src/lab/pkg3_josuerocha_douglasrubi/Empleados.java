 
package lab.pkg3_josuerocha_douglasrubi;

/**
 *
 * @author josue
 */
public class Empleados extends Personas{
    
    private String horario;
    private int ventas;

    public Empleados() {
    }

    public Empleados(String horario, int ventas) {
        this.horario = horario;
        this.ventas = ventas;
    }

    public Empleados(String horario, int ventas, String id, String username, String password, String correo, String nombre) {
        super(id, username, password, correo, nombre);
        this.horario = horario;
        this.ventas = ventas;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    
    
}
