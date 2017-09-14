package br.com.db1.exercicio03;

public class Calculadora {
	private Double resultado;
	private Double primeiroValor;
	private Double segundoValor;

	public Calculadora() {
		System.out.println("Objeto Calculadora foi criado com sucesso");
	}

	public void zerarCalculo() {
		if (resultado != 0d)
			resultado = 0d;}

	public void somar(Double valor1, Double valor2) {
		this.primeiroValor = valor1;
		this.segundoValor = valor2;
		resultado = primeiroValor + segundoValor;
	}

	public void subtrair(Double valor1, Double valor2) {
		this.primeiroValor = valor1;
		this.segundoValor = valor2;
		resultado = primeiroValor - segundoValor;
	}

	public void dividir(Double valor1, Double valor2) {
		this.primeiroValor = valor1;
		this.segundoValor = valor2;
		try {
			resultado = primeiroValor / segundoValor;
		} catch (ArithmeticException e) {
			System.out.println("Não pode dividir por 0");
		}
	}

	public void multiplicar(Double valor1, Double valor2) {
		this.primeiroValor = valor1;
		this.segundoValor = valor2;
		resultado = primeiroValor * segundoValor;
	}

	public Double exibirResultado() {
		return resultado;
	}

}
