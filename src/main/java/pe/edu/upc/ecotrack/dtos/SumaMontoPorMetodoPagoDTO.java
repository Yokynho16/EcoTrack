package pe.edu.upc.ecotrack.dtos;

public class SumaMontoPorMetodoPagoDTO {
    private String metodo_pago;
    private double total_pagos;

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public double getTotal_pagos() {
        return total_pagos;
    }

    public void setTotal_pagos(double total_pagos) {
        this.total_pagos = total_pagos;
    }
}
