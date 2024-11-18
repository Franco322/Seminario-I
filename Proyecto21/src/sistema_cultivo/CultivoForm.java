package sistema_cultivo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class CultivoForm extends JFrame {
    private JTextField nombreField;
    private JTextField tipoField;
    private JTextField temperaturaOptimaField;
    private JTextField humedadOptimaField;
    private JTextField phOptimoField;
    private JTextField rendimientoEsperadoField;
    private JButton saveButton;

    private static final String URL = "jdbc:mysql://localhost:3306/sistema_cultivo";
    private static final String USER = "root";
    private static final String PASSWORD = "Fr4nc@1q7q";

    public CultivoForm() {
        setTitle("Formulario de Cultivo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear y configurar los componentes del formulario
        JPanel panel = new JPanel(new GridLayout(7, 2, 10, 10));

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField();

        JLabel tipoLabel = new JLabel("Tipo:");
        tipoField = new JTextField();

        JLabel temperaturaOptimaLabel = new JLabel("Temperatura Óptima (°C):");
        temperaturaOptimaField = new JTextField();

        JLabel humedadOptimaLabel = new JLabel("Humedad Óptima (%):");
        humedadOptimaField = new JTextField();

        JLabel phOptimoLabel = new JLabel("pH Óptimo:");
        phOptimoField = new JTextField();

        JLabel rendimientoEsperadoLabel = new JLabel("Rendimiento Esperado (kg/ha):");
        rendimientoEsperadoField = new JTextField();

        saveButton = new JButton("Guardar");

        // Agregar los componentes al panel
        panel.add(nombreLabel);
        panel.add(nombreField);
        panel.add(tipoLabel);
        panel.add(tipoField);
        panel.add(temperaturaOptimaLabel);
        panel.add(temperaturaOptimaField);
        panel.add(humedadOptimaLabel);
        panel.add(humedadOptimaField);
        panel.add(phOptimoLabel);
        panel.add(phOptimoField);
        panel.add(rendimientoEsperadoLabel);
        panel.add(rendimientoEsperadoField);
        panel.add(new JLabel()); // Espacio
        panel.add(saveButton);

        add(panel);

        // Acción del botón de guardar
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (agregarCultivo()) {
                    JOptionPane.showMessageDialog(null, "Cultivo guardado correctamente.");
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar el cultivo.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private boolean agregarCultivo() {
        String sql = "INSERT INTO cultivo (nombre, tipo, temperatura_optima, humedad_optima, ph_optimo, rendimiento_esperado) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            // Asignar los valores de los campos al statement
            statement.setString(1, nombreField.getText());
            statement.setString(2, tipoField.getText());
            statement.setDouble(3, Double.parseDouble(temperaturaOptimaField.getText()));
            statement.setDouble(4, Double.parseDouble(humedadOptimaField.getText()));
            statement.setDouble(5, Double.parseDouble(phOptimoField.getText()));
            statement.setDouble(6, Double.parseDouble(rendimientoEsperadoField.getText()));

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
        tipoField.setText("");
        temperaturaOptimaField.setText("");
        humedadOptimaField.setText("");
        phOptimoField.setText("");
        rendimientoEsperadoField.setText("");
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
                new CultivoForm().setVisible(true);
            }
        });
    }
}

