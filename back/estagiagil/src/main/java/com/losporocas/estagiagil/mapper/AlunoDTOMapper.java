package com.losporocas.estagiagil.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.losporocas.estagiagil.dto.AlunoDTO;
import com.losporocas.estagiagil.model.Aluno;

@Component
public class AlunoDTOMapper {

	
	public List<AlunoDTO> toAlunoDTO(List<Aluno> alunos){
		return alunos.stream().map(this::toAlunoDTO).toList();
	}
	
	private AlunoDTO toAlunoDTO(Aluno aluno) {
		AlunoDTO a = new AlunoDTO();
		a.setMatricula(aluno.getMatricula());
		a.setEmail(aluno.getEmail());
		a.setNome(aluno.getNome());
		a.setStatusAluno(aluno.getStatusAluno());
		a.setPeriodo(aluno.getPeriodo());
		a.setEstagiando(aluno.isEstagiando());
		return a;
	}
}
