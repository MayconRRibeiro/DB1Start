package br.com.db1.colecoes;

import java.util.Comparator;

public class MarcaComparator implements Comparator<Carro> {

	@Override
	public int compare(Carro carro, Carro outroCarro) {
		return carro.getMarca().compareTo(outroCarro.getMarca());
	}
}
