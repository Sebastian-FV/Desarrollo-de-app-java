/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facade;

import com.cwsprog.proyectoBarberia.app.modelo.Agenda;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IAgenda {
    
    public List<Agenda> findAll();
    public Agenda findById(int id);
    public void add(Agenda agenda);
    public void update(Agenda agenda);
    public void delete(Agenda agenda);   
}
