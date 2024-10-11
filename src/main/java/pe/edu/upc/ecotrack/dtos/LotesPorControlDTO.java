package pe.edu.upc.ecotrack.dtos;

import java.time.LocalDate;

public class LotesPorControlDTO {
    private String tipo_control;
    private String nombre;
    private String tipo_cultivo;
    private LocalDate fecha_siembra;
    private String estado;
    private int cantidad;

    public String getTipo_control() {
        return tipo_control;
    }

    public void setTipo_control(String tipo_control) {
        this.tipo_control = tipo_control;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_cultivo() {
        return tipo_cultivo;
    }

    public void setTipo_cultivo(String tipo_cultivo) {
        this.tipo_cultivo = tipo_cultivo;
    }

    public LocalDate getFecha_siembra() {
        return fecha_siembra;
    }

    public void setFecha_siembra(LocalDate fecha_siembra) {
        this.fecha_siembra = fecha_siembra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
