package net.apirest.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import net.apirest.springboot.model.Profesor;
import net.apirest.springboot.service.ProfesorService;

@RestController
public class ProfesorController {

	
	@Autowired
	private ProfesorService profesorService;
	
	@GetMapping("/profesores")
	public ResponseEntity<List<Profesor>> getAllProfesores() {
		return  ResponseEntity.ok().body(profesorService.getAllProfesor());
	}
	
	@PostMapping("/profesores")
	public ResponseEntity<Profesor> createProfesor( @RequestBody Profesor profesor) {	
		return  ResponseEntity.ok().body(this.profesorService.createProfesor(profesor));
	}
	
}
