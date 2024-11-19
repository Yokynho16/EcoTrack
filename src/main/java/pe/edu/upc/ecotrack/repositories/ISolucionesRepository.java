package pe.edu.upc.ecotrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.ecotrack.entities.Soluciones;

import java.util.List;

public interface ISolucionesRepository extends JpaRepository<Soluciones, Integer> {
    @Query(value="Select\n" +
            "\tr.titulo,\n" +
            "\tr.respuesta\n" +
            "From\n" +
            "\tsoluciones r\n" +
            "Inner Join\n" +
            "\tquejas q on r.id_quejas = q.id_quejas\n" +
            "Where\n" +
            "\tq.id_quejas = :id_queja",nativeQuery = true)
    public List<String[]> buscarReportePorIdQueja(@Param("id_queja") Integer id_queja);
}
