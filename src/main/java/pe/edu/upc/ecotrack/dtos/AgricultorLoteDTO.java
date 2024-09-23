package pe.edu.upc.ecotrack.dtos;

import java.time.LocalDate;

public class AgricultorLoteDTO {
    private String nombre;
    private String nombre_lote;
    private String tipo_cultivo;
    private LocalDate fecha_siembra;
    private String estado;
    private int cantidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre_lote() {
        return nombre_lote;
    }

    public void setNombre_lote(String nombre_lote) {
        this.nombre_lote = nombre_lote;
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
