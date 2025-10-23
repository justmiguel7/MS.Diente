package com.proyecto.diente.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.diente.entidades.DetalleDental;

public interface DetalleDentalRepository extends JpaRepository<DetalleDental, Long> {
    List<DetalleDental> findByDienteId(Long dienteId);
}