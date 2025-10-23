package com.proyecto.diente.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.diente.entidades.Diente;
import com.proyecto.diente.repository.DienteRepository;

public interface DienteService {
    List<Diente> listarPorPaciente(Long pacienteId);
    Diente guardar(Diente diente);
    Diente obtenerPorId(Long id);
    List<Diente> crearDientesBaseParaPaciente(Long pacienteId);
}