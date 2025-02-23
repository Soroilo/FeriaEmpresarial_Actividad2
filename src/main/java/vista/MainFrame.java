package vista;

import controlador.*;
import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame(GestorEmpresas gestorEmpresas, GestorStands gestorStands, GestorVisitantes gestorVisitantes) {
        setTitle("Gestión de Feria Empresarial");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear pestañas
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Empresas", new EmpresasPanel(gestorEmpresas));
        tabbedPane.addTab("Stands", new StandsPanel(gestorStands, gestorEmpresas));
        tabbedPane.addTab("Visitantes", new VisitantesPanel(gestorVisitantes));
        tabbedPane.addTab("Interacciones", new InteraccionesPanel(gestorVisitantes, gestorStands));

        add(tabbedPane);
    }
}