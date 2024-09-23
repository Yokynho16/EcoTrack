package pe.edu.upc.ecotrack.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ecotrack.dtos.CotizacionesDTO;
import pe.edu.upc.ecotrack.entities.Cotizaciones;
import pe.edu.upc.ecotrack.serviceinterfaces.ICotizacionesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cotizaciones")
public class CotizacionesController {
    @Autowired
    private ICotizacionesService cS;

    @GetMapping
    public List<CotizacionesDTO> listar() {
        return cS.list().stream().map(x->{
            ModelMapper modelMapper = new ModelMapper();
            return modelMapper.map(x, CotizacionesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody CotizacionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Cotizaciones c = m.map(dto, Cotizaciones.class);
        cS.insert(c);
    }
    @GetMapping("/{id}")
    public CotizacionesDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        CotizacionesDTO dto = m.map(cS.listId(id), CotizacionesDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody CotizacionesDTO dto) {
        ModelMapper m = new ModelMapper();
        Cotizaciones c = m.map(dto, Cotizaciones.class);
        cS.update(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);
    }
}
