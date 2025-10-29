package com.proyecto.diente.service;

import java.util.List;

import com.proyecto.diente.dto.DetalleDentalDTO;
import com.proyecto.diente.entidades.DetalleDental;

public interface DetalleDentalService {
    List<DetalleDental> listarPorDiente(Long dienteId);
    DetalleDental guardar(DetalleDentalDTO dto); // <- usar DTO
}