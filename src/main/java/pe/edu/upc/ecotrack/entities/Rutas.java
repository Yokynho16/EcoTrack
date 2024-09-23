package pe.edu.upc.ecotrack.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Rutas")
public class Rutas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRutas;
    @Column(name = "origen",length=50,nullable = false)
    private String origen;
    @Column(name = "destino",length=50,nullable = false)
    private String destino;
    @Column(name = "duracion_estimada",nullable = false)
    private int duracion_estimada;
    @ManyToOne
    @JoinColumn(name = "idRastreos")
    private Rastreos ra;

    public Rutas(int idRutas, String origen, String destino, int duracion_estimada, Rastreos ra) {
        this.idRutas = idRutas;
        this.origen = origen;
        this.destino = destino;
        this.duracion_estimada = duracion_estimada;
        this.ra = ra;
    }

    public Rutas() {
    }

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
