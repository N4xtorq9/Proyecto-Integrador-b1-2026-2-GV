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
    NombreProducto NVARCHAR(100) NOT NULL,
    Descripcion NVARCHAR(500),
    IdCategoria INT NOT NULL,
    Estado NVARCHAR(20) DEFAULT 'Disponible', 
    FOREIGN KEY (IdUsuario) REFERENCES Usuarios(IdUsuario),
    FOREIGN KEY (IdCategoria) REFERENCES Categorias(IdCategoria)
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
    IdUsuario1 INT NOT NULL,
    IdUsuario2 INT NOT NULL,
    IdProducto1 INT NOT NULL,
    IdProducto2 INT NOT NULL,
    Fecha DATETIME DEFAULT GETDATE(),
    Estado NVARCHAR(20) DEFAULT 'Pendiente',
    FOREIGN KEY (IdUsuario1) REFERENCES Usuarios(IdUsuario),
    FOREIGN KEY (IdUsuario2) REFERENCES Usuarios(IdUsuario),
    FOREIGN KEY (IdProducto1) REFERENCES Productos(IdProducto),
    FOREIGN KEY (IdProducto2) REFERENCES Productos(IdProducto)
);

CREATE TABLE Mensajes (
    IdMensaje INT IDENTITY(1,1) PRIMARY KEY,
    IdIntercambio INT NOT NULL,
    IdRemitente INT NOT NULL,
    Texto NVARCHAR(500),
    Fecha DATETIME DEFAULT GETDATE(),
    FOREIGN KEY (IdIntercambio) REFERENCES Intercambios(IdIntercambio),
    FOREIGN KEY (IdRemitente) REFERENCES Usuarios(IdUsuario)
);

-- Categorías
INSERT INTO Categorias (Nombre)
VALUES ('Deportes'), ('Electrónica');

-- Usuarios
INSERT INTO Usuarios (Nombre, Correo, Clave, Telefono, FotoPerfil, rol, Estado)
VALUES 
('Juan Pérez', 'juan@example.com', '123456', '3001112233', 'juan.jpg', 'Usuario', 1),
('María López', 'maria@example.com', 'abcdef', '3004445566', 'maria.jpg', 'Usuario', 2);

-- Productos
INSERT INTO Productos (IdUsuario, Nombre, Descripcion, IdCategoria, Estado)
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

-- Mensajes del intercambio
INSERT INTO Mensajes (IdIntercambio, IdRemitente, Texto)
VALUES 
(1, 1, 'Interesado en la PS4'),
(1, 2, 'Podemos concretar el intercambio');
