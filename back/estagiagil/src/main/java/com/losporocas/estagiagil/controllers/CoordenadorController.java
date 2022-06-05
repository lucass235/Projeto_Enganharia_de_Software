package com.losporocas.estagiagil.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.losporocas.estagiagil.dto.AlunoDTO;
import com.losporocas.estagiagil.mapper.AlunoDTOMapper;
import com.losporocas.estagiagil.model.Aluno;
import com.losporocas.estagiagil.model.Coordenador;
import com.losporocas.estagiagil.repositories.CoordenadorRepository;

@RestController
@RequestMapping(value = "/coordenador")
public class CoordenadorController {

	@Autowired
	private CoordenadorRepository repository;
	@Autowired
	private AlunoDTOMapper alunoDTOMapper;
	
	@GetMapping(value = "/{matricula}")
	public List<AlunoDTO> findAll(@PathVariable String matricula){
		Coordenador result = repository.findByMatricula(matricula);		
		return alunoDTOMapper.toAlunoDTO(result.getAlunos());
	}
	/*
	@PostMapping(value = "/{matricula}")
	public List<AlunoDTO> findAll(@PathVariable String matricula){
		Coordenador result = repository.findByMatricula(matricula);		
		return alunoDTOMapper.toAlunoDTO(result.getAlunos());
	}
	*/
	
	/*
	@DeleteMapping(value = "/{matricula}/{matricula}")
	public List<AlunoDTO> deleteAluno(@PathVariable String matricula){
		Coordenador result = repository.deleteByMatricula(matricula);		
		return alunoDTOMapper.deleteToAlunoDTO(result.getAlunos(), matricula);
	}*/
}
