package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.ExerciciosString;

public class ExerciciosStringTest {
	ExerciciosString exerciciosString = new ExerciciosString();

	@Test
	public void textoEmLetrasMaiusculasTest() {
		Assert.assertEquals("HELLO FUSCA", exerciciosString.textoEmLetrasMaiusculas("Hello Fusca"));
		Assert.assertEquals("DEU CERTO", exerciciosString.textoEmLetrasMaiusculas("Deu Certo"));
	}

	@Test
	public void textoEmLetrasMinusculasTest() {
		Assert.assertEquals("hello fusca", exerciciosString.textoEmLetrasMinusculas("HeLlo FUsca"));
		Assert.assertEquals("tudo ok", exerciciosString.textoEmLetrasMinusculas("TUdO Ok"));
	}

	@Test
	public void quantidadeDeLetrasTest() {
		Assert.assertEquals((Integer) 8, exerciciosString.quantidadeDeLetras("DB1START"));
	}

	
	@Test
	public void quantidadeDeLetrasSemTrimTest() {
		Assert.assertEquals((Integer) 10, exerciciosString.quantidadeDeLetras(" DB1START "));
	}

	@Test
	public void quantidadeDeLetrasTrimTest() {
		Assert.assertEquals((Integer) 8, exerciciosString.quantidadeDeLetrasTrim(" DB1START "));
	}

	@Test
	public void exibirAsQuatroPrimeirasLetrasTest() {
		Assert.assertEquals("Mayc", exerciciosString.exibirAsQuatroPrimeirasLetras("Maycon Ribeiro"));
		Assert.assertEquals("Wagn", exerciciosString.exibirAsQuatroPrimeirasLetras("Wagner Mendes"));
	}

	@Test
	public void exibirNomeAPartirDaTerceiraLetraTest() {
		Assert.assertEquals("ycon Ribeiro", exerciciosString.exibirNomeAPartirDaTerceiraLetra("Maycon Ribeiro"));
		Assert.assertEquals("gner Mendes", exerciciosString.exibirNomeAPartirDaTerceiraLetra("Wagner Mendes"));
	}

	@Test
	public void exibirAsQuatroUltimasLetrasTest() {
		Assert.assertEquals("eiro", exerciciosString.exibirAsQuatroUltimasLetras("Maycon Ribeiro"));
		Assert.assertEquals("ndes", exerciciosString.exibirAsQuatroUltimasLetras("Wagner Mendes"));
	}

	@Test
	public void substituirPrimeiroNomeTest() {
		Assert.assertEquals("Aluno Ribeiro", exerciciosString.substituirPrimeiroNome("Maycon Ribeiro"));
		Assert.assertEquals("Aluno Mendes", exerciciosString.substituirPrimeiroNome("Wagner Mendes"));
	}

	@Test
	public void exibirTextoSeparadoTest() {
		Assert.assertEquals("banana", exerciciosString.exibirTextoSeparado("banana, maçã, melancia"));
		Assert.assertEquals("maçã", exerciciosString.exibirTextoSeparado("banana, maçã, melancia"));
		Assert.assertEquals("melancia", exerciciosString.exibirTextoSeparado("banana, maçã, melancia"));
	}

	@Test
	public void exibirQuantidadeDeVogaisTest() {
		Assert.assertEquals((Integer)6, exerciciosString.exibirQuantidadeDeVogais("Maycon Ribeiro"));
		Assert.assertEquals((Integer)4, exerciciosString.exibirQuantidadeDeVogais("Wagner Mendes"));
	}
	
	@Test
	public void textoInvertidoTest(){
		Assert.assertEquals("acsuF olleH", exerciciosString.textoInvertido("Hello Fusca"));
	}
}
