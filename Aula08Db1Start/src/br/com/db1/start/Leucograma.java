package br.com.db1.start;

public class Leucograma {
	private Double leucocitos;
	private Integer mielocitos;
	private Integer metamielocitos;
	private Integer bastonetes;
	private Integer segmentados;
	private Integer eosinofilos;
	private Integer basofilos;
	private Integer linfocitosTipicos;
	private Integer linfocitosAtipicos;
	private Integer monocitos;
	private Integer outros;
	private String observacoes;
	private ContagemPlaquetaria contagemPlaquetaria;
	
	public String formatarLeucocitos(Double leucocitos) {
		return leucocitos.toString();
	}
	
	public String calcularPorcentagem(Integer dado) {
		return dado.toString();
	}
	
	public String formatarDado(Integer dado) {
		return dado.toString();
	}
	
}
