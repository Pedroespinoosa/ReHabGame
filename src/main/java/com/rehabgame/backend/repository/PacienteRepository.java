package com.rehabgame.backend.repository;

import com.rehabgame.backend.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
	
}

