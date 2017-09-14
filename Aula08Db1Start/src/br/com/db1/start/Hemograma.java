package br.com.db1.start;

public class Hemograma {
	private String material;
	private Eritograma eritograma;
	private Leucograma leucograma;
	private Byte assinatura;
	
	Hemograma(Eritograma eritograma,Leucograma leucograma){
		this.eritograma = eritograma;
		this.leucograma = leucograma;
		
	}
}
