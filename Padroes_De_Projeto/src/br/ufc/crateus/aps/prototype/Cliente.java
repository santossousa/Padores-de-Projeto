package br.ufc.crateus.aps.prototype;

public class Cliente {

	public static void main(String[] args) {
		CarPrototype car = new FiatPrototype("jjj","sdfds","fjhgfsd");
		CarPrototype[] carNew = {car,car.getClone()};
		for(CarPrototype e : carNew) {
			System.out.println();
			e.show();
		}

	}

}
