package com.adriamilan.tinformatica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adriamilan.tinformatica.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Long> {

}