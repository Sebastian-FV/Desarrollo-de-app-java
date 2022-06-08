package com.sebasprog.demoMaven4.app.facade;

import java.util.List;

import com.sebasprog.demoMaven4.app.model.Departamento;

public interface IDepartamento {

	public interface interfazDepartamento {
		public List<Departamento> findAll();

		public Departamento listDepartamento(long id);

		public boolean add(Departamento departamento);

		public boolean actualizarDepartamento(Departamento departamento);

		public boolean eliminar(long id);
	}
}
