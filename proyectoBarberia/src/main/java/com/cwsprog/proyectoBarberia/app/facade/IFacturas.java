/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facade;

import com.cwsprog.proyectoBarberia.app.modelo.Facturas;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IFacturas {
    
    public List<Facturas> findAll();
    public Facturas findById(int id);
    public void add(Facturas facturas);
    public void update(Facturas facturas);
    public void delete(Facturas facturas);
}
