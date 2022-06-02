package com.losporocas.estagiagil.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.sun.istack.NotNull;

@MappedSuperclass
public abstract class Pessoa {
	
	@Id
	@NotNull
	private int id;
	@Column
	private String nome;
	@Column
	private String email;

	protected Pessoa() {
		
	}
	
	public Pessoa(int id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
