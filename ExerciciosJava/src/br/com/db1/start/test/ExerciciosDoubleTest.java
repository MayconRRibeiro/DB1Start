package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.ExerciciosDouble;

public class ExerciciosDoubleTest {
	ExerciciosDouble exerciciosDouble = new ExerciciosDouble();

	@Test
	public void exibirMenorValorEntreDoisDoublesTest() {
		Assert.assertTrue(3.232322 == exerciciosDouble.exibirMenorValorEntreDoisDoubles(3.232323, 3.232322));
		Assert.assertTrue(3.232322 == exerciciosDouble.exibirMenorValorEntreDoisDoubles(3.232322, 3.232323));
	}

	@Test
	public void exibirMenorValorEntreTresDoublesTest() {
		Assert.assertTrue(3.232321 == exerciciosDouble.exibirMenorValorEntreTresDoubles(3.232323, 3.232322, 3.232321));
		Assert.assertTrue(3.232321 == exerciciosDouble.exibirMenorValorEntreTresDoubles(3.232323, 3.232321, 3.232322));
		Assert.assertTrue(3.232321 == exerciciosDouble.exibirMenorValorEntreTresDoubles(3.232321, 3.232322, 3.232323));
		Assert.assertTrue(3.232321 == exerciciosDouble.exibirMenorValorEntreTresDoubles(3.232321, 3.232323, 3.232322));
		Assert.assertTrue(3.232321 == exerciciosDouble.exibirMenorValorEntreTresDoubles(3.232322, 3.232323, 3.232321));
		Assert.assertTrue(3.232321 == exerciciosDouble.exibirMenorValorEntreTresDoubles(3.232322, 3.232321, 3.232323));
	}

	@Test
	public void exibirMediaDeTresNumerosTest() {
		Assert.assertEquals((Double) 2.5d, exerciciosDouble.exibirMediaDeTresNumeros(1.25, 2.75, 3.50));
	}

	@Test
	public void calcularAreaTrianguloTest() {
		Assert.assertEquals((Double) 243d, exerciciosDouble.calcularAreaTriangulo(18d, 27d));
	}

}
