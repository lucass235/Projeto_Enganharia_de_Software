package com.losporocas.estagiagil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "alunos") 
public class Aluno extends Pessoa{
	
	@Column
	private String statusAluno;
	@Column
	private int periodo;
	@Column
	public boolean estagiando;

	@ManyToOne
	@JoinColumn(name = "coordenador_id")
	Coordenador coordenador;
	
	public Aluno(int id, String nome, String email, int periodo, String statusAluno, boolean estagiando) {
		super(id, nome, email);
		this.estagiando = estagiando;
		this.periodo = periodo;
		this.statusAluno = statusAluno;
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

	public Coordenador getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}

	public boolean isEstagiando() {
		return estagiando;
	}

	public void setEstagiando(boolean estagiando) {
		this.estagiando = estagiando;
	}
	
}
