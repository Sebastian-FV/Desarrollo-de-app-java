package modelo;

public class Empleados {

	private String id;
	private String tipo_documento;
	private String numero_documento;
	private String nombres;
	private String apellidos;
	private String departamentos;
	private String dirección;
	private String correo_electrónico;
	private String teléfono;
	private String fechaC;
	private String fechaM;
	
	public Empleados(String id, String tipo_documento, String numero_documento, String nombres, String apellidos,
			String departamentos, String dirección, String correo_electrónico, String teléfono, String fechaC,
			String fechaM) {
		super();
		this.id = id;
		this.tipo_documento = tipo_documento;
		this.numero_documento = numero_documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.departamentos = departamentos;
		this.dirección = dirección;
		this.correo_electrónico = correo_electrónico;
		this.teléfono = teléfono;
		this.fechaC = fechaC;
		this.fechaM = fechaM;
	}

	public Empleados() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public String getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(String departamentos) {
		this.departamentos = departamentos;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public String getCorreo_electrónico() {
		return correo_electrónico;
	}

	public void setCorreo_electrónico(String correo_electrónico) {
		this.correo_electrónico = correo_electrónico;
	}

	public String getTeléfono() {
		return teléfono;
	}

	public void setTeléfono(String teléfono) {
		this.teléfono = teléfono;
	}

	public String getFechaC() {
		return fechaC;
	}

	public void setFechaC(String fechaC) {
		this.fechaC = fechaC;
	}

	public String getFechaM() {
		return fechaM;
	}

	public void setFechaM(String fechaM) {
		this.fechaM = fechaM;
	}
	
	
}