package br.ufc.crateus.aps.decorator;

public class Soy extends CondimentDecorator{
	private Beverage beverage;

	public Soy(Beverage beverage) {
			this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		
		return beverage.getDescription()+" ,Soy";
	}

	@Override
	public double cost() {
		
		return .60+beverage.cost();
	}

}
