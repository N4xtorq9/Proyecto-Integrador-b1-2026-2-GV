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

CREATE TABLE Usuarios (
    idUsuarios INT PRIMARY KEY IDENTITY(1,1),
    nombre NVARCHAR(100) NOT NULL,
    email NVARCHAR(100) NOT NULL UNIQUE,
    idRoles INT FOREIGN KEY REFERENCES Roles(idRoles)
);
GO

CREATE TABLE Administradores (
    idAdministradores INT PRIMARY KEY IDENTITY(1,1),
    nombre NVARCHAR(100) NOT NULL,
    email NVARCHAR(100) NOT NULL UNIQUE,
    idRoles INT FOREIGN KEY REFERENCES Roles(idRoles)
);

