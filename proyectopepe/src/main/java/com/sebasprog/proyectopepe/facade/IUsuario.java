package com.sebasprog.proyectopepe.facade;

import java.util.List;

import com.sebasprog.proyectopepe.modelo.Usuario;

public interface IUsuario {

	public List<Usuario> findAll();
	public Usuario findById(int id);
	public void add(Usuario usuario);
	public void update(Usuario usuario);
	public void delete(Usuario usuario);
}
