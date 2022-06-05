package com.losporocas.estagiagil.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public abstract class PessoaDTO {
	
	private Long id;
	@NotEmpty
	private String matricula;
	@NotEmpty
	private String nome;
	@Email
	private String email;

	public PessoaDTO() {
		super();
	}

	public PessoaDTO(Long id, @NotEmpty String matricula, @NotEmpty String nome, @Email String email) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
	}



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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
}
