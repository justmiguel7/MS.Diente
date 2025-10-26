package com.proyecto.diente.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyecto.diente.entidades.Diente;
import com.proyecto.diente.repository.DienteRepository;

@Service
public class DienteServiceImp implements DienteService {

    @Autowired
    private DienteRepository repo;

    private static final String[][] DIENTES_BASE = {
        {"11", "Incisivo central superior derecho", "1"},
        {"12", "Incisivo lateral superior derecho", "1"},
        {"13", "Canino superior derecho", "1"},
        {"14", "Primer premolar superior derecho", "1"},
        {"15", "Segundo premolar superior derecho", "1"},
        {"16", "Primer molar superior derecho", "1"},
        {"17", "Segundo molar superior derecho", "1"},
        {"18", "Tercer molar superior derecho", "1"},
        {"21", "Incisivo central superior izquierdo", "2"},
        {"22", "Incisivo lateral superior izquierdo", "2"},
        {"23", "Canino superior izquierdo", "2"},
        {"24", "Primer premolar superior izquierdo", "2"},
        {"25", "Segundo premolar superior izquierdo", "2"},
        {"26", "Primer molar superior izquierdo", "2"},
        {"27", "Segundo molar superior izquierdo", "2"},
        {"28", "Tercer molar superior izquierdo", "2"},
        {"31", "Incisivo central inferior izquierdo", "3"},
        {"32", "Incisivo lateral inferior izquierdo", "3"},
        {"33", "Canino inferior izquierdo", "3"},
        {"34", "Primer premolar inferior izquierdo", "3"},
        {"35", "Segundo premolar inferior izquierdo", "3"},
        {"36", "Primer molar inferior izquierdo", "3"},
        {"37", "Segundo molar inferior izquierdo", "3"},
        {"38", "Tercer molar inferior izquierdo", "3"},
        {"41", "Incisivo central inferior derecho", "4"},
        {"42", "Incisivo lateral inferior derecho", "4"},
        {"43", "Canino inferior derecho", "4"},
        {"44", "Primer premolar inferior derecho", "4"},
        {"45", "Segundo premolar inferior derecho", "4"},
        {"46", "Primer molar inferior derecho", "4"},
        {"47", "Segundo molar inferior derecho", "4"},
        {"48", "Tercer molar inferior derecho", "4"}
    };

    @Override
    public List<Diente> crearDientesBaseParaPaciente(String dniPaciente) {
        List<Diente> dientes = new ArrayList<>();

        for (String[] d : DIENTES_BASE) {
            Diente diente = new Diente();
            diente.setNumero(d[0]);
            diente.setNombre(d[1]);
            diente.setCuadrante(d[2]);
            diente.setDniPaciente(dniPaciente);
            dientes.add(diente);
        }

        return repo.saveAll(dientes);
    }

    public List<Diente> listarPorPaciente(String dniPaciente) {
        return repo.findByDniPacienteConDetalles(dniPaciente);
    }


    @Override
    public Diente guardar(Diente diente) {
        return repo.save(diente);
    }

    @Override
    public Diente obtenerPorId(Long id) {
        return repo.findById(id).orElse(null);
    }
}