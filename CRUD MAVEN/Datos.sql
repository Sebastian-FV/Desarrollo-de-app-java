use BD_Admin_Emple;

#departamento
insert into Departamentos(idDepartamento,departamento_codigo,departamento_nombre,fecha_hora_crea,fecha_hora_modifica) values ('1','1111','Cundinamarca','2022-03-05  07:05:22' ,'2022-03-05  10:13:24');

#Empleados
insert into Empleados(idEmpleado,documento_tipo,documento_numero,nombres,apellidos,departamentos_id,ciudad,dirección,correo_electrónico,Teléfono,fecha_hora_crea,fecha_hora_modifica) value ('1','C.C', '1000602861','Luigui Alexander', 'Rodriguez Dimate','1', 'Bogota', 'calle 50 # 62 f 77', 'alex.lui@gmail.com','3204429180','2022-02-10  08:11:24','2022-05-02 11:31:11'); 

#ciudad 
insert into Ciudad(nombre_ciudad,codigo_cuidad) values ('Bogota','1');

select*from Empleados;