package net.apirest.springboot.service;

import java.util.List;

import net.apirest.springboot.model.Colegio;

public interface ColegioService {

	Colegio createColegio( Colegio colegio);
	Colegio updateColegio( Colegio colegio);
	List<Colegio> getAllColegio();
	Colegio getColegioById(long colegioId);
	void deleteColegio(long colegioId);

}
