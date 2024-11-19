package pe.edu.upc.ecotrack.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.ecotrack.entities.Soluciones;

import java.util.List;

public interface ISolucionesService {
    public List<Soluciones> list();
    public void insert(Soluciones so);
    public Soluciones listId(int id);
    public void update(Soluciones s);
    public void delete(int id);
    public List<String[]> buscarReportePorIdQueja(@Param("id_queja") Integer id_queja);
}
