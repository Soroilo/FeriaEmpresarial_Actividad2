package vista;

import controlador.GestorVisitantes;
import models.Visitante;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class VisitantesPanel extends JPanel {
    private final GestorVisitantes gestor;
    private JTable tablaVisitantes;
    private JTextField txtNombre, txtIdentificacion, txtEmail;

    public VisitantesPanel(GestorVisitantes gestor) {
        this.gestor = gestor;
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout(10, 10));

        // Formulario
        JPanel formPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        txtNombre = new JTextField();
        txtIdentificacion = new JTextField();
        txtEmail = new JTextField();

        formPanel.add(new JLabel("Nombre:"));
        formPanel.add(txtNombre);
        formPanel.add(new JLabel("Identificación:"));
        formPanel.add(txtIdentificacion);
        formPanel.add(new JLabel("Email:"));
        formPanel.add(txtEmail);

        // Botón
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(this::guardarVisitante);

        // Tabla
        tablaVisitantes = new JTable();
        JScrollPane scrollPane = new JScrollPane(tablaVisitantes);

        add(formPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(btnGuardar, BorderLayout.SOUTH);

        actualizarTabla();
    }

    private void guardarVisitante() {
        Visitante visitante = new Visitante(
            txtNombre.getText(),
            txtIdentificacion.getText(),
            txtEmail.getText()
        );
        gestor.agregarVisitante(visitante);
        actualizarTabla();
    }

    private void actualizarTabla() {
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Nombre", "Identificación", "Email"}, 0);
        for (Visitante visitante : gestor.getVisitantes()) {
            model.addRow(new Object[]{visitante.getNombre(), visitante.getIdentificacion(), visitante.getEmail()});
        }
        tablaVisitantes.setModel(model);
    }
}