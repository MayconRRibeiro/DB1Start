package br.com.db1.start;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ficha {
	private Integer id;
	private Pessoa propietario;
	private Pessoa requisitante;
	private Date data;
	private Integer numero;
	private Animal animal;
	private HemogramaCompleto hemogramaCompleto;
	private Clinica clinica;
	
	Ficha(){
		
	}
	
	Ficha(Animal animal){
		this.animal = animal;
	}
		
	public String getEnderecoClinica(){
		return propietario.getEndereco().getBairro();
	}
	
	public List<Animal> getDadosAnimal(){
		List<Animal> animal = new ArrayList<Animal>();
		return animal;
	}
}
