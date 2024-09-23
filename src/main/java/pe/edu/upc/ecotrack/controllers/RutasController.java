package pe.edu.upc.ecotrack.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ecotrack.dtos.RutasDTO;
import pe.edu.upc.ecotrack.entities.Rutas;
import pe.edu.upc.ecotrack.serviceinterfaces.IRutasService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rutas")
public class RutasController {
    @Autowired
    private IRutasService rS;

    @GetMapping
    public List<RutasDTO> listar(){

        return rS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RutasDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody RutasDTO dto){
        ModelMapper m=new ModelMapper();
        Rutas r=m.map(dto,Rutas.class);
        rS.insert(r);
    }
    @GetMapping("/{id}")
    public RutasDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        RutasDTO dto = m.map(rS.listId(id), RutasDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody RutasDTO dto) {
        ModelMapper m = new ModelMapper();
        Rutas r = m.map(dto, Rutas.class);
        rS.update(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        rS.delete(id);
    }
}
