package pe.edu.upc.ecotrack.dtos;

public class CultivosPorTipoDTO {
    private String tipo;
    private int cantidad;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
