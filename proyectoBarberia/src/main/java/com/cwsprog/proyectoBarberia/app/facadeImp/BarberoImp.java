/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facadeImp;

import com.cwsprog.proyectoBarberia.app.facade.IBarbero;
import com.cwsprog.proyectoBarberia.app.modelo.Barbero;
import com.cwsprog.proyectoBarberia.app.utilities.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class BarberoImp implements IBarbero{
    
    EntityManager entity =JPAUtil.getEntityManagerFactory().createEntityManager();
    List<Barbero> listBarbero = new ArrayList<Barbero>();
	
    @Override
    public List<Barbero> findAll(){
	try {
            this.entity.getTransaction().begin();
            //Query q = this.entity.createNativeQuery("Select * From Barbero");
            Query q = this.entity.createQuery("SELECT u FROM Barbero u");
            this.listBarbero = q.getResultList();
			
	} catch (Exception e) {
            e.printStackTrace();
        }
	return this.listBarbero;
    }
	
    @Override
    public Barbero findById(int id) {
    Barbero barbero = new Barbero();
	try {
            this.entity.getTransaction().begin();
            barbero = this.entity.find(Barbero.class, id);
            System.out.print("@@ " + barbero.toString());
	} catch (Exception e) {
            e.printStackTrace();
        }
	return barbero;
    }
	
    @Override
    public void add(Barbero barbero) {
	try {
            this.entity.getTransaction().begin();
            this.entity.persist(barbero);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void update(Barbero barbero) {
	try {
            this.entity.getTransaction().begin();
            this.entity.merge(barbero);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void delete(Barbero barbero) {
        try {
            this.entity.getTransaction().begin();
            this.entity.remove(barbero);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
}
