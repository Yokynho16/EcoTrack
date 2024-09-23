package pe.edu.upc.ecotrack.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ecotrack.dtos.RastreosDTO;
import pe.edu.upc.ecotrack.entities.Rastreos;
import pe.edu.upc.ecotrack.serviceinterfaces.IRastreosService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rastreos")
public class RastreosController {
    @Autowired
    private IRastreosService rS;

    @GetMapping
    public List<RastreosDTO> listar(){

        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RastreosDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody RastreosDTO dto){
        ModelMapper m=new ModelMapper();
        Rastreos r=m.map(dto,Rastreos.class);
        rS.insert(r);
    }
    @GetMapping("/{id}")
    public RastreosDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        RastreosDTO dto = m.map(rS.listId(id), RastreosDTO.class);
        return dto;
    }
    @PutMapping
    public void modifcar(@RequestBody RastreosDTO dto){
        ModelMapper m=new ModelMapper();
        Rastreos r=m.map(dto,Rastreos.class);
        rS.update(r);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable ("id") Integer id) { rS.delete(id);}
}
