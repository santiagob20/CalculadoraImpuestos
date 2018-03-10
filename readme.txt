README FIRST

____________

Para ejecutar el programa se deben seguir los siguientes pasos para asegurar su correcto funcionamiento.

Requisitos para el funcionamiento:
-Sistema operativo compatible con Java.
- Tener instalada la versión más reciente de Java runtime Environment.
-Tener instalado el motor de base de datos PostreSQL y pgAdmin 3 o superior.


1. Abrir el pgAdmin de PostgreSQL y conectarse a un servidor con dirección ip= 127.0.0.1, dns= localhost y puerto 5432.
2.Crear nuevo usuario= admin y contraseña= admin. Puede usar el siguiente query para crear el usuario:
CREATE USER admin WITH
	LOGIN
	SUPERUSER
	CREATEDB
	CREATEROLE
	INHERIT
	NOREPLICATION
	CONNECTION LIMIT -1
	PASSWORD 'admin';

2. Crear la base de datos llamada productos en PostgreSQL con owner= admin y tablespace=pg_default. Puede usar el siguiente query para crear la base de datos:
CREATE DATABASE productos
    WITH 
    OWNER = admin
    ENCODING = 'UTF8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

3. Crear la tabla productos en la base de datos actual. Puede usar el siguiente query crearla:
CREATE TABLE public.productos
(
    codigo serial NOT NULL,
    nombre_producto text NOT NULL,
    valor_producto integer NOT NULL,
    categoria text NOT NULL,
    impuesto integer NOT NULL,
    total integer NOT NULL,
    PRIMARY KEY (codigo)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.productos
    OWNER to admin;

5. Después de tener la base de datos con los pasos anteriores realizados, se puede realizar la ejecución del calcImpuestos.jar


Cualquier duda con respecto al programa puede contactarse mediante correo electrónico a iurintiveb@ucentral.edu.co
