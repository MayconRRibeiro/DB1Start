package br.com.db1.start.test;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.ExerciciosData;

public class ExerciciosDataTest {
	ExerciciosData exerciciosData = new ExerciciosData();

	@Test
	public void anoBisextoTest() {
		Assert.assertEquals(false, exerciciosData.anoBisexto(1800));
		Assert.assertEquals(true, exerciciosData.anoBisexto(1804));
		Assert.assertEquals(false, exerciciosData.anoBisexto(100));
	}

	@Test
	public void diaUtilTest() {
		Calendar data = Calendar.getInstance();
		data.set(2017, Calendar.SEPTEMBER, 18);
		Assert.assertEquals(true, exerciciosData.diaUtil(data));
		data.set(2017, Calendar.SEPTEMBER, 16);
		Assert.assertEquals(false, exerciciosData.diaUtil(data));
		data.set(2017, Calendar.SEPTEMBER, 17);
		Assert.assertEquals(false, exerciciosData.diaUtil(data));
	}

	@Test
	public void calcularIdadeTest() {
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(1996, Calendar.JULY, 11);

		Calendar dataAtual = Calendar.getInstance();
		dataAtual.set(2017, Calendar.DECEMBER, 30);
		Assert.assertEquals((Integer) 21, exerciciosData.calcularIdade(dataNascimento, dataAtual));
		dataAtual.set(2017, Calendar.JANUARY, 30);
		Assert.assertEquals((Integer) 20, exerciciosData.calcularIdade(dataNascimento, dataAtual));
		dataAtual.set(2017, Calendar.JULY, 10);
		Assert.assertEquals((Integer) 20, exerciciosData.calcularIdade(dataNascimento, dataAtual));
		dataAtual.set(2017, Calendar.JULY, 12);
		Assert.assertEquals((Integer) 21, exerciciosData.calcularIdade(dataNascimento, dataAtual));
	}

	@Test
	public void calcularDiasEntreDatasTest() {
		Calendar primeiraData = Calendar.getInstance();
		primeiraData.set(2016, Calendar.FEBRUARY, 11);
		Calendar segundaData = Calendar.getInstance();
		segundaData.set(2016, Calendar.SEPTEMBER, 13);

		Assert.assertEquals((Integer) 215, exerciciosData.calcularDiasEntreDatas(primeiraData, segundaData));
		primeiraData.set(2016, Calendar.FEBRUARY, 11);
		segundaData.set(2017, Calendar.SEPTEMBER, 13);
		Assert.assertEquals((Integer) 580, exerciciosData.calcularDiasEntreDatas(primeiraData, segundaData));
		primeiraData.set(2017, Calendar.FEBRUARY, 11);
		segundaData.set(2018, Calendar.SEPTEMBER, 13);
		Assert.assertEquals((Integer) 579, exerciciosData.calcularDiasEntreDatas(primeiraData, segundaData));
		primeiraData.set(2017, Calendar.FEBRUARY, 11);
		segundaData.set(2018, Calendar.SEPTEMBER, 13);
		Assert.assertEquals((Integer) 579, exerciciosData.calcularDiasEntreDatas(primeiraData, segundaData));
		primeiraData.set(2016, Calendar.FEBRUARY, 01);
		segundaData.set(2020, Calendar.MARCH, 01);
		Assert.assertEquals((Integer) 1490, exerciciosData.calcularDiasEntreDatas(primeiraData, segundaData));
		primeiraData.set(2017, Calendar.FEBRUARY, 01);
		segundaData.set(2021, Calendar.MARCH, 01);
		Assert.assertEquals((Integer) 1489, exerciciosData.calcularDiasEntreDatas(primeiraData, segundaData));

	}

	@Test
	public void calcularMesesEntreDatasTest() {
		Calendar primeiraData = Calendar.getInstance();
		primeiraData.set(2017, Calendar.FEBRUARY, 12);
		Calendar segundaData = Calendar.getInstance();
		segundaData.set(2019, Calendar.DECEMBER, 13);
		Assert.assertEquals((Integer) 34, exerciciosData.calcularMesesEntreDatas(primeiraData, segundaData));

	}

	@Test
	public void calcularAnosEntreDatasTest() {
		Calendar primeiraData = Calendar.getInstance();
		primeiraData.set(2017, Calendar.FEBRUARY, 12);
		Calendar segundaData = Calendar.getInstance();
		segundaData.set(2019, Calendar.DECEMBER, 13);

		Assert.assertEquals((Integer) 2, exerciciosData.calcularAnosEntreDatas(primeiraData, segundaData));
	}

	@Test
	public void calcularDiferencaHorariosTest() {
		Calendar primeiraHora = Calendar.getInstance();
		primeiraHora.set(Calendar.HOUR_OF_DAY, 07);
		primeiraHora.set(Calendar.MINUTE, 30);
		primeiraHora.set(Calendar.SECOND, 00);
		Calendar segundaHora = Calendar.getInstance();
		segundaHora.set(Calendar.HOUR_OF_DAY, 22);
		segundaHora.set(Calendar.MINUTE, 32);
		segundaHora.set(Calendar.SECOND, 01);
		Assert.assertEquals((Double) 5521d, exerciciosData.calcularDiferencaHorarios(primeiraHora, segundaHora));
	}

}
