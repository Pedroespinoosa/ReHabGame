package com.rehabgame.backend.controller;

import com.rehabgame.backend.entity.Paciente;
import com.rehabgame.backend.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PacienteWebController {

    @Autowired
    private PacienteService pacienteService;

    // 1. READ
    @GetMapping("/pacientes")
    public String listarPacientes(Model model) {
        model.addAttribute("listaPacientes", pacienteService.listarPacientes());
        return "pacientes_lista"; 
    }

    // 2. Mostrar formulario para crear paciente
    @GetMapping("/pacientes/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        Paciente paciente = new Paciente();
        model.addAttribute("paciente", paciente);
        return "pacientes_form"; 
    }

    // 3. CREATE / UPDATE
    @PostMapping("/pacientes/guardar")
    public String guardarPaciente(@ModelAttribute("paciente") Paciente paciente) {
        pacienteService.guardarPaciente(paciente);
        return "redirect:/pacientes";
    }

    // 4. Mostrar formulario para editar (UPDATE)
    @GetMapping("/pacientes/editar/{idUsuario}")
    public String mostrarFormularioEditar(@PathVariable Long idUsuario, Model model) {
        Paciente paciente = pacienteService.obtenerPaciente(idUsuario);
        model.addAttribute("paciente", paciente);
        return "pacientes_form"; 
    }

    // 5. DELETE
    @GetMapping("/pacientes/eliminar/{idUsuario}")
    public String eliminarPaciente(@PathVariable Long idUsuario) {
        pacienteService.eliminarPaciente(idUsuario);
        return "redirect:/pacientes";
    }

}