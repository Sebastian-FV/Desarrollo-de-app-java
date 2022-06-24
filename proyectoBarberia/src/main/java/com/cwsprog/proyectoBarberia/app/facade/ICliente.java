/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facade;

import com.cwsprog.proyectoBarberia.app.modelo.Cliente;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface ICliente {

    public List<Cliente> findAll();
    public Cliente findById(int id);
    public void add(Cliente cliente);
    public void update(Cliente cliente);
    public void delete(Cliente cliente);
}
