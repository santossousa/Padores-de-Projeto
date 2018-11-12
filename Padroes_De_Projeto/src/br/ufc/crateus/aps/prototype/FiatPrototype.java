package br.ufc.crateus.aps.prototype;

public class FiatPrototype extends CarPrototype {

	public FiatPrototype(FiatPrototype fiat) {
		this.model = fiat.getModel();
		this.factory = fiat.getFactory();
		this.year = fiat.getYear();

	}

	public FiatPrototype(String model, String factory, String year) {
		this.model = model;
		this.factory = factory;
		this.year = year;

	}

	@Override
	public CarPrototype getClone() {

		return new FiatPrototype(this);
	}

	@Override
	public void show() {
		System.out.println("Model : " + getModel());
		System.out.println("Factory : " + getFactory());
		System.out.println("Year : " + getYear());

	}

}
