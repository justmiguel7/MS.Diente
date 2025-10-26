package com.proyecto.diente.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyecto.diente.entidades.Diente;

public interface DienteRepository extends JpaRepository<Diente, Long> {
    @Query("SELECT DISTINCT d FROM Diente d LEFT JOIN FETCH d.detalles WHERE d.dniPaciente = :dniPaciente")
    List<Diente> findByDniPacienteConDetalles(@Param("dniPaciente") String dniPaciente);
}