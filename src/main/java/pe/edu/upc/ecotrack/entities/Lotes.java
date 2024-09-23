package pe.edu.upc.ecotrack.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Lotes")
public class Lotes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLotes;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "tipo_cultivo", nullable = false, length = 100)
    private String tipo_cultivo;

    @Column(name = "fecha_siembra",nullable = false)
    private LocalDate fecha_siembra;

    @Column(name = "estado", nullable = false, length = 15)
    private String estado;

    @Column(name = "cantidad", nullable = false)
    private int cantidad;

    @ManyToOne
    @JoinColumn(name = "idUsuarios")
    private Usuarios usuario;

    @ManyToOne
    @JoinColumn(name = "idControles")
    private Controles controles;


    public Lotes() {
    }

    public Lotes(int idLotes, String nombre, String tipo_cultivo, LocalDate fecha_siembra, String estado, int cantidad, Controles controles, Usuarios usuario) {
        this.idLotes = idLotes;
        this.nombre = nombre;
        this.tipo_cultivo = tipo_cultivo;
        this.fecha_siembra = fecha_siembra;
        this.estado = estado;
        this.cantidad = cantidad;
        this.controles = controles;
        this.usuario = usuario;
    }

    public int getIdLotes() {
        return idLotes;
    }

    public void setIdLotes(int idLotes) {
        this.idLotes = idLotes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_cultivo() {
        return tipo_cultivo;
    }

    public void setTipo_cultivo(String tipo_cultivo) {
        this.tipo_cultivo = tipo_cultivo;
    }

    public LocalDate getFecha_siembra() {
        return fecha_siembra;
    }

    public void setFecha_siembra(LocalDate fecha_siembra) {
        this.fecha_siembra = fecha_siembra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Controles getControles() {
        return controles;
    }

    public void setControles(Controles controles) {
        this.controles = controles;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
