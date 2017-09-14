package br.com.db1.start;

public abstract class Veiculo { //Classe abstrata não pode ser instanciada
	private Marca marca; //associação direta
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
}
