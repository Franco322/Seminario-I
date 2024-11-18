package sistema_cultivo;


import javax.swing.*;
import java.awt.*;

public class RecomendacionCultivoVentana {
    public static void main(String[] args) {
        // Crear una instancia de RecomendacionCultivo
        RecomendacionCultivo recomendacion = new RecomendacionCultivo(1, 1, 1, 85.5);

        // Crear la ventana principal
        JFrame frame = new JFrame("Recomendación de Cultivo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        // Crear un panel para mostrar los datos
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        // Etiquetas y valores
        panel.add(new JLabel("ID Recomendación:"));
        panel.add(new JLabel(String.valueOf(recomendacion.getIdRecomendacion())));

        panel.add(new JLabel("ID Lote:"));
        panel.add(new JLabel(String.valueOf(recomendacion.getIdLote())));

        panel.add(new JLabel("ID Cultivo:"));
        panel.add(new JLabel(String.valueOf(recomendacion.getIdCultivo())));

        panel.add(new JLabel("Viabilidad:"));
        panel.add(new JLabel(String.format("%.2f%%", recomendacion.getViabilidad())));

        // Agregar el panel a la ventana
        frame.add(panel, BorderLayout.CENTER);

        // Mostrar la ventana
        frame.setVisible(true);
    }
}

