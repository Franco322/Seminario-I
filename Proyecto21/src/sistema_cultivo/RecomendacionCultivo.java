package sistema_cultivo;

public class RecomendacionCultivo {
    private int idRecomendacion;
    private int idLote;
    private int idCultivo;
    private double viabilidad;

    // Constructor
    public RecomendacionCultivo(int idRecomendacion, int idLote, int idCultivo, double viabilidad) {
        this.idRecomendacion = idRecomendacion;
        this.idLote = idLote;
        this.idCultivo = idCultivo;
        this.viabilidad = viabilidad;
    }

    // Getters y Setters
    public int getIdRecomendacion() {
        return idRecomendacion;
    }

    public void setIdRecomendacion(int idRecomendacion) {
        this.idRecomendacion = idRecomendacion;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public int getIdCultivo() {
        return idCultivo;
    }

    public void setIdCultivo(int idCultivo) {
        this.idCultivo = idCultivo;
    }

    public double getViabilidad() {
        return viabilidad;
    }

    public void setViabilidad(double viabilidad) {
        this.viabilidad = viabilidad;
    }

    @Override
    public String toString() {
        return "RecomendacionCultivo [idRecomendacion=" + idRecomendacion + ", idLote=" + idLote + 
               ", idCultivo=" + idCultivo + ", viabilidad=" + viabilidad + "]";
    }

    // Método main
    public static void main(String[] args) {
        RecomendacionCultivo recomendacion = new RecomendacionCultivo(1, 1, 1, 85.5);
        System.out.println(recomendacion);
    }
}

