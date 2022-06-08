package com.sebasprog.demoMaven4.app.model;

import java.util.Date;
import java.util.List;

public class Departamento {

	private String id;
	private String codigo_departamento;
	private String nombre_departamento;
	private Date fecha_hora_crea;
	private Date fecha_hora_modifica;
	private List<Ciudad> fk_Ciudades_id;

	public Departamento() {
	}

	public Departamento(String id, String codigo_departamento, String nombre_departamento, Date fecha_hora_crea,
			Date fecha_hora_modifica, List<Ciudad> fk_Ciudades_id) {
		super();
		this.id = id;
		this.codigo_departamento = codigo_departamento;
		this.nombre_departamento = nombre_departamento;
		this.fecha_hora_crea = fecha_hora_crea;
		this.fecha_hora_modifica = fecha_hora_modifica;
		this.fk_Ciudades_id = fk_Ciudades_id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodigo_departamento() {
		return codigo_departamento;
	}

	public void setCodigo_departamento(String codigo_departamento) {
		this.codigo_departamento = codigo_departamento;
	}

	public String getNombre_departamento() {
		return nombre_departamento;
	}

	public void setNombre_departamento(String nombre_departamento) {
		this.nombre_departamento = nombre_departamento;
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

	public List<Ciudad> getFk_Ciudades_id() {
		return fk_Ciudades_id;
	}

	public void setFk_Ciudades_id(List<Ciudad> fk_Ciudades_id) {
		this.fk_Ciudades_id = fk_Ciudades_id;
	}

	public void setId(long long1) {
		// TODO Auto-generated method stub

	}

}
