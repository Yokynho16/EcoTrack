package pe.edu.upc.ecotrack.serviceinterfaces;

import pe.edu.upc.ecotrack.entities.Cultivos;

import java.util.List;

public interface ICultivosService {
    public List<Cultivos> list();
    public void insert(Cultivos cu);
    public Cultivos listId(int id);
    public void update(Cultivos cu);
    public void delete(int id);
    public List<String []> buscarNombre(String nombre);
}
