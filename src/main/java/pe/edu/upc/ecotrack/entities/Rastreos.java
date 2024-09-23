package pe.edu.upc.ecotrack.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Entity
@Table(name = "Rastreos")
public class Rastreos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRastreos;
    @Column(name = "fecha_salida",nullable = false)
    private LocalDate fecha_salida;
    @Column(name = "fecha_llegada",nullable = false)
    private LocalDate fecha_llegada;
    @Column(name = "estado",length = 20,nullable = false)
    private String estado;
    @Column(name = "ubicacion_actual",length = 200,nullable = false)
    private String ubicacion_actual;

    @ManyToOne
    @JoinColumn(name = "idVehiculos")
    private Vehiculos ve;

    public Rastreos() {
    }

    public Rastreos(int idRastreos, LocalDate fecha_salida, LocalDate fecha_llegada, String estado, String ubicacion_actual, Vehiculos ve) {
        this.idRastreos = idRastreos;
        this.fecha_salida = fecha_salida;
        this.fecha_llegada = fecha_llegada;
        this.estado = estado;
        this.ubicacion_actual = ubicacion_actual;
        this.ve = ve;
    }

    public int getIdRastreos() {
        return idRastreos;
    }

    public void setIdRastreos(int idRastreos) {
        this.idRastreos = idRastreos;
    }

    public LocalDate getFecha_salida() {
        return fecha_salida;
    }

    public void setFecha_salida(LocalDate fecha_salida) {
        this.fecha_salida = fecha_salida;
    }

    public LocalDate getFecha_llegada() {
        return fecha_llegada;
    }

    public void setFecha_llegada(LocalDate fecha_llegada) {
        this.fecha_llegada = fecha_llegada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUbicacion_actual() {
        return ubicacion_actual;
    }

    public void setUbicacion_actual(String ubicacion_actual) {
        this.ubicacion_actual = ubicacion_actual;
    }

    public Vehiculos getVe() {
        return ve;
    }

    public void setVe(Vehiculos ve) {
        this.ve = ve;
    }
}
