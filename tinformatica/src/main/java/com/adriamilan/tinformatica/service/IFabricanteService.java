package com.adriamilan.tinformatica.service;

import java.util.List;

import com.adriamilan.tinformatica.dto.Fabricante;

public interface IFabricanteService {

	public List<Fabricante> listFabricantes();
	
	public Fabricante fabricanteXID(Long id);

	public Fabricante saveFabricante(Fabricante fabricante);
	
	public Fabricante editFabricante(Fabricante fabricante);
	
	public void deleteFabricante(Long id);
	
}