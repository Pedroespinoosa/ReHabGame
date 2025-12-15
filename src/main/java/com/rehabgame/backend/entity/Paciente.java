package com.rehabgame.backend.entity;

import jakarta.persistence.*;

// Clase Paciente, que hereda de Usuario y tiene sus propios atributos
@Entity
@Table(name = "pacientes")
public class Paciente extends Usuario {

    private String patologia;

    private String region;

    public Paciente() {
    }

    // Getters y Setters
    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
