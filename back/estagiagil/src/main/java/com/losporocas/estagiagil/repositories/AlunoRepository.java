package com.losporocas.estagiagil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.losporocas.estagiagil.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	public Aluno findByMatricula(String matricula);
	
}