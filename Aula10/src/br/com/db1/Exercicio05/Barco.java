package br.com.db1.Exercicio05;

public class Barco extends TransporteAquatico {
	private Boolean pesqueiro;

	public Boolean isPesqueiro() {
		if (pesqueiro)
			return true;
		else
			return false;
	}
}
