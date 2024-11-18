package sistema_cultivo;

public class LoteCaracteristicas {
    private int idCaracteristica;
    private int idLote;
    private int idSuelo;
    private String topografia;
    private String clima;

    // Constructor
    public LoteCaracteristicas(int idCaracteristica, int idLote, int idSuelo, String topografia, String clima) {
        this.idCaracteristica = idCaracteristica;
        this.idLote = idLote;
        this.idSuelo = idSuelo;
        this.topografia = topografia;
        this.clima = clima;
    }

    // Getters y Setters
    public int getIdCaracteristica() {
        return idCaracteristica;
    }

    public void setIdCaracteristica(int idCaracteristica) {
        this.idCaracteristica = idCaracteristica;
    }

    public int getIdLote() {
        return idLote;
    }

    public void setIdLote(int idLote) {
        this.idLote = idLote;
    }

    public int getIdSuelo() {
        return idSuelo;
    }

    public void setIdSuelo(int idSuelo) {
        this.idSuelo = idSuelo;
    }

    public String getTopografia() {
        return topografia;
    }

    public void setTopografia(String topografia) {
        this.topografia = topografia;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    @Override
    public String toString() {
        return "LoteCaracteristicas [idCaracteristica=" + idCaracteristica + ", idLote=" + idLote + 
               ", idSuelo=" + idSuelo + ", topografia=" + topografia + ", clima=" + clima + "]";
    }

    // Método main para mostrar la funcionalidad
    public static void main(String[] args) {
        LoteCaracteristicas caracteristica = new LoteCaracteristicas(1, 1, 1, "Llano", "Húmedo");
        System.out.println(caracteristica);
    }
}

