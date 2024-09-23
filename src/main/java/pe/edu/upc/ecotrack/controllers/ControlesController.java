package pe.edu.upc.ecotrack.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ecotrack.dtos.ControlesDTO;
import pe.edu.upc.ecotrack.entities.Controles;
import pe.edu.upc.ecotrack.serviceinterfaces.IControlesService;
import pe.edu.upc.ecotrack.serviceinterfaces.IRolesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/controles")
public class ControlesController {
    @Autowired
    private IControlesService cS;

    @GetMapping
    public List<ControlesDTO> listar() {
        return cS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ControlesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody ControlesDTO dto) {
        ModelMapper m = new ModelMapper();
        Controles c = m.map(dto, Controles.class);
        cS.insert(c);
    }

    @GetMapping("/{id}")
    public ControlesDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        ControlesDTO dto = m.map(cS.listId(id), ControlesDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ControlesDTO dto) {
        ModelMapper m = new ModelMapper();
        Controles c = m.map(dto, Controles.class);
        cS.update(c);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cS.delete(id);
    }

    @GetMapping("/listarlotesportipodecontrol")
    public List<ControlesDTO> listarlotesportipodecontrol(@RequestParam String l){
        return cS.listarlotesportipodecontrol(l).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ControlesDTO.class);
        }).collect(Collectors.toList());
    }

}
