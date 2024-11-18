package sistema_cultivo;

//Clase LoteTierra.java
public class LoteTierra {
 private int idLote;
 private String nombre;
 private String ubicacion;
 private double tamano;
 private String descripcion;

 // Constructor
 public LoteTierra(int idLote, String nombre, String ubicacion, double tamano, String descripcion) {
     this.idLote = idLote;
     this.nombre = nombre;
     this.ubicacion = ubicacion;
     this.tamano = tamano;
     this.descripcion = descripcion;
 }

 // Getters y Setters
 public int getIdLote() {
     return idLote;
 }

 public void setIdLote(int idLote) {
     this.idLote = idLote;
 }

 public String getNombre() {
     return nombre;
 }

 public void setNombre(String nombre) {
     this.nombre = nombre;
 }

 public String getUbicacion() {
     return ubicacion;
 }

 public void setUbicacion(String ubicacion) {
     this.ubicacion = ubicacion;
 }

 public double getTamano() {
     return tamano;
 }

 public void setTamano(double tamano) {
     this.tamano = tamano;
 }

 public String getDescripcion() {
     return descripcion;
 }

 public void setDescripcion(String descripcion) {
     this.descripcion = descripcion;
 }

 @Override
 public String toString() {
     return "LoteTierra{idLote=" + idLote + ", nombre='" + nombre + '\'' +
             ", ubicacion='" + ubicacion + '\'' + ", tamano=" + tamano +
             ", descripcion='" + descripcion + '\'' + '}';
 }
}

