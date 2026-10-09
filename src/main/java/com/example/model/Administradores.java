package com.example.model;

import java.time.LocalDateTime;

public class Administradores {

    private Long idAdministrador; // para que sea autogenerado por la BD
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;
    private String rol; // 'admin', 'usuario', etc.
    private String estado; // 'activo', 'inactivo', 'baneado'
    private LocalDateTime fechaRegistro;
}
