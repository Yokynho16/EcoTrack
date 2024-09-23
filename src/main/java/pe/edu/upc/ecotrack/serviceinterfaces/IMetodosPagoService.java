package pe.edu.upc.ecotrack.serviceinterfaces;

import pe.edu.upc.ecotrack.entities.MetodosPago;

import java.util.List;

public interface IMetodosPagoService {
    public List<MetodosPago> list();
    public void insert(MetodosPago m);
    public MetodosPago listId(int id);
    public void update(MetodosPago m);
    public void delete(int id);
}
