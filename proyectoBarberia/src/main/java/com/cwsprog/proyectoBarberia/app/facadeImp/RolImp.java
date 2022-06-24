/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facadeImp;

import com.cwsprog.proyectoBarberia.app.facade.IRol;
import com.cwsprog.proyectoBarberia.app.modelo.Rol;
import com.cwsprog.proyectoBarberia.app.utilities.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class RolImp implements IRol{
    
    EntityManager entity =JPAUtil.getEntityManagerFactory().createEntityManager();
    List<Rol> listRol = new ArrayList<Rol>();
	
    @Override
    public List<Rol> findAll(){
        try {
            this.entity.getTransaction().begin();
            //Query q = this.entity.createNativeQuery("Select * From Rol");
            Query q = this.entity.createQuery("SELECT u FROM Rol u");
            this.listRol = q.getResultList();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.listRol;
    }
    
    @Override
    public Rol findById(int id) {
    Rol rol = new Rol();
    try {
        this.entity.getTransaction().begin();
        rol = this.entity.find(Rol.class, id);
        System.out.print("@@ " + rol.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rol;
    }

    @Override
    public void add(Rol rol) {
    try {
        this.entity.getTransaction().begin();
        this.entity.persist(rol);
        this.entity.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Rol rol) {
    try {
        this.entity.getTransaction().begin();
        this.entity.merge(rol);
        this.entity.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Rol rol) {
    try {
        this.entity.getTransaction().begin();
        this.entity.remove(rol);
        this.entity.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}