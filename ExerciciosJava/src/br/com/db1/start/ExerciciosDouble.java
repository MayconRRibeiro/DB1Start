package br.com.db1.start;

public class ExerciciosDouble {

	public Double exibirMenorValorEntreDoisDoubles(Double primeiroValor, Double segundoValor) {
		return Math.min(primeiroValor, segundoValor);
	}

	public Double exibirMenorValorEntreTresDoubles(Double primeiroValor, Double segundoValor, Double terceiroValor) {
		if (primeiroValor < segundoValor) {
			if (primeiroValor < terceiroValor)
				return primeiroValor;
			return terceiroValor;
		} else {
			if (segundoValor < terceiroValor)
				return segundoValor;
			return terceiroValor;
		}
	}

	public Double exibirMediaDeTresNumeros(Double primeiroValor, Double segundoValor, Double terceiroValor) {
		return (primeiroValor + segundoValor + terceiroValor) / 3;
	}

	public Double calcularAreaTriangulo(Double base, Double altura) {
		return base * altura / 2;
	}

}
