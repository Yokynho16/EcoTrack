package pe.edu.upc.ecotrack.dtos;

import jakarta.persistence.Column;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ControlesDTO {
    private int idControles;

    private String tipo_control;

    private String descripcion;

    private LocalDate fecha_control;

    private String ubicacion;

    public int getIdControles() {
        return idControles;
    }

    public void setIdControles(int idControles) {
        this.idControles = idControles;
    }

    public String getTipo_control() {
        return tipo_control;
    }

    public void setTipo_control(String tipo_control) {
        this.tipo_control = tipo_control;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha_control() {
        return fecha_control;
    }

    public void setFecha_control(LocalDate fecha_control) {
        this.fecha_control = fecha_control;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
