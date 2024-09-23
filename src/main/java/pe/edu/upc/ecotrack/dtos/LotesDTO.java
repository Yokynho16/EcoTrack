package pe.edu.upc.ecotrack.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import pe.edu.upc.ecotrack.entities.Controles;
import pe.edu.upc.ecotrack.entities.Usuarios;

import java.time.LocalDate;

public class LotesDTO {
    private int idLotes;

    private String nombre;

    private String tipo_cultivo;

    private LocalDate fecha_siembra;

    private String estado;

    private int cantidad;

    private Usuarios usuario;

    private Controles controles;


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
