package com.losporocas.estagiagil.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.losporocas.estagiagil.dto.AlunoDTO;
import com.losporocas.estagiagil.dto.NewAlunoDTO;
import com.losporocas.estagiagil.model.Aluno;
import com.losporocas.estagiagil.repositories.AlunoRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Repository
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private BCryptPasswordEncoder pe;

	
	
	public Aluno findByMatricula(String matricula) throws ObjectNotFoundException {

	

		Optional<Aluno> obj = alunoRepository.findByMatricula(matricula);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + matricula));
	}
	
	
	@Transactional
	public Aluno insert(Aluno obj) {
		obj.setId(null);
		return alunoRepository.save(obj);
		
	}
	
	public Aluno update(Aluno obj) throws ObjectNotFoundException {
		Aluno newObj = findByMatricula(obj.getMatricula());
		updateData(newObj, obj);
		return alunoRepository.save(newObj);
	}

	private void updateData(Aluno newObj, Aluno obj) {
		newObj.setEstagiando(obj.isEstagiando());
		newObj.setPeriodo(obj.getPeriodo());
	}

	public Aluno salvar(Aluno a) {
		return alunoRepository.save(a);
	}

}
