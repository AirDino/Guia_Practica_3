package com.m5a.Guia_Practica_Mongo_Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.m5a.Guia_Practica_Mongo_Model.Persona;
import com.m5a.Guia_Practica_Mongo_Service.PersonaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.dao.DataAccessException;

@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/persona")
public class PersonaController {

	@Autowired
	PersonaService personaService;

	@GetMapping("/listar")
	public ResponseEntity<List<Persona>> listarPersona() {
		return new ResponseEntity<>(personaService.findByAll(), HttpStatus.OK);
	}

	@PostMapping("/crear")
	public ResponseEntity<Persona> crearPersona(@RequestBody Persona p) {
		return new ResponseEntity<>(personaService.save(p), HttpStatus.CREATED);
	}

	@PutMapping("/actualizar/{id}")
	public ResponseEntity<Persona> actualizarPersona(@PathVariable Long id, @RequestBody Persona p) {
		Persona persona = personaService.findById(id);
		if (persona == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			try {
				persona.setNombre(p.getNombre());
				persona.setApellido(p.getApellido());
				persona.setDireccion(p.getDireccion());
				return new ResponseEntity<>(personaService.save(persona), HttpStatus.OK);
			} catch (DataAccessException e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
	}

	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Persona> eliminarPersona(@PathVariable Long id) {
		personaService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
