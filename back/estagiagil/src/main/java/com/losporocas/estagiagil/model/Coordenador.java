package com.losporocas.estagiagil.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table (name = "coordenadores")
public class Coordenador extends Pessoa{
	private String area;
	
	@OneToMany
	List<Aluno> alunos;
	
	public Coordenador(int id, String nome, String email, String area) {
		super(id, nome, email);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
