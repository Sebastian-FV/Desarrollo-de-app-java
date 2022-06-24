/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.facadeImp;

import com.cwsprog.proyectoBarberia.app.facade.IProducto;
import com.cwsprog.proyectoBarberia.app.modelo.Producto;
import com.cwsprog.proyectoBarberia.app.utilities.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author ADMIN
 */
public class ProductoImp implements IProducto{
    
    EntityManager entity =JPAUtil.getEntityManagerFactory().createEntityManager();
    List<Producto> listProducto = new ArrayList<Producto>();
	
    @Override
    public List<Producto> findAll(){
	try {
            this.entity.getTransaction().begin();
            //Query q = this.entity.createNativeQuery("Select * From Producto");
            Query q = this.entity.createQuery("SELECT u FROM Producto u");
            this.listProducto = q.getResultList();
			
	} catch (Exception e) {
            e.printStackTrace();
        }
	return this.listProducto;
    }
	
    @Override
    public Producto findById(int id) {
    Producto producto = new Producto();
	try {
            this.entity.getTransaction().begin();
            producto = this.entity.find(Producto.class, id);
            System.out.print("@@ " + producto.toString());
	} catch (Exception e) {
            e.printStackTrace();
        }
	return producto;
    }
	
    @Override
    public void add(Producto producto) {
	try {
            this.entity.getTransaction().begin();
            this.entity.persist(producto);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void update(Producto producto) {
	try {
            this.entity.getTransaction().begin();
            this.entity.merge(producto);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void delete(Producto producto) {
        try {
            this.entity.getTransaction().begin();
            this.entity.remove(producto);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
}