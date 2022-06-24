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
@Table(name="servicios")
public class Servicios implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idServicios;
    @Column(name="nombreServicios")
    private String nombreServicios;
    @Column(name="precioServicios")
    private double precioServicios;

    @ManyToMany (cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idVentaFK",referencedColumnName = "idVenta")
    private Venta idVentaFk;
    
    @ManyToOne (cascade = {CascadeType.MERGE})
    @JoinColumn(name ="idCitaFk", referencedColumnName = "idCita")
    private Cita idCitaFk;
    
    public Servicios() {
    }

    public Servicios(int idServicios, String nombreServicios, double precioServicios, Venta idVentaFk, Cita idCitaFk) {
        this.idServicios = idServicios;
        this.nombreServicios = nombreServicios;
        this.precioServicios = precioServicios;
        this.idVentaFk = idVentaFk;
        this.idCitaFk = idCitaFk;
    }

    public int getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(int idServicios) {
        this.idServicios = idServicios;
    }

    public String getNombreServicios() {
        return nombreServicios;
    }

    public void setNombreServicios(String nombreServicios) {
        this.nombreServicios = nombreServicios;
    }

    public double getPrecioServicios() {
        return precioServicios;
    }

    public void setPrecioServicios(double precioServicios) {
        this.precioServicios = precioServicios;
    }

    public Venta getIdVentaFk() {
        return idVentaFk;
    }

    public void setIdVentaFk(Venta idVentaFk) {
        this.idVentaFk = idVentaFk;
    }

    public Cita getIdCitaFk() {
        return idCitaFk;
    }

    public void setIdCitaFk(Cita idCitaFk) {
        this.idCitaFk = idCitaFk;
    }

    @Override
    public String toString() {
        return "Servicios{" + "idServicios=" + idServicios + ", nombreServicios=" + nombreServicios + ", precioServicios=" + precioServicios + ", idVentaFk=" + idVentaFk + ", idCitaFk=" + idCitaFk + '}';
    }
    
}
