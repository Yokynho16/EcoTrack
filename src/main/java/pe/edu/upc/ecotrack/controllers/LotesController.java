package pe.edu.upc.ecotrack.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ecotrack.dtos.AgricultorLoteDTO;
import pe.edu.upc.ecotrack.dtos.LotesDTO;
import pe.edu.upc.ecotrack.entities.Lotes;
import pe.edu.upc.ecotrack.serviceinterfaces.ILotesService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/lotes")
public class LotesController {
    @Autowired
    private ILotesService lS;
    @GetMapping
    public List<LotesDTO> listar() {
        return lS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, LotesDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody LotesDTO dto) {
        ModelMapper m = new ModelMapper();
        Lotes l = m.map(dto, Lotes.class);
        lS.insert(l);
    }

    @GetMapping("/{id}")
    public LotesDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        LotesDTO dto = m.map(lS.listId(id), LotesDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody LotesDTO dto) {
        ModelMapper m = new ModelMapper();
        Lotes l = m.map(dto, Lotes.class);
        lS.update(l);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        lS.delete(id);
    }

    @GetMapping("/lotesxagricultor")
    public List<AgricultorLoteDTO> lotesxAgricultor(@RequestParam String nombre) {
        List<String[]> lista = lS.buscarLotesPorNombreAgricultor(nombre);
        List<AgricultorLoteDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            AgricultorLoteDTO dto = new AgricultorLoteDTO();
            dto.setNombre(columna[0]);
            dto.setNombre_lote(columna[1]);
            dto.setTipo_cultivo(columna[2]);
            dto.setFecha_siembra(LocalDate.parse(columna[3]));
            dto.setEstado(columna[4]);
            dto.setCantidad(Integer.parseInt(columna[5]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
