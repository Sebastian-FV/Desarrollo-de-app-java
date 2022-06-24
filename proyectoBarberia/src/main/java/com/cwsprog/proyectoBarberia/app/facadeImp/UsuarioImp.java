/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facadeImp;

import com.cwsprog.proyectoBarberia.app.facade.IUsuario;
import com.cwsprog.proyectoBarberia.app.modelo.Usuario;
import com.cwsprog.proyectoBarberia.app.utilities.JPAUtil;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class UsuarioImp implements IUsuario{
    
    EntityManager entity =JPAUtil.getEntityManagerFactory().createEntityManager();
    List<Usuario> listUsuario = new ArrayList<Usuario>();
	
    @Override
    public List<Usuario> findAll(){
	try {
            this.entity.getTransaction().begin();
            //Query q = this.entity.createNativeQuery("Select * From Usuario");
            Query q = this.entity.createQuery("SELECT u FROM Usuario u");
            this.listUsuario = q.getResultList();
			
	} catch (Exception e) {
            e.printStackTrace();
        }
	return this.listUsuario;
    }
	
    @Override
    public Usuario findById(int id) {
    Usuario usuario = new Usuario();
	try {
            this.entity.getTransaction().begin();
            usuario = this.entity.find(Usuario.class, id);
            System.out.print("@@ " + usuario.toString());
	} catch (Exception e) {
            e.printStackTrace();
        }
	return usuario;
    }
	
    @Override
    public void add(Usuario usuario) {
	try {
            this.entity.getTransaction().begin();
            this.entity.persist(usuario);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void update(Usuario usuario) {
	try {
            this.entity.getTransaction().begin();
            this.entity.merge(usuario);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void delete(Usuario usuario) {
        try {
            this.entity.getTransaction().begin();
            this.entity.remove(usuario);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }

    public String validarCliente(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String validarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}