/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facadeImp;

import com.cwsprog.proyectoBarberia.app.facade.IProveedores;
import com.cwsprog.proyectoBarberia.app.modelo.Proveedores;
import com.cwsprog.proyectoBarberia.app.utilities.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class  ProveedoresImp implements IProveedores{
    
    EntityManager entity =JPAUtil.getEntityManagerFactory().createEntityManager();
    List<Proveedores> listProveedores = new ArrayList<Proveedores>();
	
    @Override
    public List<Proveedores> findAll(){
	try {
            this.entity.getTransaction().begin();
            //Query q = this.entity.createNativeQuery("Select * From Proveedores");
            Query q = this.entity.createQuery("SELECT u FROM Proveedores u");
            this.listProveedores = q.getResultList();
			
	} catch (Exception e) {
            e.printStackTrace();
        }
	return this.listProveedores;
    }
	
    @Override
    public Proveedores findById(int id) {
    Proveedores proveedores = new Proveedores();
	try {
            this.entity.getTransaction().begin();
            proveedores = this.entity.find(Proveedores.class, id);
            System.out.print("@@ " + proveedores.toString());
	} catch (Exception e) {
            e.printStackTrace();
        }
	return proveedores;
    }
	
    @Override
    public void add(Proveedores proveedores) {
	try {
            this.entity.getTransaction().begin();
            this.entity.persist(proveedores);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void update(Proveedores proveedores) {
	try {
            this.entity.getTransaction().begin();
            this.entity.merge(proveedores);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void delete(Proveedores proveedores) {
        try {
            this.entity.getTransaction().begin();
            this.entity.remove(proveedores);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
}