/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.modelo;

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

/**
 *
 * @author ADMIN
 */
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
	
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
    @JoinColumn(name = "idRolFk",referencedColumnName = "idRol")
    private Rol idRolFk;

    public Usuario() {
        
    }

    public Usuario(int id, String nombreUsuario, String apellidoUruario, String contraseñaUsuario, int telefonoUsuario, String direccionUsuario, int identificacionUsuario, String correoUsuario, Date nacimientoUsuario, Rol idRolFk) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUruario = apellidoUruario;
        this.contraseñaUsuario = contraseñaUsuario;
        this.telefonoUsuario = telefonoUsuario;
        this.direccionUsuario = direccionUsuario;
        this.identificacionUsuario = identificacionUsuario;
        this.correoUsuario = correoUsuario;
        this.nacimientoUsuario = nacimientoUsuario;
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

    public Rol getIdRolFk() {
        return idRolFk;
    }

    public void setIdRolFk(Rol idRolFk) {
        this.idRolFk = idRolFk;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombreUsuario=" + nombreUsuario + ", apellidoUruario=" + apellidoUruario + ", contrase\u00f1aUsuario=" + contraseñaUsuario + ", telefonoUsuario=" + telefonoUsuario + ", direccionUsuario=" + direccionUsuario + ", identificacionUsuario=" + identificacionUsuario + ", correoUsuario=" + correoUsuario + ", nacimientoUsuario=" + nacimientoUsuario + ", idRolFk=" + idRolFk + '}';
    }

    public Object getid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
