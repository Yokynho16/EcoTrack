package pe.edu.upc.ecotrack.dtos;

import pe.edu.upc.ecotrack.entities.Quejas;

import java.time.LocalDate;

public class ReportesDTO {
    private int idReportes;
    private String titulo;
    private String descripcion;
    private LocalDate fecha_creacion;
    private String tipo;
    private String respuesta;
    private Quejas quejas;

    public int getIdReportes() {
        return idReportes;
    }

    public void setIdReportes(int idReportes) {
        this.idReportes = idReportes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Quejas getQuejas() {
        return quejas;
    }

    public void setQuejas(Quejas quejas) {
        this.quejas = quejas;
    }
}
