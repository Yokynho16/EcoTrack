package pe.edu.upc.ecotrack.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.ecotrack.dtos.PagosDTO;
import pe.edu.upc.ecotrack.dtos.PagosEntreFechasDTO;
import pe.edu.upc.ecotrack.dtos.PagosPendientesDTO;
import pe.edu.upc.ecotrack.dtos.VehiculoRastreoRutaDTO;
import pe.edu.upc.ecotrack.entities.Pagos;
import pe.edu.upc.ecotrack.serviceinterfaces.IPagosService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/pagos")
public class PagosController {
    @Autowired
    private IPagosService pS;
    @GetMapping
    public List<PagosDTO> listar(){
        return pS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PagosDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insertar(@RequestBody PagosDTO dto) {
        ModelMapper m = new ModelMapper();
        Pagos p = m.map(dto, Pagos.class);
        pS.insert(p);
    }
    @GetMapping("/{id}")
    public PagosDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        PagosDTO dto = m.map(pS.listId(id), PagosDTO.class);
        return dto;
    }
    @PutMapping
    public void modificar(@RequestBody PagosDTO dto) {
        ModelMapper m = new ModelMapper();
        Pagos p = m.map(dto, Pagos.class);
        pS.update(p);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        pS.delete(id);
    }

    @GetMapping("/pagospendientes")
    public List<PagosPendientesDTO> pagosPendientes() {
        List<String[]> lista = pS.PagosPendientes();
        List<PagosPendientesDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            PagosPendientesDTO dto = new PagosPendientesDTO();
            dto.setId_pagos(Integer.parseInt(columna[0]));
            dto.setMonto(Double.parseDouble(columna[1]));
            dto.setFecha_vencimiento(LocalDate.parse(columna[2]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/pagosentrefechas")
    public List<PagosEntreFechasDTO> pagosEntreFechas() {
        List<String[]> lista = pS.PagosPendientes();
        List<PagosEntreFechasDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            PagosEntreFechasDTO dto = new PagosEntreFechasDTO();
            dto.setFecha_pago(LocalDate.parse(columna[0]));
            dto.setCantidad_pagos(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
