package com.losporocas.estagiagil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.losporocas.estagiagil.model.Coordenador;

public interface CoordenadorRepository extends JpaRepository<Coordenador, Long> {

	public Coordenador findByMatricula(String matricula);
	
	public Coordenador deleteByMatricula(String matricula);
}
