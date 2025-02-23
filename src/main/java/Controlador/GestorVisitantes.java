package controlador;

import models.Visitante;
import java.util.ArrayList;
import java.util.List;

public class GestorVisitantes {
    private List<Visitante> visitantes = new ArrayList<>();

    public void agregarVisitante(Visitante visitante) {
        visitantes.add(visitante);
    }

    public List<Visitante> getVisitantes() {
        return visitantes;
    }
}