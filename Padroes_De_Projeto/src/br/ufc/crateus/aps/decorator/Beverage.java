package br.ufc.crateus.aps.decorator;

public abstract class Beverage {
	protected String descricao = "Unknown Beverage";
	
	public String getDescription() {
		return descricao;
	}

	public abstract double cost();

}
