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
@Table(name="compra")
public class Compra implements Serializable{
    
    private static final long serialversionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompra;
    @Column(name="idProvedoresCompra")
    private int idProvedoresCompra;
    @Column(name="idProductoCompra")
    private int idProductoCompra;
    @Column(name="totalCompra")
    private double totalCompra;
    
    @ManyToOne (cascade = {CascadeType.MERGE})
    @JoinColumn(name ="idInventarioFk", referencedColumnName = "idInventario")
    private Inventario idInventarioFk;
    
    @ManyToMany (cascade = {CascadeType.MERGE})
    @JoinColumn(name ="idProveedoresFk", referencedColumnName = "idProveedores")
    private Proveedores idProveedoresFk;

    public Compra() {
        
    }

    public Compra(int idCompra, int idProvedoresCompra, int idProductoCompra, double totalCompra, Inventario idInventarioFk, Proveedores idProveedoresFk) {
        this.idCompra = idCompra;
        this.idProvedoresCompra = idProvedoresCompra;
        this.idProductoCompra = idProductoCompra;
        this.totalCompra = totalCompra;
        this.idInventarioFk = idInventarioFk;
        this.idProveedoresFk = idProveedoresFk;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProvedoresCompra() {
        return idProvedoresCompra;
    }

    public void setIdProvedoresCompra(int idProvedoresCompra) {
        this.idProvedoresCompra = idProvedoresCompra;
    }

    public int getIdProductoCompra() {
        return idProductoCompra;
    }

    public void setIdProductoCompra(int idProductoCompra) {
        this.idProductoCompra = idProductoCompra;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public Inventario getIdInventarioFk() {
        return idInventarioFk;
    }

    public void setIdInventarioFk(Inventario idInventarioFk) {
        this.idInventarioFk = idInventarioFk;
    }

    public Proveedores getIdProveedoresFk() {
        return idProveedoresFk;
    }

    public void setIdProveedoresFk(Proveedores idProveedoresFk) {
        this.idProveedoresFk = idProveedoresFk;
    }

    @Override
    public String toString() {
        return "Compra{" + "idCompra=" + idCompra + ", idProvedoresCompra=" + idProvedoresCompra + ", idProductoCompra=" + idProductoCompra + ", totalCompra=" + totalCompra + ", idInventarioFk=" + idInventarioFk + ", idProveedoresFk=" + idProveedoresFk + '}';
    }
    
}
