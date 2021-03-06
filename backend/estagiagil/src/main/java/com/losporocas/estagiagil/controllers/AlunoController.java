package com.losporocas.estagiagil.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.losporocas.estagiagil.dto.AlunoDTO;
import com.losporocas.estagiagil.mapper.AlunoDTOMapper;
import com.losporocas.estagiagil.model.Aluno;
import com.losporocas.estagiagil.repositories.AlunoRepository;
import com.losporocas.estagiagil.services.AlunoService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

	@Autowired
	private AlunoService as;
	
	//lembrar de tirar dps
	@Autowired
	private AlunoRepository repository;
	
	@Autowired
	private AlunoDTOMapper alunoDTOMapper;

	@GetMapping
	public ResponseEntity<List<AlunoDTO>> findAll(){
		List<Aluno> result = repository.findAll();
		List<AlunoDTO> aDto = alunoDTOMapper.toAlunoDTO(result);
		return ResponseEntity.ok().body(aDto);
	}

	@GetMapping(value = "/{matricula}")
	public ResponseEntity<AlunoDTO> findByMatricula(@PathVariable String matricula) throws ObjectNotFoundException{
		Aluno result = as.findByMatricula(matricula);
		AlunoDTO aDto = alunoDTOMapper.toAlunoDTO(result);
		return ResponseEntity.ok().body(aDto);
	}
	

	
}
