package br.ufc.crateus.aps.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.descricao = "Casa Mistura De Café";
	}

	@Override
	public double cost() {
		
		return .90;
	}

}
