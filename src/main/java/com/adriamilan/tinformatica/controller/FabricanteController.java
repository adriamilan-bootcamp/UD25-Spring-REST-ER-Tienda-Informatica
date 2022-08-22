package com.adriamilan.tinformatica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adriamilan.tinformatica.dto.Fabricante;
import com.adriamilan.tinformatica.service.FabricanteServiceImpl;


@RestController
@RequestMapping("/api")
public class FabricanteController {
	
	@Autowired
	FabricanteServiceImpl fabricanteService;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listFabricantes() {
		return fabricanteService.listFabricantes();
	}
	
	@GetMapping("/fabricante/{id}")
	public Fabricante fabricanteXID(@PathVariable(name="id") Long id) {
		return fabricanteService.fabricanteXID(id);
	}
	
	@PostMapping("/fabricante")
	public Fabricante saveFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteService.saveFabricante(fabricante);
	}
	
	@PutMapping("/fabricante/{id}")
	public Fabricante editFabricante(@PathVariable(name="id") Long id, @RequestBody Fabricante fabricante) {
		
		Fabricante fabricanteSelected = new Fabricante();
		Fabricante fabricanteUpdated = new Fabricante();
		
		fabricanteSelected = fabricanteService.fabricanteXID(id);
		fabricanteSelected.setNombre(fabricante.getNombre());
		
		fabricanteUpdated = fabricanteService.saveFabricante(fabricanteSelected);
		
		return fabricanteUpdated;
	}
	
	@DeleteMapping("/fabricante/{id}") 
	public void deleteFabricante(@PathVariable(name="id") Long id) {
		fabricanteService.deleteFabricante(id);
	}
}