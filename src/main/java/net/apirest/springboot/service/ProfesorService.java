package net.apirest.springboot.service;

import java.util.List;

import net.apirest.springboot.model.Profesor;


public interface ProfesorService {

	Profesor createProfesor( Profesor profesor);
	List<Profesor> getAllProfesor();
}
