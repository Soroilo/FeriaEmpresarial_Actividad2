package vista;

import controlador.GestorEmpresas;
import controlador.GestorStands;
import models.Stand;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class StandsPanel extends JPanel {
    private final GestorStands gestor;
    private final GestorEmpresas gestorEmpresas;
    private JTable tablaStands;
    private JTextField txtNumero, txtUbicacion;
    private JComboBox<String> cmbTamaño, cmbEmpresas;

    public StandsPanel(GestorStands gestor, GestorEmpresas gestorEmpresas) {
        this.gestor = gestor;
        this.gestorEmpresas = gestorEmpresas;
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout(10, 10));

        // Panel de formulario
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        txtNumero = new JTextField();
        txtUbicacion = new JTextField();
        cmbTamaño = new JComboBox<>(new String[]{"pequeño", "mediano", "grande"});
        cmbEmpresas = new JComboBox<>();

        formPanel.add(new JLabel("Número:"));
        formPanel.add(txtNumero);
        formPanel.add(new JLabel("Ubicación:"));
        formPanel.add(txtUbicacion);
        formPanel.add(new JLabel("Tamaño:"));
        formPanel.add(cmbTamaño);
        formPanel.add(new JLabel("Empresa:"));
        formPanel.add(cmbEmpresas);

        // Botones
        JButton btnCrearStand = new JButton("Crear Stand");
        btnCrearStand.addActionListener(this::crearStand);

        // Tabla
        tablaStands = new JTable();
        JScrollPane scrollPane = new JScrollPane(tablaStands);

        add(formPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(btnCrearStand, BorderLayout.SOUTH);

        actualizarCombos();
        actualizarTabla();
    }

    private void crearStand() {
        int numero = Integer.parseInt(txtNumero.getText());
        String ubicacion = txtUbicacion.getText();
        String tamaño = cmbTamaño.getSelectedItem().toString();

        Stand stand = new Stand(numero, ubicacion, tamaño);
        gestor.agregarStand(stand);
        actualizarTabla();
    }

    private void actualizarCombos() {
        cmbEmpresas.removeAllItems();
        for (Empresa empresa : gestorEmpresas.getEmpresas()) {
            cmbEmpresas.addItem(empresa.getNombre());
        }
    }

    private void actualizarTabla() {
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Número", "Ubicación", "Tamaño", "Empresa"}, 0);
        for (Stand stand : gestor.getStands()) {
            String empresa = (stand.getEmpresaAsignada() != null) ? stand.getEmpresaAsignada().getNombre() : "Libre";
            model.addRow(new Object[]{stand.getNumero(), stand.getUbicacion(), stand.getTamaño(), empresa});
        }
        tablaStands.setModel(model);
    }
}