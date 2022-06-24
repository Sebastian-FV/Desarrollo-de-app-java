/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cwsprog.proyectoBarberia.app.utilities;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ADMIN
 */
public class SessionUtils {
    
    public static HttpSession getSession(){
            return (HttpSession) FacesContext.getCurrentInstance()
                    .getExternalContext().getSession(false);
        }
    
    public static HttpServletRequest getRequest(){
            return (HttpServletRequest) FacesContext.getCurrentInstance()
                    .getExternalContext().getRequest();
        }
    
    public static String getClienteName(){
            HttpSession session = (HttpSession) FacesContext.getCurrentInstance()
                    .getExternalContext().getSession(false);
            return session.getAttribute("clientename").toString();
        }
    
    public static String getClienteId(){
            HttpSession session = getSession();
            if (session != null)
                    return (String) session.getAttribute("clienteid");
            else
                    return null;
        }
    
}
