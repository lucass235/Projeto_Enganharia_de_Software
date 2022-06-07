package com.losporocas.estagiagil.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import com.losporocas.estagiagil.model.Coordenador;
import com.losporocas.estagiagil.repositories.CoordenadorRepository;
import com.losporocas.estagiagil.security.UserSS;

@Repository
public class IUserDetailsService implements UserDetailsService{

	@Autowired
	private CoordenadorRepository coordenadorRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Coordenador c = coordenadorRepository.findByEmail(email);
		
		if(c == null) {
			throw new UsernameNotFoundException("Usuario nao encontrado");
		}
		UserSS co = new UserSS();
		co.setSenha(c.getPassword());
		co.setAuthorities(c.getAuthorities());
		co.setEmail(c.getEmail());
		
		return co;
	
	}

}
