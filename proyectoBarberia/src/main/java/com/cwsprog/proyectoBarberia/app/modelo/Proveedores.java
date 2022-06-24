/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */
@Entity 
@Table(name="proveedores")
public class Proveedores implements Serializable{
    
    private static final long serialversionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProveedores;
    @Column(name="nombreProveedores")
    private String nombreProveedores;
    @Column(name="correoProveedores")
    private String correoProveedores;
    @Column(name="DireccionProveedores")
    private String DireccionProveedores;
    @Column(name="telefonoProveedores")
    private int telefonoProveedores;

    @ManyToOne (cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idRolFK",referencedColumnName = "idRol")
    private Rol idRolFk;
    
    @ManyToMany (cascade = {CascadeType.MERGE})
    @JoinColumn(name ="idCompraFk", referencedColumnName = "idCompra")
    private Compra idCompraFk;
    
    public Proveedores() {
    }

    public Proveedores(int idProveedores, String nombreProveedores, String correoProveedores, String DireccionProveedores, int telefonoProveedores, Rol idRolFk, Compra idCompraFk) {
        this.idProveedores = idProveedores;
        this.nombreProveedores = nombreProveedores;
        this.correoProveedores = correoProveedores;
        this.DireccionProveedores = DireccionProveedores;
        this.telefonoProveedores = telefonoProveedores;
        this.idRolFk = idRolFk;
        this.idCompraFk = idCompraFk;
    }

    public int getIdProveedores() {
        return idProveedores;
    }

    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }

    public String getNombreProveedores() {
        return nombreProveedores;
    }

    public void setNombreProveedores(String nombreProveedores) {
        this.nombreProveedores = nombreProveedores;
    }

    public String getCorreoProveedores() {
        return correoProveedores;
    }

    public void setCorreoProveedores(String correoProveedores) {
        this.correoProveedores = correoProveedores;
    }

    public String getDireccionProveedores() {
        return DireccionProveedores;
    }

    public void setDireccionProveedores(String DireccionProveedores) {
        this.DireccionProveedores = DireccionProveedores;
    }

    public int getTelefonoProveedores() {
        return telefonoProveedores;
    }

    public void setTelefonoProveedores(int telefonoProveedores) {
        this.telefonoProveedores = telefonoProveedores;
    }

    public Rol getIdRolFk() {
        return idRolFk;
    }

    public void setIdRolFk(Rol idRolFk) {
        this.idRolFk = idRolFk;
    }

    public Compra getIdCompraFk() {
        return idCompraFk;
    }

    public void setIdCompraFk(Compra idCompraFk) {
        this.idCompraFk = idCompraFk;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "idProveedores=" + idProveedores + ", nombreProveedores=" + nombreProveedores + ", correoProveedores=" + correoProveedores + ", DireccionProveedores=" + DireccionProveedores + ", telefonoProveedores=" + telefonoProveedores + ", idRolFk=" + idRolFk + ", idCompraFk=" + idCompraFk + '}';
    }
    
}
