package com.sebasprog.demoMaven4.app.model;

import java.util.Date;

public class Empleado {

	private long id;
	private String tipo_documento;
	private long numero_documento;
	private String nombres;
	private String apellidos;
	private long id_departamento;
	private String direccion;
	private String correo_electronico;
	private long telefono;
	private Date fecha_hora_crea;
	private Date fecha_hora_modifica;

	public Empleado() {
	}

	public Empleado(long id, String tipo_documento, long numero_documento, String nombres, String apellidos,
			long id_departamento, String direccion, String correo_electronico, long telefono, Date fecha_hora_crea,
			Date fecha_hora_modifica) {
		super();
		this.id = id;
		this.tipo_documento = tipo_documento;
		this.numero_documento = numero_documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.id_departamento = id_departamento;
		this.direccion = direccion;
		this.correo_electronico = correo_electronico;
		this.telefono = telefono;
		this.fecha_hora_crea = fecha_hora_crea;
		this.fecha_hora_modifica = fecha_hora_modifica;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public long getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(long numero_documento) {
		this.numero_documento = numero_documento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public long getId_departamento() {
		return id_departamento;
	}

	public void setId_departamento(long id_departamento) {
		this.id_departamento = id_departamento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public Date getFecha_hora_crea() {
		return fecha_hora_crea;
	}

	public void setFecha_hora_crea(Date fecha_hora_crea) {
		this.fecha_hora_crea = fecha_hora_crea;
	}

	public Date getFecha_hora_modifica() {
		return fecha_hora_modifica;
	}

	public void setFecha_hora_modifica(Date fecha_hora_modifica) {
		this.fecha_hora_modifica = fecha_hora_modifica;
	}

}
