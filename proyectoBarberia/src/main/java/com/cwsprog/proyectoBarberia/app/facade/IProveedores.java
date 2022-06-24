/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facade;

import com.cwsprog.proyectoBarberia.app.modelo.Proveedores;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IProveedores {
    
    public List<Proveedores> findAll();
    public Proveedores findById(int id);
    public void add(Proveedores proveedores);
    public void update(Proveedores proveedores);
    public void delete(Proveedores proveedores);
}

