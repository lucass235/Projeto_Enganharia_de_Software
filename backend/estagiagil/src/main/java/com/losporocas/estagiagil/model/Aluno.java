package com.losporocas.estagiagil.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.losporocas.estagiagil.enums.Permissoes;


import org.springframework.security.core.GrantedAuthority;


@Entity
@Table(name = "alunos") 
public class Aluno extends Pessoa{
	
	@Column
	private int periodo;
	@Column
	private boolean estagiando;

	@ManyToOne
	@JoinColumn(name = "coordenador_id")
	private Coordenador coordenador;
	
	public Aluno() {
		this.coordenador = getCoordenador();
	}

	public Set <Permissoes> getPermissoes() {
		return permissoes.stream().map(x -> Permissoes.toEnum(x)).collect(Collectors.toSet());
	}
	
	public void addPerfil(Permissoes perfil) {
		permissoes.add(perfil.getCod());
	}
	
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "PERMISSOES")
	private Set<Integer> permissoes = new HashSet<>();

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

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.getSenha();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.getMatricula();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
