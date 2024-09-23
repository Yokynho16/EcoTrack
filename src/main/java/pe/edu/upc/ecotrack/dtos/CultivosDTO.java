package pe.edu.upc.ecotrack.dtos;

import pe.edu.upc.ecotrack.entities.Lotes;

public class CultivosDTO {
    private int idCultivos;
    private String nombre;
    private String tipo;
    private Lotes lotes;

    public int getIdCultivos() {
        return idCultivos;
    }

    public void setIdCultivos(int idCultivos) {
        this.idCultivos = idCultivos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Lotes getLotes() {
        return lotes;
    }

    public void setLotes(Lotes lotes) {
        this.lotes = lotes;
    }
}
