package com.losporocas.estagiagil;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.losporocas.estagiagil.model.Aluno;

@SpringBootTest
class EstagiagilApplicationTests {

	@Test
	void alunoEstagiandoTest() {
		Aluno aluno = new Aluno();
		aluno.setEstagiando(true);	
		assertEquals(true, aluno.isEstagiando());	
	}
	
	@Test
	void CompNomeTest () {
		Aluno aluno = new Aluno();
		aluno.setNome("Wesllen Leonardo De Lira Santos");
		assumeTrue(aluno.getNome().length() <= 100);//true
		assertEquals(31, aluno.getNome().length());
	}
	
	@Test
	void alunoNaoCalouroTest () {
		Aluno aluno = new Aluno();
		aluno.setPeriodo(2);
		assertNotEquals(1, aluno.getPeriodo());
	}
}



