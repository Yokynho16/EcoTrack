package pe.edu.upc.ecotrack.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.ecotrack.entities.Soluciones;
import pe.edu.upc.ecotrack.repositories.ISolucionesRepository;
import pe.edu.upc.ecotrack.serviceinterfaces.ISolucionesService;

import java.util.List;

@Service
public class SolucionesServiceImplement implements ISolucionesService {
    @Autowired
    private ISolucionesRepository sR;
    @Override
    public List<Soluciones> list() {
        return sR.findAll();
    }

    @Override
    public void insert(Soluciones re) {
        sR.save(re);
    }

    @Override
    public Soluciones listId(int id) {
        return sR.findById(id).orElse(new Soluciones());
    }

    @Override
    public void update(Soluciones r) {
        sR.save(r);
    }

    @Override
    public void delete(int id) {
        sR.deleteById(id);
    }

    @Override
    public List<String[]> buscarReportePorIdQueja(Integer id_queja) {
        return sR.buscarReportePorIdQueja(id_queja);
    }
}
