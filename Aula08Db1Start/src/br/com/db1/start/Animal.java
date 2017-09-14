package br.com.db1.start;

import java.util.Date;

public class Animal {
	private String nome;
	private Idade idade;
	private String sexo;
	private String raca;
	private Date dataNascimento;
	private String especie;
	
	public Boolean validarDataAnimal(Idade idade, Date dataNascimento) {
		return true;
	}
}
