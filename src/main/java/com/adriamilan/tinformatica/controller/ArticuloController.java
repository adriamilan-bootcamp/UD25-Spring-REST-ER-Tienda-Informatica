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

import com.adriamilan.tinformatica.dto.Articulo;
import com.adriamilan.tinformatica.dto.Fabricante;
import com.adriamilan.tinformatica.service.ArticuloServiceImpl;
import com.adriamilan.tinformatica.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloService;
	
	@Autowired
	FabricanteServiceImpl fabricanteService;
	
	@GetMapping("/articulos")
	public List<Articulo> listArticulos() {
		return articuloService.listArticulos();
	}
	
	@GetMapping("/articulo/{id}")
	public Articulo articuloXID(@PathVariable(name="id") Long id) {
		return articuloService.articuloXID(id);
	}
	
	@PostMapping("/articulo")
	public Articulo saveArticulo(@RequestBody Articulo articulo) {
		return articuloService.saveArticulo(articulo);
	}
	
	@PutMapping("/articulo/{id}")
	public Articulo editArticulo(@PathVariable(name="id") Long id, @RequestBody Articulo articulo) {
		return articuloService.editArticulo(articulo);
	}
	
	@DeleteMapping("/articulo/{id}") 
	public void deleteArticulo(@PathVariable(name="id") Long id) {
		articuloService.deleteArticulo(id);
	}
	
}