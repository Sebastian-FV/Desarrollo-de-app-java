package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Empleados;

/**
 * Servlet implementation class ServletPersonaControles
 */
@WebServlet("/ServletPersonaController")
public class ServletPersonaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private List<Empleados> listEmpleados=new ArrayList<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPersonaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String tipo_documento = request.getParameter("tipo_documento");
		String numero_documento = request.getParameter("numero_documento");
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		String departamentos = request.getParameter("departamentos");
		String dirección = request.getParameter("dirección");
		String correo_electrónico = request.getParameter("correo_electrónico");
		String teléfono = request.getParameter("teléfono");
		String fechaC = request.getParameter("fechaC");
		String fechaM = request.getParameter("fechaM");
		Empleados empleados = new Empleados();
		empleados.setId(id);
		empleados.setTipo_documento(tipo_documento);
		empleados.setNumero_documento(numero_documento);
		empleados.setNombres(nombres);
		empleados.setApellidos(apellidos);
		empleados.setDepartamentos(departamentos);
		empleados.setDirección(dirección);
		empleados.setCorreo_electrónico(correo_electrónico);
		empleados.setTeléfono(teléfono);
		empleados.setFechaC(fechaC);
		empleados.setFechaM(fechaM);
		this.listEmpleados.add(empleados);
		request.setAttribute("lista", listEmpleados);
		request.getRequestDispatcher("empleados.jsp").forward(request, response);
	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
