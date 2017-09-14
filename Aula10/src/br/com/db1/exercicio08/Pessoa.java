package br.com.db1.exercicio08;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Pessoa {
	private String nome;
	private Date dataNascimento;
	private Set<Telefone> telefone = new HashSet<Telefone>();
	private Set<Endereco> endereco = new HashSet<Endereco>();

}
