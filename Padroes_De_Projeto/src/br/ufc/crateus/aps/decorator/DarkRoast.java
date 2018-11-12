package br.ufc.crateus.aps.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.descricao = "DarkRoast";
	}

	@Override
	public double cost() {
		return .45;
	}

}
