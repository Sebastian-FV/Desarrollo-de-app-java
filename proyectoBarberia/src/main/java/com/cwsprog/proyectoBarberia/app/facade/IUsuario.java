/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facade;

import com.cwsprog.proyectoBarberia.app.modelo.Usuario;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface IUsuario {
    
    public List<Usuario> findAll();
    public Usuario findById(int id);
    public void add(Usuario usuario);
    public void update(Usuario usuario);
    public void delete(Usuario usuario);   
}