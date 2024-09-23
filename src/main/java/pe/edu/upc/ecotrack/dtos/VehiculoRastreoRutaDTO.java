package pe.edu.upc.ecotrack.dtos;

import java.time.LocalDate;

public class VehiculoRastreoRutaDTO {
    private String placa;
    private String estado;
    private LocalDate fecha_salida;
    private LocalDate fecha_llegada;
    private int cantidad_rutas;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(LocalDate fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public LocalDate getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(LocalDate fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public int getCantidad_rutas() {
        return cantidad_rutas;
    }

    public void setCantidad_rutas(int cantidad_rutas) {
        this.cantidad_rutas = cantidad_rutas;
    }
}
