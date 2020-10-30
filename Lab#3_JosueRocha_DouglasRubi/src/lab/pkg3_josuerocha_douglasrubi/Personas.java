 
package lab.pkg3_josuerocha_douglasrubi;

/**
 *
 * @author josue
 */
public class Personas {
    
    private String id;
    private String username;
    private String password;
    private String correo;
    private String nombre;

    public Personas() {
    }

    public Personas(String id, String username, String password, String correo, String nombre) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.correo = correo;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
