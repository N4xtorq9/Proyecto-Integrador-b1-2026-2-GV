CREATE DATABASE GestionRoles;
GO

USE GestionRoles;
GO

CREATE TABLE Roles (
    idRoles INT PRIMARY KEY IDENTITY(1,1),
    nombre NVARCHAR(100) NOT NULL,
    descripcion NVARCHAR(255) NULL
);
GO

CREATE TABLE Usuario (
    idUsuarios INT PRIMARY KEY IDENTITY(1,1),
    nombre NVARCHAR(100) NOT NULL,
    apellido NVARCHAR(100) NOT NULL,
    email NVARCHAR(100) NOT NULL UNIQUE,
    telefono NVARCHAR(15) NULL,
    direccion NVARCHAR(255) NULL,
    idRoles INT FOREIGN KEY REFERENCES Roles(idRoles),
    estado NVARCHAR(50) NULL,
    fechaRegistro DATETIME DEFAULT GETDATE()
);
GO

CREATE TABLE Administrador (
    idAdministrador INT PRIMARY KEY IDENTITY(1,1),
    nombre NVARCHAR(100) NOT NULL,
    apellido NVARCHAR(100) NOT NULL,
    email NVARCHAR(100) NOT NULL UNIQUE,
    telefono NVARCHAR(15) NULL,
    direccion NVARCHAR(255) NULL,
    idRoles INT FOREIGN KEY REFERENCES Roles(idRoles),
    estado NVARCHAR(50) NULL,
    fechaRegistro DATETIME DEFAULT GETDATE()
);
GO

CREATE TABLE Administradores (
    idAdministradores INT PRIMARY KEY IDENTITY(1,1),
    nombre NVARCHAR(100) NOT NULL,
    email NVARCHAR(100) NOT NULL UNIQUE,
    idRoles INT FOREIGN KEY REFERENCES Roles(idRoles)
);
GO

