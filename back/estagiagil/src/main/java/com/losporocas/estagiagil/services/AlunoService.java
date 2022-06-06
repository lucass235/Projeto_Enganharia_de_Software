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

		/*
		 * Requisito apresentado na aula 72: somente um admin ou o próprio cliente pode
		 * ver seus dados
		 */
		//UserSS user = UserService.authenticated();
		//if (user == null || !user.hasHole(Perfil.ADMIN) && !id.equals(user.getId())) {
		//	throw new AuthorizationException("Acesso negado");
		//}

		Optional<Aluno> obj = alunoRepository.findByMatricula(matricula);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + matricula));
	}
	
	
	@Transactional
	public Aluno insert(Aluno obj) {
		obj.setId(null);
		obj = alunoRepository.save(obj);
		return obj;
	}
	
	public Aluno update(Aluno obj) throws ObjectNotFoundException {
		Aluno newObj = findByMatricula(obj.getMatricula());
		updateData(newObj, obj);
		return alunoRepository.save(newObj);
	}

	private void updateData(Aluno newObj, Aluno obj) {
		// TODO Auto-generated method stub
		
	}


}
