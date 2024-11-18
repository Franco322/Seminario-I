package sistema_cultivo.app;

import sistema_cultivo.dao.CultivoDAO;
import sistema_cultivo.models.Cultivo;
import sistema_cultivo.util.FileManager;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        CultivoDAO cultivoDAO = new CultivoDAO();

        // Insertar un nuevo cultivo
        Cultivo cultivo = new Cultivo(0, "Manzano", "Frutal", 15.0, 55.0, 7.5, 15.0);
        cultivoDAO.insertCultivo(cultivo);

        // Leer todos los cultivos
        List<Cultivo> cultivos = cultivoDAO.getAllCultivos();
        cultivos.forEach(System.out::println);

        // Guardar en archivo
        FileManager.saveToFile(cultivos);

        // Leer desde archivo
        List<Cultivo> cultivosDesdeArchivo = FileManager.readFromFile();
        cultivosDesdeArchivo.forEach(System.out::println);
    }
}

