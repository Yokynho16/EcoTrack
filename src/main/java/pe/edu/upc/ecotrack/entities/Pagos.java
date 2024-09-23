package pe.edu.upc.ecotrack.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Pagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPagos;
    @Column(name = "monto",nullable = false)
    private double monto;
    @Column(name = "fecha_pago",nullable = false)
    private LocalDate fecha_pago;
    @Column(name="estado",nullable = false,length = 20)
    private String estado;
    @Column(name = "fecha_vencimiento",nullable = false)
    private LocalDate fecha_vencimiento;
    @ManyToOne
    @JoinColumn(name = "idCotizaciones")
    private Cotizaciones cotizaciones;

    public Pagos() {
    }

    public Pagos(int idPagos, double monto, LocalDate fecha_pago, String estado, LocalDate fecha_vencimiento, Cotizaciones cotizaciones) {
        this.idPagos = idPagos;
        this.monto = monto;
        this.fecha_pago = fecha_pago;
        this.estado = estado;
        this.fecha_vencimiento = fecha_vencimiento;
        this.cotizaciones = cotizaciones;
    }

    public int getIdPagos() {
        return idPagos;
    }

    public void setIdPagos(int idPagos) {
        this.idPagos = idPagos;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDate getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(LocalDate fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public Cotizaciones getCotizaciones() {
        return cotizaciones;
    }

    public void setCotizaciones(Cotizaciones cotizaciones) {
        this.cotizaciones = cotizaciones;
    }
}
