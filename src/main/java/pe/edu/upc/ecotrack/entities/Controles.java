package pe.edu.upc.ecotrack.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Controles")
public class Controles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idControles;

    @Column(name = "tipo_control", nullable = false, length = 100)
    private String tipo_control;

    @Column(name = "descripcion", nullable = false, length = 255)
    private String descripcion;

    @Column(name = "fecha_control", nullable = false)
    private LocalDate fecha_control;

    @Column(name = "ubicacion", nullable = false, length = 255)
    private String ubicacion;

    public Controles() {
    }

    public Controles(int idControles, String tipo_control, String descripcion, LocalDate fecha_control, String ubicacion) {
        this.idControles = idControles;
        this.tipo_control = tipo_control;
        this.descripcion = descripcion;
        this.fecha_control = fecha_control;
        this.ubicacion = ubicacion;
    }

    public int getIdControles() {
        return idControles;
    }

    public void setIdControles(int idControles) {
        this.idControles = idControles;
    }

    public String getTipo_control() {
        return tipo_control;
    }

    public void setTipo_control(String tipo_control) {
        this.tipo_control = tipo_control;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha_control() {
        return fecha_control;
    }

    public void setFecha_control(LocalDate fecha_control) {
        this.fecha_control = fecha_control;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
