package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.ExerciciosInteger;

public class ExerciciosIntegerTest {
	ExerciciosInteger exerciciosInteger = new ExerciciosInteger();

	@Test
	public void somarTest() {
		Assert.assertTrue(12 == exerciciosInteger.somar(5, 7));
		Assert.assertTrue(12 == exerciciosInteger.somar(7, 5));

	}

	@Test
	public void subtrairTest() {
		Assert.assertTrue(2 == exerciciosInteger.subtrair(8, 6));
		Assert.assertTrue(-2 == exerciciosInteger.subtrair(6, 8));
	}

	@Test
	public void multiplicarTest() {
		Assert.assertTrue(8 == exerciciosInteger.multiplicar(4, 2));
		Assert.assertTrue(8 == exerciciosInteger.multiplicar(2, 4));
	}

	@Test
	public void dividirTest() {
		Assert.assertTrue(2 == exerciciosInteger.dividir(4, 2));
		Integer valorResultadoEsperado = 0;
		Assert.assertEquals(valorResultadoEsperado, exerciciosInteger.dividir(2, 4));
	}

	@Test
	public void numeroParTest() {
		Assert.assertTrue(true == exerciciosInteger.numeroPar(8));
		Assert.assertTrue(false == exerciciosInteger.numeroPar(7));
	}

	@Test
	public void numeroMaiorTest() {
		Assert.assertTrue(7 == exerciciosInteger.numeroMaior(5, 7));
		Assert.assertTrue(8 == exerciciosInteger.numeroMaior(8, 7));
	}

	@Test
	public void imparesValorAteCemTest() {
		Assert.assertEquals("50", exerciciosInteger.imparesValorAteCem(0));
		Assert.assertEquals("25", exerciciosInteger.imparesValorAteCem(50));
	}
}
