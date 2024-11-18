package sistema_cultivo.dao;

import sistema_cultivo.models.Cultivo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CultivoDAO {
    public List<Cultivo> getAllCultivos() {
        List<Cultivo> cultivos = new ArrayList<>();
        String sql = "SELECT * FROM cultivo";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                cultivos.add(new Cultivo(
                        rs.getInt("idCultivo"),
                        rs.getString("nombre"),
                        rs.getString("tipo"),
                        rs.getDouble("temperaturaOptima"),
                        rs.getDouble("humedadOptima"),
                        rs.getDouble("phOptimo"),
                        rs.getDouble("rendimientoEsperado")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cultivos;
    }

    public boolean insertCultivo(Cultivo cultivo) {
        String sql = "INSERT INTO cultivo (nombre, tipo, temperatura_optima, humedad_optima, ph_optimo, rendimiento_esperado) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cultivo.getNombre());
            pstmt.setString(2, cultivo.getTipo());
            pstmt.setDouble(3, cultivo.getTemperaturaOptima());
            pstmt.setDouble(4, cultivo.getHumedadOptima());
            pstmt.setDouble(5, cultivo.getPhOptimo());
            pstmt.setDouble(6, cultivo.getRendimientoEsperado());
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}


