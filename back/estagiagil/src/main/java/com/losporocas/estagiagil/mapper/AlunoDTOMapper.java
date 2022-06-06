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
	
	public AlunoDTO toAlunoDTO(Aluno aluno) {
		AlunoDTO a = new AlunoDTO();
		a.setMatricula(aluno.getMatricula());
		a.setEmail(aluno.getEmail());
		a.setNome(aluno.getNome());
		a.setPeriodo(aluno.getPeriodo());
		a.setEstagiando(aluno.isEstagiando());
		a.setNomeCoordenador(aluno.getCoordenador().getNome());
		return a;
	}
	
	public List<AlunoDTO> getAlunoDTOList(List<Aluno> alunos){
		return alunos.stream().map(this::toAlunoDTO).toList();
	}
	
	
	
	public AlunoDTO byMatriculaAlunoDTO(List<Aluno> alunos, String matricula){
		AlunoDTO alDTO = new AlunoDTO();
		Aluno al;
		//List<AlunoDTO>alunos.stream().map(this::toAlunoDTO).toList();
		for(int i = 0; i<alunos.size();i++) {
			if(alunos.get(i).getMatricula().equals(matricula)) {
				al = alunos.get(i);
				alDTO = toAlunoDTO(al);
			}
		}
		return alDTO;
	}
	
	
}
