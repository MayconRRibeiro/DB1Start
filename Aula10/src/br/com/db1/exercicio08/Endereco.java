package br.com.db1.exercicio08;

public class Endereco {
	private String logradouro;
	private Integer cep;
	private TipoLogradouro tipoLogradouro;
	private Pessoa pessoa;
	
	public String exibirCepFormatado() {
		return cep.toString().substring(0, 5) + "-" + cep.toString().substring(5);
	}
}
