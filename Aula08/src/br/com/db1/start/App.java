package br.com.db1.start;

public class App {
	public static void main(String[] args) {
		 Carro carro = new Carro(new Motor(),new Volante(),new Pneu());
		 carro.getMarca();
		 
		Moto moto = new Moto();
		moto.getMarca();
		//moto.getGuidao(); //Funciona. O filho pode acessar os metodos e atributos do pai
		
		Veiculo veiculo = new Moto(); //A superclasse n�o � muito utilizada
		//veiculo.getGuidao(); //N�o Funciona. O pai n�o pode acessar os metodos e atributos do filho.
		
		//Veiculo veiculo2 = new Veiculo(); // Classe abstrata n�o pode ser instanciada
	}
}
