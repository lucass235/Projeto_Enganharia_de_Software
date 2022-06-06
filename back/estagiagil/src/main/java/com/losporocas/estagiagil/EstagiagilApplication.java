package com.losporocas.estagiagil;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class EstagiagilApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstagiagilApplication.class, args);
		System.out.print(new BCryptPasswordEncoder().encode("123"));
	}
	
}
