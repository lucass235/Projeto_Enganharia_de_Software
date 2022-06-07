package com.losporocas.estagiagil.enums;

public enum Permissoes {

	COORDENADOR(1, "ROLE_ADMIN"),
	ALUNO(2, "ROLE_ALUNO");
	
	private int cod;
	private String permissao;
	
	private Permissoes(int cod, String permissao) {
		this.cod = cod;
		this.permissao = permissao;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getPermissao() {
		return permissao;
	}

	public void setPermissao(String permissao) {
		this.permissao = permissao;
	}
	
	public static Permissoes toEnum(Integer cod) {

		if (cod == null) {
			return null;
		}
		for (Permissoes x : Permissoes.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
	
}
