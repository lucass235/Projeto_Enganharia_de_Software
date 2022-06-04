package com.losporocas.estagiagil.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.losporocas.estagiagil.dto.AlunoDTO;
import com.losporocas.estagiagil.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	public List<Aluno> findByMatricula(String matricula);
	
}