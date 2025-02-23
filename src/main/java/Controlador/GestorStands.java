package controlador;

import models.Stand;
import models.Empresa;
import java.util.ArrayList;
import java.util.List;

public class GestorStands {
    private List<Stand> stands = new ArrayList<>();

    public void agregarStand(Stand stand) {
        stands.add(stand);
    }

    public void asignarEmpresaAStand(Empresa empresa, Stand stand) {
        stand.setEmpresaAsignada(empresa);
    }

    public List<Stand> getStandsDisponibles() {
        List<Stand> disponibles = new ArrayList<>();
        for (Stand stand : stands) {
            if (stand.getEmpresaAsignada() == null) {
                disponibles.add(stand);
            }
        }
        return disponibles;
    }
}