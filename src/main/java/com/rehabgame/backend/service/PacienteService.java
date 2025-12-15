package com.rehabgame.backend.service;

import com.rehabgame.backend.entity.Paciente;
import com.rehabgame.backend.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    // CRUD: Leer todos
    public List<Paciente> listarPacientes() {
        return pacienteRepository.findAll();
    }

    // CRUD: Guardar
    public void guardarPaciente(Paciente paciente) {
        pacienteRepository.save(paciente);
    }

    // CRUD: Leer uno
    public Paciente obtenerPaciente(Long idUsuario) {
        return pacienteRepository.findById(idUsuario).orElse(null);
    }

    // CRUD: Eliminar
    public void eliminarPaciente(Long idUsuario) {
        pacienteRepository.deleteById(idUsuario);
    }
}