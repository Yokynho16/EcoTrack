package pe.edu.upc.ecotrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.ecotrack.entities.Reportes;

import java.util.List;

public interface IReportesRepository extends JpaRepository<Reportes,Integer> {
    @Query(value="Select\n" +
            "\tr.titulo,\n" +
            "\tr.respuesta\n" +
            "From\n" +
            "\treportes r\n" +
            "Inner Join\n" +
            "\tquejas q on r.id_quejas = q.id_quejas\n" +
            "Where\n" +
            "\tq.id_quejas = :id_queja",nativeQuery = true)
    public List<String[]> buscarReportePorIdQueja(@Param("id_queja") Integer id_queja);
}
