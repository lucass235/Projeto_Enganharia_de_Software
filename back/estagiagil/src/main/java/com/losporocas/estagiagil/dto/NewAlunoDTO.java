package com.losporocas.estagiagil.dto;

import javax.validation.constraints.NotEmpty;

import com.losporocas.estagiagil.model.Coordenador;

public class NewAlunoDTO extends NewPessoaDTO{
	
	private int periodo;

	private boolean estagiando;
	
	private Coordenador coordenador;
	
	
	
	public Coordenador getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
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
