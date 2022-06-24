/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facade;

import com.cwsprog.proyectoBarberia.app.modelo.Rol;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IRol {
    
    public List<Rol> findAll();

    public Rol findById(int IRol);

    public void add(Rol IRol);

    public void update(Rol IRol);

    public void delete(Rol IRol);
}
