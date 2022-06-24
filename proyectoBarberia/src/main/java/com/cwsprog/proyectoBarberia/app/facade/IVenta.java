/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facade;

import com.cwsprog.proyectoBarberia.app.modelo.Venta;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IVenta {
    
    public List<Venta> findAll();
    public Venta findById(int id);
    public void add(Venta venta);
    public void update(Venta venta);
    public void delete(Venta venta);
}
