/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facadeImp;

import com.cwsprog.proyectoBarberia.app.facade.ICompra;
import com.cwsprog.proyectoBarberia.app.modelo.Compra;
import com.cwsprog.proyectoBarberia.app.utilities.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class CompraImp implements ICompra{
    
    EntityManager entity =JPAUtil.getEntityManagerFactory().createEntityManager();
    List<Compra> listCompra = new ArrayList<Compra>();
	
    @Override
    public List<Compra> findAll(){
	try {
            this.entity.getTransaction().begin();
            //Query q = this.entity.createNativeQuery("Select * From Compra");
            Query q = this.entity.createQuery("SELECT u FROM Compra u");
            this.listCompra = q.getResultList();
			
	} catch (Exception e) {
            e.printStackTrace();
        }
	return this.listCompra;
    }
	
    @Override
    public Compra findById(int id) {
    Compra compra = new Compra();
	try {
            this.entity.getTransaction().begin();
            compra = this.entity.find(Compra.class, id);
            System.out.print("@@ " + compra.toString());
	} catch (Exception e) {
            e.printStackTrace();
        }
	return compra;
    }
	
    @Override
    public void add(Compra compra) {
	try {
            this.entity.getTransaction().begin();
            this.entity.persist(compra);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void update(Compra compra) {
	try {
            this.entity.getTransaction().begin();
            this.entity.merge(compra);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void delete(Compra compra) {
        try {
            this.entity.getTransaction().begin();
            this.entity.remove(compra);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
}