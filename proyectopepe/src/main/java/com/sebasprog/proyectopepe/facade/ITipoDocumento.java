package com.sebasprog.proyectopepe.facade;

import java.util.List;

import com.sebasprog.proyectopepe.modelo.TipoDocumento;

public interface ITipoDocumento {

	public List<TipoDocumento> findAll();
		public TipoDocumento findById(int ITipoDocumento);
		public void add(TipoDocumento ITipoDocumento);
		public void update(TipoDocumento ITipoDocumento);
		public void delete(TipoDocumento ITipoDocumento);
}
