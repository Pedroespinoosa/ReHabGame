package com.rehabgame.backend.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "usuarios")
public class Usuario {
    // Nuestros atributos definidos en el diagrama de clases para 'Usuario'
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    private String nombre;

    private String contrasena;

    private String correo;

    private String telefono;
   
    @Column(name = "fotografia_perfil")
    private String fotografiaPerfil;

    // Constructor vacío 
    public Usuario() {
    }

    // Getters y Setters
    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFotografiaPerfil() {
        return fotografiaPerfil;
    }

    public void setFotografiaPerfil(String fotografiaPerfil) {
        this.fotografiaPerfil = fotografiaPerfil;
    }
}

