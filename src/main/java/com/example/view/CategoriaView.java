package com.example.view;

import com.example.model.Categoria;
import com.example.service.CategoriaService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("categorias")
public class CategoriaView extends VerticalLayout {

    private CategoriaService categoriaService = new CategoriaService();
    private Grid<Categoria> grid = new Grid<>(Categoria.class);

    public CategoriaView() {
        grid.setColumns("idCategoria", "nombre");

    TextField nombre = new TextField("Nombre de Categoría");

        Button addButton = new Button("Agregar Categoría", e -> {
            Categoria nueva = new Categoria(categoriaService.findAll().size() + 1,
                                            nombre.getValue());
            categoriaService.save(nueva);
            grid.setItems(categoriaService.findAll());
            nombre.clear();
        });

        Button deleteButton = new Button("Eliminar Categoría", e -> {
            if (!grid.getSelectedItems().isEmpty()) {
                Categoria seleccionada = grid.getSelectedItems().iterator().next();
                categoriaService.delete(seleccionada.getIdCategoria());
                grid.setItems(categoriaService.findAll());
            }
        });

        add(nombre, addButton, deleteButton, grid);
    }
}
