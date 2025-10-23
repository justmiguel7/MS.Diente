package com.proyecto.diente.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto.diente.entidades.Diente;

public interface DienteRepository extends JpaRepository<Diente, Long> {
    List<Diente> findByPacienteId(Long pacienteId);
}