package com.example.model;

public class Productos {

    private int idProducto; // para que sea autogenerado por la BD
    private int IdUsuario;
    private int IdCategoria;
    private int IdAdministrador;
    private String NombreProducto;
    private String Descripcion;
    private String Estado;

    public Productos(int idProducto, int IdUsuario, int IdCategoria, int IdAdministrador, String NombreProducto, String Descripcion, String Estado) {
        this.idProducto = idProducto;
        this.IdUsuario = IdUsuario;
        this.IdCategoria = IdCategoria;
        this.IdAdministrador = IdAdministrador;
        this.NombreProducto = NombreProducto;
        this.Descripcion = Descripcion;
        this.Estado = Estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        IdCategoria = idCategoria;
    }

    public int getIdAdministrador() {
        return IdAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        IdAdministrador = idAdministrador;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    @Override
    public String toString() {
        return "Productos [idProducto=" + idProducto + ", IdUsuario=" + IdUsuario + ", IdCategoria=" + IdCategoria
                + ", IdAdministrador=" + IdAdministrador + ", NombreProducto=" + NombreProducto + ", Descripcion="
                + Descripcion + ", Estado=" + Estado + "]";
    }
}