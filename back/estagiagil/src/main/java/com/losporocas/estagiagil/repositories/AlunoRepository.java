package com.losporocas.estagiagil.repositories;

import java.util.List;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.losporocas.estagiagil.model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	//public List<Aluno> findByMatricula(String matricula);
	
	//Aluno findByLogin(String login);
	
	@Transactional(readOnly = true)
	Aluno findByMatricula(String matricula);
	
}