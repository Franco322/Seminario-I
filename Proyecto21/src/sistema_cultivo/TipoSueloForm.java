package sistema_cultivo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class TipoSueloForm extends JFrame {
    private JTextField nombreField;
    private JTextField texturaField;
    private JTextField capacidadRetencionField;
    private JTextField phField;
    private JTextField materiaOrganicaField;
    private JButton saveButton;

    private static final String URL = "jdbc:mysql://localhost:3306/sistema_cultivo";
    private static final String USER = "root";
    private static final String PASSWORD = "Fr4nc@1q7q";

    public TipoSueloForm() {
        setTitle("Formulario de Tipo de Suelo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear y configurar los componentes del formulario
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField();

        JLabel texturaLabel = new JLabel("Textura:");
        texturaField = new JTextField();

        JLabel capacidadRetencionLabel = new JLabel("Capacidad de Retención (%):");
        capacidadRetencionField = new JTextField();

        JLabel phLabel = new JLabel("pH:");
        phField = new JTextField();

        JLabel materiaOrganicaLabel = new JLabel("Materia Orgánica (%):");
        materiaOrganicaField = new JTextField();

        saveButton = new JButton("Guardar");

        // Agregar los componentes al panel
        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(texturaLabel);
        panel.add(texturaField);
        panel.add(capacidadRetencionLabel);
        panel.add(capacidadRetencionField);
        panel.add(phLabel);
        panel.add(phField);
        panel.add(materiaOrganicaLabel);
        panel.add(materiaOrganicaField);
        panel.add(new JLabel()); // Espacio vacío
        panel.add(saveButton);

        add(panel);

        // Acción del botón de guardar
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (agregarTipoSuelo()) {
                    JOptionPane.showMessageDialog(null, "Tipo de suelo guardado correctamente.");
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar el tipo de suelo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private boolean agregarTipoSuelo() {
        String sql = "INSERT INTO tipo_suelo (nombre, textura, capacidad_retencion, ph, materia_organica) VALUES (?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {
             
            // Asignar los valores de los campos al statement
            statement.setString(1, nombreField.getText());
            statement.setString(2, texturaField.getText());
            statement.setDouble(3, Double.parseDouble(capacidadRetencionField.getText()));
            statement.setDouble(4, Double.parseDouble(phField.getText()));
            statement.setDouble(5, Double.parseDouble(materiaOrganicaField.getText()));

            // Ejecutar la inserción
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;

        } catch (SQLException e) {
            System.err.println("Error al guardar en la base de datos: " + e.getMessage());
            return false;
        } catch (NumberFormatException e) {
            System.err.println("Error: Formato numérico inválido.");
            return false;
        }
    }

    // Método para limpiar los campos de entrada después de guardar
    private void limpiarCampos() {
        nombreField.setText("");
        texturaField.setText("");
        capacidadRetencionField.setText("");
        phField.setText("");
        materiaOrganicaField.setText("");
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return;
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TipoSueloForm().setVisible(true);
            }
        });
    }
}

