package com.losporocas.estagiagil.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.losporocas.estagiagil.model.Vaga;
import com.losporocas.estagiagil.repositories.VagaRepository;

@RestController
@RequestMapping(value = "/vagas")
public class VagaController {

	@Autowired
	private VagaRepository repository;

	@GetMapping
	public List<Vaga> findAll(){
		List<Vaga> result = repository.findAll();
		return result;
	}
	
}