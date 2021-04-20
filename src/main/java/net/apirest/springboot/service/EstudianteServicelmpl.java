package net.apirest.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.apirest.springboot.model.Estudiante;
import net.apirest.springboot.repository.EstudianteRepository;

@Service
@Transactional
public class EstudianteServicelmpl implements EstudianteService{

	@Autowired
	private EstudianteRepository estudianterepository;
	
	@Override
	public Estudiante createEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		return estudianterepository.save(estudiante);
	}

	@Override
	public List<Estudiante> getAllEstudiante() {
		// TODO Auto-generated method stub
		return (List<Estudiante>) estudianterepository.findAll();
	}

}
