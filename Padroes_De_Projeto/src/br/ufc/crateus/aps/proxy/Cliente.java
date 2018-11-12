package br.ufc.crateus.aps.proxy;

public class Cliente {

	public static void main(String[] args) {
		Internet internet = new ProxyInterenet();
		try {
			internet.connect("www.crateus.ufc.br");
			internet.add("www.crate.br", "129.157.1.0");
			//internet.ListSite();
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
