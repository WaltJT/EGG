CREATE DATABASE EGG;

USE EGG;

CREATE TABLE USUARIOS (

ID INT NOT NULL AUTO_INCREMENT,

NOMBRE VARCHAR(50),

APELLIDO VARCHAR(50),

EDAD INT(3),

ESTADO_CIVIL VARCHAR (50),

PRIMARY KEY (ID)

);

INSERT INTO USUARIOS (NOMBRE,APELLIDO,EDAD,ESTADO_CIVIL) VALUES ('Alfredo','Gomez','55','Casado');

INSERT INTO USUARIOS (NOMBRE,APELLIDO,EDAD,ESTADO_CIVIL) VALUES ('Juan','Perez','36','Casado');

