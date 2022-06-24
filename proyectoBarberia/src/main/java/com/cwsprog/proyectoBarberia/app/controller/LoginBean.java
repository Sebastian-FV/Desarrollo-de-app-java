/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.controller;

import com.cwsprog.proyectoBarberia.app.facadeImp.RolImp;
import com.cwsprog.proyectoBarberia.app.facadeImp.UsuarioImp;
import com.cwsprog.proyectoBarberia.app.modelo.Usuario;
import com.cwsprog.proyectoBarberia.app.utilities.SessionUtils;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean {
    
    UsuarioImp usuarioImp = new UsuarioImp();
    
    RolImp rolImp = new RolImp();
    
    Usuario usuario = new Usuario();
    
    public LoginBean(){
        
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    public void setCliente(Usuario usuario){
        this.usuario = usuario;
    }
    
    public String iniciarSession(){
        String path = "";
        String usuarioRol = "";
        usuarioRol = this.usuarioImp.validarUsuario(usuario);
        // System.out.println("Rol usuario "+ usuarioRol);
        HttpSession session = SessionUtils.getSession();
        switch (usuarioRol) {
            
            case "Administrador":
                session.setAttribute("usuarioname", usuario.getNombreUsuario());
                path = "/usuario/list.xhtml?faces-redirect = true";
                break;
            
            case "Cliente":
                session.setAttribute("usuarioname", usuario.getNombreUsuario());
                path = "/productos/list.xhtml?faces-redirect = true";
                break;
            
            case "Proveedor":
                session.setAttribute("usuarioname", usuario.getNombreUsuario());
                path = "/productos/list.xhtml?faces-redirect = true";
                break;
                
            case "Barbero":
                session.setAttribute("usuarioname", usuario.getNombreUsuario());
                path = "/productos/list.xhtml?faces-redirect = true";
                break;
            
            default:
                FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                        "Incorrect Usuarioname and Password",
                        "Please enter correct usuarioname and Password"));
                path = "/autemticacion/incioSession?faces-redirect = true";
                break;
        }   
        return path;
    }
}
