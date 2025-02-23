package vista;

import controlador.GestorStands;
import controlador.GestorVisitantes;
import models.Comentario;
import models.Stand;
import models.Visitante;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;

public class InteraccionesPanel extends JPanel {
    private GestorVisitantes gestorVisitantes;
    private GestorStands gestorStands;
    private JComboBox<Visitante> cmbVisitantes;
    private JComboBox<Stand> cmbStands;
    private JTextArea txtComentario;
    private JSpinner spinnerCalificacion;
    private JTable tablaInteracciones;

    public InteraccionesPanel(GestorVisitantes gestorVisitantes, GestorStands gestorStands) {
        this.gestorVisitantes = gestorVisitantes;
        this.gestorStands = gestorStands;
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout(10, 10));

        // Panel de formulario
        JPanel formPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        cmbVisitantes = new JComboBox<>();
        cmbStands = new JComboBox<>();
        txtComentario = new JTextArea();
        spinnerCalificacion = new JSpinner(new SpinnerNumberModel(1, 1, 5, 1));

        formPanel.add(new JLabel("Visitante:"));
        formPanel.add(cmbVisitantes);
        formPanel.add(new JLabel("Stand:"));
        formPanel.add(cmbStands);
        formPanel.add(new JLabel("Comentario:"));
        formPanel.add(new JScrollPane(txtComentario));
        formPanel.add(new JLabel("Calificación:"));
        formPanel.add(spinnerCalificacion);

        // Botón
        JButton btnRegistrar = new JButton("Registrar Interacción");
        btnRegistrar.addActionListener(this::registrarInteraccion);

        // Tabla
        tablaInteracciones = new JTable();
        JScrollPane scrollPane = new JScrollPane(tablaInteracciones);

        add(formPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(btnRegistrar, BorderLayout.SOUTH);

        actualizarCombos();
    }

    private void registrarInteraccion(ActionEvent e) {
        Visitante visitante = (Visitante) cmbVisitantes.getSelectedItem();
        Stand stand = (Stand) cmbStands.getSelectedItem();
        String comentario = txtComentario.getText();
        int calificacion = (int) spinnerCalificacion.getValue();

        // Guardar en una lista global (crear un gestor de comentarios)
        Comentario nuevoComentario = new Comentario(visitante, stand, comentario, calificacion);
        // gestorComentarios.agregarComentario(nuevoComentario); // Implementar esto
        actualizarTabla();
    }

    private void actualizarCombos() {
        cmbVisitantes.removeAllItems();
        for (Visitante visitante : gestorVisitantes.getVisitantes()) {
            cmbVisitantes.addItem(visitante);
        }

        cmbStands.removeAllItems();
        for (Stand stand : gestorStands.getStands()) {
            cmbStands.addItem(stand);
        }
    }

    private void actualizarTabla() {
        // Implementar lógica para mostrar comentarios
    }
}