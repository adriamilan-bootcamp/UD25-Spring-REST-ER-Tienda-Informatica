package com.adriamilan.tinformatica.service;

import java.util.List;

import com.adriamilan.tinformatica.dto.Articulo;

public interface IArticuloService {

	public List<Articulo> listArticulos();
	
	public Articulo articuloXID(Long id);
	
	public Articulo saveArticulo(Articulo articulo);
	
	public Articulo editArticulo(Articulo articulo);
	
	public void deleteArticulo(Long id);
	
}