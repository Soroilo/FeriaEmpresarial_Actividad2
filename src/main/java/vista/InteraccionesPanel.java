package vista;

import controlador.GestorStands;
import controlador.GestorVisitantes;
import javax.swing.*;
import java.awt.*;

public class InteraccionesPanel extends JPanel {
    public InteraccionesPanel(GestorVisitantes gestorVisitantes, GestorStands gestorStands) {
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout(10, 10));

        // Panel superior (combos y calificación)
        JPanel topPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        JComboBox<String> cmbVisitantes = new JComboBox<>();
        JComboBox<String> cmbStands = new JComboBox<>();
        JSpinner spinnerCalificacion = new JSpinner(new SpinnerNumberModel(1, 1, 5, 1));
        JTextArea txtComentario = new JTextArea(3, 20);

        topPanel.add(new JLabel("Visitante:"));
        topPanel.add(cmbVisitantes);
        topPanel.add(new JLabel("Stand:"));
        topPanel.add(cmbStands);
        topPanel.add(new JLabel("Calificación:"));
        topPanel.add(spinnerCalificacion);
        topPanel.add(new JLabel("Comentario:"));
        topPanel.add(new JScrollPane(txtComentario));

        // Botón "Registrar"
        JButton btnRegistrar = new JButton("Registrar Interacción");
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        btnPanel.add(btnRegistrar);

        add(topPanel, BorderLayout.NORTH);
        add(btnPanel, BorderLayout.SOUTH);
    }
}