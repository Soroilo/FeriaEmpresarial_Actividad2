package controlador;

import models.Empresa;
import java.util.ArrayList;
import java.util.List;

public class GestorEmpresas {
    private List<Empresa> empresas = new ArrayList<>();

    public void agregarEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }

    public void eliminarEmpresa(Empresa empresa) {
        empresas.remove(empresa);
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }
}