package br.com.db1.exercicio06;

public class Endereco {
	private String logradouro;
	private Integer cep;
	private Restaurante restaurante;
	private TipoLogradouro tipoLogradouro;
	
	public String exibirCepFormatado() {
		return cep.toString().substring(0, 5) + "-" + cep.toString().substring(5);
	}
}
