package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Departamentos;

/**
 * Servlet implementation class ServletDepartamentoController
 */
@WebServlet("/ServletDepartamentoController")
public class ServletDepartamentoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Departamentos> listDepartamentos=new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDepartamentoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String codigo_departamento = request.getParameter("codigo_departamento");
		String nombre_departamento = request.getParameter("nombre_departamento");
		String fechaC = request.getParameter("fechaC");
		String fechaM = request.getParameter("fechaM");
		Departamentos departamentos = new Departamentos();
		departamentos.setId(id);
		departamentos.setCodigo_departamento(codigo_departamento);
		departamentos.setNombre_departamento(nombre_departamento);
		departamentos.setFechaC(fechaC);
		departamentos.setFechaM(fechaM);
		this.listDepartamentos.add(departamentos);
		request.setAttribute("lista", listDepartamentos);
		request.getRequestDispatcher("departamentos.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
