package pe.edu.upc.ecotrack.dtos;

import java.time.LocalDate;

public class PagosEntreFechasDTO {
    private LocalDate fecha_pago;
    private int cantidad_pagos;

    public LocalDate getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDate fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public int getCantidad_pagos() {
        return cantidad_pagos;
    }

    public void setCantidad_pagos(int cantidad_pagos) {
        this.cantidad_pagos = cantidad_pagos;
    }
}
