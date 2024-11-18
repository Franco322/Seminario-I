package sistema_cultivo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoteTierraService {
    // Método para agregar un nuevo lote de tierra
    public void agregarLote(LoteTierra lote) {
        String url = "jdbc:mysql://localhost:3306/sistema_cultivo"; // URL de conexión a la base de datos
        String usuario = "root"; // Usuario de la base de datos
        String contrasena = "Fr4nc@1q7q"; // Contraseña de la base de datos

        // Sentencia SQL para insertar un nuevo registro en la tabla lote_tierra
        String sql = "INSERT INTO lote_tierra (nombre, ubicacion, tamano, descripcion) VALUES (?, ?, ?, ?)";

        try (Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
             PreparedStatement statement = conexion.prepareStatement(sql)) {

            // Configuración de los parámetros de la consulta
            statement.setString(1, lote.getNombre());
            statement.setString(2, lote.getUbicacion());
            statement.setDouble(3, lote.getTamano());
            statement.setString(4, lote.getDescripcion());

            // Ejecución de la consulta
            int filasInsertadas = statement.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("El lote de tierra fue agregado exitosamente.");
            }
        } catch (SQLException e) {
            System.out.println("Error al agregar el lote de tierra: " + e.getMessage());
        }
    }

    // Método main para probar la funcionalidad
    public static void main(String[] args) {
        LoteTierra lote = new LoteTierra(0, "Lote C", "Ubicación Y", 100.0, "Gran lote que linda con el A");
        LoteTierraService servicio = new LoteTierraService();
        servicio.agregarLote(lote);
    }
}

