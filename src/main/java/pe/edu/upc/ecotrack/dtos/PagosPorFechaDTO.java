package pe.edu.upc.ecotrack.dtos;

import java.time.LocalDate;

public class PagosPorFechaDTO {
    private LocalDate fecha_pago;
    private int cantidad;

    public LocalDate getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDate fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
