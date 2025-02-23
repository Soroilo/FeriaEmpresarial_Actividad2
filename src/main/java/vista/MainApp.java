package vista;

import controlador.GestorEmpresas;
import controlador.GestorStands;
import controlador.GestorVisitantes;
import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        GestorEmpresas gestorEmpresas = new GestorEmpresas();
        GestorStands gestorStands = new GestorStands();
        GestorVisitantes gestorVisitantes = new GestorVisitantes();

        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame(gestorEmpresas, gestorStands, gestorVisitantes);
            mainFrame.setVisible(true);
        });
    }
}