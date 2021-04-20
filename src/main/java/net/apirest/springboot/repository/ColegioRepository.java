package net.apirest.springboot.repository;


import org.springframework.data.repository.CrudRepository;
import net.apirest.springboot.model.Colegio;


public interface ColegioRepository  extends CrudRepository<Colegio, Long>{

}
