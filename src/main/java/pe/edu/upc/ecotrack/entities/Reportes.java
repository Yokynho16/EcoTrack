package pe.edu.upc.ecotrack.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Reportes")
public class Reportes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReportes;
    @Column(name = "titulo", nullable = false,length = 100)
    private String titulo;

    @Column(name = "descripcion", nullable = false,length = 254)
    private String descripcion;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDate fecha_creacion;

    @Column (name = "tipo", nullable = false, length = 50)
    private String tipo;

    @Column (name = "respuesta", nullable = false, length = 254)
    private String respuesta;
    @ManyToOne
    @JoinColumn(name = "idQuejas")
    private Quejas quejas;

    public Reportes() {
    }

    public Reportes(int idReportes, String titulo, String descripcion, LocalDate fecha_creacion, String tipo, String respuesta, Quejas quejas) {
        this.idReportes = idReportes;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
        this.tipo = tipo;
        this.respuesta = respuesta;
        this.quejas = quejas;
    }

    public int getIdReportes() {
        return idReportes;
    }

    public void setIdReportes(int idReportes) {
        this.idReportes = idReportes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(LocalDate fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Quejas getQuejas() {
        return quejas;
    }

    public void setQuejas(Quejas quejas) {
        this.quejas = quejas;
    }
}
