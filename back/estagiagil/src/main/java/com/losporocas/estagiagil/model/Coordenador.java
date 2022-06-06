package com.losporocas.estagiagil.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.losporocas.estagiagil.enums.Permissoes;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;


@Entity
@Table (name = "coordenadores")
public class Coordenador extends Pessoa{
	
	@Column
	private String area;
	
	@JsonIgnore
	@Column
	@OneToMany (mappedBy = "coordenador")
	private List<Aluno> alunos= new ArrayList();
	
	public Coordenador() {
		addPerfil(Permissoes.COORDENADOR);
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
	

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
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
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
