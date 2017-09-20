package br.com.db1.colecoes;

public class Carro implements Comparable<Carro> {
	private final Integer ano;
	private String nome;
	private final String marca;
	private final String placa;

	public Carro(Integer ano, String nome, String marca, String placa) {
		this.ano = ano;
		this.nome = nome;
		this.marca = marca;
		this.placa = placa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAno() {
		return ano;
	}

	public String getMarca() {
		return marca;
	}

	public String getPlaca() {
		return placa;
	}

	@Override
	public int compareTo(Carro carro) {
		if (this.ano < carro.getAno()) {
			return -1;
		}
		if (this.ano > carro.getAno()) {
			return 1;
		}
		return 0;
	}

}
