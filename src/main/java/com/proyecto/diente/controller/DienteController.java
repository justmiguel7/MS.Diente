package com.proyecto.diente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.proyecto.diente.entidades.Diente;
import com.proyecto.diente.service.DienteService;
@RestController
@RequestMapping("/api/dientes")
@CrossOrigin("*")
public class DienteController {

    @Autowired
    private DienteService service;

    @GetMapping("/paciente/{pacienteId}")
    public List<Diente> listarPorPaciente(@PathVariable Long pacienteId) {
        return service.listarPorPaciente(pacienteId);
    }

    @PostMapping
    public Diente guardar(@RequestBody Diente diente) {
        return service.guardar(diente);
    }

    @GetMapping("/{id}")
    public Diente obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }
}