package com.sebasprog.proyectopepe.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class TipoDocumento implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoDocumento;
	@Column(name="nombreTipoDocumento")
	private String nombreTipoDocumento;
	@Column(name="abreviaturaTipoDocumento")
	private String abreviaturaTipoDocumento;
	
	@OneToMany(mappedBy = "idTipoDocumento",cascade = {CascadeType.MERGE})
	private List<Usuario> lisUsuario;

	public TipoDocumento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoDocumento(int idTipoDocumento, String nombreTipoDocumento, String abreviaturaTipoDocumento,
			List<Usuario> lisUsuario) {
		super();
		this.idTipoDocumento = idTipoDocumento;
		this.nombreTipoDocumento = nombreTipoDocumento;
		this.abreviaturaTipoDocumento = abreviaturaTipoDocumento;
		this.lisUsuario = lisUsuario;
	}

	public int getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(int idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public String getNombreTipoDocumento() {
		return nombreTipoDocumento;
	}

	public void setNombreTipoDocumento(String nombreTipoDocumento) {
		this.nombreTipoDocumento = nombreTipoDocumento;
	}

	public String getAbreviaturaTipoDocumento() {
		return abreviaturaTipoDocumento;
	}

	public void setAbreviaturaTipoDocumento(String abreviaturaTipoDocumento) {
		this.abreviaturaTipoDocumento = abreviaturaTipoDocumento;
	}

	public List<Usuario> getLisUsuario() {
		return lisUsuario;
	}

	public void setLisUsuario(List<Usuario> lisUsuario) {
		this.lisUsuario = lisUsuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "TipoDocumento [idTipoDocumento=" + idTipoDocumento + ", nombreTipoDocumento=" + nombreTipoDocumento
				+ ", abreviaturaTipoDocumento=" + abreviaturaTipoDocumento + ", lisUsuario=" + lisUsuario + "]";
	}
	
	
}
