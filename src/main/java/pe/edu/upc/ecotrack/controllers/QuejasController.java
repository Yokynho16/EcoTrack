package pe.edu.upc.ecotrack.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ecotrack.dtos.QuejasDTO;
import pe.edu.upc.ecotrack.entities.Quejas;
import pe.edu.upc.ecotrack.serviceinterfaces.IQuejasService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/quejas")
public class QuejasController {
    @Autowired
    private IQuejasService qS;
    @GetMapping
    public List<QuejasDTO> listar() {
        return qS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,QuejasDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody QuejasDTO dto) {
        ModelMapper m=new ModelMapper();
        Quejas q=m.map(dto, Quejas.class);
        qS.insert(q);
    }
    @GetMapping("/{id}")
    public QuejasDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        QuejasDTO dto = m.map(qS.listId(id), QuejasDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody QuejasDTO dto) {
        ModelMapper m=new ModelMapper();
        Quejas q=m.map(dto,Quejas.class);
        qS.update(q);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Integer id) { qS.delete(id);}

}
