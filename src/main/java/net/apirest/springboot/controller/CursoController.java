package net.apirest.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import net.apirest.springboot.model.Curso;
import net.apirest.springboot.service.CursoService;

@RestController
public class CursoController {


	@Autowired
	private CursoService cursoservice; 
	
	@GetMapping("/cursos")
	public ResponseEntity<List<Curso>> getAllcursos () {
		return  ResponseEntity.ok().body(cursoservice.getAllCursos());
	}
	
	@GetMapping("/cursos/{id}")
	public ResponseEntity<Curso> getColegioById ( @PathVariable Long id) {
		return  ResponseEntity.ok().body(this.cursoservice.getCursooById(id));
	}

	
	@PostMapping("/cursos")
	public ResponseEntity<Curso> createColegio ( @RequestBody Curso curso) {	
		return  ResponseEntity.ok().body(this.cursoservice.createCurso(curso));
	}
	
	@PutMapping("/cursos")
	public ResponseEntity<Curso> updateColegio ( @RequestBody Curso curso) {	
		return  ResponseEntity.ok().body(this.cursoservice.updateCurso(curso));
	}
	
	@DeleteMapping("/cursos/{id}")
	public  HttpStatus deleteColegio ( @PathVariable Long id) {
		this.cursoservice.deleteCurso(id);
		return HttpStatus.OK;
	}
	
}
