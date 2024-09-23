package pe.edu.upc.ecotrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ecotrack.entities.Lotes;

import java.util.List;

@Repository
public interface ILotesRepository extends JpaRepository<Lotes,Integer> {
    @Query(value = "Select \n" +
            "\tu.nombre,\n" +
            "\tl.nombre as nombre_lote,\n" +
            "\tl.tipo_cultivo,\n" +
            "\tl.fecha_siembra,\n" +
            "\tl.estado,\n" +
            "\tl.cantidad\n" +
            "From\n" +
            "\tlotes l\n" +
            "Inner Join\n" +
            "\tusuarios u on l.id_usuarios = u.id_usuarios\n" +
            "Inner Join\n" +
            "\troles r on u.id_roles = r.id_roles \n" +
            "Where\n" +
            "\tr.tipo = 'Agricultor' and u.nombre = :nombre",nativeQuery = true)
    public List<String[]> buscarLotesPorNombreAgricultor(@Param("nombre") String nombre);
}
