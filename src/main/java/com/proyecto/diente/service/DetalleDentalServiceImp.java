package com.proyecto.diente.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.diente.repository.DetalleDentalRepository;
import com.proyecto.diente.entidades.DetalleDental;

@Service
public class DetalleDentalServiceImp implements DetalleDentalService {

    @Autowired
    private DetalleDentalRepository repo;

    @Override
    public List<DetalleDental> listarPorDiente(Long dienteId) {
        return repo.findByDienteId(dienteId);
    }

    @Override
    public DetalleDental guardar(DetalleDental detalle) {
        return repo.save(detalle);
    }
}