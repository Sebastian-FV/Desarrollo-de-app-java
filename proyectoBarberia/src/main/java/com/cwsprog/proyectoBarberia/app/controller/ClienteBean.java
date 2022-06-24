/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.controller;

import com.cwsprog.proyectoBarberia.app.facadeImp.ClienteImp;
import com.cwsprog.proyectoBarberia.app.facadeImp.RolImp;
import com.cwsprog.proyectoBarberia.app.modelo.Cliente;
import com.cwsprog.proyectoBarberia.app.modelo.Rol;
import com.cwsprog.proyectoBarberia.app.utilities.ExportarExcel;
import java.io.IOException;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@ManagedBean(name = "clienteBean")
@RequestScoped
public class ClienteBean implements Serializable {
    
    Cliente cliente = new Cliente();
    private Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
    private List<Cliente> listClientes = new ArrayList<Cliente>();
    private List<Rol> listaRoles = new ArrayList<Rol>();
    
    private int idRol;

    public ClienteBean() {
        this.llenarRoles();
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
    
    public List<Rol> getListaRoles() {
        return listaRoles;
    }

    public void setListaRoles(List<Rol> listaRoles) {
        this.listaRoles = listaRoles;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setUsuario(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> findAll() {
        try {
            ClienteImp clienteImp = new ClienteImp();
            this.listClientes = clienteImp.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.listClientes;
    }
    
   private void llenarRoles(){
        RolImp rolImp=new RolImp();
        this.listaRoles=rolImp.findAll();
        System.out.println("@Roles: "+this.listaRoles.toString());
        //return this.listaRoles;
    }
    
    public String save(){
        ClienteImp usuImp=new ClienteImp();
        RolImp rolImp=new RolImp();
        
        Rol rol=new Rol();
        
        rol=rolImp.findById(idRol);
        
        cliente.setIdRolFk(rol);
        System.out.println(cliente.toString());
        usuImp.add(cliente);
         return "/cliente/list.xhtml?faces-redirect=true";  
        
    }
    
    public String edi(int id){
        System.out.println("Entro al id");
        ClienteImp usuImp=new ClienteImp();
         cliente=usuImp.findById(id);
        
         this.sessionMap.put("cliente", cliente);
      
        return  "/cliente/edit.xhtml?faces-redirect=true"; 
    }
    public String update(Cliente cli){
       
         ClienteImp usuImp=new ClienteImp();
         RolImp rolImp=new RolImp();
         Rol rol=new Rol();
         
         rol=rolImp.findById(cli.getIdRolFk().getIdRol());
         cli.setIdRolFk(rol);
         usuImp.update(cli);
         return "/cliente/list.xhtml?faces-redirect=true";  
    }
    
    public void exportar() throws IOException{
        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
	String currentDateTime = dateFormatter.format(new Date());
	String headerKey = "Content-Disposition";
	String headerValue = "attachment; filename=listaclientes_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
        ClienteImp clienteImp = new ClienteImp();
        this.listClientes = clienteImp.findAll();
        
        ExportarExcel excelExporter = new ExportarExcel(this.listClientes);
        excelExporter.export(response);
    }
}