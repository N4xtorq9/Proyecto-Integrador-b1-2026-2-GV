Create database Interapp

Use interapp

CREATE TABLE Usuarios (
    IdUsuario INT IDENTITY(1,1) PRIMARY KEY,
    Nombre NVARCHAR(100) NOT NULL,
    Email NVARCHAR(100) UNIQUE NOT NULL,
    Clave NVARCHAR(200) NOT NULL,
    FechaNacimiento DATE,
    Telefono NVARCHAR(20),
    Rol NVARCHAR(50) DEFAULT 'Usuario',
    FotoPerfil NVARCHAR(200),
    Estado BIT DEFAULT 1 -- activo/inactivo
);

CREATE TABLE Categorias (
    IdCategoria INT IDENTITY(1,1) PRIMARY KEY,
    Nombre NVARCHAR(100) NOT NULL
);

CREATE TABLE Productos (
    IdProducto INT IDENTITY(1,1) PRIMARY KEY,
    IdUsuario INT NOT NULL,
    IdCategoria INT NOT NULL,
    IdAdministrador INT NULL, -- Asociado con la tabla Administradores
    NombreProducto NVARCHAR(100) NOT NULL,
    Descripcion NVARCHAR(500),
    Estado NVARCHAR(20) DEFAULT 'Disponible', 
    FOREIGN KEY (IdUsuario) REFERENCES Usuarios(IdUsuario),
    FOREIGN KEY (IdCategoria) REFERENCES Categorias(IdCategoria),
    FOREIGN KEY (IdAdministrador) REFERENCES Administradores(IdAdministrador)
);

CREATE TABLE FotosProducto (
    IdFoto INT IDENTITY(1,1) PRIMARY KEY,
    IdProducto INT NOT NULL,
    UrlFoto NVARCHAR(200) NOT NULL,
    EsPrincipal BIT DEFAULT 0,
    FOREIGN KEY (IdProducto) REFERENCES Productos(IdProducto)
);

CREATE TABLE Intercambios (
    IdIntercambio INT IDENTITY(1,1) PRIMARY KEY,
    IdUsuario INT NOT NULL,
    IdProducto INT NOT NULL,
    IdAdministrador INT NULL, -- Asociado con la tabla Administradores
    Estado NVARCHAR(20) DEFAULT 'Pendiente',
    FOREIGN KEY (IdUsuario) REFERENCES Usuarios(IdUsuario),
    FOREIGN KEY (IdProducto) REFERENCES Productos(IdProducto),
    FOREIGN KEY (IdAdministrador) REFERENCES Administradores(IdAdministrador)
);

CREATE TABLE Administradores (
    idAdministrador INT IDENTITY(1,1) PRIMARY KEY,
    Nombre NVARCHAR(100) NOT NULL,
    Email NVARCHAR(100) UNIQUE NOT NULL,
    Clave NVARCHAR(200) NOT NULL,
    Telefono NVARCHAR(20),
    direccion NVARCHAR(200) NOT NULL,
    Rol NVARCHAR(50) DEFAULT 'Usuario',
    Estado BIT DEFAULT 1, -- activo/inactivo
    FechaRegistro DATETIME DEFAULT GETDATE(),
);

-- Categorías
INSERT INTO Categorias (Nombre)
VALUES ('Deportes'), ('Electrónica');

-- Usuarios
INSERT INTO Usuarios (Nombre, Email, Clave, Telefono, FotoPerfil, rol, Estado)
VALUES 
('Juan Pérez', 'juan@example.com', '123456', '3001112233', 'juan.jpg', 'Usuario', 1),
('María López', 'maria@example.com', 'abcdef', '3004445566', 'maria.jpg', 'Usuario', 2);

-- Productos
INSERT INTO Productos (IdUsuario, NombreProducto, Descripcion, IdCategoria, Estado)
VALUES 
(1, 'Bicicleta de montaña', 'Bicicleta en buen estado, color azul.', 1, 'Disponible'),
(2, 'Consola PS4', 'Consola PS4 con dos controles y juegos.', 2, 'Disponible');

-- Fotos de producto
INSERT INTO FotosProducto (IdProducto, UrlFoto, EsPrincipal)
VALUES 
(1, 'bicicleta.jpg', 1),
(2, 'ps4.jpg', 1);

-- Intercambio entre Juan y María
INSERT INTO Intercambios (IdUsuario1, IdUsuario2, IdProducto1, IdProducto2, Estado)
VALUES (1, 2, 1, 2, 'Pendiente');


