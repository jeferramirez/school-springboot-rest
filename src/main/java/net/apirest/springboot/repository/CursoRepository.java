package net.apirest.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import net.apirest.springboot.model.Curso;


public interface CursoRepository extends CrudRepository<Curso, Long> {

}
