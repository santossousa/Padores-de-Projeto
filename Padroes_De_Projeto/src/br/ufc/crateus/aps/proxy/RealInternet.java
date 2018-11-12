package br.ufc.crateus.aps.proxy;

import java.util.HashMap;

public class RealInternet implements Internet {
	
	private HashMap<String,String> list= new HashMap<>();

	@Override
	public void connect(String server) throws Exception {
			System.out.println("Connected ..."+server);
	}

	@Override
	public void add(String hostname,String ip) {
		
		System.out.println("Add new Proxy ..."+hostname+" , "+ip);
		list.put(hostname, ip);
	}

	@Override
	public void ListSite() {
		for(String key : list.keySet()) {
			System.out.println(key+" , "+list.get(key));
		}
	}

		

}
