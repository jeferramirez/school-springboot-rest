package net.apirest.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import net.apirest.springboot.model.Estudiante;

public interface EstudianteRepository extends CrudRepository<Estudiante, Long> {

}
