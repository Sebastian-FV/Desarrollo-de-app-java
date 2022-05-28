package com.sebasprog.demoMaven4.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sebasprog.demoMaven4.app.facade.imp.Departamentoimp;
import com.sebasprog.demoMaven4.app.model.Departamento;
import com.sebasprog.demoMaven4.app.utilties.Utility;

/**
 * Servlet implementation class DepartamentoServletController
 */
public class DepartamentoServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Departamento> listDepartamento=new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DepartamentoServletController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doprocess(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doprocess(request, response);
	}


protected void doprocess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	Departamentoimp departamentoImp = new Departamentoimp();
	if(request.getParameter("action")!=null) {
	String action=request.getParameter("action");
	switch (action) {
	case "edit":
		System.out.println("@Editar");
		long id = Long.parseLong(request.getParameter("id"));
		
		Departamento departamento=departamentoImp.buscarPorId(id);
		request.setAttribute("departamento", departamento);
		request.setAttribute("titulo", "Lista Departamento");
		request.getRequestDispatcher("departamento/udate.jsp").forward(request, response);
		break;
	case "update":
		Departamento departamento1=new Departamento();
		departamento1.setId(Long.parseLong(request.getParameter("id")));
		departamento1.setCodigo_departamento(request.getParameter("codigo"));
		departamento1.setNombre_departamento(request.getParameter("nombre"));
		departamento1.setFecha_hora_crea(Utility.convertiFecha(request.getParameter("fecha_crea")));
		departamento1.setFecha_hora_modifica(new Date());
		departamentoImp.actualizarDepartamento(departamento1);
		this.listDepartamento=departamentoImp.buscarTodos();
		System.out.println("list"+ this.listDepartamento);
		request.setAttribute("departamentos", "Lista Departamentos");
		request.setAttribute("departamento", this.listDepartamento);
		request.getRequestDispatcher("departamento/list.jsp").forward(request, response);
		break;
		
	default:
		this.listDepartamento=departamentoImp.buscarTodos();
		System.out.println("list"+ this.listDepartamento);
		request.setAttribute("departamentos", "Lista Departamentos");
		request.setAttribute("departamento", this.listDepartamento);
		request.getRequestDispatcher("departamento/list.jsp").forward(request, response);
		break;
		}
	
	}else {
		this.listDepartamento=departamentoImp.buscarTodos();
		System.out.println("list"+ this.listDepartamento);
		request.setAttribute("departamentos", "Lista Departamentos");
		request.setAttribute("departamento", this.listDepartamento);
		request.getRequestDispatcher("departamento/list.jsp").forward(request, response);
		}

	}

}
