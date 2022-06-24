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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */  
@Entity 
@Table(name="servicios")
public class Venta implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVenta;
    @Column(name="idClienteVenta")
    private int idClienteVenta;
    @Column(name="fechaVenta")
    private Date fechaVenta;
    @Column(name="idProductoVenta")
    private int idProductoVenta;
    @Column(name="idServicoVenta")
    private int idServicoVenta;
    @Column(name="totalVenta")
    private double totalVenta;

    @ManyToOne(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idInventarioFK",referencedColumnName = "idInventario")
    private Inventario idInventarioFk;
    
    @ManyToOne (cascade = {CascadeType.MERGE})
    @JoinColumn(name ="idFacturasFk", referencedColumnName = "idFacturas")
    private Facturas idFacturasFk;
    
    @ManyToMany (cascade = {CascadeType.MERGE})
    @JoinColumn(name ="idProductoFk", referencedColumnName = "idProducto")
    private Producto idProductoFk;
    
    @ManyToMany (cascade = {CascadeType.MERGE})
    @JoinColumn(name ="idServiciosFk", referencedColumnName = "idServicios")
    private Servicios idServiciosFk;
    
    public Venta() {
    }

    public Venta(int idVenta, int idClienteVenta, Date fechaVenta, int idProductoVenta, int idServicoVenta, double totalVenta, Inventario idInventarioFk, Facturas idFacturasFk, Producto idProductoFk, Servicios idServiciosFk) {
        this.idVenta = idVenta;
        this.idClienteVenta = idClienteVenta;
        this.fechaVenta = fechaVenta;
        this.idProductoVenta = idProductoVenta;
        this.idServicoVenta = idServicoVenta;
        this.totalVenta = totalVenta;
        this.idInventarioFk = idInventarioFk;
        this.idFacturasFk = idFacturasFk;
        this.idProductoFk = idProductoFk;
        this.idServiciosFk = idServiciosFk;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdClienteVenta() {
        return idClienteVenta;
    }

    public void setIdClienteVenta(int idClienteVenta) {
        this.idClienteVenta = idClienteVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getIdProductoVenta() {
        return idProductoVenta;
    }

    public void setIdProductoVenta(int idProductoVenta) {
        this.idProductoVenta = idProductoVenta;
    }

    public int getIdServicoVenta() {
        return idServicoVenta;
    }

    public void setIdServicoVenta(int idServicoVenta) {
        this.idServicoVenta = idServicoVenta;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public Inventario getIdInventarioFk() {
        return idInventarioFk;
    }

    public void setIdInventarioFk(Inventario idInventarioFk) {
        this.idInventarioFk = idInventarioFk;
    }

    public Facturas getIdFacturasFk() {
        return idFacturasFk;
    }

    public void setIdFacturasFk(Facturas idFacturasFk) {
        this.idFacturasFk = idFacturasFk;
    }

    public Producto getIdProductoFk() {
        return idProductoFk;
    }

    public void setIdProductoFk(Producto idProductoFk) {
        this.idProductoFk = idProductoFk;
    }

    public Servicios getIdServiciosFk() {
        return idServiciosFk;
    }

    public void setIdServiciosFk(Servicios idServiciosFk) {
        this.idServiciosFk = idServiciosFk;
    }

    @Override
    public String toString() {
        return "Venta{" + "idVenta=" + idVenta + ", idClienteVenta=" + idClienteVenta + ", fechaVenta=" + fechaVenta + ", idProductoVenta=" + idProductoVenta + ", idServicoVenta=" + idServicoVenta + ", totalVenta=" + totalVenta + ", idInventarioFk=" + idInventarioFk + ", idFacturasFk=" + idFacturasFk + ", idProductoFk=" + idProductoFk + ", idServiciosFk=" + idServiciosFk + '}';
    }
    
}
