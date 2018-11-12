package br.ufc.crateus.aps.prototype;

public abstract  class CarPrototype {
	protected String model;
	protected String factory;
	protected String year;
	
	
	
	public abstract CarPrototype getClone();



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getFactory() {
		return factory;
	}



	public void setFactory(String factory) {
		this.factory = factory;
	}



	public String getYear() {
		return year;
	}



	public void setYear(String year) {
		this.year = year;
	}
	public abstract void show();

}
