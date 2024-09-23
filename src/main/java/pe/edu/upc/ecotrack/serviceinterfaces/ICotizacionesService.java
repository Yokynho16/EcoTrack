package pe.edu.upc.ecotrack.serviceinterfaces;

import pe.edu.upc.ecotrack.entities.Cotizaciones;

import java.util.List;

public interface ICotizacionesService {
    public List<Cotizaciones> list();
    public void insert(Cotizaciones cotizaciones);
    public Cotizaciones listId(int id);
    public void update(Cotizaciones cotizaciones);
    public void delete(int id);
}
