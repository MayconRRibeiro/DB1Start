package br.com.db1.start;

public class Esporte {
	// Modificador de acesso implicito � sempre publico.
	String descricao;

	public String exibirDescricao() {
		return descricao;
	}

	private void metodoPrivado() {
		descricao = "este texto � do metodo privado";
	}
	
}
