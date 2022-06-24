/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facadeImp;

import com.cwsprog.proyectoBarberia.app.facade.IFacturas;
import com.cwsprog.proyectoBarberia.app.modelo.Facturas;
import com.cwsprog.proyectoBarberia.app.utilities.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class FacturasImp implements IFacturas{
    
    EntityManager entity =JPAUtil.getEntityManagerFactory().createEntityManager();
    List<Facturas> listFacturas = new ArrayList<Facturas>();
	
    @Override
    public List<Facturas> findAll(){
	try {
            this.entity.getTransaction().begin();
            //Query q = this.entity.createNativeQuery("Select * From Facturas");
            Query q = this.entity.createQuery("SELECT u FROM Factura u");
            this.listFacturas = q.getResultList();
			
	} catch (Exception e) {
            e.printStackTrace();
        }
	return this.listFacturas;
    }
	
    @Override
    public Facturas findById(int id) {
    Facturas facturas = new Facturas();
	try {
            this.entity.getTransaction().begin();
            facturas = this.entity.find(Facturas.class, id);
            System.out.print("@@ " + facturas.toString());
	} catch (Exception e) {
            e.printStackTrace();
        }
	return facturas;
    }
	
    @Override
    public void add(Facturas facturas) {
	try {
            this.entity.getTransaction().begin();
            this.entity.persist(facturas);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void update(Facturas facturas) {
	try {
            this.entity.getTransaction().begin();
            this.entity.merge(facturas);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void delete(Facturas facturas) {
        try {
            this.entity.getTransaction().begin();
            this.entity.remove(facturas);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
}