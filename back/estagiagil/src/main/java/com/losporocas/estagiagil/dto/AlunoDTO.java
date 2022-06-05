package com.losporocas.estagiagil.dto;

public class AlunoDTO extends PessoaDTO {

	private int periodo;

	public boolean estagiando;

	public AlunoDTO() {
		super();
	}
	
	public AlunoDTO(Long id, String matricula, String nome, String email, int periodo, boolean estagiando) {
		super(id, matricula, nome, email);
		this.periodo = periodo;
		this.estagiando = estagiando;
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
