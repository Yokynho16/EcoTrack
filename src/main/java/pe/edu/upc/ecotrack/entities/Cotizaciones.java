package pe.edu.upc.ecotrack.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Cotizaciones")
public class Cotizaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCotizaciones;

    @Column(name = "precio", nullable = false)
    private double precio;

    @Column(name = "fecha_cotizacion", nullable = false)
    private LocalDateTime fecha_cotizacion;

    @ManyToOne
    @JoinColumn(name = "idUsuarios")
    private Usuarios usuario;

    public Cotizaciones() {
    }

    public Cotizaciones(int idCotizaciones, double precio, LocalDateTime fecha_cotizacion, Usuarios usuario) {
        this.idCotizaciones = idCotizaciones;
        this.precio = precio;
        this.fecha_cotizacion = fecha_cotizacion;
        this.usuario = usuario;
    }

    public int getIdCotizaciones() {
        return idCotizaciones;
    }

    public void setIdCotizaciones(int idCotizaciones) {
        this.idCotizaciones = idCotizaciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LocalDateTime getFecha_cotizacion() {
        return fecha_cotizacion;
    }

    public void setFecha_cotizacion(LocalDateTime fecha_cotizacion) {
        this.fecha_cotizacion = fecha_cotizacion;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}