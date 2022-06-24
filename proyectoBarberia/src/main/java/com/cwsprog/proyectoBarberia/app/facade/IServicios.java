/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facade;

import com.cwsprog.proyectoBarberia.app.modelo.Servicios;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IServicios {
    
    public List<Servicios> findAll();
    public Servicios findById(int id);
    public void add(Servicios servicios);
    public void update(Servicios servicios);
    public void delete(Servicios servicios);
}
