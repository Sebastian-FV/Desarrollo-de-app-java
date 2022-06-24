/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facadeImp;

import com.cwsprog.proyectoBarberia.app.facade.IInventario;
import com.cwsprog.proyectoBarberia.app.modelo.Inventario;
import com.cwsprog.proyectoBarberia.app.utilities.JPAUtil;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class InventarioImp implements IInventario{
    
    EntityManager entity =JPAUtil.getEntityManagerFactory().createEntityManager();
    List<Inventario> listInventario = new ArrayList<Inventario>();
	
    @Override
    public List<Inventario> findAll(){
	try {
            this.entity.getTransaction().begin();
            //Query q = this.entity.createNativeQuery("Select * From Inventario");
            Query q = this.entity.createQuery("SELECT u FROM Inventario u");
            this.listInventario = q.getResultList();
			
	} catch (Exception e) {
            e.printStackTrace();
        }
	return this.listInventario;
    }
	
    @Override
    public Inventario findById(int id) {
    Inventario inventario = new Inventario();
	try {
            this.entity.getTransaction().begin();
            inventario = this.entity.find(Inventario.class, id);
            System.out.print("@@ " + inventario.toString());
	} catch (Exception e) {
            e.printStackTrace();
        }
	return inventario;
    }
	
    @Override
    public void add(Inventario inventario) {
	try {
            this.entity.getTransaction().begin();
            this.entity.persist(inventario);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void update(Inventario inventario) {
	try {
            this.entity.getTransaction().begin();
            this.entity.merge(inventario);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void delete(Inventario inventario) {
        try {
            this.entity.getTransaction().begin();
            this.entity.remove(inventario);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
}