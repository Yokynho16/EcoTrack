package pe.edu.upc.ecotrack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.ecotrack.entities.Vehiculos;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IVehiculosRepository extends JpaRepository<Vehiculos,Integer> {
    @Query(value = "Select \n" +
            "\tv.placa,\n" +
            "\tv.estado,\n" +
            "\tr.fecha_salida,\n" +
            "\tr.fecha_llegada,\n" +
            "\tCount(rs.id_rutas) as cantidad_rutas\n" +
            "From\n" +
            "\tvehiculos v\n" +
            "Inner Join \n" +
            "\trastreos r on v.id_vehiculos = r.id_vehiculos\n" +
            "Inner Join\n" +
            "\trutas rs on r.id_rastreos = rs.id_rastreos\n" +
            "Where\n" +
            "\tv.placa = :placa and r.fecha_llegada Between :fecha_inicio and :fecha_fin \n" +
            "Group by\n" +
            "\tv.placa, v.estado, r.fecha_salida, r.fecha_llegada;",nativeQuery = true)
    public List<String[]> reporteVehiculosPorFechasYCantidadRutas(@Param("placa") String placa,@Param("fecha_inicio") LocalDate fecha_inicio, @Param("fecha_fin")LocalDate fecha_fin);

    @Query(value="Select \n" +
            "\tplaca,\n" +
            "\tcapacidad_carga,\n" +
            "\testado\n" +
            "From\n" +
            "\tvehiculos\n" +
            "Where\n" +
            "\testado = 'Disponible'", nativeQuery = true)
    public List<String[]> reporteVehiculosDisponible();
}
