package br.com.db1.exercicio06;

public class Telefone {
	private Integer ddd;
	private Integer numero;
	private Restaurante restaurante;

	public String exibirTelefoneFormatado() {
		return "(" + ddd + ")" + numero;
	}

}
