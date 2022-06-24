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
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */
@Entity 
@Table(name="inventario")
public class Inventario implements Serializable{
    
    private static final long serialversionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInventario;
    @Column(name="idProveedores")
    private int idProveedores;
    @Column(name="idProductos")
    private String idProductos;
    @Column(name="CantidadInventario")
    private int CantidadInventario;
    @Column(name="fechaOpenInventario")
    private Date fechaOpenInventario;
    @Column(name="fechaExitInventario")
    private Date fechaExitInventario;
    @Column(name="totalInventario")
    private double totalInventario;

    @OneToMany (cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idCompraFK",referencedColumnName = "idCompra")
    private Compra idCompraFk;
    
    @OneToMany (cascade = {CascadeType.MERGE})
    @JoinColumn(name ="idVentaFk", referencedColumnName = "idVenta")
    private Venta idVentaFk;
    
    public Inventario() {
    }

    public Inventario(int idInventario, int idProveedores, String idProductos, int CantidadInventario, Date fechaOpenInventario, Date fechaExitInventario, double totalInventario, Compra idCompraFk, Venta idVentaFk) {
        this.idInventario = idInventario;
        this.idProveedores = idProveedores;
        this.idProductos = idProductos;
        this.CantidadInventario = CantidadInventario;
        this.fechaOpenInventario = fechaOpenInventario;
        this.fechaExitInventario = fechaExitInventario;
        this.totalInventario = totalInventario;
        this.idCompraFk = idCompraFk;
        this.idVentaFk = idVentaFk;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getIdProveedores() {
        return idProveedores;
    }

    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }

    public String getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(String idProductos) {
        this.idProductos = idProductos;
    }

    public int getCantidadInventario() {
        return CantidadInventario;
    }

    public void setCantidadInventario(int CantidadInventario) {
        this.CantidadInventario = CantidadInventario;
    }

    public Date getFechaOpenInventario() {
        return fechaOpenInventario;
    }

    public void setFechaOpenInventario(Date fechaOpenInventario) {
        this.fechaOpenInventario = fechaOpenInventario;
    }

    public Date getFechaExitInventario() {
        return fechaExitInventario;
    }

    public void setFechaExitInventario(Date fechaExitInventario) {
        this.fechaExitInventario = fechaExitInventario;
    }

    public double getTotalInventario() {
        return totalInventario;
    }

    public void setTotalInventario(double totalInventario) {
        this.totalInventario = totalInventario;
    }

    public Compra getIdCompraFk() {
        return idCompraFk;
    }

    public void setIdCompraFk(Compra idCompraFk) {
        this.idCompraFk = idCompraFk;
    }

    public Venta getIdVentaFk() {
        return idVentaFk;
    }

    public void setIdVentaFk(Venta idVentaFk) {
        this.idVentaFk = idVentaFk;
    }

    @Override
    public String toString() {
        return "Inventario{" + "idInventario=" + idInventario + ", idProveedores=" + idProveedores + ", idProductos=" + idProductos + ", CantidadInventario=" + CantidadInventario + ", fechaOpenInventario=" + fechaOpenInventario + ", fechaExitInventario=" + fechaExitInventario + ", totalInventario=" + totalInventario + ", idCompraFk=" + idCompraFk + ", idVentaFk=" + idVentaFk + '}';
    }
    
}
