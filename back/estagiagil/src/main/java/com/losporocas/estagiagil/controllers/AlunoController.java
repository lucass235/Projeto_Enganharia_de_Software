package com.losporocas.estagiagil.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.losporocas.estagiagil.model.Aluno;
import com.losporocas.estagiagil.repositories.AlunoRepository;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

	@Autowired
	private AlunoRepository repository;

	@GetMapping
	public List<Aluno> findAll(){
		List<Aluno> result = repository.findAll();
		return result;
	}
	
}