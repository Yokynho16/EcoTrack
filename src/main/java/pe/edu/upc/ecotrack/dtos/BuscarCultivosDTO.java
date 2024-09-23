package pe.edu.upc.ecotrack.dtos;

public class BuscarCultivosDTO {
    public int idCultivo;
    public String tipoCultivo;

    public int getIdCultivo() {
        return idCultivo;
    }

    public void setIdCultivo(int idCultivo) {
        this.idCultivo = idCultivo;
    }

    public String getTipoCultivo() {
        return tipoCultivo;
    }

    public void setTipoCultivo(String tipoCultivo) {
        this.tipoCultivo = tipoCultivo;
    }
}
