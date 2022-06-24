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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */
@Entity 
@Table(name="facturas")
public class Facturas implements Serializable{
    
    private static final long serialversionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFacturas;
    @Column(name="fechaFacturas")
    private Date fechaFacturas;
    @Column(name="idCliente")
    private int idCliente;
    
    @OneToMany (cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idVentaFK",referencedColumnName = "idVenta")
    private Venta idVentaFk;
    
    @OneToOne (cascade = {CascadeType.MERGE})
    @JoinColumn(name ="idAdministradorFk", referencedColumnName = "idAdministrador")
    private Administrador idAdministradorFk;
    
    @OneToMany (cascade = {CascadeType.MERGE})
    @JoinColumn(name ="idClienteFk", referencedColumnName = "idCliente")
    private Cliente idClienteFk;

    public Facturas() {
    }

    public Facturas(int idFacturas, Date fechaFacturas, int idCliente, Venta idVentaFk, Administrador idAdministradorFk, Cliente idClienteFk) {
        this.idFacturas = idFacturas;
        this.fechaFacturas = fechaFacturas;
        this.idCliente = idCliente;
        this.idVentaFk = idVentaFk;
        this.idAdministradorFk = idAdministradorFk;
        this.idClienteFk = idClienteFk;
    }

    public int getIdFacturas() {
        return idFacturas;
    }

    public void setIdFacturas(int idFacturas) {
        this.idFacturas = idFacturas;
    }

    public Date getFechaFacturas() {
        return fechaFacturas;
    }

    public void setFechaFacturas(Date fechaFacturas) {
        this.fechaFacturas = fechaFacturas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Venta getIdVentaFk() {
        return idVentaFk;
    }

    public void setIdVentaFk(Venta idVentaFk) {
        this.idVentaFk = idVentaFk;
    }

    public Administrador getIdAdministradorFk() {
        return idAdministradorFk;
    }

    public void setIdAdministradorFk(Administrador idAdministradorFk) {
        this.idAdministradorFk = idAdministradorFk;
    }

    public Cliente getIdClienteFk() {
        return idClienteFk;
    }

    public void setIdClienteFk(Cliente idClienteFk) {
        this.idClienteFk = idClienteFk;
    }

    @Override
    public String toString() {
        return "Facturas{" + "idFacturas=" + idFacturas + ", fechaFacturas=" + fechaFacturas + ", idCliente=" + idCliente + ", idVentaFk=" + idVentaFk + ", idAdministradorFk=" + idAdministradorFk + ", idClienteFk=" + idClienteFk + '}';
    }
    
}
