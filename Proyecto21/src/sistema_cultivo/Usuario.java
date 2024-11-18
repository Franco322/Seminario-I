package sistema_cultivo;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String email;
    private String password;
    private String rol;

    // Constructor
    public Usuario(int idUsuario, String nombre, String email, String password, String rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.rol = rol;
    }

    // Getters y Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", email=" + email + 
               ", rol=" + rol + "]";
    }

    // Método main para mostrar la funcionalidad
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "Lorena Banega", "banega.lorena@proyecto21.com", "lab629", "Administrador");
        System.out.println(usuario);
    }
}

