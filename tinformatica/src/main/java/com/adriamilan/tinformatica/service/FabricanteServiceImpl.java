package com.adriamilan.tinformatica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.tinformatica.dao.IFabricanteDAO;
import com.adriamilan.tinformatica.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService {

	@Autowired
	IFabricanteDAO fabricanteDao;

	@Override
	public List<Fabricante> listFabricantes() {
		return fabricanteDao.findAll();
	}

	@Override
	public Fabricante fabricanteXID(Long id) {
		return fabricanteDao.findById(id).get();
	}

	@Override
	public Fabricante saveFabricante(Fabricante fabricante) {
		return fabricanteDao.save(fabricante);
	}

	@Override
	public Fabricante editFabricante(Fabricante fabricante) {
		return fabricanteDao.save(fabricante);
	}

	@Override
	public void deleteFabricante(Long id) {
		fabricanteDao.deleteById(id);
	}
	
}