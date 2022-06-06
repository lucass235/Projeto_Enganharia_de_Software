package com.losporocas.estagiagil.dto;

import javax.validation.constraints.NotEmpty;

public class NewAlunoDTO extends NewPessoaDTO{
	
	private int periodo;

	private boolean estagiando;
	
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
