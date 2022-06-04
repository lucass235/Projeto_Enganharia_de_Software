package com.losporocas.estagiagil.dto;

public class AlunoDTO extends PessoaDTO {

	private String statusAluno;

	private int periodo;

	public boolean estagiando;

	public AlunoDTO() {
		super();
	}

	public String getStatusAluno() {
		return statusAluno;
	}

	public void setStatusAluno(String statusAluno) {
		this.statusAluno = statusAluno;
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
