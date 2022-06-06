package com.losporocas.estagiagil.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.losporocas.estagiagil.dto.AlunoDTO;
import com.losporocas.estagiagil.dto.NewAlunoDTO;
import com.losporocas.estagiagil.model.Aluno;
import com.losporocas.estagiagil.model.Coordenador;
import com.losporocas.estagiagil.repositories.AlunoRepository;
import com.losporocas.estagiagil.repositories.CoordenadorRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CoordenadorService {

	@Autowired
	private CoordenadorRepository coordenadorRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private BCryptPasswordEncoder pe;
	

	
	public Aluno findByMatricula(String matricula) throws ObjectNotFoundException {

		Optional<Aluno> obj = alunoRepository.findByMatricula(matricula);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + matricula));
	}
	
	public Coordenador findCoordenadorByMatricula(Aluno aluno, NewAlunoDTO novo, String matricula) throws ObjectNotFoundException {
		aluno.setEmail(novo.getEmail());
		aluno.setSenha(new BCryptPasswordEncoder().encode(novo.getSenha()));
		aluno.setPeriodo(novo.getPeriodo());
		aluno.setMatricula(novo.getMatricula());
		aluno.setNome(novo.getNome());
		Optional<Coordenador> obj = coordenadorRepository.findByMatricula(matricula);
		//aluno.setCoordenador(obj);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + matricula));
	}
}
