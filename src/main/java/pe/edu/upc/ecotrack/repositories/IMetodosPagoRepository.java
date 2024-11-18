package pe.edu.upc.ecotrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ecotrack.entities.MetodosPago;
import pe.edu.upc.ecotrack.entities.Pagos;

import java.util.List;

@Repository
public interface IMetodosPagoRepository extends JpaRepository<MetodosPago,Integer> {
    @Query(value="SELECT\n" +
            "\tme.id_metodos_pago,\n" +
            "\tme.nombre,\n" +
            "\tme.descripcion,\n" +
            "\tme.id_usuarios,\n" +
            "\tme.id_pagos\n" +
            "FROM metodos_pago me\n" +
            "inner join usuarios u on me.id_usuarios = u.id_usuarios\n" +
            "where u.username = :username ", nativeQuery = true)
    public List<MetodosPago> listarMetodosPagoUsername(@Param("username") String username);

}
