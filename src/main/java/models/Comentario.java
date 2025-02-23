package models;

import java.time.LocalDate;

public class Comentario {
    private final Visitante visitante;
    private final Stand stand;
    private final String comentario;
    private final int calificacion; // 1-5
    private final LocalDate fecha;

    public Comentario(Visitante visitante, Stand stand, String comentario, int calificacion) {
        this.visitante = visitante;
        this.stand = stand;
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.fecha = LocalDate.now();
    }

    // Getters
    public Visitante getVisitante() { return visitante; }
    public Stand getStand() { return stand; }
    public String getComentario() { return comentario; }
    public int getCalificacion() { return calificacion; }
    public LocalDate getFecha() { return fecha; }
}