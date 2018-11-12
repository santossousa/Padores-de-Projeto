package br.ufc.crateus.aps.decorator;

public class Milk extends CondimentDecorator {
	private Beverage beverage;
	public Milk(Beverage beverage) {
		this.beverage = beverage;
		
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription()+" ,Milk";
	}

	@Override
	public double cost() {
		
		return .30+beverage.cost();
	}

}
