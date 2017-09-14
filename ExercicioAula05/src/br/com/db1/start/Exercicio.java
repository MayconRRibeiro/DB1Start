package br.com.db1.start;

public class Exercicio {
	public static void main(String[] args) {
		//exemploPrimitivoString();
		
		//exemploPrimitivoDouble();
		
		//exemploPrimitivoInteger();
		
		//exemploPrimitivoBooleano();
		
		/*Laboratorio laboratorio = new Laboratorio();
		laboratorio.setNumero(5);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("izabela");
		
		laboratorio.entrarAluno(pessoa);	*/
	
		exemploLacoRepeticao();
		
	}						
	private static void exemploLacoRepeticao() {	
		exemploWhile();
		
		exemploDoWhile();
			
		exemploFor();
	}
	
	private static void exemploWhile() {
		System.out.println("Exemplo com While");
		
		Integer contador = 1;
		while(contador <= 10){
			System.out.print(contador+" ");
			contador++;
		}
		
		System.out.println(" ");
	}
	
	private static void exemploDoWhile() {
		System.out.println(" ");
		System.out.println("Exemplo com Do While");
		
		Integer contador = 1;
		do {
			System.out.print(contador+" ");
			contador++;
		} while(contador <= 10);
		
		System.out.println(" ");
	}
	
	private static void exemploFor() {
		System.out.println("");
		System.out.println("Exemplo com For");
		
		for (int i = 1; i < 11; i++) {
			System.out.print(i+" ");
		}
	}
	


//------------------------------------------------------------------------------------------------------------------------

	private static void exemploPrimitivoBooleano() {
		boolean variavelPrimitiva = false;
		Boolean variavelNaoPrimitiva = Boolean.FALSE;	
	}

	private static void exemploPrimitivoInteger() {
		int valorNumerico = 0;
		Integer valorNumerico2 = 1;
		Integer valorNumerico3 = 2;
		
		System.out.println(valorNumerico3);
		
		valorNumerico3.toString();
		
		String.valueOf(valorNumerico);
		
		System.out.println(""+valorNumerico);
		
		
	}

	private static void exemploPrimitivoDouble() {
		double numeroComVirgula = 1.92;
		Double numeroComVirgula2 = 1.92;
	}

	private static void exemploPrimitivoString() {
		char umaLetra = 'a';
		String variasLetras = "varias letras";
		
		String exemploDeString = "12345";
		char numero1 = '1';
		
		System.out.println(exemploDeString.length());
		exemploDeString.toLowerCase();
		exemploDeString.toUpperCase();
		
		System.out.println("Converter texto em numero");
		System.out.println(Integer.parseInt(exemploDeString));

	}
	
	
	
	
	
	
	
	
}
