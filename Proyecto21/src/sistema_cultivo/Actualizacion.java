package sistema_cultivo;

public class Actualizacion {
    private int idActualizacion;
    private int idUsuario;
    private int idLote;
    private String fecha;
    private String descripcion;

    // Constructor
    public Actualizacion(int idActualizacion, int idUsuario, int idLote, String fecha, String descripcion) {
        this.idActualizacion = idActualizacion;
        this.idUsuario = idUsuario;
        this.idLote = idLote;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public int getIdActualizacion() {
        return idActualizacion;
    }

    public void setIdActualizacion(int idActualizacion) {
        this.idActualizacion = idActualizacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Actualizacion [idActualizacion=" + idActualizacion + ", idUsuario=" + idUsuario + 
               ", idLote=" + idLote + ", fecha=" + fecha + ", descripcion=" + descripcion + "]";
    }

    // Método main
    public static void main(String[] args) {
        Actualizacion actualizacion = new Actualizacion(1, 1, 1, "2024-10-24", "Actualización de características del lote");
        System.out.println(actualizacion);
    }
}

