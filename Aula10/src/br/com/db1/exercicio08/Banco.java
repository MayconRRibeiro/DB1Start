package br.com.db1.exercicio08;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Banco {
	private String nome;
	private Date dataFundacao;
	private String publico;
	private Set<Conta> conta = new HashSet<Conta>();

	public Boolean isPublico() {
		if (publico.toLowerCase() == "publico")
			return true;
		else
			return false;
	}
}
