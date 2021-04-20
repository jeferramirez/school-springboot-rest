package net.apirest.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import net.apirest.springboot.model.Asignatura;
import net.apirest.springboot.repository.AsignaturaRepository;


@Service
@Transactional
public class AsignaturaServicelmpl implements AsignaturaService {

	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	@Override
	public Asignatura createAsignatura(Asignatura asignatura) {
		// TODO Auto-generated method stub
		return asignaturaRepository.save(asignatura);
	}

	@Override
	public List<Asignatura> getAllAsignatura() {
		// TODO Auto-generated method stub
		return (List<Asignatura>) asignaturaRepository.findAll();
	}

}
