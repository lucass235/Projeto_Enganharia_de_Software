package com.losporocas.estagiagil.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.losporocas.estagiagil.dto.AlunoDTO;
import com.losporocas.estagiagil.dto.NewAlunoDTO;
import com.losporocas.estagiagil.mapper.AlunoDTOMapper;
import com.losporocas.estagiagil.model.Aluno;
import com.losporocas.estagiagil.model.Coordenador;
import com.losporocas.estagiagil.repositories.AlunoRepository;
import com.losporocas.estagiagil.services.AlunoService;
import com.losporocas.estagiagil.services.CoordenadorService;
import java.net.URI;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/coordenador")
public class CoordenadorController {

	@Autowired
	private AlunoService as;
	
	@Autowired
	private CoordenadorService cs;
	
	@Autowired
	private AlunoRepository repository;
	
	@Autowired
	private AlunoDTOMapper alunoDTOMapper;

	@GetMapping(value = "/alunos")
	public ResponseEntity<List<AlunoDTO>> findAll(){
		List<Aluno> result = repository.findAll();
		List<AlunoDTO> aDto = alunoDTOMapper.toAlunoDTO(result);
		return ResponseEntity.ok().body(aDto);
	}

	@GetMapping(value = "/alunos/{matricula}")
	public ResponseEntity<AlunoDTO> findByMatricula(@PathVariable String matricula) throws ObjectNotFoundException{
		Aluno result = as.findByMatricula(matricula);
		AlunoDTO aDto = alunoDTOMapper.toAlunoDTO(result);
		return ResponseEntity.ok().body(aDto);
	}
	
	@PostMapping(value = "/{matricula}/alunos")
	public ResponseEntity salvar(@RequestBody NewAlunoDTO novo, @PathVariable String matricula) throws ObjectNotFoundException {
		Aluno aluno = new Aluno();
		Coordenador c = cs.findCoordenadorByMatricula(aluno, novo, matricula);
		aluno.setCoordenador(c);
		try {
			as.salvar(aluno);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{matricula}").buildAndExpand(novo.getMatricula()).toUri();
			return ResponseEntity.created(uri).build();
		}catch(Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
			
	}
	
	@PutMapping("/alunos/{matricula}")
	public ResponseEntity atualizar(
			@PathVariable String matricula,
			@RequestBody AlunoDTO aDTO) throws ObjectNotFoundException {
		
		Aluno alunoExistente = as.findByMatricula(matricula);
		if(alunoExistente==null) {
			return ResponseEntity.notFound().build();
		}
		
		alunoExistente.setEstagiando(aDTO.isEstagiando());
		alunoExistente.setPeriodo(aDTO.getPeriodo());
		repository.save(alunoExistente);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{matricula}").buildAndExpand(aDTO.getMatricula()).toUri();
		return ResponseEntity.created(uri).build();
		//return ResponseEntity.noContent().build();
		
	}
	
}
