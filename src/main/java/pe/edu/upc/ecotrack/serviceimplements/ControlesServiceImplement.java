package pe.edu.upc.ecotrack.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.ecotrack.entities.Controles;
import pe.edu.upc.ecotrack.repositories.IControlesRepository;
import pe.edu.upc.ecotrack.serviceinterfaces.IControlesService;

import java.util.List;
@Service
public class ControlesServiceImplement implements IControlesService {
    @Autowired
    private IControlesRepository cR;
    @Override
    public List<Controles> list() {
        return cR.findAll();
    }

    @Override
    public void insert(Controles controles) {
        cR.save(controles);
    }

    @Override
    public Controles listId(int id) {
        return cR.findById(id).orElse(new Controles());
    }

    @Override
    public void update(Controles controles) {
        cR.save(controles);
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public List<String[]> listarlotesportipodecontrol(String tipo_control) {
        return cR.listarlotesportipodecontrol(tipo_control);
    }

}
