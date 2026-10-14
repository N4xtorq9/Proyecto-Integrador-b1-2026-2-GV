package com.example.model;

import java.time.LocalDateTime;

public class Administradores {

    private Long idAdministrador; // para que sea autogenerado por la BD
    private String nombre;
    private String email;
    private String clave;
    private String telefono;
    private String direccion;
    private String rol; // 'admin', 'usuario', etc.
    private String estado; // 'activo', 'inactivo', 'baneado'
    private LocalDateTime fechaRegistro;

    public Administradores(Long idAdministrador, String nombre, String email, String telefono, String direccion, String rol, String estado, LocalDateTime fechaRegistro) {
        this.idAdministrador = idAdministrador;
        this.nombre = nombre;
        this.email = email;
        this.clave = clave;
        this.telefono = telefono;
        this.direccion = direccion;
        this.rol = rol;
        this.estado = estado;
        this.fechaRegistro = fechaRegistro;


        
    
    }
}


