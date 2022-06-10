package com.sebasprog.proyectopepe.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="nombreUsuario")
	private String nombreUsuario;
	@Column(name="apellidoUruario")
	private String apellidoUruario;
	@Column(name="contraseñaUsuario")
	private String contraseñaUsuario;
	@Column(name="telefonoUsuario")
	private int telefonoUsuario;
	@Column(name="direccionUsuario")
	private String direccionUsuario;
	@Column(name="identificacionUsuario")
	private int identificacionUsuario;
	@Column(name="correoUsuario")
	private String correoUsuario;
	@Column(name="nacimientoUsuario")
	private Date nacimientoUsuario;
	
	@ManyToOne(cascade = {CascadeType.MERGE})
	@JoinColumn(name="idTipoDocumentoFk",referencedColumnName = "idTipoDocumento")
	private TipoDocumento idTipoDocumentoFk;
	
	@ManyToOne(cascade = {CascadeType.MERGE})
	@JoinColumn(name="idRolFk",referencedColumnName = "idRol")
	private Rol idRolFk;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int id, String nombreUsuario, String apellidoUruario, String contraseñaUsuario, int telefonoUsuario,
			String direccionUsuario, int identificacionUsuario, String correoUsuario, Date nacimientoUsuario,
			TipoDocumento idTipoDocumentoFk, Rol idRolFk) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUruario = apellidoUruario;
		this.contraseñaUsuario = contraseñaUsuario;
		this.telefonoUsuario = telefonoUsuario;
		this.direccionUsuario = direccionUsuario;
		this.identificacionUsuario = identificacionUsuario;
		this.correoUsuario = correoUsuario;
		this.nacimientoUsuario = nacimientoUsuario;
		this.idTipoDocumentoFk = idTipoDocumentoFk;
		this.idRolFk = idRolFk;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUruario() {
		return apellidoUruario;
	}

	public void setApellidoUruario(String apellidoUruario) {
		this.apellidoUruario = apellidoUruario;
	}

	public String getContraseñaUsuario() {
		return contraseñaUsuario;
	}

	public void setContraseñaUsuario(String contraseñaUsuario) {
		this.contraseñaUsuario = contraseñaUsuario;
	}

	public int getTelefonoUsuario() {
		return telefonoUsuario;
	}

	public void setTelefonoUsuario(int telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	public String getDireccionUsuario() {
		return direccionUsuario;
	}

	public void setDireccionUsuario(String direccionUsuario) {
		this.direccionUsuario = direccionUsuario;
	}

	public int getIdentificacionUsuario() {
		return identificacionUsuario;
	}

	public void setIdentificacionUsuario(int identificacionUsuario) {
		this.identificacionUsuario = identificacionUsuario;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public Date getNacimientoUsuario() {
		return nacimientoUsuario;
	}

	public void setNacimientoUsuario(Date nacimientoUsuario) {
		this.nacimientoUsuario = nacimientoUsuario;
	}

	public TipoDocumento getIdTipoDocumentoFk() {
		return idTipoDocumentoFk;
	}

	public void setIdTipoDocumentoFk(TipoDocumento idTipoDocumentoFk) {
		this.idTipoDocumentoFk = idTipoDocumentoFk;
	}

	public Rol getIdRolFk() {
		return idRolFk;
	}

	public void setIdRolFk(Rol idRolFk) {
		this.idRolFk = idRolFk;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombreUsuario=" + nombreUsuario + ", apellidoUruario=" + apellidoUruario
				+ ", contraseñaUsuario=" + contraseñaUsuario + ", telefonoUsuario=" + telefonoUsuario
				+ ", direccionUsuario=" + direccionUsuario + ", identificacionUsuario=" + identificacionUsuario
				+ ", correoUsuario=" + correoUsuario + ", nacimientoUsuario=" + nacimientoUsuario
				+ ", idTipoDocumentoFk=" + idTipoDocumentoFk + ", idRolFk=" + idRolFk + "]";
	}
	
}
