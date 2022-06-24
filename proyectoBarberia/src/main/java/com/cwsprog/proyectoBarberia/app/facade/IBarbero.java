/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facade;

import com.cwsprog.proyectoBarberia.app.modelo.Barbero;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IBarbero {
    
    public List<Barbero> findAll();
    public Barbero findById(int id);
    public void add(Barbero barbero);
    public void update(Barbero barbero);
    public void delete(Barbero barbero);   
}
