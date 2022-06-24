/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facadeImp;

import com.cwsprog.proyectoBarberia.app.facade.IServicios;
import com.cwsprog.proyectoBarberia.app.modelo.Servicios;
import com.cwsprog.proyectoBarberia.app.utilities.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class ServiciosImp implements IServicios{
    
    EntityManager entity =JPAUtil.getEntityManagerFactory().createEntityManager();
    List<Servicios> listServicios = new ArrayList<Servicios>();
	
    @Override
    public List<Servicios> findAll(){
	try {
            this.entity.getTransaction().begin();
            //Query q = this.entity.createNativeQuery("Select * From Servicios");
            Query q = this.entity.createQuery("SELECT u FROM Servicios u");
            this.listServicios = q.getResultList();
			
	} catch (Exception e) {
            e.printStackTrace();
        }
	return this.listServicios;
    }
	
    @Override
    public Servicios findById(int id) {
    Servicios servicios = new Servicios();
	try {
            this.entity.getTransaction().begin();
            servicios = this.entity.find(Servicios.class, id);
            System.out.print("@@ " + servicios.toString());
	} catch (Exception e) {
            e.printStackTrace();
        }
	return servicios;
    }
	
    @Override
    public void add(Servicios servicios) {
	try {
            this.entity.getTransaction().begin();
            this.entity.persist(servicios);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void update(Servicios servicios) {
	try {
            this.entity.getTransaction().begin();
            this.entity.merge(servicios);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void delete(Servicios servicios) {
        try {
            this.entity.getTransaction().begin();
            this.entity.remove(servicios);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
}