package com.example.view;

import com.example.model.Producto;
import com.example.service.ProductoService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("productos")
public class ProductoView extends VerticalLayout {

    private ProductoService productoService = new ProductoService();
    private Grid<Producto> grid = new Grid<>(Producto.class);

    public ProductoView() {
        grid.setColumns("idProducto", "nombre", "descripcion", "precio", "idCategoria");

        TextField nombre = new TextField("Nombre del Producto");
        TextField descripcion = new TextField("Descripción");
        NumberField precio = new NumberField("Precio");
        TextField idCategoria = new TextField("ID Categoría");

        Button addButton = new Button("Agregar Producto", e -> {
            Producto nuevo = new Producto(productoService.findAll().size() + 1,
                                          nombre.getValue(),
                                          descripcion.getValue(),
                                          precio.getValue(),
                                          Integer.parseInt(idCategoria.getValue()));
            productoService.save(nuevo);
            grid.setItems(productoService.findAll());
            nombre.clear();
            descripcion.clear();
            precio.clear();
            idCategoria.clear();
        });

        Button deleteButton = new Button("Eliminar Producto", e -> {
            if (!grid.getSelectedItems().isEmpty()) {
                Producto seleccionado = grid.getSelectedItems().iterator().next();
                productoService.delete(seleccionado.getIdProducto());
                grid.setItems(productoService.findAll());
            }
        });

        add(nombre, descripcion, precio, idCategoria, addButton, deleteButton, grid);
    }
}
