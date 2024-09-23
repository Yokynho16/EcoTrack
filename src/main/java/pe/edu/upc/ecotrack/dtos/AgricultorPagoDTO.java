package pe.edu.upc.ecotrack.dtos;

import java.time.LocalDate;

public class AgricultorPagoDTO {
    private String nombre;
    private int id_pagos;
    private double monto;
    private LocalDate fecha_pago;
    private String estado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_pagos() {
        return id_pagos;
    }

    public void setId_pagos(int id_pagos) {
        this.id_pagos = id_pagos;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDate fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
