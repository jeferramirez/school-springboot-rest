package net.apirest.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import net.apirest.springboot.model.Asignatura;
import net.apirest.springboot.service.AsignaturaService;


@RestController
public class AsignaturaController {

	@Autowired
	private AsignaturaService asignaturaService;
	
	@GetMapping("/asignaturas")
	public ResponseEntity<List<Asignatura>> getAllAsignaturas() {
		return  ResponseEntity.ok().body(asignaturaService.getAllAsignatura());
	}
	
	@PostMapping("/asignaturas")
	public ResponseEntity<Asignatura> createAsignatura( @RequestBody Asignatura asignatura) {	
		return  ResponseEntity.ok().body(this.asignaturaService.createAsignatura(asignatura));
	}
	
}
