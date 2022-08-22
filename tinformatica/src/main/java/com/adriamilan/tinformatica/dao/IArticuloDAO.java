package com.adriamilan.tinformatica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriamilan.tinformatica.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Long>{

}