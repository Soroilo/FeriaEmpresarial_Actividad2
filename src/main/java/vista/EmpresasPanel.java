package vista;

import controlador.GestorEmpresas;
import javax.swing.*;
import java.awt.*;

public class EmpresasPanel extends JPanel {
    public EmpresasPanel(GestorEmpresas gestorEmpresas) {
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10)); // Layout principal
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Márgenes externos

        // Componentes
        JPanel formPanel = new JPanel(new GridLayout(3, 2, 5, 5)); // 3 filas, 2 columnas
        JTextField txtNombre = new JTextField();
        JTextField txtSector = new JTextField();
        JTextField txtEmail = new JTextField();
        JButton btnGuardar = new JButton("Guardar");
        JTable tablaEmpresas = new JTable();
        JScrollPane scrollPane = new JScrollPane(tablaEmpresas);

        // Agregar componentes al formulario
        formPanel.add(new JLabel("Nombre:"));
        formPanel.add(txtNombre);
        formPanel.add(new JLabel("Sector:"));
        formPanel.add(txtSector);
        formPanel.add(new JLabel("Email:"));
        formPanel.add(txtEmail);

        // Panel de botones
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnPanel.add(btnGuardar);

        // Agregar todo al panel principal
        add(formPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
    }
}