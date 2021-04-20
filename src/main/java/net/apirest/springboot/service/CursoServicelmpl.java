package net.apirest.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.apirest.springboot.exception.ResourceNotFoundException;
import net.apirest.springboot.model.Curso;
import net.apirest.springboot.repository.CursoRepository;


@Service
@Transactional
public class CursoServicelmpl implements CursoService{
	@Autowired
	private CursoRepository cursoRepository;
	
	@Override
	public Curso createCurso(Curso curso) {
		// TODO Auto-generated method stub
		return cursoRepository.save(curso);
	}

	@Override
	public Curso updateCurso(Curso curso) {
		
	java.util.Optional<Curso> cursoDb = this.cursoRepository.findById(curso.getId());
		
		if(cursoDb.isPresent()) {
			
			Curso cursoUpdate =  cursoDb.get();
			cursoUpdate.setId(curso.getId());
			cursoUpdate.setGrado(curso.getGrado());
			cursoUpdate.setSalon(curso.getSalon());

			cursoRepository.save(cursoUpdate);

			return cursoUpdate;
			
		 } else { 
			throw new ResourceNotFoundException("Record not found "); 
		 }
	}

	@Override
	public List<Curso> getAllCursos() {
		// TODO Auto-generated method stub
		return (List<Curso>) cursoRepository.findAll();
	}

	@Override
	public Curso getCursooById(long cursoId) {
		// TODO Auto-generated method stub
	   	java.util.Optional<Curso> cursoDb = this.cursoRepository.findById(cursoId);
		
			if(cursoDb.isPresent()) {
				return cursoDb.get();
			} else {
				throw new ResourceNotFoundException("Record not found "); 
			}
	}

	@Override
	public void deleteCurso(long cursoId) {
	 	java.util.Optional<Curso> cursoDb = this.cursoRepository.findById(cursoId);
		
			if(cursoDb.isPresent()) {
				this.cursoRepository.delete(cursoDb.get());
			} else {
				throw new ResourceNotFoundException("Record not found "); 
			}	
	}

}
