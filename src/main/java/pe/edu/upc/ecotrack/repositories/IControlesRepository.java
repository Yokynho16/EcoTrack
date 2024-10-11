package pe.edu.upc.ecotrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ecotrack.entities.Controles;

import java.util.List;

@Repository
public interface IControlesRepository extends JpaRepository<Controles, Integer> {
    @Query(value = "" +
            "SELECT co.tipo_control,l.nombre,l.tipo_cultivo,l.fecha_siembra,l.estado,l.cantidad\n " +
            "FROM  controles co\n " +
            "INNER JOIN lotes l on co.id_controles = l.id_controles\n " +
            "WHERE co.tipo_control =:tipo_control\n",
            nativeQuery = true)
    List<String[]> listarlotesportipodecontrol(@Param("tipo_control") String tipo_control);

}
