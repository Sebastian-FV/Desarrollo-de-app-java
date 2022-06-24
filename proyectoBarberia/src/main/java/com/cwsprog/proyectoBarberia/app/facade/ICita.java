/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facade;

import com.cwsprog.proyectoBarberia.app.modelo.Cita;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ICita {
    
    public List<Cita> findAll();
    public Cita findById(int id);
    public void add(Cita cita);
    public void update(Cita cita);
    public void delete(Cita cita);   
}