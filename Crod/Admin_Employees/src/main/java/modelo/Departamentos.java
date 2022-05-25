package modelo;

public class Departamentos {

	private String id;
	private String codigo_departamento;
	private String nombre_departamento;
	private String fechaC;
	private String fechaM;
	
	public Departamentos(String id, String codigo_departamento, String nombre_departamento, String fechaC,
			String fechaM) {
		super();
		this.id = id;
		this.codigo_departamento = codigo_departamento;
		this.nombre_departamento = nombre_departamento;
		this.fechaC = fechaC;
		this.fechaM = fechaM;
	}
	public Departamentos() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCodigo_departamento() {
		return codigo_departamento;
	}
	public void setCodigo_departamento(String codigo_departamento) {
		this.codigo_departamento = codigo_departamento;
	}
	public String getNombre_departamento() {
		return nombre_departamento;
	}
	public void setNombre_departamento(String nombre_departamento) {
		this.nombre_departamento = nombre_departamento;
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
