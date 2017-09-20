package br.com.db1.colecoes;

public class Produto implements Comparable<Produto> {
	private final Integer id;
	private final String descricao;
	private Double valor;

	public Produto(Integer id, String descricao, Double valor) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
	}

	public Integer getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public int compareTo(Produto produto) {
		if (this.valor < produto.getValor()) {
			return -1;
		}
		if (this.valor > produto.getValor()) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return descricao;
	}

}
