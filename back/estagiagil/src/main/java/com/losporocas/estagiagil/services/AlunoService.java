package com.losporocas.estagiagil.services;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.losporocas.estagiagil.model.Aluno;
import com.losporocas.estagiagil.repositories.AlunoRepository;
import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public Aluno findByMatricula(String matricula) throws ObjectNotFoundException {

		Optional<Aluno> obj = alunoRepository.findByMatricula(matricula);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + matricula));
	}
	
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
