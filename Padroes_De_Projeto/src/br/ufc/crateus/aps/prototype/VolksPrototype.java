package br.ufc.crateus.aps.prototype;

public class VolksPrototype extends CarPrototype {

	@Override
	public CarPrototype getClone() {

		return new VolksPrototype(this);
	}

	public VolksPrototype(VolksPrototype volks) {
		this.model = volks.getModel();
		this.factory = volks.getFactory();
		this.year = volks.getYear();

	}
	
	 public VolksPrototype(String model,String factory ,String year) {
		 this.model = model;
		 this.factory = factory;
		 this.year = year;
				 
	
	}

	@Override
	public void show() {
		System.out.println("Model : " + getModel());
		System.out.println("Factory : " + getFactory());
		System.out.println("Year : " + getYear());

	}

}
