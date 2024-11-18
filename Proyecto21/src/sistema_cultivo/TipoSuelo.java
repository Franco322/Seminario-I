package sistema_cultivo;

public class TipoSuelo {
    private int idSuelo;
    private String nombre;
    private String textura;
    private double capacidadRetencion;
    private double ph;
    private double materiaOrganica;

    // Constructor
    public TipoSuelo(int idSuelo, String nombre, String textura, double capacidadRetencion, double ph, double materiaOrganica) {
        this.idSuelo = idSuelo;
        this.nombre = nombre;
        this.textura = textura;
        this.capacidadRetencion = capacidadRetencion;
        this.ph = ph;
        this.materiaOrganica = materiaOrganica;
    }

    // Getters y Setters
    public int getIdSuelo() {
        return idSuelo;
    }

    public void setIdSuelo(int idSuelo) {
        this.idSuelo = idSuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public double getCapacidadRetencion() {
        return capacidadRetencion;
    }

    public void setCapacidadRetencion(double capacidadRetencion) {
        this.capacidadRetencion = capacidadRetencion;
    }

    public double getPh() {
        return ph;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }

    public double getMateriaOrganica() {
        return materiaOrganica;
    }

    public void setMateriaOrganica(double materiaOrganica) {
        this.materiaOrganica = materiaOrganica;
    }

    @Override
    public String toString() {
        return "TipoSuelo [idSuelo=" + idSuelo + ", nombre=" + nombre + ", textura=" + textura +
               ", capacidadRetencion=" + capacidadRetencion + ", ph=" + ph + 
               ", materiaOrganica=" + materiaOrganica + "]";
    }

    // Método main para mostrar la funcionalidad
    public static void main(String[] args) {
        TipoSuelo suelo = new TipoSuelo(1, "Suelo Arcilloso", "Arcilla", 40.5, 6.8, 5.0);
        System.out.println(suelo);
    }
}

