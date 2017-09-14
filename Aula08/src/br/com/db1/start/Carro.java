package br.com.db1.start;

public class Carro extends Veiculo {
	
	private Motor motor;
	private Volante volante;
	private Pneu pneu;

	Carro(Motor motor, Volante volante, Pneu pneu){ //Construtor com par�metros //composi��o
		this.motor = motor;
		this.volante = volante;
		this.pneu = pneu; 
		super.setMarca(Marca.BMW); //Super indica que voc� esta chamando o m�todo do pai
		setMarca(Marca.BMW); //Overriden,sem
	}
	
	public void setMarca(Marca marca){
			
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Volante getVolante() {
		return volante;
	}

	public void setVolante(Volante volante) {
		this.volante = volante;
	}

	public Pneu getPneu() {
		return pneu;
	}

	public void setPneu(Pneu pneu) {
		this.pneu = pneu;
	}
	
	
	
}
