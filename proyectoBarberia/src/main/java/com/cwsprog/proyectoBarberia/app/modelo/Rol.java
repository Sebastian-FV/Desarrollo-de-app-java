/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.modelo;

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

/**
 *
 * @author ADMIN
 */
@Entity 
@Table(name="rol")
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
    private List<Cliente> lisCliente;

    public Rol() {
    }

    public Rol(int idRol, String nombreRol, String descRol, List<Cliente> lisCliente) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.descRol = descRol;
        this.lisCliente = lisCliente;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescRol() {
        return descRol;
    }

    public void setDescRol(String descRol) {
        this.descRol = descRol;
    }

    public List<Cliente> getLisCliente() {
        return lisCliente;
    }

    public void setLisCliente(List<Cliente> lisCliente) {
        this.lisCliente = lisCliente;
    }

    @Override
    public String toString() {
        return "Rol{" + "idRol=" + idRol + ", nombreRol=" + nombreRol + ", descRol=" + descRol + ", lisCliente=" + lisCliente + '}';
    }
      
}
