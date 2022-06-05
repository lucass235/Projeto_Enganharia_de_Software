package com.losporocas.estagiagil.dto;

import javax.validation.constraints.NotEmpty;

import java.io.Serializable;

public class NewAlunoDTO extends NewPessoaDTO{
	
	@NotEmpty
	private int periodo;

	public boolean estagiando;
	
	public NewAlunoDTO(String matricula, String nome, String email, String senha) {
		super(matricula, nome, email, senha);
		// TODO Auto-generated constructor stub
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public boolean isEstagiando() {
		return estagiando;
	}

	public void setEstagiando(boolean estagiando) {
		this.estagiando = estagiando;
	}

	
	
	
	
}