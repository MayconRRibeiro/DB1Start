package br.com.db1.colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaExercicio {
	private List<String> vogais = new ArrayList<>();
	private List<Integer> valores = new ArrayList<>();
	private Integer[] arrayValores = { 23, 20, 72, 17, 68, 95, 28, 69, 25, 99 };
	private List<String> palavrasList = new ArrayList<>();
	private String[] arrayPalavras = { "Avião", "Seta", "Bone", "Teste", "Legal", "Top", "Wiki", "Fusca", "Arvore",
			"Pequeno" };

	public ListaExercicio() {
		vogais.add("a");
		vogais.add("e");
		vogais.add("i");
		vogais.add("o");
		vogais.add("u");
		for (Integer numero : arrayValores) {
			valores.add(numero);
		}
		for (String palavra : arrayPalavras) {
			palavrasList.add(palavra);
		}
	}

	public Set<String> getConsoantes(String nome) {
		nome = nome.toLowerCase();
		Set<String> consoantesEncontradas = new HashSet<>();
		for (Integer x = 0; x < nome.length(); x++) {
			String letra = nome.substring(x, x + 1);
			if (!vogais.contains(letra)) {
				consoantesEncontradas.add(letra);
			}
		}
		return consoantesEncontradas;
	}

	public Set<String> getVogais(String nome) {
		nome = nome.toLowerCase();
		Set<String> vogaisEncontradas = new HashSet<>();
		for (Integer x = 0; x < nome.length(); x++) {
			String letra = nome.substring(x, x + 1);
			if (vogais.contains(letra)) {
				vogaisEncontradas.add(letra);
			}
		}
		return vogaisEncontradas;
	}

	public List<Integer> getValores() {
		return valores;
	}

	public List<Integer> getValoresAnyLessThird() {
		valores.remove(2);
		return valores;
	}

	public List<Integer> getValoresIndexMultiplesOf3() {
		System.out.print("[");
		for (int x = 0; x < valores.size(); x++) {
			if (x == valores.size() - 1) {
				System.out.print(valores.get(x));
			} else if (x >= 3 && x % 3 == 0) {
				System.out.print(valores.get(x) + ", ");
			}
		}
		System.out.println("]");
		return valores;
	}

	public List<Integer> getValoresMultiplesOf2() {
		List<Integer> valoresMultiplosDe2 = new ArrayList<>();
		for (Integer x = 0; x < valores.size(); x++) {
			if (valores.get(x) % 2 == 0) {
				valoresMultiplosDe2.add(valores.get(x));
			}
		}
		return valoresMultiplosDe2;
	}

	public Set<String> getPalavrasToAnotherCollection() {
		Set<String> palavrasSet = new HashSet<>();
		palavrasSet.addAll(palavrasList);
		return palavrasSet;
	}

	public static boolean equalsList(List<?> primeiraList, List<?> segundaList) {
		if (primeiraList == null || segundaList == null) {
			return false;
		}
		if (primeiraList.size() != segundaList.size()) {
			return false;
		}
		return primeiraList.containsAll(segundaList);
	}

	public static boolean equalsSet(Set<?> primeiroSet, Set<?> segundoSet) {
		if (primeiroSet == null || segundoSet == null) {
			return false;
		}
		if (primeiroSet.size() != segundoSet.size()) {
			return false;
		}
		return primeiroSet.containsAll(segundoSet);
	}
}
