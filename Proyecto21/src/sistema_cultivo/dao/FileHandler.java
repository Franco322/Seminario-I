package sistema_cultivo.dao;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    public void saveToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

