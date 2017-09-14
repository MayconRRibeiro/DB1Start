package br.com.db1.start;

public enum Marca {
	VOLKSWAGEN("Volkswagen","VL"),
	CHEVROLET("Chevrolet","CH"),
	FIAT("Fiat","FI"),
	BMW("BMW","FI");
	
	String descricao;
	String sigla;
	
	Marca(String descricao, String sigla){
		this.descricao = descricao;
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getSigla() {
		return sigla;
	}
	
}
