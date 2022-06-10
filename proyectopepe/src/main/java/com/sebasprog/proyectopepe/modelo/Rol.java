package com.sebasprog.proyectopepe.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Rol")
public class Rol implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRol;
	@Column(name="nombreRol")
	private String nombreRol;
	@Column(name="descRol")
	private String descRol;
	
	@OneToMany(mappedBy = "idRolFk",cascade = {CascadeType.MERGE} )
	private List<Usuario> lisUsuario;
	
}
