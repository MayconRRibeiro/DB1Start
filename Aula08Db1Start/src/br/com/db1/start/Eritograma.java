package br.com.db1.start;

public class Eritograma {
	private Double proteinaPlasmatica;
	private Double eritrocitos;
	private Double hemoglobina;
	private Double hematocrito;
	private Double vcm;
	private Double hcm;
	private Double chcm;
	private Metarrubrocitos metarrubrocitos;
	
	public String formatarEritrocitos(Double eritrocitos) {
		return eritrocitos.toString();
	}
	
	public String formatarHemoglobina(Double hemoglobina) {
		return hemoglobina.toString();
	}
	
	public String formatarHematocrito(Double hematocrito) {
		return hematocrito.toString();
	}
	
	public String formatarVcm(Double vcm){
		return vcm.toString();
	}
	
	public String formatarHcm(Double hcm) {
		return hcm.toString();
	}
	
	public String formatarChcm(Double chcm) {
		return chcm.toString();
	}
	
	public String formatarDados(Double dado) {
		return dado.toString();
	}
	
	
	
	
	
}
