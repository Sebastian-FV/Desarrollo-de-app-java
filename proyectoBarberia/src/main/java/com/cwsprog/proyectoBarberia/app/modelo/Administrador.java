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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */
@Entity 
@Table(name="administrador") 
public class Administrador implements Serializable{
    
    private static final long serialversionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdministrador;
    @Column(name="nombreAdministrador")
    private String nombreAdministrador;
    @Column(name="correoAdministrador")
    private String correoAdministrador;
    @Column(name="telefonoAdministrador")
    private int telefonoAdministrador;
    
    @ManyToOne (cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idRolFK",referencedColumnName = "idRol")
    private Rol idRolFk;
    
    @OneToMany (cascade = {CascadeType.MERGE})
    @JoinColumn(name ="idFacturasFk", referencedColumnName = "idFacturas")
    private Facturas idFacturasFk;
    
    @OneToMany (cascade = {CascadeType.MERGE})
    @JoinColumn(name ="idCitaFk", referencedColumnName = "idCita")
    private Cita idCitaFk;
    
    @OneToOne (cascade = {CascadeType.MERGE})
    @JoinColumn(name ="idAgendaFk", referencedColumnName = "idAgenda")
    private Agenda idAgendaFk;

    public Administrador() {
    }

    public Administrador(int idAdministrador, String nombreAdministrador, String correoAdministrador, int telefonoAdministrador, Rol idRolFk, Facturas idFacturasFk, Cita idCitaFk, Agenda idAgendaFk) {
        this.idAdministrador = idAdministrador;
        this.nombreAdministrador = nombreAdministrador;
        this.correoAdministrador = correoAdministrador;
        this.telefonoAdministrador = telefonoAdministrador;
        this.idRolFk = idRolFk;
        this.idFacturasFk = idFacturasFk;
        this.idCitaFk = idCitaFk;
        this.idAgendaFk = idAgendaFk;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNombreAdministrador() {
        return nombreAdministrador;
    }

    public void setNombreAdministrador(String nombreAdministrador) {
        this.nombreAdministrador = nombreAdministrador;
    }

    public String getCorreoAdministrador() {
        return correoAdministrador;
    }

    public void setCorreoAdministrador(String correoAdministrador) {
        this.correoAdministrador = correoAdministrador;
    }

    public int getTelefonoAdministrador() {
        return telefonoAdministrador;
    }

    public void setTelefonoAdministrador(int telefonoAdministrador) {
        this.telefonoAdministrador = telefonoAdministrador;
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

    public Cita getIdCitaFk() {
        return idCitaFk;
    }

    public void setIdCitaFk(Cita idCitaFk) {
        this.idCitaFk = idCitaFk;
    }

    public Agenda getIdAgendaFk() {
        return idAgendaFk;
    }

    public void setIdAgendaFk(Agenda idAgendaFk) {
        this.idAgendaFk = idAgendaFk;
    }

    @Override
    public String toString() {
        return "Administrador{" + "idAdministrador=" + idAdministrador + ", nombreAdministrador=" + nombreAdministrador + ", correoAdministrador=" + correoAdministrador + ", telefonoAdministrador=" + telefonoAdministrador + ", idRolFk=" + idRolFk + ", idFacturasFk=" + idFacturasFk + ", idCitaFk=" + idCitaFk + ", idAgendaFk=" + idAgendaFk + '}';
    }
    
}