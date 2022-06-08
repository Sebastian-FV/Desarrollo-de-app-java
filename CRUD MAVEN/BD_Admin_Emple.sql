drop database BD_Admin_Emple;

create database BD_Admin_Emple;
use BD_Admin_Emple;

create table Departamentos(
idDepartamento int (50) primary key, /*(autoincremental , deshabilitado en el formulario)*/
departamento_codigo int not null,
departamento_nombre varchar (50) not null,
fecha_hora_crea datetime not null, /*(Solo visual)*/
fecha_hora_modifica datetime not null/*(Solo visual)*/
);


create table Empleados(
idEmpleado int (50) primary key, /*(autoincremental , deshabilitado en el formulario)*/
documento_tipo varchar (20) not null, /*(RC, TI, CC, CE)*/
documento_numero  char (10),
nombres varchar (100) not null,
apellidos varchar (100) not null,
departamentos_id bigint (100) not null, /*(Relación)*/ 
ciudad varchar (100) not null,
dirección varchar (100) not null,
correo_electrónico varchar (100),
Teléfono varchar (100),
fecha_hora_crea datetime not null, /*(Solo visual)*/
fecha_hora_modifica datetime not null /*(Solo visual)*/
);

create table Ciudad(
nombre_ciudad varchar (100) not null,
codigo_cuidad int not null
);