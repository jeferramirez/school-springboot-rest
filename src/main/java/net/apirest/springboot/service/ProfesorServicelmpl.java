package net.apirest.springboot.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.apirest.springboot.model.Profesor;
import net.apirest.springboot.repository.ProfesorRepository;


@Service
@Transactional
public class ProfesorServicelmpl implements ProfesorService{

	@Autowired
	private ProfesorRepository profesorRepository;
	
	@Override
	public Profesor createProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		return profesorRepository.save(profesor);
	}

	@Override
	public List<Profesor> getAllProfesor() {
		// TODO Auto-generated method stub
		return (List<Profesor>) profesorRepository.findAll();
	}

}
