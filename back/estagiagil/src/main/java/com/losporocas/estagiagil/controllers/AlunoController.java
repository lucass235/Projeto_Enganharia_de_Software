package com.losporocas.estagiagil.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.losporocas.estagiagil.dto.AlunoDTO;
import com.losporocas.estagiagil.mapper.AlunoDTOMapper;
import com.losporocas.estagiagil.model.Aluno;
import com.losporocas.estagiagil.repositories.AlunoRepository;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

	@Autowired
	private AlunoRepository repository;
	
	@Autowired
	private AlunoDTOMapper alunoDTOMapper;

	@GetMapping
	public List<AlunoDTO> findAll(){
		List<Aluno> result = repository.findAll();
		return alunoDTOMapper.getAlunoDTOList(result);
	}

	@GetMapping(value = "/{matricula}")
	public AlunoDTO findAll(@PathVariable String matricula){
		List<Aluno> result = repository.findByMatricula(matricula);
		return alunoDTOMapper.byMatriculaAlunoDTO(result, matricula);
	}
	
	
}
