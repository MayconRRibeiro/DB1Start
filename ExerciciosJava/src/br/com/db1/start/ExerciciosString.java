package br.com.db1.start;

public class ExerciciosString {
	private static Integer indexTextoSeparado = -1;

	public String textoEmLetrasMaiusculas(String texto) {
		return texto.toUpperCase();
	}

	public String textoEmLetrasMinusculas(String texto) {
		return texto.toLowerCase();
	}

	public Integer quantidadeDeLetras(String texto) {
		return texto.length();
	}

	public Integer quantidadeDeLetrasTrim(String texto) {
		return texto.trim().length();
	}

	public String exibirAsQuatroPrimeirasLetras(String texto) {
		return texto.substring(0, 4);
	}

	public String exibirNomeAPartirDaTerceiraLetra(String texto) {
		return texto.substring(2);
	}

	public String exibirAsQuatroUltimasLetras(String texto) {
		return texto.substring(texto.length() - 4);
	}

	public String substituirPrimeiroNome(String texto) {
		for (Integer i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == ' ')
				return texto.replace(texto.substring(0, i), "Aluno");
		}
		return "Aluno" + texto;
	}

	public String exibirTextoSeparado(String texto) {
		if (indexTextoSeparado == 4)
			indexTextoSeparado = -1;
		indexTextoSeparado += 1;
		String[] textoSeparado = texto.split(",");
		return textoSeparado[indexTextoSeparado].trim();
	}

	public Integer exibirQuantidadeDeVogais(String texto) {
		Integer quantidadeDeVogais = 0;
		for (Integer i = 0; i < texto.length(); i++) {
			if (texto.toLowerCase().charAt(i) == 'a' || 
				texto.toLowerCase().charAt(i) == 'e' || 
				texto.toLowerCase().charAt(i) == 'i' || 
				texto.toLowerCase().charAt(i) == 'o' || 
				texto.toLowerCase().charAt(i) == 'u')
				quantidadeDeVogais += 1;
		}
		return quantidadeDeVogais;
	}

	public String textoInvertido(String texto) {
		String textoInverso = "";
		char textoChar[] = texto.toCharArray();
		for (int i = textoChar.length - 1; i >= 0; i--) {
			textoInverso += String.valueOf(textoChar[i]);
		}
		return textoInverso;
	}

}
