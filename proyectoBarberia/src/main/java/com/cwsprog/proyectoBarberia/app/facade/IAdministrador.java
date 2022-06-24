/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facade;

import com.cwsprog.proyectoBarberia.app.modelo.Administrador;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IAdministrador {
    
    public List<Administrador> findAll();
    public Administrador findById(int id);
    public void add(Administrador administrador);
    public void update(Administrador administrador);
    public void delete(Administrador administrador);   
}
