package com.example.model;

public class Categorias {
    private int IdCategoria;
    private String nombreCategoria;


    public Categorias(int idCategoria, String nombreCategoria) {
        IdCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }


    public Categorias(int idCategoria, String nombreCategoria) {
        IdCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }


    public int getIdCategoria() {
        return IdCategoria;
    }


    public void setIdCategoria(int idCategoria) {
        IdCategoria = idCategoria;
    }


    public String getNombreCategoria() {
        return nombreCategoria;
    }


    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }


    @Override
    public String toString() {
        return "Categorias [IdCategoria=" + IdCategoria + ", nombreCategoria=" + nombreCategoria + "]";
    }
}

