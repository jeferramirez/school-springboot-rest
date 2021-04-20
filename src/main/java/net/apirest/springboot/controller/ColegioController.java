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
import net.apirest.springboot.model.Colegio;
import net.apirest.springboot.service.ColegioService;

@RestController
public class ColegioController {
	@Autowired
	private ColegioService colegioService; 
	
	@GetMapping("/colegios")
	public ResponseEntity<List<Colegio>> getAllColegios () {
		return  ResponseEntity.ok().body(colegioService.getAllColegio());
	}
	
	@GetMapping("/colegios/{id}")
	public ResponseEntity<Colegio> getColegioById ( @PathVariable Long id) {
		return  ResponseEntity.ok().body(this.colegioService.getColegioById(id));
	}

	
	@PostMapping("/colegios")
	public ResponseEntity<Colegio> createColegio ( @RequestBody Colegio colegio) {	
		return  ResponseEntity.ok().body(this.colegioService.createColegio(colegio));
	}
	
	@PutMapping("/colegios")
	public ResponseEntity<Colegio> updateColegio ( @RequestBody Colegio colegio) {	
		return  ResponseEntity.ok().body(this.colegioService.updateColegio(colegio));
	}
	
	@DeleteMapping("/colegios/{id}")
	public  HttpStatus deleteColegio ( @PathVariable Long id) {
		this.colegioService.deleteColegio(id);
		return HttpStatus.OK;
	}

	
}
