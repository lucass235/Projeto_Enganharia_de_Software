package com.losporocas.estagiagil.model;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name = "coordenadores")
public class Coordenador extends Pessoa{
	
	@Column
	private String area;
	
	@Column
	@OneToMany (mappedBy = "coordenador")
	private List<Aluno> alunos;

	public Coordenador() {
		super();
	}

	public Coordenador(String area) {
		super();
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	

}
