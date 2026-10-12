package com.example.service;

import com.example.model.Categoria;
import java.util.ArrayList;
import java.util.List;

public class CategoriaService implements CrudService<Categoria> {
    private List<Categoria> categorias = new ArrayList<>();

    @Override
    public List<Categoria> findAll() {
        return categorias;
    }
    
    @Override
    public void save(Categoria categoria) {
        categorias.add(categoria);
    }

    @Override
    public void update(Categoria categoria) {
        categorias.replaceAll(c -> c.getIdCategoria() == categoria.getIdCategoria() ? categoria : c);
    }

    @Override
    public void delete(int id) {
        categorias.removeIf(c -> c.getIdCategoria() == id);
    }
}