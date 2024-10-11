package pe.edu.upc.ecotrack.serviceinterfaces;

import org.springframework.data.repository.query.Param;
import pe.edu.upc.ecotrack.entities.Controles;

import java.util.List;

public interface IControlesService {
    public List<Controles> list();

    public void insert(Controles controles);

    public Controles listId(int id);

    public void update(Controles controles);

    public void delete(int id);
    List<String[]> listarlotesportipodecontrol(@Param("tipo_control") String tipo_control);
}
