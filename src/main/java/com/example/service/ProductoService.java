package com.example.service;

import com.example.model.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoService implements CrudService<Producto> {
    private List<Producto> productos = new ArrayList<>();

    @Override
    public List<Producto> findAll() {
        return productos;
    }

    @Override
    public void save(Producto producto) {
        productos.add(producto);
    }

    @Override
    public void update(Producto producto) {
        productos.replaceAll(p -> p.getIdProducto() == producto.getIdProducto() ? producto : p);
    }

    @Override
    public void delete(int id) {
        productos.removeIf(p -> p.getIdProducto() == id);
    }
}
