package vista;

import controlador.GestorEmpresas;
import models.Empresa;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class EmpresasPanel extends JPanel {
    private final GestorEmpresas gestor;
    private JTable tablaEmpresas;
    private JTextField txtNombre, txtSector, txtEmail;

    public EmpresasPanel(GestorEmpresas gestor) {
        this.gestor = gestor;
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout(10, 10));

        // Panel de formulario (arriba)
        JPanel formPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        txtNombre = new JTextField();
        txtSector = new JTextField();
        txtEmail = new JTextField();

        formPanel.add(new JLabel("Nombre:"));
        formPanel.add(txtNombre);
        formPanel.add(new JLabel("Sector:"));
        formPanel.add(txtSector);
        formPanel.add(new JLabel("Email:"));
        formPanel.add(txtEmail);

        // Panel de botones (sur)
        JPanel btnPanel = new JPanel(new FlowLayout());
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(this::guardarEmpresa);

        btnPanel.add(btnGuardar);

        // Tabla de empresas (centro)
        tablaEmpresas = new JTable();
        JScrollPane scrollPane = new JScrollPane(tablaEmpresas);

        // Agregar componentes al panel principal
        add(formPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(btnPanel, BorderLayout.SOUTH);

        actualizarTabla();
    }

    private void guardarEmpresa() {
        if (txtNombre.getText().isEmpty() || txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nombre y email son obligatorios");
            return;
        }

        Empresa empresa = new Empresa(
            txtNombre.getText(),
            txtSector.getText(),
            txtEmail.getText()
        );
        gestor.agregarEmpresa(empresa);
        actualizarTabla();
        limpiarCampos();
    }

    private void actualizarTabla() {
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Nombre", "Sector", "Email"}, 0);
        for (Empresa empresa : gestor.getEmpresas()) {
            model.addRow(new Object[]{empresa.getNombre(), empresa.getSector(), empresa.getEmail()});
        }
        tablaEmpresas.setModel(model);
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtSector.setText("");
        txtEmail.setText("");
    }
}