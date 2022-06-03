package com.losporocas.estagiagil.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "empresas") 
public class Empresa {
	
	@Column
	private boolean isRecrutando;
	@Column
	private String nome;
	@Column
	private String descricao;
	 
	@Id
	@NotNull
	public int id;
	
	@OneToMany
	
	List<Vaga> vagas;

	protected Empresa() {
	}

	public Empresa(String nome, String descricao, int id) {
		this.nome = nome;
		this.descricao = descricao;
		this.id = id;
	}

	public boolean isRecrutando() {
		return isRecrutando;
	}

	public void setRecrutando(boolean isRecrutando) {
		this.isRecrutando = isRecrutando;
	}

	public String getNome() {
	  return nome;
	}

	public void setNome(String nome) {
	  this.nome = nome;
	}

	public String getDescricao() {
	  return descricao;
	}

	public void setDescricao(String descricao) {
	  this.descricao = descricao;
	}

}
