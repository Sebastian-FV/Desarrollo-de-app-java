/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.modelo;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */
@Entity 
@Table(name="agenda")
public class Agenda implements Serializable{
    
    private static final long serialversionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAgenda;
    @Column(name="idBarbero")
    private int idBarbero;
    @Column(name="idCliente")
    private int idCliente;
    @Column(name="fechaAgenda")
    private Date fechaAgenda;
    @Column(name="horaAgenda")
    private Time horaAgenda;
    
    @OneToMany (cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idAdministradorFk",referencedColumnName = "idAdministrador")
    private Administrador idAdministradorFk;
    
    @ManyToOne (cascade = {CascadeType.MERGE})
    @JoinColumn(name = "idBarberoFk",referencedColumnName = "idBarbero")
    private Barbero idBarberoFk;

    public Agenda() {
    }

    public Agenda(int idAgenda, int idBarbero, int idCliente, Date fechaAgenda, Time horaAgenda, Administrador idAdministradorFk, Barbero idBarberoFk) {
        this.idAgenda = idAgenda;
        this.idBarbero = idBarbero;
        this.idCliente = idCliente;
        this.fechaAgenda = fechaAgenda;
        this.horaAgenda = horaAgenda;
        this.idAdministradorFk = idAdministradorFk;
        this.idBarberoFk = idBarberoFk;
    }

    public int getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        this.idAgenda = idAgenda;
    }

    public int getIdBarbero() {
        return idBarbero;
    }

    public void setIdBarbero(int idBarbero) {
        this.idBarbero = idBarbero;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaAgenda() {
        return fechaAgenda;
    }

    public void setFechaAgenda(Date fechaAgenda) {
        this.fechaAgenda = fechaAgenda;
    }

    public Time getHoraAgenda() {
        return horaAgenda;
    }

    public void setHoraAgenda(Time horaAgenda) {
        this.horaAgenda = horaAgenda;
    }

    public Administrador getIdAdministradorFk() {
        return idAdministradorFk;
    }

    public void setIdAdministradorFk(Administrador idAdministradorFk) {
        this.idAdministradorFk = idAdministradorFk;
    }

    public Barbero getIdBarberoFk() {
        return idBarberoFk;
    }

    public void setIdBarberoFk(Barbero idBarberoFk) {
        this.idBarberoFk = idBarberoFk;
    }

    @Override
    public String toString() {
        return "Agenda{" + "idAgenda=" + idAgenda + ", idBarbero=" + idBarbero + ", idCliente=" + idCliente + ", fechaAgenda=" + fechaAgenda + ", horaAgenda=" + horaAgenda + ", idAdministradorFk=" + idAdministradorFk + ", idBarberoFk=" + idBarberoFk + '}';
    }
    
}
