package br.com.db1.colecoes.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import br.com.db1.colecoes.ListaExercicio;;

public class ListaExercicioTest {
	ListaExercicio exercicio = new ListaExercicio();

	@After
	public void separaTest() {
		System.out.println("");
	}

	@Test
	public void getConsoantesTest() {
		Set<String> consoantes = exercicio.getConsoantes("Maycon");
		Assert.assertTrue(consoantes.size() == 4);
		Assert.assertTrue(consoantes.contains("m"));
		Assert.assertFalse(consoantes.contains("a"));
		Assert.assertTrue(consoantes.contains("y"));
		Assert.assertTrue(consoantes.contains("c"));
		Assert.assertFalse(consoantes.contains("o"));
		Assert.assertTrue(consoantes.contains("n"));
	}

	@Test
	public void getVogaisTest() {
		Set<String> vogais = exercicio.getVogais("Maycon");
		Assert.assertTrue(vogais.size() == 2);
		Assert.assertFalse(vogais.contains("m"));
		Assert.assertTrue(vogais.contains("a"));
		Assert.assertFalse(vogais.contains("y"));
		Assert.assertFalse(vogais.contains("c"));
		Assert.assertTrue(vogais.contains("o"));
		Assert.assertFalse(vogais.contains("n"));
	}

	@Test
	public void getValuesAnyLessThirdTest() {
		System.out.println(exercicio.getValores());
		System.out.println(exercicio.getValoresAnyLessThird());
	}

	@Test
	public void getValuesIndexMultipleOf3Test() {
		System.out.println(exercicio.getValores());
		exercicio.getValoresIndexMultiplesOf3();
	}

	@Test
	public void getValuesMultiplesOf2Test() {
		System.out.println(exercicio.getValores());
		System.out.println(exercicio.getValoresMultiplesOf2());
	}

	@Test
	public void getPalavrasToAnotherCollectionTest() {
		System.out.println(exercicio.getPalavrasToAnotherCollection());
	}

	@Test
	public void compararListTest() {
		List<String> test1 = new ArrayList<>();
		test1.add("a");
		test1.add("b");

		List<String> test2 = new ArrayList<>();
		test2.add("b");
		test2.add("c");

		Assert.assertEquals(false, ListaExercicio.equalsList(test1, test2));
	}

	@Test
	public void compararSetTest() {
		Set<String> test1 = new HashSet<>();
		test1.add("a");
		test1.add("b");

		Set<String> test2 = new HashSet<>();
		test2.add("a");
		test2.add("b");

		Assert.assertEquals(true, ListaExercicio.equalsSet(test1, test2));
	}

}
