package br.com.db1.start.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.start.Calculadora;

public class CalculadoraTest {
	
	private Calculadora calculadora = new Calculadora();
	
	//Antes de cada teste vai executar o Before
	@Before
	public void before(){
		calculadora.zerarCalculo();
		System.out.println("Rodou 1 teste");
	}
	
	//Depois de cada teste vai executar o after
	@After
	public void after(){
		System.out.println("Resultado: " + calculadora.exibirResultado());
		System.out.println("finalizou 1 teste");
	}
	
	@Test
	public void somarTest() {
		calculadora.somar(2d, 4d);
		Assert.assertTrue(calculadora.exibirResultado() == 6d);
	}

	@Test
	public void zerarCalculoTest() {
		calculadora.zerarCalculo();
		Assert.assertTrue(calculadora.exibirResultado() == 0d);
	}

	@Test
	public void subtrairTest() {
		calculadora.subtrair(-8d, 3d);
		Assert.assertTrue(calculadora.exibirResultado() == -11d);
	}

	@Test
	public void multiplicarTest() {
		calculadora.multiplicar(2d, 8d);
		Assert.assertTrue(calculadora.exibirResultado() == 16d);
	}

	@Test
	public void dividirTest() {
		calculadora.dividir(8d, 2d);
		Assert.assertTrue(calculadora.exibirResultado() == 4d);

		//calculadora.dividir(8d, 0d);
		//Assert.assertTrue(calculadora.exibirResultado() == null);
	}
}
