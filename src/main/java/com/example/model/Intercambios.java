package com.example.model;

public class Intercambios {

    private int IdIntercambio;
    private int IdUsuario;
    private int IdProducto;
    private int IdAdministrador;
    private String Estado;

    public Intercambios(int idIntercambio, int IdUsuario, int IdProducto, int IdAdministrador, String Estado) {
        this.IdIntercambio = idIntercambio;
        this.IdUsuario = IdUsuario;
        this.IdProducto = IdProducto;
        this.IdProducto = IdAdministrador;
        this.Estado = Estado;
    }

    public int getIdIntercambio() {
        return IdIntercambio;
    }

    public void setIdIntercambio(int idIntercambio) {
        IdIntercambio = idIntercambio;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int idProducto) {
        IdProducto = idProducto;
    }

    public int getIdAdministrador() {
        return IdAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        IdAdministrador = idAdministrador;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    @Override
    public String toString() {
        return "Intercambios [IdIntercambio=" + IdIntercambio + ", IdUsuario=" + IdUsuario + ", IdProducto="
                + IdProducto + ", IdAdministrador=" + IdAdministrador + ", Estado=" + Estado + "]";
    }


}
