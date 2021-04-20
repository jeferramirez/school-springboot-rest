package net.apirest.springboot.service;

import java.util.List;

import net.apirest.springboot.model.Asignatura;



public interface AsignaturaService {

	Asignatura createAsignatura( Asignatura asignatura);
	List<Asignatura> getAllAsignatura();
}
