package net.apirest.springboot.service;

import java.util.List;

import net.apirest.springboot.model.Estudiante;

public interface EstudianteService {


	Estudiante createEstudiante( Estudiante estudiante);
	List<Estudiante> getAllEstudiante();
}
