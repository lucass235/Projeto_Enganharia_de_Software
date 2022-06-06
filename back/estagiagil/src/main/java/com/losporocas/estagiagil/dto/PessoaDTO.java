package com.losporocas.estagiagil.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public abstract class PessoaDTO {
	
	@NotEmpty
	private String matricula;
	@NotEmpty
	private String nome;
	@Email
	private String email;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
