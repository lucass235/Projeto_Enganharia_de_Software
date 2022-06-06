package com.losporocas.estagiagil.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.losporocas.estagiagil.model.Aluno;
import com.losporocas.estagiagil.model.Coordenador;

public interface CoordenadorRepository extends JpaRepository<Coordenador, Long> {

	Coordenador findByEmail(String email);
	
	public Optional<Coordenador> findByMatricula(String matricula);
	

}
