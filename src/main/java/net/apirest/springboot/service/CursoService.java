package net.apirest.springboot.service;

import java.util.List;

import net.apirest.springboot.model.Curso;

public interface CursoService {

	Curso createCurso( Curso curso);
	Curso updateCurso( Curso curso);
	List<Curso> getAllCursos();
	Curso getCursooById(long cursoId);
	void deleteCurso(long cursoId);

}
