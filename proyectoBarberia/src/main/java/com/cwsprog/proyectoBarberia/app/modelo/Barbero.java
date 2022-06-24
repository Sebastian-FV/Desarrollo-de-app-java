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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */
@Entity 
@Table(name="barbero")
public class Barbero implements Serializable{
    
    private static final long serialversionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBarbero;
    @Column(name="nombreBarbero")
    private String nombreBarbero;
    @Column(name="correoBarbero")
    private String correoBarbero;
    @Column(name="telefonoBarbero")
    private int telefonoBarbero;
    
    @OneToMany(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idRolFk",referencedColumnName = "idRol")
    private Rol idRolFk;
    
    @OneToMany(cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idAgendaFk",referencedColumnName = "idAgenda")
    private Agenda idAgendaFk;

    public Barbero() {
    
    }

    public Barbero(int idBarbero, String nombreBarbero, String correoBarbero, int telefonoBarbero, Rol idRolFk, Agenda idAgendaFk) {
        this.idBarbero = idBarbero;
        this.nombreBarbero = nombreBarbero;
        this.correoBarbero = correoBarbero;
        this.telefonoBarbero = telefonoBarbero;
        this.idRolFk = idRolFk;
        this.idAgendaFk = idAgendaFk;
    }

    public int getIdBarbero() {
        return idBarbero;
    }

    public void setIdBarbero(int idBarbero) {
        this.idBarbero = idBarbero;
    }

    public String getNombreBarbero() {
        return nombreBarbero;
    }

    public void setNombreBarbero(String nombreBarbero) {
        this.nombreBarbero = nombreBarbero;
    }

    public String getCorreoBarbero() {
        return correoBarbero;
    }

    public void setCorreoBarbero(String correoBarbero) {
        this.correoBarbero = correoBarbero;
    }

    public int getTelefonoBarbero() {
        return telefonoBarbero;
    }

    public void setTelefonoBarbero(int telefonoBarbero) {
        this.telefonoBarbero = telefonoBarbero;
    }

    public Rol getIdRolFk() {
        return idRolFk;
    }

    public void setIdRolFk(Rol idRolFk) {
        this.idRolFk = idRolFk;
    }

    public Agenda getIdAgendaFk() {
        return idAgendaFk;
    }

    public void setIdAgendaFk(Agenda idAgendaFk) {
        this.idAgendaFk = idAgendaFk;
    }

    @Override
    public String toString() {
        return "Barbero{" + "idBarbero=" + idBarbero + ", nombreBarbero=" + nombreBarbero + ", correoBarbero=" + correoBarbero + ", telefonoBarbero=" + telefonoBarbero + ", idRolFk=" + idRolFk + ", idAgendaFk=" + idAgendaFk + '}';
    }
    
}
