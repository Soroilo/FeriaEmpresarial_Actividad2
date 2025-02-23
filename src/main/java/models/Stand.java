package models;

public class Stand {
    private final int numero;
    private final String ubicacion;
    private final String tamaño; // "pequeño", "mediano", "grande"
    private Empresa empresaAsignada;

    public Stand(int numero, String ubicacion, String tamaño) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.tamaño = tamaño;
    }

    // Getters y Setters
    public int getNumero() { return numero; }
    public String getUbicacion() { return ubicacion; }
    public String getTamaño() { return tamaño; }
    public Empresa getEmpresaAsignada() { return empresaAsignada; }
    public void setEmpresaAsignada(Empresa empresa) { this.empresaAsignada = empresa; }
}