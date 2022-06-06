package com.losporocas.estagiagil.dto;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class NewPessoaDTO {

		@NotEmpty
		private String matricula;
		@NotEmpty
		private String nome;
		@Email
		@NotEmpty
		private String email;
		@NotEmpty
		private String senha;

		public NewPessoaDTO(String matricula, String nome, String email, String senha) {
			super();
			this.matricula = matricula;
			this.nome = nome;
			this.email = email;
			this.senha = senha;
		}
		

		public String getSenha() {
			return senha;
		}


		public void setSenha(String senha) {
			this.senha = senha;
		}


		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
}


