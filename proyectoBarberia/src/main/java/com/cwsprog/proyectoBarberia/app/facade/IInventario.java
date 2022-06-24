/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facade;

import com.cwsprog.proyectoBarberia.app.modelo.Inventario;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IInventario {

    public List<Inventario> findAll();
    public Inventario findById(int id);
    public void add(Inventario inventario);
    public void update(Inventario inventario);
    public void delete(Inventario inventario);
}
