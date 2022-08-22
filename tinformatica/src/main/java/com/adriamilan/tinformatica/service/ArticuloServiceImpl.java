package com.adriamilan.tinformatica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adriamilan.tinformatica.dao.IArticuloDAO;
import com.adriamilan.tinformatica.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	IArticuloDAO articuloDao;

	@Override
	public List<Articulo> listArticulos() {
		return articuloDao.findAll();
	}

	@Override
	public Articulo articuloXID(Long id) {
		return articuloDao.findById(id).get();
	}

	@Override
	public Articulo saveArticulo(Articulo articulo) {
		return articuloDao.save(articulo);
	}

	@Override
	public Articulo editArticulo(Articulo articulo) {
		Articulo articuloSelected = new Articulo();
		Articulo articuloUpdated = new Articulo();
		
		articuloSelected = articuloDao.findById(articulo.getId()).get();
		articuloSelected.setNombre(articulo.getNombre());
		articuloSelected.setPrecio(articulo.getPrecio());
		articuloSelected.setFabricante(articulo.getFabricante());
		
		articuloUpdated = articuloDao.save(articuloSelected);
		
		return articuloUpdated;
	}

	@Override
	public void deleteArticulo(Long id) {
		articuloDao.deleteById(id);
	}
	
}