package br.com.db1.exercicio06;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Restaurante {
	private String nome;
	private Boolean serveAlmoco;
	private Boolean serveJantar;
	private Boolean serveCafeDaManha;
	private Endereco endereco;
	private Set<Telefone> telefone = new HashSet<Telefone>();
	private List<Pedido> pedido = new ArrayList<Pedido>();

	public void gerarRelatorioFaturamento(Date dataInicial, Date dataFinal) {

	}
}
