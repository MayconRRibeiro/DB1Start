package br.com.db1.start;

public class Endereco {
	private String tipoLogradouro;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private Integer cep;

	public String formatarCep(Integer cep) {
		return cep.toString();
	}
	
	public Boolean validarCep() {
		return true;
	}
}
