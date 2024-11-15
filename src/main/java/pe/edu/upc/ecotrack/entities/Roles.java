package pe.edu.upc.ecotrack.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Roles", uniqueConstraints = {@UniqueConstraint(columnNames = {"idUsuarios", "tipo"})})
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRoles;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    @ManyToOne
    @JoinColumn(name="idUsuarios", nullable = false)
    private Usuarios usuario;


    public Roles() {
    }

    public Roles(int idRoles, String tipo, Usuarios usuario) {
        this.idRoles = idRoles;
        this.tipo = tipo;
        this.usuario = usuario;
    }

    public int getIdRoles() {
        return idRoles;
    }

    public void setIdRoles(int idRoles) {
        this.idRoles = idRoles;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }
}
