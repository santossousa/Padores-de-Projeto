package br.ufc.crateus.aps.proxy;

import java.util.HashMap;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class ProxyInterenet implements Internet {
	private Internet internet = new RealInternet();
	private static HashMap<String, String> sitesServer;
	static {
		sitesServer = new HashMap();
		sitesServer.put("www.cs.princeton.edu", "101.189.1.30");
		sitesServer.put("www.cs.princeton.edu", "123.189.1.19");
		sitesServer.put("www.princeton.edu", "189.178.1.89");
		sitesServer.put("www.yale.edu", "134.222.0.1");
		sitesServer.put("www.simpsons.com", "209.052.165.60");
		sitesServer.put("www.apple.com", "17.112.152.32");
		sitesServer.put("www.amazon.com", "207.171.182.16");
		sitesServer.put("www.ebay.com", "66.135.192.87");
		sitesServer.put("www.cnn.com", "64.236.16.20");
		sitesServer.put("www.google.com", "216.239.41.99");
		sitesServer.put("www.nytimes.com", "199.239.136.200");
		sitesServer.put("www.microsoft.com", "207.126.99.140");
		sitesServer.put("www.dell.com", "143.166.224.230");
		sitesServer.put("www.slashdot.org", "66.35.250.151");
		sitesServer.put("www.espn.com", "199.181.135.201");
		sitesServer.put("www.weather.com", "63.111.66.11");
		sitesServer.put("www.yahoo.com", "216.109.118.65");
		sitesServer.put("www.crateus.ufc.br", "200.19.190.7");

	}

	@Override
	public void connect(String server) throws Exception {
		if (sitesServer.containsKey(server.toLowerCase())) {
			internet.connect(server);
			

		} else {
			throw new Exception("Acesso negado ....");

		}

	}

	@Override
	public void add(String hostname,String ip) {
		internet.add(hostname, ip);
		sitesServer.put(hostname, ip);
				
	}
	public void ListSite() {
		
		for(String key : sitesServer.keySet()) {
			System.out.println(key+","+sitesServer.get(key));
		}
	}

}
