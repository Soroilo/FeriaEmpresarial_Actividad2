package vista;

import controlador.GestorEmpresas;
import controlador.GestorStands;
import javax.swing.*;
import java.awt.*;

public class StandsPanel extends JPanel {
    public StandsPanel(GestorStands gestorStands, GestorEmpresas gestorEmpresas) {
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));

        // Panel de formulario (GridLayout)
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        JTextField txtNumero = new JTextField();
        JTextField txtUbicacion = new JTextField();
        JComboBox<String> cmbTamaño = new JComboBox<>(new String[]{"Pequeño", "Mediano", "Grande"});
        JComboBox<String> cmbEmpresas = new JComboBox<>();

        formPanel.add(new JLabel("Número:"));
        formPanel.add(txtNumero);
        formPanel.add(new JLabel("Ubicación:"));
        formPanel.add(txtUbicacion);
        formPanel.add(new JLabel("Tamaño:"));
        formPanel.add(cmbTamaño);
        formPanel.add(new JLabel("Empresa:"));
        formPanel.add(cmbEmpresas);

        // Tabla de stands
        JTable tablaStands = new JTable();
        JScrollPane scrollPane = new JScrollPane(tablaStands);

        // Botón "Asignar"
        JButton btnAsignar = new JButton("Asignar Empresa");
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnPanel.add(btnAsignar);

        add(formPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);
    }
}