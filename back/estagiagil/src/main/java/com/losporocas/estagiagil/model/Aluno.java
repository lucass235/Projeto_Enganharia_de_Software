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
	private boolean estagiando;

	@ManyToOne
	@JoinColumn(name = "coordenador_id")
	private Coordenador coordenador;

	public Aluno() {
		super();
	}

	public Aluno(String statusAluno, int periodo, boolean estagiando, Coordenador coordenador) {
		super();
		this.statusAluno = statusAluno;
		this.periodo = periodo;
		this.estagiando = estagiando;
		this.coordenador = coordenador;
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

	public Coordenador getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Coordenador coordenador) {
		this.coordenador = coordenador;
	}

}
