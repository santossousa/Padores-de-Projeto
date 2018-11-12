package br.ufc.crateus.aps.decorator;

public class Espresso extends Beverage{

	public Espresso() {
		this.descricao = "Expresso";
	}

	@Override
	public double cost() {
		
		return 2.10;
	}

}
