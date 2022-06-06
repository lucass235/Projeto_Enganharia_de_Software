package com.losporocas.estagiagil.dto;

import javax.validation.constraints.NotEmpty;

public class NewCoordenadorDTO extends NewPessoaDTO{

	@NotEmpty
	private String area;

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
}
