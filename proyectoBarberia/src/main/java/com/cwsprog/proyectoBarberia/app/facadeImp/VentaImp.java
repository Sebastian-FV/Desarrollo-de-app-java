/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facadeImp;

import com.cwsprog.proyectoBarberia.app.facade.IVenta;
import com.cwsprog.proyectoBarberia.app.modelo.Venta;
import com.cwsprog.proyectoBarberia.app.utilities.JPAUtil;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class VentaImp implements IVenta{

    EntityManager entity =JPAUtil.getEntityManagerFactory().createEntityManager();
    List<Venta> listVenta = new ArrayList<Venta>();
	
    @Override
    public List<Venta> findAll(){
	try {
            this.entity.getTransaction().begin();
            //Query q = this.entity.createNativeQuery("Select * From Venta");
            Query q = this.entity.createQuery("SELECT u FROM Venta u");
            this.listVenta = q.getResultList();
			
	} catch (Exception e) {
            e.printStackTrace();
        }
	return this.listVenta;
    }
	
    @Override
    public Venta findById(int id) {
    Venta venta = new Venta();
	try {
            this.entity.getTransaction().begin();
            venta = this.entity.find(Venta.class, id);
            System.out.print("@@ " + venta.toString());
	} catch (Exception e) {
            e.printStackTrace();
        }
	return venta;
    }
	
    @Override
    public void add(Venta venta) {
	try {
            this.entity.getTransaction().begin();
            this.entity.persist(venta);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void update(Venta venta) {
	try {
            this.entity.getTransaction().begin();
            this.entity.merge(venta);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void delete(Venta venta) {
        try {
            this.entity.getTransaction().begin();
            this.entity.remove(venta);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
}