package br.com.db1.start;

public abstract class Veiculo { //Classe abstrata n�o pode ser instanciada
	private Marca marca; //associa��o direta
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}
