package pe.edu.upc.ecotrack.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.ecotrack.entities.Reportes;
import pe.edu.upc.ecotrack.repositories.IReportesRepository;
import pe.edu.upc.ecotrack.serviceinterfaces.IReportesService;

import java.util.List;
@Service
public class ReportesServiceImplement implements IReportesService {
    @Autowired
    private IReportesRepository rR;
    @Override
    public List<Reportes> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Reportes re) {
        rR.save(re);
    }

    @Override
    public Reportes listId(int id) {
        return rR.findById(id).orElse(new Reportes());
    }

    @Override
    public void update(Reportes r) {
        rR.save(r);
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public List<String[]> buscarReportePorIdQueja(Integer id_queja) {
        return rR.buscarReportePorIdQueja(id_queja);
    }
}
