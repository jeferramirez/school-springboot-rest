package net.apirest.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import net.apirest.springboot.model.Estudiante;
import net.apirest.springboot.service.EstudianteService;

@RestController
public class EstudianteController {
	
	@Autowired
	private EstudianteService estudianteService;
	
	@GetMapping("/estudiantes")
	public ResponseEntity<List<Estudiante>> getAllEstudiantes() {
		return  ResponseEntity.ok().body(estudianteService.getAllEstudiante());
	}
	
	@PostMapping("/estudiantes")
	public ResponseEntity<Estudiante> createEstudiante( @RequestBody Estudiante estudiante) {	
		return  ResponseEntity.ok().body(this.estudianteService.createEstudiante(estudiante));
	}
	

}
