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

    //  busca por DNI del paciente 
    @GetMapping("/paciente/{dniPaciente}")
    public List<Diente> listarPorPaciente(@PathVariable String dniPaciente) {
        return service.listarPorPaciente(dniPaciente);
    }

    @PostMapping
    public Diente guardar(@RequestBody Diente diente) {
        return service.guardar(diente);
    }

    @GetMapping("/{id}")
    public Diente obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    // ✅ Crear los dientes base al registrar un nuevo paciente
    @PostMapping("/paciente/{dniPaciente}/crear-base")
    public List<Diente> crearDientesBase(@PathVariable String dniPaciente) {
        return service.crearDientesBaseParaPaciente(dniPaciente);
    }
}
