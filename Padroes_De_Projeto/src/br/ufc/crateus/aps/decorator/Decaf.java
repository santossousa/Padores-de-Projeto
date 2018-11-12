package br.ufc.crateus.aps.decorator;

public class Decaf extends Beverage {

	public Decaf() {
		this.descricao = "Decaf";
	}

	@Override
	public double cost() {
		return .50;
	}

}
