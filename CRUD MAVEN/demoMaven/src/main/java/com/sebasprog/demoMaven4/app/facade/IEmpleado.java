package com.sebasprog.demoMaven4.app.facade;

import java.util.List;

import com.sebasprog.demoMaven4.app.model.Empleado;

public interface IEmpleado {

	public interface interfazEmpleado {
		public List<Empleado> findAll();

		public Empleado listEmpleados(long id);

		public boolean add(Empleado empleado);

		public boolean actualizarEmpleado(Empleado empleado);

		public boolean eliminar(long id);
	}
}
