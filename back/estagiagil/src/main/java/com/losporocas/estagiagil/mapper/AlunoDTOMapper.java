package com.losporocas.estagiagil.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import com.losporocas.estagiagil.dto.AlunoDTO;
import com.losporocas.estagiagil.dto.CoordenadorDTO;
import com.losporocas.estagiagil.model.Aluno;
import com.losporocas.estagiagil.model.Coordenador;

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
	
	public Aluno fromDTO(AlunoDTO aluno) {
		Aluno a = new Aluno();
		a.setEstagiando(aluno.isEstagiando());
		a.setPeriodo(aluno.getPeriodo());
		//a.setCoordenador(1);
		return a;
	}
	
	public CoordenadorDTO toCoordenadorDTO(Coordenador c) {
		CoordenadorDTO a = new CoordenadorDTO();
		a.setMatricula(c.getMatricula());
		a.setEmail(c.getEmail());
		a.setNome(c.getNome());
		return a;
	}
	
}
