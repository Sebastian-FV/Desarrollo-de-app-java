package com.sebasprog.demoMaven4.app.facade.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sebasprog.demoMaven4.app.data.Conexion;
import com.sebasprog.demoMaven4.app.facade.IEmpleado.interfazEmpleado;
import com.sebasprog.demoMaven4.app.model.Empleado;

public class EmpleadoImp extends Conexion implements interfazEmpleado{

	 PreparedStatement pstEmpleados;
     ResultSet rsEmpleados;
     Empleado empleado = new Empleado();
     String query="";
     private List <Empleado> listEmpleado = new ArrayList<>();
    
    public List<Empleado> findAll() {
     this.query="SELECT * FROM Empleados";
     
     try{
         if (this.getConnection()!=null) {
        	 
      System.out.println("El servidor se ha conectado a la base de datos");
     this.pstEmpleados=this.getConnection().prepareStatement(query);
     this.rsEmpleados=this.pstEmpleados.executeQuery();
     while(this.rsEmpleados.next()){
     Empleado empleado = new Empleado();
            empleado.setId(this.rsEmpleados.getLong("id"));
            empleado.setTipo_documento(this.rsEmpleados.getString("tipo_documento"));
            empleado.setNumero_documento(this.rsEmpleados.getLong("numero_documento"));
            empleado.setNombres(this.rsEmpleados.getString("nombres"));
            empleado.setApellidos(this.rsEmpleados.getString("apellidos"));
            empleado.setId_departamento(this.rsEmpleados.getLong("id_departamento"));
            empleado.setDireccion(this.rsEmpleados.getString("direccion"));
            empleado.setCorreo_electronico(this.rsEmpleados.getString("correo_electronico"));
            empleado.setTelefono(this.rsEmpleados.getLong("telefono"));
            empleado.setFecha_hora_crea(this.rsEmpleados.getDate("fecha_hora_crea"));
            empleado.setFecha_hora_modifica(this.rsEmpleados.getDate("fecha_hora_modifica"));
            this.listEmpleado.add(empleado);
     }
     }
    else {
             System.out.println("Fallo la conexion");
         }   
     }catch(Exception e){
    	 e.printStackTrace();
     }
     return listEmpleado;
    }

    
    public Empleado listEmpleados(long id) {
     this.query="SELECT * FROM Empleados WHERE id=?";
      Empleado empleado = new Empleado();
     try{
if (this.getConnection()!=null) {
     this.pstEmpleados=this.getConnection().prepareStatement(query);
     this.pstEmpleados.setLong(1,id);
     this.rsEmpleados=this.pstEmpleados.executeQuery(); 
     while(rsEmpleados.next()){
            empleado.setId(this.rsEmpleados.getLong("id"));
            empleado.setTipo_documento(this.rsEmpleados.getString("tipo_documento"));
            empleado.setNumero_documento(this.rsEmpleados.getLong("numero_documento"));
            empleado.setNombres(this.rsEmpleados.getString("nombres"));
            empleado.setApellidos(this.rsEmpleados.getString("apellidos"));
            empleado.setId_departamento(this.rsEmpleados.getLong("id_departamento"));
            empleado.setDireccion(this.rsEmpleados.getString("direccion"));
            empleado.setCorreo_electronico(this.rsEmpleados.getString("correo_electronico"));
            empleado.setTelefono(this.rsEmpleados.getLong("telefono"));
            empleado.setFecha_hora_crea(this.rsEmpleados.getDate("fecha_hora_crea"));
            empleado.setFecha_hora_modifica(this.rsEmpleados.getDate("fecha_hora_modifica"));
         
     }
}
else   {
    System.out.println("Fallo la conexion");
}
     
     }catch(Exception e){
    	 e.printStackTrace();
     }
     return empleado;
    }

    @Override
    public boolean add(Empleado empleado) {
        
         this.query="INSERT INTO Empleados(tipo_documento,numero_documento,nombres,apellidos,departamento_id,direccion,correo_electronico,telefono) VALUES(?,?,?,?,?,?,?,?)";
    try{
if (this.getConnection()!=null) {
     this.pstEmpleados=this.getConnection().prepareStatement(query);
     this.pstEmpleados.setString(1, empleado.getTipo_documento());
     this.pstEmpleados.setLong(2, empleado.getNumero_documento());
     this.pstEmpleados.setString(3, empleado.getNombres());
     this.pstEmpleados.setString(4, empleado.getApellidos());
     this.pstEmpleados.setLong(5, empleado.getId_departamento());
     this.pstEmpleados.setString(6, empleado.getDireccion());
     this.pstEmpleados.setString(7, empleado.getCorreo_electronico());
     this.pstEmpleados.setLong(8, empleado.getTelefono());
  
     this.pstEmpleados.execute();
    
} else {
	
System.out.println("Fallo la conexion");

}
    }catch(Exception e){
    	e.printStackTrace();
    }
    return false;    
    }

     @Override
    public boolean actualizarEmpleado(Empleado empleado) {
      
    this.query="UPDATE  Empleados SET id=?,tipo_documento=?,numero_documento=?,nombres=?,apellidos=?,departamento_id=?,direccion=?,correo_electronico=?,telefono=? WHERE id=?";
    try{
if (this.getConnection()!=null) {
     this.pstEmpleados=this.getConnection().prepareStatement(query);
     this.pstEmpleados.setLong(1, empleado.getId());
     this.pstEmpleados.setString(2, empleado.getTipo_documento());
     this.pstEmpleados.setLong(3, empleado.getNumero_documento());
     this.pstEmpleados.setString(4, empleado.getNombres());
     this.pstEmpleados.setString(5, empleado.getApellidos());
     this.pstEmpleados.setLong(6, empleado.getId_departamento());
     this.pstEmpleados.setString(7, empleado.getDireccion());
     this.pstEmpleados.setString(8, empleado.getCorreo_electronico());
     this.pstEmpleados.setLong(9, empleado.getTelefono());
     this.pstEmpleados.setLong(10, empleado.getId());
     this.pstEmpleados.executeUpdate();
     
} else {System.out.println("Fallo la conexion");}
    }catch(Exception e){}
    return false;
    }

    @Override
    public boolean eliminar(long id) {
        this.query="DELETE FROM Empleados WHERE id=?";
        try{
	if (this.getConnection()!=null) {
	     this.pstEmpleados=this.getConnection().prepareStatement(query);
	     this.pstEmpleados.setLong(1, id);
	     this.pstEmpleados.executeUpdate();
	     
	} else {System.out.println("Fallo la conexion");}
	    }catch(Exception e){}
	    return false;
    }
	    
}