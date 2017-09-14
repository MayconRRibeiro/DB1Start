package br.com.db1.start;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Recibo {
	private Integer numero;
	private Double valorTotal;
	private Boolean aceitacao;
	private Date data;
	private Cidade cidade;
	private Consumidor consumidor;
	private Emitente emitente;
	private List<Servico> servico = new ArrayList<Servico>();


	public Boolean validarCampos() {
		return true;
	}
	
	public String descreverValor() {
		return "descrever Valor";
	}
	
	public String exibirMesDescritivo() {
		return "Mes Descritivo";
	}
	
	
}


