/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.controller;

import com.cwsprog.proyectoBarberia.app.facadeImp.RolImp;
import com.cwsprog.proyectoBarberia.app.facadeImp.UsuarioImp;
import com.cwsprog.proyectoBarberia.app.modelo.Rol;
import com.cwsprog.proyectoBarberia.app.modelo.Usuario;
import com.cwsprog.proyectoBarberia.app.utilities.ExportarExcell;
import java.io.IOException;
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
@ManagedBean(name = "usuarioBean")
@RequestScoped
public class UsuarioBean {
    
    Usuario usuario = new Usuario();
    private Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
    private List<Usuario> listUsuarios = new ArrayList<Usuario>();
    private List<Rol> listaRoles = new ArrayList<Rol>();
    
    private int idRol;

    public UsuarioBean() {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> findAll() {
        try {
            UsuarioImp usuarioImp = new UsuarioImp();
            this.listUsuarios = usuarioImp.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return this.listUsuarios;
    }
    
   private void llenarRoles(){
        RolImp rolImp=new RolImp();
        this.listaRoles=rolImp.findAll();
        System.out.println("@Roles: "+this.listaRoles.toString());
        //return this.listaRoles;
    }
    
    public String save(){
        UsuarioImp usuImp=new UsuarioImp();
        RolImp rolImp=new RolImp();
        
        Rol rol=new Rol();
        
        rol=rolImp.findById(idRol);
        
        usuario.setIdRolFk(rol);
        System.out.println(usuario.toString());
        usuImp.add(usuario);
         return "/usuarios/list.xhtml?faces-redirect=true";  
        
    }
    
    public String edi(int id){
        System.out.println("Entro al id");
        UsuarioImp usuImp=new UsuarioImp();
         usuario=usuImp.findById(id);
        
         this.sessionMap.put("usuario", usuario);
      
        return  "/usuarios/edit.xhtml?faces-redirect=true"; 
    }
    public String update(Usuario usu){
       
         UsuarioImp usuImp=new UsuarioImp();
         RolImp rolImp=new RolImp();
         Rol rol=new Rol();
         
         rol=rolImp.findById(usu.getIdRolFk().getIdRol());
         usu.setIdRolFk(rol);
         usuImp.update(usu);
         return "/usuarios/list.xhtml?faces-redirect=true";  
    }
    
    public void exportar() throws IOException{
        HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
        
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
	String currentDateTime = dateFormatter.format(new Date());
	String headerKey = "Content-Disposition";
	String headerValue = "attachment; filename=listausuarios_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
         
        UsuarioImp usuarioImp = new UsuarioImp();
        this.listUsuarios = usuarioImp.findAll();
        
        ExportarExcell excelExporter = new ExportarExcell(this.listUsuarios);
        excelExporter.export(response);
    }
}