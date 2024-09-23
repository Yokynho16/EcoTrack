package pe.edu.upc.ecotrack.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Vehiculos")
public class Vehiculos {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idVehiculos;
    @Column(name="placa",nullable = false,length = 9)
    private String placa;
    @Column(name="modelo",nullable = false,length=50)
    private String modelo;
    @Column(name="marca",nullable = false,length = 50)
    private String marca;
    @Column(name = "capacidad_carga",nullable = false)
    private int capacidad_carga;
    @Column(name = "estado",nullable = false,length = 50)
    private String estado;
    @Column(name = "fecha_inscripcion",nullable = false)
    private LocalDate fecha_inscripcion;

    @ManyToOne
    @JoinColumn(name = "idUsuarios",nullable = false)
    private Usuarios usuario;

    public Vehiculos() {
    }

    public Vehiculos(int idVehiculos, String placa, String modelo, String marca, int capacidad_carga, String estado, LocalDate fecha_inscripcion, Usuarios usuario) {
        this.idVehiculos = idVehiculos;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.capacidad_carga = capacidad_carga;
        this.estado = estado;
        this.fecha_inscripcion = fecha_inscripcion;
        this.usuario = usuario;
    }

    public int getIdVehiculos() {
        return idVehiculos;
    }

    public void setIdVehiculos(int idVehiculos) {
        this.idVehiculos = idVehiculos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(int capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(LocalDate fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
