package sistema_cultivo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioService {
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_cultivo"; 
    private static final String USER = "root";
    private static final String PASSWORD = "Fr4nc@1q7q"; //

 // Método para cargar todos los usuarios desde la base de datos
    public List<Usuario> cargarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT id_usuario, nombre_usuario, contrasena, rol, correo_electronico FROM usuario";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int idUsuario = resultSet.getInt("id_usuario");
                String nombreUsuario = resultSet.getString("nombre_usuario");
                String contrasena = resultSet.getString("contrasena");
                String rol = resultSet.getString("rol");
                String correoElectronico = resultSet.getString("correo_electronico");

                Usuario usuario = new Usuario(idUsuario, nombreUsuario, contrasena, rol, correoElectronico);
                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            System.err.println("Error al cargar los usuarios: " + e.getMessage());
        }

        return usuarios;
    }
}

