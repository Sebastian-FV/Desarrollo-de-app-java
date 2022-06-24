
package com.cwsprog.proyectoBarberia.app.facadeImp;

import com.cwsprog.proyectoBarberia.app.modelo.Cita;
import com.cwsprog.proyectoBarberia.app.utilities.JPAUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.cwsprog.proyectoBarberia.app.facade.ICita;

/**
 *
 * @author ADMIN
 */
public class CitaImp implements ICita{
    
    EntityManager entity =JPAUtil.getEntityManagerFactory().createEntityManager();
    List<Cita> listCita = new ArrayList<Cita>();
	
    @Override
    public List<Cita> findAll(){
	try {
            this.entity.getTransaction().begin();
            //Query q = this.entity.createNativeQuery("Select * From Cita");
            Query q = this.entity.createQuery("SELECT u FROM Cita u");
            this.listCita = q.getResultList();
			
	} catch (Exception e) {
            e.printStackTrace();
        }
	return this.listCita;
    }
	
    @Override
    public Cita findById(int id) {
    Cita cita = new Cita();
	try {
            this.entity.getTransaction().begin();
            cita = this.entity.find(Cita.class, id);
            System.out.print("@@ " + cita.toString());
	} catch (Exception e) {
            e.printStackTrace();
        }
	return cita;
    }
	
    @Override
    public void add(Cita cita) {
	try {
            this.entity.getTransaction().begin();
            this.entity.persist(cita);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void update(Cita cita) {
	try {
            this.entity.getTransaction().begin();
            this.entity.merge(cita);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
	
    @Override
    public void delete(Cita cita) {
        try {
            this.entity.getTransaction().begin();
            this.entity.remove(cita);
            this.entity.getTransaction().commit();
	} catch (Exception e) {
            e.printStackTrace();
	}
    }
}