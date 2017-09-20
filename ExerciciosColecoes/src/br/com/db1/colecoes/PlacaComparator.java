package br.com.db1.colecoes;

import java.util.Comparator;

public class PlacaComparator implements Comparator<Carro> {

	@Override
	public int compare(Carro carro, Carro outroCarro) {
		return carro.getPlaca().compareTo(outroCarro.getPlaca());
	}
}
