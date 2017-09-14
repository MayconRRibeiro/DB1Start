package br.com.db1.start;

public class ExerciciosInteger {

	public Integer somar(Integer primeiroValor, Integer segundoValor) {
		return primeiroValor + segundoValor;
	}

	public Integer subtrair(Integer primeiroValor, Integer segundoValor) {
		return primeiroValor - segundoValor;
	}

	public Integer multiplicar(Integer primeiroValor, Integer segundoValor) {
		return primeiroValor * segundoValor;
	}

	public Integer dividir(Integer primeiroValor, Integer segundoValor) {
		return primeiroValor / segundoValor;
	}

	public Boolean numeroPar(Integer valor) {
		if (valor % 2 == 0)
			return true;
		return false;
	}

	public Integer numeroMaior(Integer primeiroValor, Integer segundoValor) {
		if (primeiroValor > segundoValor)
			return primeiroValor;
		return segundoValor;
	}

	public String imparesValorAteCem(Integer valor) {
		Integer quantidadeDeValores = 0;
		for (Integer i = valor; i <= 100; i++) {
			if (i % 2 == 1) {
				quantidadeDeValores += 1;
				System.out.println(quantidadeDeValores + "ºValor: " + i);
			}
		}
		System.out.println("");
		return quantidadeDeValores.toString();
	}

}
