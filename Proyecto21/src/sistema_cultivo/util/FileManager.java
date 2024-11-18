package sistema_cultivo.util;

import sistema_cultivo.models.Cultivo;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    private static final String FILE_NAME = "cultivos.txt";

    public static void saveToFile(List<Cultivo> cultivos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(cultivos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Cultivo> readFromFile() {
        List<Cultivo> cultivos = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            cultivos = (List<Cultivo>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return cultivos;
    }
}

