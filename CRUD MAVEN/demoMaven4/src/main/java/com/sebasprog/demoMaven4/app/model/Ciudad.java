package com.sebasprog.demoMaven4.app.model;

public class Ciudad {
	private String id;
	private String nombre_ciudad;
	private String codigo_ciudad;
	private long fk_departamento;
	
	public Ciudad() {
		
	}

	public Ciudad(String id, String nombre_ciudad, String codigo_ciudad, long fk_departamento) {
		super();
		this.id = id;
		this.nombre_ciudad = nombre_ciudad;
		this.codigo_ciudad = codigo_ciudad;
		this.fk_departamento = fk_departamento;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre_ciudad() {
		return nombre_ciudad;
	}

	public void setNombre_ciudad(String nombre_ciudad) {
		this.nombre_ciudad = nombre_ciudad;
	}

	public String getCodigo_ciudad() {
		return codigo_ciudad;
	}

	public void setCodigo_ciudad(String codigo_ciudad) {
		this.codigo_ciudad = codigo_ciudad;
	}

	public long getFk_departamento() {
		return fk_departamento;
	}

	public void setFk_departamento(long fk_departamento) {
		this.fk_departamento = fk_departamento;
	}
	
}
