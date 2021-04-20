package net.apirest.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import net.apirest.springboot.exception.ResourceNotFoundException;
import net.apirest.springboot.model.Colegio;
import net.apirest.springboot.repository.ColegioRepository;

@Service
@Transactional
public class ColegioServicelmpl  implements ColegioService{

	@Autowired
	private ColegioRepository colegioRepository;

	@Override
	public Colegio createColegio(Colegio colegio) {
		// TODO Auto-generated method stub
		return colegioRepository.save(colegio);
	}

	@Override
	public Colegio updateColegio(Colegio colegio) {
		// TODO Auto-generated method stub
		java.util.Optional<Colegio> colegioDb = this.colegioRepository.findById(colegio.getId());
		
		if(colegioDb.isPresent()) {
			
			Colegio colegioUpdate =  colegioDb.get();
			colegioUpdate.setId(colegio.getId());
			colegioUpdate.setName(colegio.getName());
			colegioRepository.save(colegioUpdate);

			return colegioUpdate;
			
		 } else { 
			throw new ResourceNotFoundException("Record not found "); 
		 }
	}

	@Override
	public List<Colegio> getAllColegio() {
		// TODO Auto-generated method stub
		return (List<Colegio>) colegioRepository.findAll();
	}

	@Override
	public Colegio getColegioById(long colegioId) {
		// TODO Auto-generated method stub
    	java.util.Optional<Colegio> colegioDb = this.colegioRepository.findById(colegioId);
		
		if(colegioDb.isPresent()) {
			return colegioDb.get();
		} else {
			throw new ResourceNotFoundException("Record not found "); 
		}
		
	}

	@Override
	public void deleteColegio(long colegioId) {
		
		// TODO Auto-generated method stub
    	java.util.Optional<Colegio> colegioDb = this.colegioRepository.findById(colegioId);
		
		if(colegioDb.isPresent()) {
			this.colegioRepository.delete( colegioDb.get());
		} else {
			throw new ResourceNotFoundException("Record not found "); 
		}
		
		
	}

}
