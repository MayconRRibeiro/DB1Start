package br.com.db1.start;

import java.util.Calendar;

public class ExerciciosData {

	public Boolean anoBisexto(Integer ano) {
		if (ano % 4 == 0) {
			if (ano.toString().substring(ano.toString().length() - 2).equals("00")) {
				if (ano % 400 == 0)
					return true;
				return false;
			} else
				return true;
		}
		return false;
	}

	public Boolean diaUtil(Calendar data) {
		if (data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
			return false;
		return true;
	}

	public Integer calcularIdade(Calendar dataNascimento, Calendar dataAtual) {
		Integer idade;

		idade = dataAtual.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

		if (dataAtual.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
			idade--;
		} else {
			if (dataAtual.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH)
					&& dataAtual.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
				idade--;
			}
		}

		return idade;
	}

	public Integer calcularDiasEntreDatas(Calendar primeiraData, Calendar segundaData) {
		Integer dias = Math.abs(segundaData.get(Calendar.DAY_OF_YEAR) - primeiraData.get(Calendar.DAY_OF_YEAR));
		if (segundaData.get(Calendar.YEAR) == primeiraData.get(Calendar.YEAR))
			return dias;
		else {
			Integer anos = Math.abs((segundaData.get(Calendar.YEAR) - primeiraData.get(Calendar.YEAR)));
			Integer anosCont = Math.abs((segundaData.get(Calendar.YEAR) - primeiraData.get(Calendar.YEAR)));
			Integer primeiraDataMes = primeiraData.get(Calendar.MONTH);
			Integer segundaDataMes = segundaData.get(Calendar.MONTH);
			Integer diasBisextos = 0;
			Boolean anoBisexto = false;
			if (anoBisexto(primeiraData.get(Calendar.YEAR)) == true)
				anoBisexto = true;
			if (anoBisexto == true) {
				if ((primeiraDataMes <= 1 && segundaDataMes > 1) || (primeiraDataMes > 1 && segundaDataMes <= 1)
						&& (anoBisexto(primeiraData.get(Calendar.YEAR)) == true
								&& anoBisexto(segundaData.get(Calendar.YEAR)) == true))
					for (Integer y = 1; y <= anos; y += 4) {
						diasBisextos += 1;
					}
			} else {
				while (anosCont >= 4) {
					diasBisextos += 1;
					anosCont -= 4;
				}
			}
			return dias + anos * 365 + diasBisextos;
		}
	}

	public Integer calcularMesesEntreDatas(Calendar primeiraData, Calendar segundaData) {
		Integer meses;
		meses = segundaData.get(Calendar.MONTH) - primeiraData.get(Calendar.MONTH);
		if (segundaData.get(Calendar.YEAR) == primeiraData.get(Calendar.YEAR))
			return meses;
		else {
			Integer anos;
			anos = Math.abs((segundaData.get(Calendar.YEAR) - primeiraData.get(Calendar.YEAR)));
			return meses + anos * 12;
		}
	}

	public Integer calcularAnosEntreDatas(Calendar primeiraData, Calendar segundaData) {
		return Math.abs((segundaData.get(Calendar.YEAR) - primeiraData.get(Calendar.YEAR)));
	}

	public Double calcularDiferencaHorarios(Calendar primeiraHora, Calendar segundaHora) {
		Integer horas = Math.abs(
				(Integer) primeiraHora.get(Calendar.HOUR_OF_DAY) - (Integer) segundaHora.get(Calendar.HOUR_OF_DAY));
		Integer minutos = Math
				.abs((Integer) primeiraHora.get(Calendar.MINUTE) - (Integer) segundaHora.get(Calendar.MINUTE));
		Integer segundos = Math
				.abs((Integer) primeiraHora.get(Calendar.SECOND) - (Integer) segundaHora.get(Calendar.SECOND));
		Integer valorTotal = (horas * 360 + minutos * 60 + segundos);
		return valorTotal.doubleValue();
	}
}
