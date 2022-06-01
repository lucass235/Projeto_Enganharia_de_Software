package com.losporocas.estagiagil.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vagas")
public class Vaga {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String requisito;
	private String descricao;

	
	public Vaga() {
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