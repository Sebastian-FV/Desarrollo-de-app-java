/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facadeImp;

import com.cwsprog.proyectoBarberia.app.facade.IAgenda;
import com.cwsprog.proyectoBarberia.app.modelo.Agenda;
import com.cwsprog.proyectoBarberia.app.utilities.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class AgendaImp implements IAgenda{
    
    EntityManager entity =JPAUtil.getEntityManagerFactory().createEntityManager();
    List<Agenda> listAgenda = new ArrayList<Agenda>();
	
    @Override
    public List<Agenda> findAll(){
	try {
            this.entity.getTransaction().begin();
            //Query q = this.entity.createNativeQuery("Select * From Agenda");
            Query q = this.entity.createQuery("SELECT u FROM Agenda u");
            this.listAgenda = q.getResultList();
			
	} catch (Exception e) {
            e.printStackTrace();
        }
	return this.listAgenda;
    }
	
    @Override
    public Agenda findById(int id) {
    Agenda agenda = new Agenda();
	try {
            this.entity.getTransaction().begin();
            agenda = this.entity.find(Agenda.class, id);
            System.out.print("@@ " + agenda.toString());
	} catch (Exception e) {
            e.printStackTrace();
        }
	return agenda;
    }
	
    @Override
    public void add(Agenda agenda) {
	try {
            this.entity.getTransaction().begin();
            this.entity.persist(agenda);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void update(Agenda agenda) {
	try {
            this.entity.getTransaction().begin();
            this.entity.merge(agenda);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void delete(Agenda agenda) {
        try {
            this.entity.getTransaction().begin();
            this.entity.remove(agenda);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
}
