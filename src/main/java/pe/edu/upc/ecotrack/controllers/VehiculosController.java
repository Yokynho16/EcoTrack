package pe.edu.upc.ecotrack.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ecotrack.dtos.VehiculoRastreoRutaDTO;
import pe.edu.upc.ecotrack.dtos.VehiculosDTO;
import pe.edu.upc.ecotrack.dtos.VehiculosDisponibleDTO;
import pe.edu.upc.ecotrack.entities.Vehiculos;
import pe.edu.upc.ecotrack.serviceinterfaces.IVehiculosService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vehiculos")
public class VehiculosController {
    @Autowired
    private IVehiculosService vS;

    @GetMapping
    public List<VehiculosDTO> listar(){
        return vS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,VehiculosDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody VehiculosDTO dto){
        ModelMapper m=new ModelMapper();
        Vehiculos v=m.map(dto, Vehiculos.class);
        vS.insert(v);
    }
    @GetMapping("/{id}")
    public VehiculosDTO listarId(@PathVariable ("id") Integer id){
        ModelMapper m=new ModelMapper();
        VehiculosDTO dto=m.map(vS.listId(id),VehiculosDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody VehiculosDTO dto) {
        ModelMapper m = new ModelMapper();
        Vehiculos ve = m.map(dto, Vehiculos.class);
        vS.update(ve);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){vS.delete(id);}
    @GetMapping("/rastreoxruta")
    public List<VehiculoRastreoRutaDTO> rastreoXRuta(@RequestParam String pl,@RequestParam LocalDate f_i,@RequestParam LocalDate f_f) {
        List<String[]> lista = vS.reporteVehiculosPorFechasYCantidadRutas(pl,f_i,f_f);
        List<VehiculoRastreoRutaDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            VehiculoRastreoRutaDTO dto = new VehiculoRastreoRutaDTO();
            dto.setPlaca(columna[0]);
            dto.setEstado(columna[1]);
            dto.setFecha_salida(LocalDate.parse(columna[2]));
            dto.setFecha_llegada(LocalDate.parse(columna[3]));
            dto.setCantidad_rutas(Integer.parseInt(columna[4]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
    @GetMapping("/vehiculosdisponibles")
    public List<VehiculosDisponibleDTO> vehiculosDisponibles() {
        List<String[]> lista = vS.reporteVehiculosDisponible();
        List<VehiculosDisponibleDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            VehiculosDisponibleDTO dto = new VehiculosDisponibleDTO();
            dto.setPlaca(columna[0]);
            dto.setCapacidad_carga(Integer.parseInt(columna[1]));
            dto.setEstado(columna[2]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
