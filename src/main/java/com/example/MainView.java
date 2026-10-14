package com.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Gestión de Roles InterApp")
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        setSizeFull();
        setPadding(true);
        setSpacing(true);

        H2 titulo = new H2("Gestión de Roles InterApp");

        TabSheet tabSheet = new TabSheet();
        tabSheet.setWidthFull();

        tabSheet.add("Usuarios", crearSeccionUsuario());
        tabSheet.add("Administradores", crearSeccionAdministrador());
        tabSheet.add("Categorías", crearSeccionCategoria());
        tabSheet.add("Productos", crearSeccionProducto());
        tabSheet.add("Intercambios", crearSeccionIntercambio());

        add(titulo, tabSheet);
    }

    // Método privado para gestionar la primera entidad
    private Component crearSeccionUsuario() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("ID");
        TextField nombreField = new TextField("Nombre");
        TextField emailField = new TextField("Email");
        TextField claveField = new TextField("Clave");
        TextField fechaNacimientoField = new TextField("Fecha de Nacimiento");
        TextField telefonoField = new TextField("Teléfono");
        TextField direccionField = new TextField("Dirección");
        TextField estadoField = new TextField("Estado");

        FormLayout form = new FormLayout(idField, nombreField, emailField, claveField, fechaNacimientoField, telefonoField, direccionField, estadoField);

        Button btnCrear = new Button("Crear", e -> 
            Notification.show("Usuarios - Crear: " + nombreField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> 
            Notification.show("Usuarios - Consultar ID: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e -> 
            Notification.show("Usuarios - Actualizar ID: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e -> 
            Notification.show("Usuarios - Eliminar ID: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            nombreField.clear();
            emailField.clear();
            claveField.clear();
            fechaNacimientoField.clear();
            telefonoField.clear();
            direccionField.clear();
            estadoField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Nombre").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Email").setAutoWidth(true);
        grid.addColumn(row -> row[3]).setHeader("Clave").setAutoWidth(true);
        grid.addColumn(row -> row[4]).setHeader("Fecha de Nacimiento").setAutoWidth(true);
        grid.addColumn(row -> row[5]).setHeader( "Teléfono").setAutoWidth(true);
        grid.addColumn(row -> row[6]).setHeader("Dirección").setAutoWidth(true);
        grid.addColumn(row -> row[7]).setHeader("Estado").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }


    //Sección de Administradores
    // Método privado para gestionar la segunda entidad
    private Component crearSeccionAdministrador() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("Código / ID");
        TextField tituloField = new TextField("Título");
        TextField categoriaField = new TextField("Categoría");

        FormLayout form = new FormLayout(idField, tituloField, categoriaField);

        Button btnCrear = new Button("Crear", e -> 
            Notification.show("Administradores - Crear: " + tituloField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> 
            Notification.show("Administradores - Consultar Código: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e -> 
            Notification.show("Administradores - Actualizar Código: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e -> 
            Notification.show("Administradores - Eliminar Código: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            tituloField.clear();
            categoriaField.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(
            btnCrear, btnConsultar, btnActualizar, btnEliminar, btnLimpiar
        );
        acciones.getStyle().set("flex-wrap", "wrap");

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("Código / ID").setAutoWidth(true);
        grid.addColumn(row -> row[1]).setHeader("Título").setAutoWidth(true);
        grid.addColumn(row -> row[2]).setHeader("Categoría").setAutoWidth(true);

        layout.add(form, acciones, grid);
        return layout;
    }

    //Sección de Categorías

    private Component crearSeccionCategoria() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idField = new TextField("idCategoria / ID");
        TextField nombreCategoriaField = new TextField("nombreCategoria");

        FormLayout form = new FormLayout(idField, nombreCategoriaField, categoriaField);

        Button btnCrear = new Button("Crear", e -> 
            Notification.show("Categorías - Crear: " + nombreCategoriaField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> 
            Notification.show("Categorías - Consultar idCategoria: " + idField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e -> 
            Notification.show("Categorías - Actualizar idCategoria: " + idField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e -> 
            Notification.show("Categorías - Eliminar idCategoria: " + idField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idField.clear();
            nombreCategoriaField.clear();
        });

    }

    //Sección de Productos
    private Component crearSeccionProducto() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idProductoField = new TextField("idProducto / ID");
        TextField idUsuarioField = new TextField("idUsuario");
        TextField nombreProductoField = new TextField("nombreProducto");
        TextField descripcionField = new TextField("descripcion");
        TextField idCategoriaField = new TextField("idCategoria");
        TextField estadoField = new TextField("estado");

        FormLayout form = new FormLayout(idProductoField, idUsuarioField, nombreProductoField, descripcionField, idCategoriaField, estadoField);

        Button btnCrear = new Button("Crear", e -> 
            Notification.show("Productos - Crear: " + nombreProductoField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> 
            Notification.show("Productos - Consultar idProducto: " + idProductoField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e -> 
            Notification.show("Productos - Actualizar idProducto: " + idProductoField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e -> 
            Notification.show("Productos - Eliminar idProducto: " + idProductoField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idProductoField.clear();
            idUsuarioField.clear();
            nombreProductoField.clear();
            descripcionField.clear();
            idCategoriaField.clear();
            estadoField.clear();
        });

    }

    // Sección de Intercambios
    private Component crearSeccionIntercambio() {
        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField idIntercambioField = new TextField("idIntercambio / ID");
        TextField idUsuarioField = new TextField("idUsuario");
        TextField idProductoField = new TextField("idProducto");
        TextField estadoField = new TextField("estado");

        FormLayout form = new FormLayout(idIntercambioField, idUsuarioField, idProductoField, estadoField);

        Button btnCrear = new Button("Crear", e -> 
            Notification.show("Intercambios - Crear: " + idIntercambioField.getValue())
        );
        btnCrear.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button btnConsultar = new Button("Consultar", e -> 
            Notification.show("Intercambios - Consultar idIntercambio: " + idIntercambioField.getValue())
        );

        Button btnActualizar = new Button("Actualizar", e -> 
            Notification.show("Intercambios - Actualizar idIntercambio: " + idIntercambioField.getValue())
        );

        Button btnEliminar = new Button("Eliminar", e -> 
            Notification.show("Intercambios - Eliminar idIntercambio: " + idIntercambioField.getValue())
        );
        btnEliminar.addThemeVariants(ButtonVariant.LUMO_ERROR);

        Button btnLimpiar = new Button("Limpiar", e -> {
            idIntercambioField.clear();
            idUsuarioField.clear();
            idProductoField.clear();
            estadoField.clear();
        });

    }

}
