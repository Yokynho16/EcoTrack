package pe.edu.upc.ecotrack.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ecotrack.dtos.ReportePorQuejaDTO;
import pe.edu.upc.ecotrack.dtos.SolucionesDTO;
import pe.edu.upc.ecotrack.entities.Soluciones;
import pe.edu.upc.ecotrack.serviceinterfaces.ISolucionesService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/soluciones")
public class SolucionesController {
    @Autowired
    private ISolucionesService sS;
    @GetMapping
    public List<SolucionesDTO> listar() {
        return sS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,SolucionesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody SolucionesDTO dto) {
        ModelMapper m=new ModelMapper();
        Soluciones r=m.map(dto,Soluciones.class);
        sS.insert(r);
    }
    @GetMapping("/{id}")
    public SolucionesDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        SolucionesDTO dto = m.map(sS.listId(id), SolucionesDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody SolucionesDTO dto) {
        ModelMapper m=new ModelMapper();
        Soluciones r=m.map(dto,Soluciones.class);
        sS.update(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Integer id) { sS.delete(id);}


    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    @GetMapping("/buscarreporteporidqueja")
    public List<ReportePorQuejaDTO> reportePorIdQueja(@RequestParam Integer id_queja) {
        List<String[]> lista = sS.buscarReportePorIdQueja(id_queja);
        List<ReportePorQuejaDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            ReportePorQuejaDTO dto = new ReportePorQuejaDTO();
            dto.setTitulo(columna[0]);
            dto.setRespuesta(columna[1]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
