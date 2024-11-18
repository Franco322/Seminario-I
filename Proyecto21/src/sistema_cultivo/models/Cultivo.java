package sistema_cultivo.models;

public class Cultivo {
    private int idCultivo;
    private String nombre;
    private String tipo;
    private double temperaturaOptima;
    private double humedadOptima;
    private double phOptimo;
    private double rendimientoEsperado;

    public Cultivo(int idCultivo, String nombre, String tipo, double temperaturaOptima, double humedadOptima, double phOptimo, double rendimientoEsperado) {
        this.idCultivo = idCultivo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.temperaturaOptima = temperaturaOptima;
        this.humedadOptima = humedadOptima;
        this.phOptimo = phOptimo;
        this.rendimientoEsperado = rendimientoEsperado;
    }

    // Getters y Setters
    public int getIdCultivo() { return idCultivo; }
    public void setIdCultivo(int idCultivo) { this.idCultivo = idCultivo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public double getTemperaturaOptima() { return temperaturaOptima; }
    public void setTemperaturaOptima(double temperaturaOptima) { this.temperaturaOptima = temperaturaOptima; }
    public double getHumedadOptima() { return humedadOptima; }
    public void setHumedadOptima(double humedadOptima) { this.humedadOptima = humedadOptima; }
    public double getPhOptimo() { return phOptimo; }
    public void setPhOptimo(double phOptimo) { this.phOptimo = phOptimo; }
    public double getRendimientoEsperado() { return rendimientoEsperado; }
    public void setRendimientoEsperado(double rendimientoEsperado) { this.rendimientoEsperado = rendimientoEsperado; }

    @Override
    public String toString() {
        return "Cultivo [idCultivo=" + idCultivo + ", nombre=" + nombre + ", tipo=" + tipo +
                ", temperaturaOptima=" + temperaturaOptima + ", humedadOptima=" + humedadOptima +
                ", phOptimo=" + phOptimo + ", rendimientoEsperado=" + rendimientoEsperado + "]";
    }
}

