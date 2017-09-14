package br.com.db1.start;

public class Main {
	public static void main(String[] args) {
		System.out.println(TipoBasquete.NBA);

		Basquete vBasquete = new Basquete();
		System.out.println(vBasquete);
		vBasquete.setTipoBasquete(TipoBasquete.NBA);
		System.out.println(vBasquete);
	}
}
