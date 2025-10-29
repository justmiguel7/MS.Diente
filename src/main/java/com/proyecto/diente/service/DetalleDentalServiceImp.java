package com.proyecto.diente.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.diente.repository.DetalleDentalRepository;
import com.proyecto.diente.repository.DienteRepository;
import com.proyecto.diente.entidades.DetalleDental;
import com.proyecto.diente.entidades.Diente;
import com.proyecto.diente.dto.DetalleDentalDTO;

@Service
public class DetalleDentalServiceImp implements DetalleDentalService {

    @Autowired
    private DetalleDentalRepository repo;

    @Autowired
    private DienteRepository dienteRepo;

    @Override
    public List<DetalleDental> listarPorDiente(Long dienteId) {
        return repo.findByDienteId(dienteId);
    }

    @Override
    public DetalleDental guardar(DetalleDentalDTO dto) {
        // Buscar el diente correspondiente
        Diente diente = dienteRepo.findById(dto.getDiente_id())
                .orElseThrow(() -> new RuntimeException("Diente no encontrado"));

        // Mapear DTO a entidad
        DetalleDental detalle = new DetalleDental();
        detalle.setTurnoId(dto.getTurnoId().intValue());
        detalle.setDiente(diente);
        detalle.setDiagnostico(dto.getDiagnostico());
        detalle.setTratamiento(dto.getTratamiento());
        detalle.setObservaciones(dto.getObservaciones());
        detalle.setFechaRegistro(dto.getFechaRegistro() != null ? dto.getFechaRegistro() : LocalDateTime.now());

        return repo.save(detalle);
    }
}
