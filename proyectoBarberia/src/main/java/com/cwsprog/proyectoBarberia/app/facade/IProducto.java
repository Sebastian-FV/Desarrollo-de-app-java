/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facade;

import com.cwsprog.proyectoBarberia.app.modelo.Producto;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IProducto {
    
    public List<Producto> findAll();
    public Producto findById(int id);
    public void add(Producto producto);
    public void update(Producto producto);
    public void delete(Producto producto);
}
