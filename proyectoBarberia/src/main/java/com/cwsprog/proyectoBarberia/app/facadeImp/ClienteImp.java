/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facadeImp;

import com.cwsprog.proyectoBarberia.app.facade.ICliente;
import com.cwsprog.proyectoBarberia.app.modelo.Cliente;
import com.cwsprog.proyectoBarberia.app.utilities.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class ClienteImp implements ICliente{

    EntityManager entity =JPAUtil.getEntityManagerFactory().createEntityManager();
    List<Cliente> listClientes = new ArrayList<Cliente>();
	
    @Override
    public List<Cliente> findAll(){
	try {
            this.entity.getTransaction().begin();
            //Query q = this.entity.createNativeQuery("Select * From Cliente");
            Query q = this.entity.createQuery("SELECT u FROM Cliente u");
            this.listClientes = q.getResultList();
			
	} catch (Exception e) {
            e.printStackTrace();
        }
	return this.listClientes;
    }
	
    @Override
    public Cliente findById(int id) {
    Cliente cliente = new Cliente();
	try {
            this.entity.getTransaction().begin();
            cliente = this.entity.find(Cliente.class, id);
            System.out.print("@@ " + cliente.toString());
	} catch (Exception e) {
            e.printStackTrace();
        }
	return cliente;
    }
	
    @Override
    public void add(Cliente cliente) {
	try {
            this.entity.getTransaction().begin();
            this.entity.persist(cliente);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void update(Cliente cliente) {
	try {
            this.entity.getTransaction().begin();
            this.entity.merge(cliente);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void delete(Cliente cliente) {
        try {
            this.entity.getTransaction().begin();
            this.entity.remove(cliente);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }

    public String validarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}