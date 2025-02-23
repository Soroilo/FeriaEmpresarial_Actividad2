package vista;

import controlador.GestorVisitantes;
import javax.swing.*;
import java.awt.*;

public class VisitantesPanel extends JPanel {
    public VisitantesPanel(GestorVisitantes gestorVisitantes) {
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));

        // Formulario con GridBagLayout (para mayor control)
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Márgenes

        JTextField txtNombre = new JTextField(20);
        JTextField txtIdentificacion = new JTextField(15);
        JTextField txtEmail = new JTextField(20);

        // Primera fila
        gbc.gridx = 0; gbc.gridy = 0;
        formPanel.add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1;
        formPanel.add(txtNombre, gbc);

        // Segunda fila
        gbc.gridx = 0; gbc.gridy = 1;
        formPanel.add(new JLabel("Identificación:"), gbc);
        gbc.gridx = 1;
        formPanel.add(txtIdentificacion, gbc);

        // Tercera fila
        gbc.gridx = 0; gbc.gridy = 2;
        formPanel.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        formPanel.add(txtEmail, gbc);

        // Botón "Guardar"
        JButton btnGuardar = new JButton("Guardar Visitante");
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        formPanel.add(btnGuardar, gbc);

        // Tabla de visitantes
        JTable tablaVisitantes = new JTable();
        JScrollPane scrollPane = new JScrollPane(tablaVisitantes);

        add(formPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }
}