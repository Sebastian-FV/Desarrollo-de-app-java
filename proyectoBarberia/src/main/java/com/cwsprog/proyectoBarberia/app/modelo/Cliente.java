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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */
@Entity 
@Table(name="cliente")
public class Cliente implements Serializable{
    
    private static final long serialversionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="nombreCliente")
    private String nombreCliente;
    @Column(name="correoCliente")
    private String correoCliente;
    @Column(name="telefonoCliente")
    private int telefonoCliente;
    @Column(name="direccionCliente")
    private String direccionCliente;
    
    @ManyToOne (cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idRolFK",referencedColumnName = "idRol")
    private Rol idRolFk;
    
    @ManyToOne (cascade = {CascadeType.MERGE})
    @JoinColumn(name ="idFacturasFk", referencedColumnName = "idFacturas")
    private Facturas idFacturasFk;

    public Cliente() {
        
    }

    public Cliente(int idCliente, String nombreCliente, String correoCliente, int telefonoCliente, String direccionCliente, Rol idRolFk, Facturas idFacturasFk) {
        this.id = idCliente;
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        this.telefonoCliente = telefonoCliente;
        this.direccionCliente = direccionCliente;
        this.idRolFk = idRolFk;
        this.idFacturasFk = idFacturasFk;
    }

    public int getIdCliente() {
        return id;
    }

    public void setIdCliente(int idCliente) {
        this.id = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public Rol getIdRolFk() {
        return idRolFk;
    }

    public void setIdRolFk(Rol idRolFk) {
        this.idRolFk = idRolFk;
    }

    public Facturas getIdFacturasFk() {
        return idFacturasFk;
    }

    public void setIdFacturasFk(Facturas idFacturasFk) {
        this.idFacturasFk = idFacturasFk;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + id + ", nombreCliente=" + nombreCliente + ", correoCliente=" + correoCliente + ", telefonoCliente=" + telefonoCliente + ", direccionCliente=" + direccionCliente + ", idRolFk=" + idRolFk + ", idFacturasFk=" + idFacturasFk + '}';
    }
    
}
