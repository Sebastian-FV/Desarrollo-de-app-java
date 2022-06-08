package com.sebasprog.demoMaven4.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sebasprog.demoMaven4.app.facade.imp.DepartamentoImp;
import com.sebasprog.demoMaven4.app.model.Departamento;

/**
 * Servlet implementation class DepartamentoServletController
 */
public class DepartamentoServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Departamento> listDepartamento = new ArrayList<>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DepartamentoServletController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doProccess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doProccess(request, response);
	}

	protected void doProccess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DepartamentoImp deparImp = new DepartamentoImp();
		if (request.getParameter("action") != null) {
			String action = request.getParameter("action");
			if (action.equalsIgnoreCase("edit")) {
				long id = Long.parseLong(request.getParameter("id"));
				Departamento departamento = deparImp.listDepartamento(id);
				request.setAttribute("departamento", departamento);
				request.getRequestDispatcher("Departamentos/editar.jsp").forward(request, response);

			} else if (action.equalsIgnoreCase("actualizar")) {
				try {
					Departamento departamento = new Departamento();
					departamento.setId(Long.parseLong(request.getParameter("id")));
					departamento.setCodigo_departamento(request.getParameter("codigo_departamento"));
					departamento.setNombre_departamento(request.getParameter("nombre_departamento"));
					deparImp.actualizarDepartamento(departamento);
				} catch (Exception e) {
					e.printStackTrace();
				}
				this.listDepartamento = deparImp.findAll();
				request.setAttribute("listDep", listDepartamento);
				request.getRequestDispatcher("Departamentos/listDepartamentos.jsp").forward(request, response);
			} else if (action.equalsIgnoreCase("add")) {
				request.getRequestDispatcher("Departamentos/agregar.jsp").forward(request, response);

			} else if (action.equalsIgnoreCase("agregar")) {
				try {
					Departamento departamento = new Departamento();
					departamento.setCodigo_departamento(request.getParameter("codigo_departamento"));
					departamento.setNombre_departamento(request.getParameter("nombre_departamento"));
					deparImp.add(departamento);

				} catch (Exception e) {
					e.printStackTrace();
				}

				this.listDepartamento = deparImp.findAll();
				request.setAttribute("listDep", listDepartamento);
				request.getRequestDispatcher("Departamentos/listDepartamentos.jsp").forward(request, response);

			} else if (action.equalsIgnoreCase("eliminar")) {
				Long id = Long.parseLong(request.getParameter("id"));
				deparImp.eliminar(id);
				this.listDepartamento = deparImp.findAll();
				request.setAttribute("listDep", listDepartamento);
				request.getRequestDispatcher("Departamentos/listDepartamentos.jsp").forward(request, response);

			}

			else if (action.equalsIgnoreCase("regresar")) {
				this.listDepartamento = deparImp.findAll();
				request.setAttribute("listDep", listDepartamento);
				request.getRequestDispatcher("Departamentos/listDepartamentos.jsp").forward(request, response);

			}
		}
		this.listDepartamento = deparImp.findAll();
		request.setAttribute("listDep", listDepartamento);
		request.getRequestDispatcher("Departamentos/listDepartamentos.jsp").forward(request, response);
	}
}
