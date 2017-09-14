package br.com.db1.exercicio04;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Pessoa {
	private String nome;
	private Date dataNascimento;
	private Sexo sexo;
	private Set<Telefone> telefone = new HashSet<Telefone>();
}
