package com.proyecto.diente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.proyecto.diente.entidades.DetalleDental;
import com.proyecto.diente.service.DetalleDentalService;
import com.proyecto.diente.dto.DetalleDentalDTO;

@RestController
@RequestMapping("/api/detalles")
@CrossOrigin("*")
public class DetalleDentalController {

    @Autowired
    private DetalleDentalService service;

    @GetMapping("/diente/{dienteId}")
    public List<DetalleDental> listarPorDiente(@PathVariable Long dienteId) {
        return service.listarPorDiente(dienteId);
    }

    @PostMapping
    public DetalleDental guardar(@RequestBody DetalleDentalDTO dto) {
        return service.guardar(dto);
    }
}