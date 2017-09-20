package br.com.db1.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.colecoes.DescricaoComparator;
import br.com.db1.colecoes.Produto;

public class ProdutoTest {
	List<Produto> produtos = new ArrayList<>();

	@After
	public void separarTest() {
		System.out.println("");
	}

	@Before
	public void adicionarDados() {
		produtos.add(new Produto(98, "Celular", 1000d));
		produtos.add(new Produto(50, "Monitor", 200d));
		produtos.add(new Produto(55, "Caneca", 50d));
		System.out.println("Lista normal: " + produtos);
	}

	@Test
	public void ordenarPorValorTest() {
		Collections.sort(produtos);
		System.out.println("Lista ordenada por valor: " + produtos);

		Assert.assertTrue(produtos.get(0).getValor() == 50d);
		Assert.assertTrue(produtos.get(1).getValor() == 200d);
		Assert.assertTrue(produtos.get(2).getValor() == 1000d);

	}

	@Test
	public void ordenarPorDescricaoTest() {
		DescricaoComparator comparator = new DescricaoComparator();
		Collections.sort(produtos, comparator);
		System.out.println("Lista ordenada por descrição: " + produtos);

		Assert.assertTrue(produtos.get(0).getDescricao() == "Caneca");
		Assert.assertTrue(produtos.get(1).getDescricao() == "Celular");
		Assert.assertTrue(produtos.get(2).getDescricao() == "Monitor");
	}

}
