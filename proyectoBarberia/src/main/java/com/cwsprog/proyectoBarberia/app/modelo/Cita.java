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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ADMIN
 */
@Entity 
@Table(name="cita")
public class Cita implements Serializable{
    
    private static final long serialversionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCita;
    @Column(name="agendaCita")
    private String agendaCita;
    @Column(name="servicioCita")
    private String servicioCita;
    
    @OneToMany (cascade ={CascadeType.MERGE})
    @JoinColumn (name="idAdministradorFk", referencedColumnName = "idAdministradorFk")
    private Administrador idAdministradorFk;
    
    @OneToMany (cascade ={CascadeType.MERGE})
    @JoinColumn (name="idServiciosFk", referencedColumnName = "idServiciosFk")
    private Servicios idServiciosFk;

    public Cita() {
    }

    public Cita(int idCita, String agendaCita, String servicioCita, Administrador idAdministradorFk, Servicios idServiciosFk) {
        this.idCita = idCita;
        this.agendaCita = agendaCita;
        this.servicioCita = servicioCita;
        this.idAdministradorFk = idAdministradorFk;
        this.idServiciosFk = idServiciosFk;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getAgendaCita() {
        return agendaCita;
    }

    public void setAgendaCita(String agendaCita) {
        this.agendaCita = agendaCita;
    }

    public String getServicioCita() {
        return servicioCita;
    }

    public void setServicioCita(String servicioCita) {
        this.servicioCita = servicioCita;
    }

    public Administrador getIdAdministradorFk() {
        return idAdministradorFk;
    }

    public void setIdAdministradorFk(Administrador idAdministradorFk) {
        this.idAdministradorFk = idAdministradorFk;
    }

    public Servicios getIdServiciosFk() {
        return idServiciosFk;
    }

    public void setIdServiciosFk(Servicios idServiciosFk) {
        this.idServiciosFk = idServiciosFk;
    }

    @Override
    public String toString() {
        return "Cita{" + "idCita=" + idCita + ", agendaCita=" + agendaCita + ", servicioCita=" + servicioCita + ", idAdministradorFk=" + idAdministradorFk + ", idServiciosFk=" + idServiciosFk + '}';
    }
    
}
