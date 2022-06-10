package com.sebasprog.proyectopepe.facade;

import java.util.List;

import com.sebasprog.proyectopepe.modelo.Rol;

public interface IRol {

	public List<Rol> findAll();
	public Rol findById(int IRol);
	public void add(Rol IRol);
	public void update(Rol IRol);
	public void delete(Rol IRol);
}
