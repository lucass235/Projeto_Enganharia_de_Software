package com.losporocas.estagiagil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "vagas")
public class Vaga {
	
	@Id
	@NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String requisito;
	
	@Column
	private String descricao;
	
	@Column
	@NotNull
	@JoinColumn(name = "empresa_nome")
	private String empresa;

	
	protected Vaga() {
	}
	
	public Vaga(int id, String requisito, String descricao) {
	   this.requisito = requisito;
	   this.descricao = descricao;
	 }
	  
	public String getRequisito() {
	  return requisito;
	}

	public void setRequisito(String requisito) {
	  this.requisito = requisito;
	}

	public String getDescricao() {
	  return descricao;
	}
 
	public void setDescricao(String descricao) {
	  this.descricao = descricao;
	}


}
