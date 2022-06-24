/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facadeImp;

import com.cwsprog.proyectoBarberia.app.facade.IAdministrador;
import com.cwsprog.proyectoBarberia.app.modelo.Administrador;
import com.cwsprog.proyectoBarberia.app.utilities.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
        
/**
 *
 * @author ADMIN
 */
public class AdministradorImp implements IAdministrador {
    
    EntityManager entity =JPAUtil.getEntityManagerFactory().createEntityManager();
    List<Administrador> listAdministrador = new ArrayList<Administrador>();
	
    @Override
    public List<Administrador> findAll(){
	try {
            this.entity.getTransaction().begin();
            //Query q = this.entity.createNativeQuery("Select * From Administrador");
            Query q = this.entity.createQuery("SELECT u FROM Administrador u");
            this.listAdministrador = q.getResultList();
			
	} catch (Exception e) {
            e.printStackTrace();
        }
	return this.listAdministrador;
    }
	
    @Override
    public Administrador findById(int id) {
    Administrador administrador = new Administrador();
	try {
            this.entity.getTransaction().begin();
            administrador = this.entity.find(Administrador.class, id);
            System.out.print("@@ " + administrador.toString());
	} catch (Exception e) {
            e.printStackTrace();
        }
	return administrador;
    }
	
    @Override
    public void add(Administrador administrador) {
	try {
            this.entity.getTransaction().begin();
            this.entity.persist(administrador);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void update(Administrador administrador) {
	try {
            this.entity.getTransaction().begin();
            this.entity.merge(administrador);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void delete(Administrador administrador) {
        try {
            this.entity.getTransaction().begin();
            this.entity.remove(administrador);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
}