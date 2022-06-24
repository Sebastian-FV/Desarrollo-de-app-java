/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facade;

import com.cwsprog.proyectoBarberia.app.modelo.Compra;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ICompra {
    
    public List<Compra> findAll();
    public Compra findById(int id);
    public void add(Compra compra);
    public void update(Compra compra);
    public void delete(Compra compra);
}
