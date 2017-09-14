package br.com.db1.start;

public class Basquete extends EsporteColetivo {
	
	private TipoBasquete tipoBasquete;

	
	public TipoBasquete getTipoBasquete() {
		return tipoBasquete;
	}

	public void setTipoBasquete(TipoBasquete tipoBasquete) {
		this.tipoBasquete = tipoBasquete;
	}

	@Override
	public String toString() {
		return "Basquete [tipoBasquete=" + tipoBasquete + ", descricao =" + descricao + "]";
	}

}
