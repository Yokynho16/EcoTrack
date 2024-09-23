package pe.edu.upc.ecotrack.dtos;


import pe.edu.upc.ecotrack.entities.Rastreos;

public class RutasDTO {
    private int idRutas;
    private String origen;
    private String destino;
    private int duracion_estimada;
    private Rastreos ra;


    public int getIdRutas() {
        return idRutas;
    }

    public void setIdRutas(int idRutas) {
        this.idRutas = idRutas;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDuracion_estimada() {
        return duracion_estimada;
    }

    public void setDuracion_estimada(int duracion_estimada) {
        this.duracion_estimada = duracion_estimada;
    }

    public Rastreos getRa() {
        return ra;
    }

    public void setRa(Rastreos ra) {
        this.ra = ra;
    }
}
