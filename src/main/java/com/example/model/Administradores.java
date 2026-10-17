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

    public Administradores(Long idAdministrador, String nombre, String email, String clave, String telefono,
            String direccion, String rol, String estado, LocalDateTime fechaRegistro) {
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

    public Long getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(Long idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDateTime fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public String toString() {
        return "Administradores [idAdministrador=" + idAdministrador + ", nombre=" + nombre + ", email=" + email
                + ", clave=" + clave + ", telefono=" + telefono + ", direccion=" + direccion + ", rol=" + rol
                + ", estado=" + estado + ", fechaRegistro=" + fechaRegistro + "]";
    }
    
}


